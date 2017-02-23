package generics;
import generics.Person;
import generics.Car;
import generics.ArrayList;

interface Owner<K, V extends Person & Car>
{
	ArrayList<Car> cars();
	V[] owner();
}