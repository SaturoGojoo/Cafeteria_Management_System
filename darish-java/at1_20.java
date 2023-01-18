public class at1_20 {
    public static void main(String[] args) {
        try {
            System.out.println("Sleeping for 500 milliseconds...");
            Thread.sleep(500);
            System.out.println("Thread awoke!");
        }
        catch (InterruptedException ie) {
            System.out.println("Sleep interrupted: "+ ie.getMessage());
        }
    }
}
