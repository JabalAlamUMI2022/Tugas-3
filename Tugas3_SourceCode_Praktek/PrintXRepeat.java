import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */

public class PrintXRepeat {

    public static void main(String[] args) {
        // Kamus :
        int sum; 
        int x;
        Scanner masukan = new Scanner(System.in);
        /* Program */
        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */

        if (x == 999) {
            System.out.print("Kasus kosong \n");
        } else { /* Minimal ada satu data yang dijumlahkan */

            sum = 0; /* Inisialisasi; invariant !! */
            do {
                sum = sum + x; /* Proses */
                System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */
            } while (x != 999); /* Kondisi pengulangan */

            System.out.println("Hasil penjumlahan = " + sum);
        }

        masukan.close();     }
}
