public class Tugas4 {

    public static void main(String[] args) {
        int n;

        // Input bilangan n
        System.out.print("Masukkan bilangan n: ");
        n = Integer.parseInt(System.console().readLine());

        // Hitung jumlah pasangan marmut secara rekursif
        int hasil = jumlahMarmutRekursif(n);

        // Tampilkan hasil perhitungan
        System.out.println("Jumlah pasangan marmut: " + hasil);
    }

    // Fungsi rekursif untuk menghitung jumlah pasangan marmut
    static int jumlahMarmutRekursif(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return jumlahMarmutRekursif(n - 1) + jumlahMarmutRekursif(n - 2);
        }
    }
}
