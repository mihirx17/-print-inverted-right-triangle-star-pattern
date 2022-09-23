///@mihirx17
import java.util.*;
public class Main {
    public  static  void inverted_star_pattern() {
        int row, cl;
        System.out.println("Enter your Row values===");
        Scanner Sc = new Scanner(System.in);
        row = Sc.nextInt();
        for (int i = row; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
inverted_star_pattern();

    }
}
///NOTHING IS GOOD LIKE YOU
