import java.util.Scanner;

/* Contoh program yang mengandung prosedur dan fungsi */
/* prosedur/fungsi */

public class SubProgram {

    /*** Fungsi ***/
    public static int maxab(int a, int b) {
        /* mencari maksimum dua bilangan bulat */
        return ((a >= b) ? a : b);
    }

    /*** Prosedur ***/
    public static void tukar(int[] arr) {
        /* menukar dua bilangan bulat */
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println("Ke dua bilangan setelah tukar: a = " + arr[0] + " b = " + arr[1]);
    }

    /*** Program Utama ***/
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Membaca dua bilangan integer */
        /* Menuliskan maksimum dua bilangan yang dibaca 
        dg memanggil fungsi */
        /* Menukar kedua bilangan dengan 'prosedur' */
        int a, b;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Maksimum dua bilangan \n");
        System.out.print("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
        a = masukan.nextInt();
        b = masukan.nextInt();
        System.out.println("Ke dua bilangan : a = " + a + " b = " + b);
        System.out.println("Maksimum = " + maxab(a, b));

        // Memodifikasi nilai variabel a dan b dengan array
        int[] arr = {a, b};
        tukar(arr);
        a = arr[0];
        b = arr[1];

        masukan.close(); // Tutup Scanner untuk menghindari kebocoran sumber daya
    }
}
