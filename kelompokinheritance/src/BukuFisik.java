public class BukuFisik extends Buku {
    private String lokasiRak;

    public BukuFisik(String judulBuku, String kodeBuku, GenreBuku genre, String lokasiRak) {
        super(judulBuku, kodeBuku, genre);
        this.lokasiRak = lokasiRak;
    }

    public String getLokasiRak() {
        return lokasiRak;
    }

    public void setLokasiRak(String lokasiRak) {
        this.lokasiRak = lokasiRak;
    }
}
