/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ACER
 */
public class Admin {
    private String nama_pengguna;
    private String kata_sandi;

    ArrayList<Siswa> add = new ArrayList<>();
    ArrayList<Buku> daftarbuku = new ArrayList<>();
    ArrayList<Notifikasi> aktivitas = new ArrayList<>();
    
    public Admin(String nama_pengguna, String kata_sandi) {
        this.nama_pengguna = nama_pengguna;
        this.kata_sandi = kata_sandi;
    }
    
    public boolean checkLogin(String nama_pengguna, String kata_sandi) {
        return nama_pengguna.equals(nama_pengguna) && kata_sandi.equals(kata_sandi);
    }

    public void addSiswa (String nama, String nomor_siswa, ArrayList<String> daftar_pinjam){
        Siswa anggota = new Siswa(nama, nomor_siswa, daftar_pinjam);
        add.add(anggota);
    }
    
    public void addSiswa (Siswa anggota){
        add.add(anggota);
    }
    
    
    
    public void removeSiswa(String nama){
        boolean ditemukan = false;
        for(Siswa value : add){
            if(value.getNama().contains(nama)){
                add.remove(value);
                System.out.println("Berhasil Menghapus " + value.getNama() + "\n");
                ditemukan = true;
                break;
            }
        }   
        if(!ditemukan){
            System.out.println("Anggota Tidak Ditemukan");
        }
    }
    
    public void addBuku(String judul, String pengarang, String nomor_ISBN, boolean status_ketersediaan, String kategori, int tahun_terbit){
        Buku daftar = new Buku(judul, pengarang, nomor_ISBN, status_ketersediaan, kategori, tahun_terbit);
        System.out.println("============================== Notifikasi ===============================");
        System.out.println("Buku Baru Telah Tersedia!");
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Kategori : " + kategori);
        System.out.println("Tahun Terbit : " + tahun_terbit);
        System.out.println("");
        daftarbuku.add(daftar);
    }
    
    public void addBuku(Buku buku){
        daftarbuku.add(buku);
    }
    
    
    
    public void removeBuku(String Judul){
        for(Buku value : daftarbuku){
            if(value.getJudul().contains(Judul)){
                daftarbuku.remove(value);
            }
        }
    }
    
    public void tampilkanAnggota(){
        System.out.print("====================== Daftar Siswa Perpustakaan SMALAN =========================");
        
        for(Siswa value : add){
            System.out.println("\nNama               : " + value.getNama());
            System.out.println("\nNomor              : "+value.getNomor_siswa());
            System.out.println("Riwayat Peminjaman : "+value.getDaftar_pinjam());
        }
        System.out.println("=========================================================================\n");
    }
    
    public String getNama_pengguna() {
        return nama_pengguna;
    }

    public void setNama_pengguna(String nama_pengguna) {
        this.nama_pengguna = nama_pengguna;
    }

    public String getKata_sandi() {
        return kata_sandi;
    }

    public void setKata_sandi(String kata_sandi) {
        this.kata_sandi = kata_sandi;
    }

    boolean validateLogin(String usernameInput, String passwordInput) {
        return usernameInput.equals(this.nama_pengguna) && passwordInput.equals(this.kata_sandi);
    }
}