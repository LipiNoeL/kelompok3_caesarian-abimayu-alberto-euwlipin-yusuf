import java.util.List;
import java.util.ArrayList;

public class GenreBuku {
    private String kodeGenre;
    private String namaGenre;
    private List<Buku> daftarBuku;

    public GenreBuku(String namaGenre, String kodeGenre) {
        this.namaGenre = namaGenre;
        this.kodeGenre = kodeGenre;
        this.daftarBuku = new ArrayList<>();
    }

    public String getKodeGenre() {
        return kodeGenre;
    }

    public void setKodeGenre(String kodeGenre) {
        this.kodeGenre = kodeGenre;
    }

    public String getNamaGenre() {
        return namaGenre;
    }

    public void setNamaGenre(String namaGenre) {
        this.namaGenre = namaGenre;
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public void tambahBuku(Buku buku) {
        if (!daftarBuku.contains(buku)) {
            daftarBuku.add(buku);
            buku.setGenre(this);
        }
    }

    public void tampilkanDaftarBuku() {
        System.out.println("Daftar Buku dengan Genre " + namaGenre + ":");
        for (Buku buku : daftarBuku) {
            System.out.println("- " + buku.getJudulBuku() + " (" + buku.getKodeBuku() + ")");
        }
    }
}