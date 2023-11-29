/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;
import java.util.ArrayList;
import java.util.List;

public class Siswa {

    static void add(Siswa agt1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nama;
    private String nomor_siswa;
    private List<String> daftar_pinjam;
//    private Admin admin;
 
    public Siswa(String nama, String nomor_siswa, List<String> daftar_pinjam) {
        this.nama = nama;
        this.nomor_siswa = nomor_siswa;
        List<String> ArrayList = daftar_pinjam;
        this.daftar_pinjam = new ArrayList<>(daftar_pinjam);
//        this.admin = admin;
    }
    
    private TransaksiPeminjaman transaksi;
    private Admin admin;
    public Siswa(Admin admin, String nama, String nomor_siswa, TransaksiPeminjaman transaksi) {
        this.admin = admin;
        this.nama = nama;
        this.nomor_siswa = nomor_siswa;
        this.transaksi = transaksi;
        admin.addSiswa(this);
    }
    
    private TransaksiPengembalian riwayatTransaksi;
    ArrayList<TransaksiPengembalian> daftarTransaksi = new ArrayList<>();
    StringBuilder rekapTransaksi = new StringBuilder();
    ArrayList<Buku> bukuPinjaman = new ArrayList<>();
    
    public void melihatBuku(){
        System.out.println("============================= Daftar Buku ===============================\n");
        for(Buku value : admin.daftarbuku){
            System.out.println("Judul        : " + value.getJudul());
            System.out.println("Pengarang    : "+value.getPengarang());
            System.out.println("NomorISBN    : "+value.getNomor_ISBN());
            System.out.println("Ketersediaan : "+value.isStatus_ketersediaan());
            System.out.println(" ");
        }
        System.out.println("=========================================================================\n");
    }
    
    public void peminjamanBuku(String judul){
        StringBuilder pinjam = new StringBuilder();
        boolean ditemukan = false;
        System.out.println("\n=========================== Peminjaman Buku =============================");
        for (Buku value : admin.daftarbuku){
            if (value.getJudul().equals(judul) && value.isStatus_ketersediaan()){
                pinjam.append("Peminjam          : "+ nama).append("\nNomor Anggota     : " + nomor_siswa);
                pinjam.append("\nMeminjam Buku     : " + value.getJudul());
                bukuPinjaman.add(value);
                //admin.daftarbuku.remove(value);
                value.setStatus_ketersediaan(false);
                ditemukan = true;
                rekapTransaksi.append(judul + ", ");
                //riwayatPeminjaman = rekapTransaksi.toString();
                break;
            }
    }
    }
    
    public void pengembalianBuku(String judul, int durasiPengembalian){
        boolean berhasil = false;
        for(Buku value  : bukuPinjaman){
            if(value.getJudul().equals(judul)){
//                admin.daftarbuku.add(value);
                value.setStatus_ketersediaan(true);
                bukuPinjaman.remove(value);
                berhasil = true;
                break;
            }else{
                System.out.println("Tidak Ada Buku Yang Sesuai!");
            }
        }
        if (berhasil){
            System.out.println("========================== Pengembalian Buku ============================");
            System.out.println("Nama             : "+nama + "\nID               : " + nomor_siswa);
            System.out.println("Berhasil Mengembalikan Buku " + judul);
            System.out.println("Waktu Peminjaman : " + transaksi.getWaktuPeminjaman());
            System.out.print("Durasi Peminjaman " + durasiPengembalian + " Hari");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomor_siswa() {
        return nomor_siswa;
    }

    public void setnomor_siswa(String nomor_siswa) {
        this.nomor_siswa = nomor_siswa;
    }

    public List<String> getDaftar_pinjam() {
        return daftar_pinjam;
    }

    public void setDaftar_pinjam(List<String> daftar_pinjam) {
        this.daftar_pinjam = daftar_pinjam;
    }

    public void pinjamBuku(String judulBuku) {
        daftar_pinjam.add(judulBuku);
    }

    public void kembalikanBuku(String judulBuku) {
        daftar_pinjam.remove(judulBuku);
    }

}
