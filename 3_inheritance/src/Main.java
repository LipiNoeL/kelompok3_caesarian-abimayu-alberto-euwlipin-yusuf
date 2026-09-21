public class Main {

    public static void main(String[] args) {
        GenreBuku genre1 = new GenreBuku("Fiksi", "GN001");
        GenreBuku genre2 = new GenreBuku("Sains", "GN002");
        GenreBuku genre3 = new GenreBuku("Sejarah", "GN003");

        // Instansiasi subclass BukuFisik dan BukuDigital
        Buku buku1 = new BukuFisik("Laskar Pelangi", "BK001", genre1, "Rak A-12");
        Buku buku2 = new BukuFisik("Bumi Manusia", "BK002", genre1, "Rak A-15");
        Buku buku3 = new BukuDigital("Sejarah Singkat Waktu", "BK003", genre2, 4.5);
        Buku buku4 = new BukuDigital("Sapiens", "BK004", genre3, 12.0);

        System.out.println("=== DETAIL BUKU (IMPLEMENTASI ABSTRAKSI) ===");
        buku1.tampilkanInfoBuku();
        buku2.tampilkanInfoBuku();
        buku3.tampilkanInfoBuku();
        buku4.tampilkanInfoBuku();

        Member mem1 = new Member("Rian", "MB001");
        Member mem2 = new Member("Abi", "MB002");
        Member mem3 = new Member("Ipin", "MB003");

        System.out.println("\n=== FITUR PEMINJAMAN (IMPLEMENTASI INTERFACE) ===");
        // Menggunakan metode dari Interface DapatDipinjam
        buku1.pinjamBuku(mem1);
        buku3.pinjamBuku(mem1);
        buku1.pinjamBuku(mem2);
        buku2.pinjamBuku(mem3);
        buku4.pinjamBuku(mem3);

        System.out.println("\n=== DAFTAR BUKU PER GENRE ===");
        genre1.tampilkanDaftarBuku();
        genre2.tampilkanDaftarBuku();
        genre3.tampilkanDaftarBuku();

        System.out.println("\n=== DAFTAR PINJAMAN PER MEMBER ===");
        mem1.tampilkanDaftarPinjaman();
        mem2.tampilkanDaftarPinjaman();
        mem3.tampilkanDaftarPinjaman();

        System.out.println("\n=== DAFTAR PEMINJAM PER BUKU ===");
        buku1.tampilkanPeminjam();
        buku2.tampilkanPeminjam();
        buku3.tampilkanPeminjam();
        buku4.tampilkanPeminjam();

        System.out.println("\n=== DEMO PENGEMBALIAN BUKU ===");
        buku1.kembalikanBuku(mem1);
        System.out.println("Status peminjam " + buku1.getJudulBuku() + " setelah Rian mengembalikan:");
        buku1.tampilkanPeminjam();
    }
}