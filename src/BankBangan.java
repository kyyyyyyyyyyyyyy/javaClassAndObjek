import java.util.Scanner;

public class BankBangan {
    public static void main (String []args) {
        Scanner read = new Scanner(System.in);
        int balance = 0,suggest, transaction, plus, minus;
//        char transaction;
            System.out.println("------------------------------------------");
            System.out.println("Selamat Datang Di ATM Abal Abal");
            System.out.println("masukan 0 untuk melakukan setor tunai");
            System.out.println("masukan 1 untuk melakaukan tarik tunai");
            System.out.println("masukan 2 untuk mengcheck saldo");
            System.out.println("masukan 2 untuk keluar dari ATM abal abal");
        while (true) {
            System.out.print("Masukan angka 0 atau 1: ");
            transaction = read.nextInt();

            if (transaction == 0) {
                System.out.print("masukan nominal yang ingn di setorkan: ");
                plus = read.nextInt();
                balance += plus;
                System.out.println("setor tunai berhasil, saldo kamu: " + balance);
            } else if (transaction == 1) {
                if (balance <= 5000){
                    System.out.println("saldo kamu sisa " + balance +" masih kurang dari 5000 nih");
                }
                System.out.print("masukan nominal yang ingn anda tarik:");
                minus = read.nextInt();
                suggest = balance - minus;
                if (suggest <= 5000) {
                    System.out.println("saldonya gabisa di ambil semua nih, harus ada sisa minimal 5000");
                } else {
                    balance -= minus;
                    System.out.println("tarik tunai berhasil, saldo kamu: " + balance);
                }
            } else if(transaction == 2) {
                System.out.println("saldo anda saat ini: " + balance);
            }else if ( transaction == 3) {
                System.out.println("terimakasih telah menggunakan ATM abal abal");
                break;
            } else {
                System.out.println("inputan yang kamu masukan tidak valid");
            }
        }

        read.close();
    }
}
