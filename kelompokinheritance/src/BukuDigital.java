public class BukuDigital extends Buku {
    private double ukuranFileMB;

    public BukuDigital(String judulBuku, String kodeBuku, GenreBuku genre, double ukuranFileMB) {
        super(judulBuku, kodeBuku, genre);
        this.ukuranFileMB = ukuranFileMB;
    }

    public double getUkuranFileMB() {
        return ukuranFileMB;
    }

    public void setUkuranFileMB(double ukuranFileMB) {
        this.ukuranFileMB = ukuranFileMB;
    }
}
