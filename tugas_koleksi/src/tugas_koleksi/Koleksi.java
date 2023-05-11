
package tugas_koleksi;

public class Koleksi {
    String judul;
    String penerbit;
    int tahun;
    
    public Koleksi(){
        System.out.println("Agnesya's Collection");
    }
    public void greeting(){
        System.out.println("____WELCOME____");
    }
    
    public static void main(String[] args) {
        System.out.println("[PUTRI DWI AGNESYA / 21081010142]");
        Koleksi a = new Koleksi();
        a.greeting();
        System.out.println("");
        Buku b = new Buku();
        b.greeting();
        b.judul();
        b.penulis();
        b.penerbit();
        b.tahun();
        System.out.println("");
        Majalah c = new Majalah();
        c.greeting();
        c.judul();
        c.edisi();
        c.penerbit();
        c.tahun();
        System.out.println("");
        Skripsi d = new Skripsi();
        d.greeting();
        d.penulis();
        d.judul();
        d.penerbit();
        d.tahun();
    }
}
class Buku extends Koleksi{
    String penulis;
    public Buku(){
        super();
    }
    public void greeting(){
        System.out.println("Koleksi Buku");
    }
    public void judul(){
        judul="OOP with Java";
        System.out.println("Judul Buku : '"+judul+"' ");
    }
    public void penulis (){
        penulis="Andres";
        System.out.println("Penulis Buku : "+penulis);
    }
    public void penerbit(){
        System.out.println("Penerbit Buku : Bintang Lima");
    }
    public void tahun(){
        tahun= 2012;
        System.out.println("Tahun Terbit : "+tahun);
    }
}
class Majalah extends Koleksi{
    String Edisi; 
    public Majalah(){
        super();
    }
    public void greeting(){
        System.out.println("Koleksi Majalah");
    }
    public void judul(){
        judul="Elle";
        System.out.println("Judul Majalah : '"+judul+"' ");
    }
    public void edisi (){
        System.out.println("Edisi Majalah : 1");
    }
    public void penerbit(){
        System.out.println("Penerbit Majalah : Mayapada Group");
    }
    public void tahun(){
        tahun= 2008;
        System.out.println("Tahun Terbit : "+tahun);
    }
}
class Skripsi extends Buku{
    String NPM; 
    public Skripsi(){
        super(); 
    }
    public void greeting(){
        System.out.println("Koleksi Skripsi");
    }
    public void NPM(){
        NPM="21081010142";
        System.out.println("NPM : "+NPM);
    }
    public void penulis (){
        System.out.println("Penulis Skripsi : Putri Dwi Agnesya");
    }
    public void judul (){
        System.out.println("Judul Skripsi : Software UMKM Jasa");
    }
    public void penerbit(){
        System.out.println("Penerbit Skripsi : UPNV Jatim");
    }
    public void tahun(){
        System.out.println("Tahun :2023");
    }
}