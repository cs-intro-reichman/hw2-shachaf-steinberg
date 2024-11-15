public class TimeCalc {
    public static void main(String[] args) {
    int firstHours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
    int firstMinutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
    int newTime = Integer.parseInt("" + args[1]);


    //convert original time and new time to show sum in hours and minutes
    int totalMinutes = (firstHours * 60) + firstMinutes + newTime; 
    int totalHours = totalMinutes / 60;
    int newHours = totalHours % 24;
    int newMinutes = totalMinutes - (totalHours * 60);

        // convert hours and minutes to the 24-hour format hh:mm
        if (newHours > 23) {
            newHours = newHours % 24;
        } else if (newMinutes > 59) {
            newMinutes = newMinutes % 60;
        } 
        
        // print 0 before hours or minutes if needed
        if (newHours < 10 && newMinutes < 10) {
                System.out.println("0" +newHours + ":0" + newMinutes);
        } else if (newMinutes < 10) {
            System.out.println(newHours + ":0" + newMinutes);
        } else if (newHours < 10) { 
            System.out.println("0" +newHours + ":" + newMinutes);
        } else {    
            System.out.println(newHours + ":" + newMinutes);
        }
    }
    
}
