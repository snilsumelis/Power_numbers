import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        System.out.print("Bir sayı giriniz: ");
        int k = input.nextInt();

        int total=1;

        for (int i = 1; i<=k; i++){
            total *=n;
        }
        System.out.print(total);
    }
}