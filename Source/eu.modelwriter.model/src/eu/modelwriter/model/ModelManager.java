package eu.modelwriter.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import eu.modelwriter.model.Tuple.BOUND;
import eu.modelwriter.model.exception.InvalidArityException;
import eu.modelwriter.model.observer.Subject;
import eu.modelwriter.model.observer.UpdateType;

public class ModelManager extends Subject {
  private static ModelManager manager;
  private static final Universe universe = new Universe();

  public static ModelManager getInstance() {
    if (ModelManager.manager == null) {
      ModelManager.manager = new ModelManager();
    }
    return ModelManager.manager;
  }

  public Atom addAtom(List<RelationSet> relationSets, final Serializable data, final BOUND bound) {
    if (relationSets == null) {
      relationSets = Arrays.asList(new RelationSet[] {});
    }

    final Atom atom;
    final String id = UUID.randomUUID().toString();
    atom = new Atom(relationSets, id, data);

    if (relationSets.size() == 0) {
      ModelManager.universe.addStrayedAtom(atom);
    } else {
      ModelManager.universe.addAtom(atom);
      try {
        for (int i = 0; i < relationSets.size(); i++) {
          final Tuple unaryTuple = new Tuple(relationSets.get(i), id, data, bound, 1, atom);
          atom.addTuplesIn(unaryTuple);
          relationSets.get(i).addTuple(unaryTuple);
        }
      } catch (final InvalidArityException e) {
        e.printStackTrace();
      }
    }
    this.notifyAllObservers(atom, UpdateType.ADD_ATOM);
    return atom;
  }

  public RelationSet addRelationSet(final String name, final int arity) {
    final RelationSet relationSet = new RelationSet(name, arity);
    ModelManager.universe.addRelationSet(relationSet);
    return relationSet;
  }

  public Tuple addTuple(final RelationSet relationSet, final Serializable data, final BOUND bound,
      final int arity, final Atom... atoms) throws InvalidArityException {
    if (arity != atoms.length) {
      throw new InvalidArityException();
    }

    final List<RelationSet> relationSets;
    if (relationSet == null) {
      relationSets = Arrays.asList(new RelationSet[] {});
    } else {
      relationSets = Arrays.asList(new RelationSet[] {relationSet});
    }

    final Tuple tuple;
    final String id = UUID.randomUUID().toString();
    tuple = new Tuple(relationSet, id, data, bound, arity, atoms);

    if (relationSets.size() == 0) {
      ModelManager.universe.addStrayedTuple(tuple);
    } else {
      ModelManager.universe.addTuple(tuple);
      try {
        relationSet.addTuple(tuple);
      } catch (final InvalidArityException e) {
        e.printStackTrace();
      }
    }
    this.notifyAllObservers(tuple, UpdateType.ADD_TUPLE);
    return tuple;
  }

  public void changeRelationSetsOfAtom(final String id, final List<String> newRelationSets) {
    this.getAtom(id).setRelationSets(this.getRelationSets(newRelationSets));
    this.notifyAllObservers(this.getAtomClone(id), UpdateType.CHANGE_ATOM_RELATIONSETS);
  }

  public List<String> getAllRelationSetsNames() {
    final List<String> relationSetsNames = new ArrayList<String>();
    for (final RelationSet relationSet : ModelManager.universe.getRelationSets()) {
      relationSetsNames.add(relationSet.getName());
    }
    return relationSetsNames;
  }

  private Atom getAtom(final String id) {
    return ModelManager.universe.getAtom(id);
  }

  public Atom getAtomClone(final String id) {
    return (Atom) ModelManager.universe.getAtom(id).clone();
  }

  public List<String> getNaryRelationSetNames() {
    final List<String> naryRelationNames = new ArrayList<String>();
    for (final RelationSet relationSet : ModelManager.universe.getRelationSets()) {
      if (relationSet.getArity() > 1) {
        naryRelationNames.add(relationSet.getName());
      }
    }
    return naryRelationNames;

  }

  private List<RelationSet> getRelationSets(final List<String> relationSetNames) {
    final List<RelationSet> relationSets = new ArrayList<RelationSet>();
    for (final String relationSetName : relationSetNames) {
      relationSets.add(ModelManager.universe.getRelationSet(relationSetName));
    }
    return relationSets;
  }

  public ArrayList<RelationSet> getRelationSetsCopy() {
    return new ArrayList<RelationSet>(ModelManager.universe.getRelationSets());
  }

  private Tuple getTuple(final String id) {
    return ModelManager.universe.getTuple(id);
  }

  public Tuple getTupleClone(final String id) {
    return (Tuple) ModelManager.universe.getTuple(id).clone();
  }

  public List<String> getUnaryRelationSetNames() {
    final List<String> unaryRelationSetNames = new ArrayList<String>();
    unaryRelationSetNames.add("Univ");
    for (final RelationSet relationSet : ModelManager.universe.getRelationSets()) {
      if (relationSet.getArity() == 1) {
        unaryRelationSetNames.add(relationSet.getName());
      }
    }
    return unaryRelationSetNames;
  }

  public boolean removeAtom(final String id) {
    boolean removed = false;
    final Atom atom = this.getAtom(id);
    if (atom.getRelationSets().size() == 0) {
      removed = ModelManager.universe.removeStrayedAtom(id);
    } else {
      removed = ModelManager.universe.removeAtom(id);
    }
    if (removed) {
      this.notifyAllObservers(atom, UpdateType.REMOVE_ATOM);
      return true;
    }
    return false;
  }

  public boolean removeModelElement(final ModelElement element) {
    if (element instanceof Atom) {
      return this.removeAtom(element.getID());
    } else if (element instanceof Tuple) {
      return this.removeTuple(element.getID());
    }
    return false;
  }

  public boolean removeTuple(final String id) {
    boolean removed = false;
    final Tuple tuple = this.getTuple(id);
    if (tuple.getRelationSets().size() == 0) {
      removed = ModelManager.universe.removeStrayedTuple(id);
    } else {
      removed = ModelManager.universe.removeTuple(id);
    }
    if (removed) {
      this.notifyAllObservers(tuple, UpdateType.REMOVE_TUPLE);
      return true;
    }
    return false;
  }
}
