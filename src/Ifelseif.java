import java.util.Scanner;

public class Ifelseif {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int grade;

        System.out.print("Masukan nilai anda: ");
        grade = read.nextInt();

        if(grade >= 85 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 75 && grade < 85) {
            System.out.println("B");
        } else if (grade >= 50 && grade < 75) {
            System.out.println("C");
        } else if (grade >= 0 && grade < 50) {
            System.out.println("D");
        }else {
            System.out.println("Nilai anda tidak valid");
        }

    }
}
