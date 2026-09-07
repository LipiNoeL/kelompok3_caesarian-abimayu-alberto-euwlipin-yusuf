import java.util.List;
import java.util.ArrayList;

public class Member {
    private String nama;
    private String idMember;
    private List<Buku> daftarPinjaman;  // Relasi Many-to-Many ke Buku

    public Member(String nama, String idMember) {
        this.nama = nama;
        this.idMember = idMember;
        this.daftarPinjaman = new ArrayList<>();
    }

    // Getters and setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public List<Buku> getDaftarPinjaman() {
        return daftarPinjaman;
    }

    // Relasi Many-to-Many: member meminjam buku
    public void tambahPinjaman(Buku buku) {
        if (!daftarPinjaman.contains(buku)) {
            daftarPinjaman.add(buku);
            buku.tambahPeminjam(this); // sinkronkan sisi Buku
        }
    }

    public void tampilkanDaftarPinjaman() {
        System.out.println("Daftar Buku yang dipinjam " + nama + ":");
        for (Buku buku : daftarPinjaman) {
            System.out.println("- " + buku.getJudulBuku() + " (" + buku.getKodeBuku() + ")");
        }
    }
}
