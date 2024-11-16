// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
    String word = args[0];
    word = word.toUpperCase();
    int times = Integer.parseInt(args[1]);
    String anOrA = "";

    // Check if any of the special letters appear and change "a" to "an"
    String specialLetters = "AEFHILMNORSX";
        for (int j = 0; j < word.length(); j++) {
             anOrA = "a";
             for (int n = 0; n < specialLetters.length(); n++) {
                if (word.charAt(j) == specialLetters.charAt(n)) {
                    anOrA = "an";
                    break;    
                }
            }
            System.out.println("Give me " + anOrA + " " + word.charAt(j) + "!");            
        }

        System.out.println("What does that spell?");

            for (int i = 0; i < times; i++) {
                System.out.println(word +"!!!");
            }
    }         
}

