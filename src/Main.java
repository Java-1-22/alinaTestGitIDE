import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        int c = in.nextInt();
        System.out.println("Echo: " + word + "-" + (word.charAt(c)) + "-" + (word.charAt(c)) + "-" + (word.charAt(c)) + "!");


    }

}