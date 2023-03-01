import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {

        Scanner inScan = new Scanner(System.in);
        String name = inScan.next();
        System.out.println("Hello " + name);
    }
}
