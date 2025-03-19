import java.util.Scanner;

public class JavaIoScanner {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int nim;
        String name;

        System.out.print("Masukan NIM: ");
        nim = read.nextInt();

        System.out.print("Masukan Name: ");
        name = read.nextLine();

        System.out.println("DATA MAHASISWA");
        System.out.println("nim: " + nim);
        System.out.println("name: " + name);
    }
}
