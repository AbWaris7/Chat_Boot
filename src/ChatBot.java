import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String botName = "Mr.Reboot";
        int brithYear = 1996;

        System.out.println("Hello! My name is " + botName);
        System.out.println("I was created in "+brithYear);

        System.out.println("Please, remind me your name.");
        String guestName = input.nextLine();
        System.out.println("What a great name you have, "+guestName);

        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = input.nextInt();
        int remainder5 = input.nextInt();
        int remainder7 = input.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is "+age+"; that's a good time to start programming!");


    }
}
