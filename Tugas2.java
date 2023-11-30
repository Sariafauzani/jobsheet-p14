public class Tugas2 {

    static int hitungPenjumlahan(int f) {
        if (f == 1) {
            return 1;
        } else {
            return f + hitungPenjumlahan(f - 1);
        }
    }

    public static void main(String[] args) {
        int f = 8;

        System.out.println("Jumlah bilangan dari 1 sampai " + f + " adalah: " + hitungPenjumlahan(f));
    }
}
