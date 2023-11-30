public class Tugas1 {

    static void deretrekursif(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            deretRekursif(n - 1);
        }
    }
    static void deretRekursif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Deret Rekursif");
        deretRekursif(n);
        System.out.println("Deret Iteratif");
        deretRekursif(n);
    }
}