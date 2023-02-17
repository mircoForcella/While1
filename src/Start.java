import static java.lang.Thread.sleep;

public class Start {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("I am in loop");
                sleep(1000);
            } catch (InterruptedException e) {
            }

        }
    }
}
