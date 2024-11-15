public  class  TestRandom {
	public static void main(String[]  args) {
	int nTimes = Integer.parseInt(args[0]);
	double lessThen = 0;
	double greaterThen = 0;
	
		// counts n times if greater or less then 0.5
		for (int i = 0; i < nTimes; i++) {
			double randomNumber = Math.random();
			if (randomNumber > 0.5) {
				greaterThen++;
			} else if (randomNumber <= 0.5) {
				lessThen++;
			}
		}
		// makes sure that the edge case of == 0 wont give an error
		if (greaterThen != 0 && lessThen != 0) {
			double ratio = (double) greaterThen / lessThen;
			System.out.println("> 0.5:" + "   " + lessThen + " times");
			System.out.println("<= 0.5:" + "  " + greaterThen + " times");
			System.out.println("Ratio:" + "   " + ratio);
		} else {
			System.out.println("> 0.5:" + "   " + lessThen + " times");
			System.out.println("<= 0.5:" + "  " + greaterThen + " times");
		}

	}
}
