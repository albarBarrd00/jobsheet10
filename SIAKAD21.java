import java.util.Scanner;

/**
 * SIAKAD21
 */
public class SIAKAD21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlhMhs, jmlhMatkul;

        System.out.print("Jumlah mahasiswa yang akan di input nilainya: ");
        jmlhMhs = sc.nextInt();
        System.out.print("jumlah matkul yang akan di input: ");
        jmlhMatkul = sc.nextInt();
        int[][] nilai = new int[jmlhMhs][jmlhMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Input nilai mahasiswa ke- " + (i + 1));
            double totalPerSiswa = 0;
            System.out.println();

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa / jmlhMatkul);
        }
        sc.nextLine();
        System.out.println("\n=============================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j = 0; j < jmlhMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jmlhMhs; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / jmlhMhs);
        }
    }
}