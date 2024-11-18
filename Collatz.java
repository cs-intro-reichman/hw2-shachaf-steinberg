public class Collatz {
	public static void main(String args[]) {
	int num = Integer.parseInt(args[0]);
	String verboseOrConcise = args[1];
	int times = 1;
		// give a different output for verbose or concise
		if (verboseOrConcise.equals("c")) {
			System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");
		} else if (verboseOrConcise.equals("v")) {
			// for loop just for the first row when seed = 1
			for (int i = 1; i <= num; i++) {
				int seed = i;
				String str = "";
				str += "" + seed + " ";
				if (seed == 1) {
					seed = (seed * 3) + 1;
					str += seed + " ";
				}  
				// the remainder of the loop when seed !=n 
					while (seed != 1) {
						if (seed % 2 == 0) {
							seed /= 2;
							str += seed + " ";;
						} else if (seed % 2 == 1) {
							seed = (seed * 3) + 1;
							str += seed + " ";;
						}
						times++;
					}
					times++;
					System.out.println(str + "(" + times + ")");
					times = 0;
			}  
			System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");
		}
	}
}



 