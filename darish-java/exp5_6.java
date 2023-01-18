package exp5_but_exp6.java;

class myException extends Exception {

    myException(String msg) {
        super(msg);
    }
}

public class exp5_6 {

    public static void main(String args[]) {
        try {
            int marks = 101;
            if (marks > 100) {
                throw new myException("Greater then");
            }
            System.out.println(marks);
        } catch (myException e) {
            System.out.println("Exception Caught ");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("completed");
        }
    }
}
