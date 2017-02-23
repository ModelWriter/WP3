package generics;
import generics.List;
import BookStorePackage.pack.B;
import generics.Car;
import generics.ArrayList;
import generics.CArr;
import generics.sub.Hey;
import generics.sub.subsub.CantTouchThis;
import BookStorePackage.A;
import generics.V;

interface Canvas
{
	String c();
	V[] d();
	List<? extends CArr> ref();
	Hey heyRef();
	CantTouchThis noWay();
	A[] b();
	Boolean draw(List<? extends B> shapes, Integer x, Integer y);
	<K extends Car> void create(String name);
	void create(ArrayList<? extends List<Car>> arg);
}