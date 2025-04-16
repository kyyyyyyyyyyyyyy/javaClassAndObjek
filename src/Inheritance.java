public class Inheritance {
    public static void main (String[] args) {
        laptop vaio = new laptop();
        teknologi t = new teknologi();
        System.out.println(t.spek() + " " + vaio.spek() + " ");
    }
}

class teknologi {
    String toko = "mandet jaya united";

    public teknologi() {
        System.out.println("Kuningan");
    }

    public String spek() {
        return ("Spesifikasi Komputer");
    }
}

class laptop extends teknologi {

    public laptop() {
        super();
    }

    public String spek() {
        return ("intel i5, ssd 1 TB (" + toko + ")");
    }
}
