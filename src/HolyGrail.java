import java.util.Scanner;
/**
 * Simple I/O project using Scanner
 * @version 09.23.2022
 * @author hlevinson
 */
public class HolyGrail {
    /**
     * Main method of class HolyGrail
     * @param args command line arguments, if needed.
     */
    public static void main(String[] args) {
        // declaring local variables
        String name, quest, color;
        Scanner in = new Scanner(System.in);
        System.out.println("* A chat with the bridge keeper *\n" +
                "Who would cross the Bridge of Death must answer me these questions three, ere the other side he see. ");

        //getting user imput
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        System.out.print("Question 2: What is your quest? ");
        quest = in.nextLine();
        System.out.print("Question 3: What is your favorite color? ");
        color = in.nextLine();

        //King Arthur's response
        System.out.println("King Arthur says, \"You have to know these things when you're a king, you know.\"");

        System.out.println("Your name is: " + name);
        System.out.println("Your quest is: " + quest);
        System.out.println("Your favorite color is: " + color);
        System.out.println("* end of program *");

    }
}
