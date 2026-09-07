import java.util.List;
import java.util.ArrayList;

public class Buku {
    private String kodeBuku;
    private String judulBuku;
    private GenreBuku genre;                  // Relasi Many-to-One ke GenreBuku
    private List<Member> daftarPeminjam;       // Relasi Many-to-Many ke Member

    public Buku(String judulBuku, String kodeBuku, GenreBuku genre) {
        this.judulBuku = judulBuku;
        this.kodeBuku = kodeBuku;
        this.daftarPeminjam = new ArrayList<>();
        if (genre != null) {
            genre.tambahBuku(this); // otomatis daftar ke genre saat buku dibuat
        }
    }

    // Getters and setters
    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public GenreBuku getGenre() {
        return genre;
    }

    // Dipanggil dari GenreBuku.tambahBuku() agar relasi tetap sinkron
    public void setGenre(GenreBuku genre) {
        if (this.genre != genre) {
            this.genre = genre;
            genre.tambahBuku(this);
        }
    }

    public List<Member> getDaftarPeminjam() {
        return daftarPeminjam;
    }

    // Relasi Many-to-Many: buku dipinjam oleh member
    public void tambahPeminjam(Member member) {
        if (!daftarPeminjam.contains(member)) {
            daftarPeminjam.add(member);
            member.tambahPinjaman(this); // sinkronkan sisi Member
        }
    }

    public void tampilkanPeminjam() {
        System.out.println("Buku \"" + judulBuku + "\" sedang/pernah dipinjam oleh:");
        for (Member member : daftarPeminjam) {
            System.out.println("- " + member.getNama() + " (" + member.getIdMember() + ")");
        }
    }
}
