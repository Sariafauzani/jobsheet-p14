import java.util.Scanner;
public class Tugas3 {

    static boolean cekPrima(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;

        System.out.print("Masukkan Bilangan: ");
        bilangan = input.nextInt();

        if (cekPrima(bilangan)) {
            System.out.println("Bilangan " + bilangan + " adalah bilangan prima");
        } else {
            System.out.println("Bilangan " + bilangan + " bukan bilangan prima");
        }
    }
}
