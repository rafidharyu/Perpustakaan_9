package perpustakaan;

public class TransaksiPengembalian {
    private String judul;
    private int idTransaksi;
    private String tanggalPeminjaman;
    private double denda;

    public TransaksiPengembalian(String judul, int idTransaksi, String tanggalPeminjaman, double denda) {
        this.judul = judul;
        this.idTransaksi = idTransaksi;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.denda = denda;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(String tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }
    
    public String toString(){
        return "Buku '" + this.judul +"' Id Transaksi " + this.idTransaksi;
    }
    
}