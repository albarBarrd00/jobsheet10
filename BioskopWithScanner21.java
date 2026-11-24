import java.util.Scanner;
/**
 * BioskopWithScanner21
 */
public class BioskopWithScanner21 {

    public static void main(String[] args) {
        int baris, kolom, menu;
        String nama, next;
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int i;

        while (true) {
            System.out.println("MENU BIOSKOP:");
            System.out.println("1. input data penonton");
            System.out.println("2. tampilkan daftar penonton");
            System.out.println("3. exit");
            System.out.print("pilih menu(1/2/3): ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                for (int j = 0; j < penonton.length; j++) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();

                    if (kolom < 1 || baris <1 || baris > penonton.length || kolom > penonton[0].length) {
                        System.out.println("Baris/Kolom kursi tidak tersedia");
                        System.out.print("masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                    }
                    sc.nextLine();

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {

                for (i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton pada baris ke- " + (i + 1) + ": " + String.join(", ", penonton[i]));
                }
            } else if (menu == 3) {
                System.out.println("program selesai");
                break;
            } else {
                System.out.println("piihan tidak valid");
            }
        }

    }
}