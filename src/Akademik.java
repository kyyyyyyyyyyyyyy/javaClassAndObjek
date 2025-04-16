public class Akademik {
    public static void main(String[] args) {
        mahasiswa kayu = new mahasiswa(2024081, "Asep", "PBO");
        kayu.setGrade(100, 100);
        System.out.println(kayu.biodata());
        System.out.println("NILai: " + kayu.grade());
        System.out.print("Nama panggilan: ");
        kayu.nickName();
    }
}

class human {
    public String name;

    protected human (String data) {
        this.name = data;
    }

    public String biodata () {
        return ("Name: " + this.name);
    }
}

class mahasiswa extends human {
    public int nim;
    public String mataKuliah;
    public double uts, uas;

    public void setGrade(double r, double s) {
        uts = r;
        uas = s;
    }

    public double grade () {
        double countGrade = (uts + uas) / 2;
        return countGrade;
    }

    public mahasiswa (int no, String nameMhs, String matkul) {
        super(nameMhs);
        this.nim = no;
        this.mataKuliah = matkul;
    }

    public String biodata() {
        return (super.biodata() + "\nNIM: " + nim + "\nmata kuliah: " + mataKuliah);
    }

    public void nickName () {
        System.out.println("bandar");
    }

    public String nickName (String nickname) {
       return nickname;
    }

}
