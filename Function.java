public interface Function {
/* We have the standart linear function: y=k*x+b;
The function of demand looks like Qd=a-b*P,
and the function of supply looks like Qs=b*P-a, where:
Qd(Qs) - quantity of demand(supply);
P - price.
a - b;
b - k.
*/
	public void printFunction();
	//Print function with economic sense.

	public void changeFunction(double percentage);
	//Change function (quantity of demand or supply) on some percentage.
}