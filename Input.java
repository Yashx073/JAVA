import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        System.out.println("Hey what is ur name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Your name is " + name);
        input.close();

    }
}