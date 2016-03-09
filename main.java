public class main {
	public static void main(String[] args) {
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