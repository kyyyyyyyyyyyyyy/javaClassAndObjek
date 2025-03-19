import java.util.Scanner;

public class Array {
    public static void main (String []args) {
        Scanner read = new Scanner(System.in);
        int jumlah, i;

        System.out.print("masukan lebar array:");
        jumlah = read.nextInt();
        read.nextLine();

        String [] buah = new String[jumlah];

        for (i = 0; i < jumlah; i++) {
            System.out.print("masukan array ke-" + i + ":");
            buah[i] = read.nextLine();
        }

        for (i = 0; i < jumlah; i++) {
            System.out.println("index ke " + i + " adalah " + buah[i]);
        }

        read.close();

    }
}
