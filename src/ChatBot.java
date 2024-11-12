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




    }
}
