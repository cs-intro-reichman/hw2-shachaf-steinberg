public class CalcPi {
	public static void main(String [] args) { 
	double aprPi = Math.PI;
	int times = Integer.parseInt(args[0]);
	double divider = 1.0;
	double sum = 0.0;
	
		for (int i = 1; i <= times; i++) {
			if (i % 2 == 0) {
				sum -= (1.0 / divider);
			} else { 
				sum += (1.0 / divider);
			}
			divider += 2.0;

		}
		System.out.println("pi according to Java: "+ aprPi);
		System.out.println("pi, approximated:     " + (sum * 4));
	}
}