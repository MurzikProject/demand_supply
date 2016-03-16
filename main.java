public class main {
	
	public static void main(String[] args) {
		String text1 = "You should enter the coefficients of demand and supply functions.";
		String text2 = "Notice. We use the linear function like this: y=k*x+b.";
		String text3 = "Where y means Q - quantity, and x means P - price.";

		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);

		functionDemand demand1 = new functionDemand();
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