import java.io.*;

public class JavaInputOutput {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int nim;
        String name;

        System.out.print("Masukan NIM: ");
        nim = Integer.parseInt(read.readLine());

        System.out.print("Masukan Name: ");
        name = read.readLine();

        System.out.println("DATA MAHASISWA");
        System.out.println("nim: " + nim);
        System.out.println("name: " + name);
    }

}
