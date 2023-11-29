package perpustakaan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransaksiPeminjaman {
    
    private int idTransaksi;
    private String waktuPeminjaman;
    private int durasiPeminjaman;

    public TransaksiPeminjaman() {
        this.idTransaksi = 100;
        this.waktuPeminjaman = getCurrentDateTime();
        this.durasiPeminjaman = 7;
    }
    
    private String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return now.format(formatter);
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setWaktuPeminjaman(String waktuPeminjaman) {
        this.waktuPeminjaman = waktuPeminjaman;
    }

    public void setDurasiPeminjaman(int durasiPeminjaman) {
        this.durasiPeminjaman = durasiPeminjaman;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public String getWaktuPeminjaman() {
        return waktuPeminjaman;
    }

    public int getDurasiPeminjaman() {
        return durasiPeminjaman;
    }
    
    public void catatanPeminjaman(Siswa siswa, Buku buku){
        System.out.println("Catatan Peminjaman:");
        System.out.println("ID Transaksi: " + this.idTransaksi);
        System.out.println("Waktu Peminjaman: " + this.waktuPeminjaman);
        System.out.println("Durasi Peminjaman: " + this.durasiPeminjaman + " hari");
        System.out.println("Siswa yang meminjam: " + siswa.getNama());
        System.out.println("Buku yang dipinjam: " + buku.getJudul());

        
    }
    
    public String toString(){
        return "Pada " + this.waktuPeminjaman;
    }
}