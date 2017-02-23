package generics;
import generics.Iterator;

interface List<E>
{
	void add(E element);
	Iterator<E> iterator();
}