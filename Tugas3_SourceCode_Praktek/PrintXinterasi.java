import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */
public class PrintXinterasi {

    public static void main(String[] args) {
        // Kamus :
        int sum = 0;  
        int x;
        Scanner masukan = new Scanner(System.in);
        /* Program */
        System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */
        if (x == 999) {
            System.out.print("Kasus kosong \n");
        } else { /* Minimal ada satu data yang dijumlahkan */
            sum = x; /* Inisialisasi; invariant !! */
            while (true) { // Mengganti for (;;) dengan while (true)
                System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */
                if (x == 999)
                    break;
                else {
                    sum = sum + x; /* Proses */
                }
            }
        }
        System.out.println("Hasil penjumlahan = " + sum);
        /* Terminasi */
        masukan.close(); // Tutup Scanner untuk menghindari kebocoran sumber daya
    }
}
