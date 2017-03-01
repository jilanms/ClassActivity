import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------Class Activity------------");

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scn.nextLine();
        Main.processName(name);
    }

    /**
     * Print out the length of the name if it is more than 10 and less than 20 characters long, and the third letter in the name
     */
    private static void processName(String name) {
        int len = name.length();
        if (len > 10 && len < 20) {
            System.out.println("Wow, " + name + " that name is between 10 and 20 characters long!");
        }
        char thirdLetter = name.charAt(2);
        System.out.println("Your name has " + len + " letters and the third letter is " + thirdLetter + ".");
    }

}
