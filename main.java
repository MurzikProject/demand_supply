public class main {
	public static void main(String[] args) {
		System.out.println("You should enter the coefficients of demand and supply functions.");
		System.out.println("Notice. We use the linear function like this: y=k*x+b.");
		System.out.println("Where y means Q - quantity, and x means P - price.");
		System.out.println("Ok, lets start with demand function. You need to enter 2 coefficients: "+
							"k and b."+
							"Remember, the coeficient k in demand function always use with minus.");

		functionDemand demand1 = new functionDemand(-1.0, 8);
		functionSupply supply1 = new functionSupply(2.0, -10.0);

		demand1.printFunction();
		supply1.printFunction();

		System.out.println("-----New functions-----");

		demand1.changeFunction(50);
		supply1.changeFunction(-25);
		demand1.printFunction();
		supply1.printFunction();

	}
}