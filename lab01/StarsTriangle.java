import java.util.Scanner;

public class StarsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of stars: ");
        int starNumber = scanner.nextInt();
        for (int i = 0; i < starNumber; i++) {
            for (int j = 0; j < starNumber - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
