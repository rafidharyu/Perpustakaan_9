/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author ACER
 */
public class Buku {

    private String judul;
    private String pengarang;
    private String nomor_ISBN;
    private boolean status_ketersediaan;
    private String kategori;
    private int tahun_terbit;

    public Buku(String judul, String pengarang, String nomor_ISBN, boolean status_ketersediaan, String kategori, int tahun_terbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.nomor_ISBN = nomor_ISBN;
        this.status_ketersediaan = status_ketersediaan;
        this.kategori = kategori;
        this.tahun_terbit = tahun_terbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getNomor_ISBN() {
        return nomor_ISBN;
    }

    public void setNomor_ISBN(String nomor_ISBN) {
        this.nomor_ISBN = nomor_ISBN;
    }

    public boolean isStatus_ketersediaan() {
        return status_ketersediaan;
    }

    public void setStatus_ketersediaan(boolean status_ketersediaan) {
        this.status_ketersediaan = status_ketersediaan;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }
}
