import java.util.Scanner;
public class Percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = input.nextInt();
        System.out.print("Pangkat: ");
        pangkat = input.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat);
        for (int i = 0; i < pangkat; i++) {
            System.out.print(bilangan);
            if (i < pangkat - 1) {
                System.out.print(" x ");
            }
        }
        System.out.print(" = ");
        System.out.println(hasil);
    }
}
