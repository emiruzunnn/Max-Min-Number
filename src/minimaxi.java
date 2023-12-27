import java.util.Scanner;

public class minimaxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kac tane sayi gireceksiniz: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Gecerli bir pozitif sayi giriniz.");
            return;
        }

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Sayiyi giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);

        scanner.close();
    }
}
