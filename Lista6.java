import java.util.Arrays;
import java.util.Scanner;

public class Lista6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num[] = new int[5];
        int i = 0;
        System.out.println("digite 5 numeros ");
        while (i <= 4) {
            System.out.println("digite o " + (i + 1) + "º numero");
            num[i] = scanner.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(num));
    }
}
