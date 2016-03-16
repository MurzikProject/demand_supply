import java.util.Scanner;

public class functionDemand implements Function {

	private double k;
	private double b;

	public functionDemand() {
		String text4 = "Ok, lets start with demand function. You need to enter 2 coefficients: "+
							"k and b."+
							" Remember, the coefficient k in demand function always use with minus.";
		String text5 = "Please, enter the coefficient b (not negative number).";
		double temp_k;
		double temp_b;
		
		System.out.println(text4);

		Scanner dk = new Scanner(System.in);

		if (dk.hasNextDouble()) {
			temp_k = dk.nextDouble();
			if (temp_k<0) {
				this.k=temp_k;
			} else {
				System.out.println("The coefficient k in demand function always use with minus!!!");
			}
		} else {
			System.out.println("You entered not correct data type!");
		}

		System.out.println(text5);

		Scanner db = new Scanner(System.in);

		if (db.hasNextDouble()) {
			temp_b=db.nextDouble();
			if (temp_b>=0) {
				this.b=temp_b;
			} else {
				System.out.println("The coefficient b in demand function always isn't negative!!!");
			}
		} else {
			System.out.println("You entered not correct data type!");
		}
	}

	public void printFunction() {
		System.out.println("The function of demand: Qd="+
			b+k+"*P");
	}

	public void changeFunction(double percentage) {
		if (percentage<0) {
			this.k=(1-Math.abs(percentage)/100)*k;
			this.b=(1-Math.abs(percentage)/100)*b;
		} else if (percentage>0) {
			this.k=(1+percentage/100)*k;
			this.b=(1+percentage/100)*b;
		} else {
			this.k=k;
			this.b=b;
		}
	}
}