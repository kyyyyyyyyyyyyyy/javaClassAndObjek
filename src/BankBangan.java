import java.util.Scanner;   //import class scanner

public class BankBangan {   //nama class
    public static void main (String []args) {
        Scanner read = new Scanner(System.in);  //deklarasi objek scanner
        int balance = 0,suggest, transaction, plus, minus;  //deklarasi variabel
        //output yang menampilkan instruksi
            System.out.println("------------------------------------------");
            System.out.println("Selamat Datang Di ATM Abal Abal");
            System.out.println("masukan 0 untuk melakukan setor tunai");
            System.out.println("masukan 1 untuk melakaukan tarik tunai");
            System.out.println("masukan 2 untuk mengcheck saldo");
            System.out.println("masukan 3 untuk keluar dari ATM abal abal");
        //membuat agar aplikasi terus berjalan, sebelum user memutuskan untuk keluar
        while (true) {
            System.out.print("Masukan angka 0 atau 1: ");   //output untuk memasukan jenis transaksi
            transaction = read.nextInt();   //menyimpat input dari user

            if (transaction == 0) { //pengkondisian angka 0 sebagai setor tunai
                System.out.print("masukan nominal yang ingn di setorkan: ");    //output yang akan ditampilkan
                plus = read.nextInt();  //menyimpan nominal saldo yang di setorkan
                balance += plus;    //menambah saldo sesuai dengan nominal yang user inputkan
                System.out.println("setor tunai berhasil, saldo kamu: " + balance); //output untuk menampilkan saldo setelah setor tunai
            } else if (transaction == 1) {  //pengkondisian angka 1 sebagai tarik
                if (balance <= 5000){   //pengkondisian jika saldo kurang dari 5k, maka uang tersebut tidak dapat di tarik
                    System.out.println("saldo kamu sisa " + balance +" masih kurang dari 5000 nih");    //output jika saldo di bawah 5k
                }
                System.out.print("masukan nominal yang ingn anda tarik:");  //output jika saldo diatas 5k
                minus = read.nextInt(); //menyimpan nominal saldo yang ingin di tarik
                suggest = balance - minus;  //simulasi saldo di kurangi inputan yang ingin di tarik
                if (suggest < 5000) {   //pengecekan apakah saldo di bawah 5k setelah di tarik
                    System.out.println("saldonya gabisa di ambil semua nih, harus ada sisa minimal 5000");  //output jika hasil simulasi saldo di bawah 5k
                } else {    //jika masih mememiliki saldo 5k atau lebih
                    balance -= minus;   //pengurangan saldo dari nominal yang ingn di tarik
                    System.out.println("tarik tunai sebesar " + minus + " berhasil, saldo kamu: " + balance);   //output penarikan berhasil
                }
            } else if(transaction == 2) {   //pengkondisian angka 2 sebagai cek saldo
                System.out.println("saldo anda saat ini: " + balance);  //output untuk cek saldo
            }else if ( transaction == 3) {  //pengkondisian 3 untuk keluar dari program
                System.out.println("terimakasih telah menggunakan ATM abal abal");  //output sebelum keluar program
                break;  //keluar dari perulangan
            } else {    //pngecekan jika inputan di luar angka 0-3
                System.out.println("inputan yang kamu masukan tidak valid");    //output jika menginputkan angka selain 0-3
            }
        }

        read.close();   //menutup objek scanner
    }
}
