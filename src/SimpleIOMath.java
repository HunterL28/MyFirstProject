import java.util.Scanner;
/**
 * Simple I/O project using Objects
 * @version 09.23.2022
 * @author hlevinson
 */
// Declaring Local Variables
public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     * Prompts user to answer their name, age, and favorite number that is stated by the computer
     * "Sings" the song to the user
     */
    public void promptUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("* Sit yourself down, take a seat *\n" +
                "* All you gotta do is repeat after me *");
        // Getting user input
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("How old are you? ");
        age = in.nextInt();
        System.out.print("What is your favorite number? ");
        favNumber = in.nextInt();
        System.out.println("""
                I'm gonna teach you how to sing it out
                Come on, come on, come on
                Let me tell you what it's all about
                Reading, writing, arithmetic
                Are the branches of the learning tree""");
    }

    /**
     * Returns values written by user
     * Returns other information such as age at next birthday, the smallest Prime Factor of age, favorite number squared
     */
    public void printInfo() {
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + (age - 1));
        System.out.println("At your next birthday, you will turn " + (age + 1) + ".");
        System.out.println("The first prime factor of " + age + " is: " + smallestPrimeFactor(age));
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + (int)(Math.pow(favNumber, 2)));
        System.out.println("* end of program *");
    }

    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    private int smallestPrimeFactor(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (isPrime(i)) {
                if (num % i == 0)
                    return i;
            }
        }
        return num;
    }

    /**
     * Main method for class SimpleIOMath
     * @param args command-line arguments, if needed
     */
    public static void main(String[] args) {
        SimpleIOMath app = new SimpleIOMath();
        app.promptUser();
        app.printInfo();
    }
}
