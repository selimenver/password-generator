import java.security.SecureRandom;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        SecureRandom rng = new SecureRandom();
        Scanner reader = new Scanner(System.in);

        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+[]{}|;:,.<>?/~1234567890";
        boolean exit = false;

        while (!exit) {
            String password = "";
            System.out.println("How long do you want your password length to be?");
            int answer = reader.nextInt();
            reader.nextLine();

            for (int i = 1; i <= answer; i++) {
                int randomPassword = rng.nextInt(letters.length());
                char randomChar = letters.charAt(randomPassword);
                password += randomChar;
            }
            System.out.println("Your new password: " + password);

            System.out.println("do you want to create another password? (y or n)");
            String option = reader.nextLine().trim();

            if (option.equalsIgnoreCase("y")) {

            } else if (option.equalsIgnoreCase("n")) {
                System.out.println("quitting program.");
                exit = true;
            }
            else{
                System.out.println("please type a valid answer.");
            }
        }
    }
}
