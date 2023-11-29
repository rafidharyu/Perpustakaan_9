/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Siswa> daftarSiswa = new ArrayList<>();
        Admin adm = new Admin("sutris", "sutris123");
        TransaksiPeminjaman T1 = new TransaksiPeminjaman();
        
        ArrayList<String> daftarPinjamAwal = new ArrayList<>();
        daftarPinjamAwal.add("-");
        
        Siswa agt1 = new Siswa("Rafid", "123", daftarPinjamAwal);
        Siswa agt2 = new Siswa("Nanda", "456", daftarPinjamAwal);
        daftarSiswa.add(agt1);
        daftarSiswa.add(agt2);
        
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        
        Buku bku1 = new Buku("Si Kancil", "AT Muthar", "123456789", true, "Dongeng", 2004);
        Buku bku2 = new Buku("Matematika X", "Prof. Febi Dwi", "8907654", true, "Kelas X", 2012);

        daftarBuku.add(bku1);
        daftarBuku.add(bku2);
        
        adm.addSiswa ("Rafid", "123", daftarPinjamAwal  );
        adm.addSiswa ("Perdi", "456", daftarPinjamAwal  );
        adm.addSiswa ("Dimas", "666", daftarPinjamAwal );
        adm.addBuku("Marmut Merah Jambu", "Raditya Dika", "987654321", true, "Fiksi Remaja", 2011);
        adm.addBuku("Ilmu Pengetahuan Alam XI", "Bapak Rahmattullah", "983759274", true, "Kelas XI", 2016);
        adm.addBuku("Under Siege", "Hotman Prancis", "9264829471", true, "Hukum", 2023);
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("=========================================================================");
            //int index = 1;
            System.out.println("Pilih Akses Sebagai");
            System.out.println("1. Login Admin\n2. Login Siswa\n0. Keluar");
            System.out.print("Masukan Input : ");
            int pilihanAwal = scanner.nextInt();
            scanner.nextLine();
            
            if(pilihanAwal == 0){
                System.out.println("Anda Telah Berhasil Keluar");
                break;
            }
            else if(pilihanAwal == 1){
                System.out.print("Masukkan nama pengguna: ");
                String usernameInput = scanner.nextLine();
                System.out.print("Masukkan kata sandi   : ");
                String passwordInput = scanner.nextLine();
                if (adm.validateLogin(usernameInput, passwordInput)) {
                    System.out.println("Anda berhasil login sebagai admin!");
                    
                    while(true){
                    System.out.println("=========================================================================\n");
                    System.out.println("Pilih operasi:");
                    System.out.println("1. Tambah Anggota");
                    System.out.println("2. Hapus Anggota");
                    System.out.println("3. Tambah Buku");
                    System.out.println("4. Hapus Buku");
                    System.out.println("5. Tampilkan Anggota");
                    System.out.println("0. Kembali");
                    System.out.print("Masukan Input : ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    
                     switch (choice) {
                            case 1:
                                System.out.println("TAMBAH ANGGOTA PERPUSTAKAAN");
                                System.out.print("Masukkan Nama Anggota : ");
                                String nama = scanner.nextLine();
                                System.out.print("Masukkan nomor Anggota : ");
                                String nomor_siswa = scanner.nextLine();
                                System.out.print("Masukkan Daftar Peminjaman: ");
                                
                                ArrayList<String> daftar_pinjam = new ArrayList<>();

                                
                                System.out.print("Masukkan jumlah riwayat peminjaman yang ingin dimasukkan: ");
                                int jumlahRiwayat = scanner.nextInt();
                                scanner.nextLine(); 

                               
                                for (int i = 0; i < jumlahRiwayat; i++) {
                                    System.out.print("Masukkan riwayat peminjaman ke-" + (i + 1) + ": ");
                                    String riwayatPeminjaman = scanner.nextLine();
                                    daftar_pinjam.add(riwayatPeminjaman);
                                }

                            
                                adm.addSiswa(nama, nomor_siswa, daftar_pinjam);
                                System.out.println("\nBerhasil Menambahkan Anggota Perpustakaan Smalan.");
                                break;
                      
                            case 2:
                                System.out.println("HAPUS ANGGOTA PERPUSTAKAAN");
                                System.out.print("Masukkan Nama Anggota Yang Akan Dihapus : ");
                                String namaSiswa = scanner.nextLine();
                                adm.removeSiswa(namaSiswa);
                                break;
                                
                            case 3:
                                System.out.print("Masukkan Judul Buku : ");
                                String judul = scanner.nextLine();
                                System.out.print("Masukkan Penulis Buku : ");
                                String pengarang = scanner.nextLine();
                                System.out.print("Masukkan NoISBN Buku : ");
                                String nomor_ISBN = scanner.nextLine();
                                scanner.nextLine();
                                System.out.print("Masukkan Status Ketersediaan Buku (true = tersedia, false = tidak tersedia) : ");
                                boolean status_ketersediaan = scanner.nextBoolean();
                                System.out.print("Masukkan Kategori Buku : ");
                                String kategori = scanner.nextLine();
                                System.out.print("Masukkan Tahun Terbit Buku : ");
                                int tahun_terbit = scanner.nextInt();
                                scanner.nextLine();
                                
                                adm.addBuku(judul, pengarang, nomor_ISBN, status_ketersediaan, kategori, tahun_terbit);
                                System.out.println("\nBerhasil Menambahkan Buku LibraTech..");
                                break;
                                
                            case 4:
                                System.out.println("BUKU YANG AKAN DIHAPUS");
                                System.out.print("Masukkan Judul Buku Yang Akan Dihapus : ");
                                String judulBuku = scanner.nextLine();
                                adm.removeBuku(judulBuku);
                                System.out.println("Berhasil Menghapus " + judulBuku + "\n");
                                break;
                                
                            case 5:
                                System.out.println("TAMPILKAN ANGGOTA");
                                adm.tampilkanAnggota();
                                scanner.nextLine();
                                break;
                                
                            case 0:
                                System.out.println("");
                            default:
                                System.out.println("Operasi tidak valid. Silakan pilih kembali.");
                    }
                    
                    if (choice == 0) {
                    System.out.println("Kembali ke menu utama.");
                    break; 
                }
                    }
                    
                    break;
                    
                } else {
                     System.out.println("Login gagal! Nama pengguna atau kata sandi salah.");
                     break;
            }
            }
             else if(pilihanAwal == 2){
                System.out.println("LOGIN SISWA");
             
                System.out.print("Masukkan nama siswa: ");
                String namaSiswa = scanner.nextLine();
                System.out.print("Masukkan nomor siswa: ");
                String nomorSiswa = scanner.nextLine();
                
                if (!namaSiswa.isEmpty() && !nomorSiswa.isEmpty()) {
                System.out.println("Anda berhasil login sebagai siswa!");

                 
                    while (true){
                                Siswa hasil = daftarSiswa.get(1);
                                System.out.println("=========================================================================\n");
                                System.out.println("Pilih operasi:");
                                System.out.println("1. Pinjam Buku");
                                System.out.println("2. Kembalikan Buku");
                                System.out.println("3. Tampilkan Buku");
                                System.out.println("0. Keluar");
                                System.out.print("Masukan Input : ");
                                int choice = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("=========================================================================\n");

                                switch (choice) {
                                    case 1:
                                        
                                        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                                        String judulPinjam = scanner.nextLine();
                                        
                                        TransaksiPeminjaman transaksi = new TransaksiPeminjaman();
                                        Siswa siswaPeminjam = daftarSiswa.get(0); 
                                        Buku bukuDipinjam = daftarBuku.get(0);
                                        transaksi.catatanPeminjaman(siswaPeminjam, bukuDipinjam);
                                        
                                        
                                        break;
                                    case 2:
                                        System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
                                        String judulKembali = scanner.nextLine();
                                        System.out.print("Masukkan durasi peminjaman: ");
                                        int durasiPengembalian = scanner.nextInt();
                                        hasil.pengembalianBuku(judulKembali, durasiPengembalian);
                                        scanner.nextLine();
                                        System.out.println("\n");
                                        System.out.print("Berhasil Mengembalikan Buku " + judulKembali + "\n");
                                        break;
                                    case 3:
                                        hasil.melihatBuku();
                                        break;

                                     }
                                
                                if(choice == 0 ){
                                        break;
                                    }
                                
                                }
                        } 
        }else {
                System.out.println("Login siswa gagal! Nama siswa atau nomor siswa kosong.");
    }
               
} 
        }
    }

