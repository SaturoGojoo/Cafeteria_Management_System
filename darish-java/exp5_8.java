
import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException (String msg){
        super(msg);
    }
}

public class exp5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (password.length() <=8 ) {
                throw new InvalidPasswordException("Enter valid password.");
            } else{
                System.out.println("Login sucessfully...");
            }
        } catch (InvalidPasswordException e) {
            System.out.println("Password is too weak..");
            System.out.println(e.getMessage());
        }

    }
}
