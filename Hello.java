import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello! What's your name?");
        Scanner getname = new Scanner(System.in);
        String name = getname.nextLine();
        System.out.println("Nice to meet you, " + name + ".");
    }
}
