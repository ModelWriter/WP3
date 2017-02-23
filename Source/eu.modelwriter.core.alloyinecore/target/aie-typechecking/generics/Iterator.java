package generics;
import generics.MyException;

interface Iterator<E>
{
	E next();
	Boolean hasNext();
}