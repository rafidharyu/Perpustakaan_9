package perpustakaan;

import java.util.Date;

public class Notifikasi {

    private int idNotifikasi;
    private Date tanggal;
    private String isiPesan;
    public String jenisNotifikasi;
    public boolean status;

    public Notifikasi(int idNotifikasi, Date tanggal, String isiPesan, String jenisNotifikasi, boolean status) {
        this.idNotifikasi = idNotifikasi;
        this.tanggal = tanggal;
        this.isiPesan = isiPesan;
        this.jenisNotifikasi = jenisNotifikasi;
        this.status = status;
    }

    public int getIdNotifikasi() {
        return idNotifikasi;
    }

    public void setIdNotifikasi(int idNotifikasi) {
        this.idNotifikasi = idNotifikasi;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getIsiPesan() {
        return isiPesan;
    }

    public void setIsiPesan(String isiPesan) {
        this.isiPesan = isiPesan;
    }

    public String getJenisNotifikasi() {
        return jenisNotifikasi;
    }

    public void setJenisNotifikasi(String jenisNotifikasi) {
        this.jenisNotifikasi = jenisNotifikasi;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void createNotification(String content, String type) {
        this.isiPesan = content;
        this.jenisNotifikasi = type;
        this.status = false;
    }

    public void tandaTelahDibaca() {
        this.status = true;
    }
    
}
