import java.util.Scanner;

/**
 * Tugas
 */
public class Tugas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, tot, rata;
        int[][] surve = new int[10][6];

        for (i = 0; i < surve.length; i++) {
            System.out.println("Responden ke- " + (i + 1));
            for (j = 0; j < surve[i].length; j++) {
                System.out.print("Pertanyaan ke- " + (j + 1) + " bernilai: ");
                surve[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < surve.length; i++) {
            tot = 0;
            for (j = 0; j < surve[i].length; j++) {
                tot += surve[i][j];
            }
            rata = tot / 6;
            System.out.println("Rata-rata setiap responden ke- " + (i + 1) + ": " + rata);

        }
        for (j = 0; j < surve[0].length; j++) {
            tot = 0;
            for (i = 0; i < surve.length; i++) {
                tot += surve[i][j];
            }
            i = 0;
            rata = tot / 10;
            System.out.println("Rata-rata setiap pertanyaan ke- " + (j + 1) + ": " + rata);
            i++;
        }
    }
}