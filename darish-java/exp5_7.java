package exp5_but_exp6.java;

class MarksOutOfBound extends Exception {

    MarksOutOfBound(String msg) {
        super(msg);
    }
}

public class exp5_7 {

    public static void main(String args[]) {
        try {
            int S_no = 1;
            String name = "royden";
            int C_no = 23;
            int marks = 70;
            if (marks > 100) {
                throw new MarksOutOfBound("Greater then");
            }
            if (marks < 0) {
                throw new MarksOutOfBound("less then");
            }
            System.out.println("Sr. no: " + S_no);
            System.out.println("name: " + name);
            System.out.println("Center no:" + C_no);
            System.out.println("marks: " + marks);
        } catch (MarksOutOfBound e) {
            System.out.println("Exception Caught ");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("completed");
        }
    }
}
