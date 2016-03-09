public class functionSupply implements Function {

	private double k;
	private double b;

	public functionSupply(double k, double b) {
		this.k=k;
		this.b=b;
	}

	public void printFunction() {
		System.out.println("The function of supply: Qs="+
			k+"*P"+b);
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