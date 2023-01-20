package PakageMain;

import Entity.*;
import Controller.*;
import java.util.Scanner;

import view.*;

public class SepatuMain {
//    Scanner input = new Scanner(System.in);
//    public Dian07111_AnggotaController anggota = new Dian07111_AnggotaController();
//    public SepatuController sepatu = new SepatuController();
//    public Dian07111_PetugasController ptgs = new Dian07111_PetugasController();

    public static void main(String args[]) {
       LoginGUI main = new LoginGUI();
//        Dian07111_PeminjamanGUI peminjam = new Dian07111_PeminjamanGUI();    
    }
//        Scanner input1 = new Scanner(System.in);
//        Dian07111_Main main = new Dian07111_Main();
//        main.ptgs.dataPetugas();
//        System.out.println("MAKMUR SEPATU !! ");
//        
//        int pil;
//        do{
//            System.out.println("\n"
//            +"1. Login "+"\n"
//            +"0. Exit"+"\n"
//            +"Pilih : ");
//            pil = input1.nextInt();
//        
//            switch(pil){
//                case 1:
//                    
//                System.out.print("No.Id Petugas = ");
//                String idus = input1.next();
//                System.out.print("Password = ");
//                String pws = input1.next();
//                main.login(idus,pws); 
//            }
//            
//        }while(pil != 0);
//    }
//   
//    void login(String idus, String pws){
//        boolean cekLogin = false;
//        int i;
//        for(i=0; i<ptgs.petugas_m.getDataPetugas().size(); i++){
//            //mengecek pws & idus
//         try{
//         if(idus.equals(ptgs.petugas_m.getDataPetugas().get(i).getUser_id()) && 
//                 pws.equals(ptgs.petugas_m.getDataPetugas().get(i).getPassword())){
//             cekLogin = true;
//             break;
//         }
//         }catch(Exception e){
//             cekLogin = false;
//        }  
//    }
//        
//        if(cekLogin){
//            System.out.println("\n"+"Hallo "+ptgs.petugas_m.getDataPetugas().get(i).
//                    getUser()+" Selamat Datang di Makmur Sepatu!!");
//            menuUtama();
//        }else{
//            System.out.println("Maaf Password atau ID SALAH!!");
//        }
//    } 
    //======================= MENU UTAMA =======================
//    void menuUtama(){
//        int pilih;
//        do{
//            System.out.println("\n"
//            +" == Menu Utama == "+"\n"
//            +"1. Data Sepatu"+"\n"
//            +"2. Transaksi"+"\n"
//            +"0.Exit"+"\n"
//            +"Pilih : ");
//            pilih = input.nextInt();
//            
//            switch(pilih){
//                case 1:
//                    menuSepatu();
//                    break;
//                case 2:
//                    menuAnggota();
//                    break;
//            }
//        }while(pilih != 0);
//    }
//    
//    //======================= MENU SEPATU =======================
//    void menuSepatu(){
//       int pilihan;
//           do{
//                System.out.println("\n"
//                +"===== MENU Buku ====="+"\n"
//                +"1. Tambah Sepatu"+"\n"
//                +"2. Lihat Sepatu"+"\n"
//                +"3. Ubah Sepatu"+"\n"
//                +"4. Hapus Sepatu"+"\n"
//                +"0. Keluar"+"\n"
//                +"Pilih : ");
//                pilihan = input.nextInt();
//
//                switch(pilihan){
//                   case 1 :
//                           insert();
//                       break;
//                   case 2 : 
//                           view();
//                       break;
//                   case 3 : 
//                           update();
//                       break;
//                   case 4 : 
//                           delete();
//                       break;
//                   }  
//                }while(pilihan != 0); 
//    }
//    
//     void view(){
//        if(sepatu.sepatu_m.getDatasepatu().size()>0){
//            int nospt = 0;
//            for (int i = 0; i < sepatu.sepatu_m.getDataSepatu().size(); i++) {
//                nospt++;
//                System.out.println("\n"
//                +"[SEPATU " + nospt + "]"+"\n"
//                +"Kode sepatu     : "+sepatu.sepatu_m.getDataSepatu().get(i).getKodeSepatu()+"\n"
//                +"Merek sepatu    : "+sepatu.sepatu_m.getDataSepatu().get(i).getMerek()+"\n"
//                +"Ukuran Sepatu   : "+sepatu.sepatu_m.getDataSepatu().get(i).getUkuran()+"\n"
//                +"Harga           : "+sepatu.sepatu_m.getDataSepatu().get(i).getHarga()+"\n"
//                +"Jumlah Stok     : "+sepatu.sepatu_m.getDataSepatu().get(i).getJumBarang());
//            }
//        }else{
//            System.out.println("Data Sepatu Kosong!!");
//        }
//    }
//     void insert() {
//        
//        System.out.println("Kode Sepatu :  ");
//        String KodeSepatu = input.next();
//        
//        System.out.println("Merek : ");
//        String Merek = input.next();
//        
//        System.out.println("Ukuran : ");
//        int Ukuran = input.nextInt();
//        
//        System.out.println("Harga : ");
//        String Harga = input.next();
//        
//        System.out.println("Jumlah Stok : ");
//        int Jumbarang = input.nextInt();
//        
//        sepatu.insert(new Sepatu(KodeSepatu,Merek, Ukuran, Harga, Jumbarang));
//        System.out.println("Data Buku Berhasil Disimpan !!\n");
//    }
//
//     void update() {
//        if(sepatu.sepatu_m.getDataSepatu().size()>0){
//            for (int nospt_i = 0; nospt_i < sepatu.sepatu_m.getDataSepatu().size(); nospt_i++) {
//                System.out.println("["+nospt_i+"] "+sepatu.sepatu_m.getDataSepatu().get(nospt_i).getJudul());
//            }
//             
//            System.out.println("Pilih Index Buku : ");
//            int selectIndex = input.nextInt();
//                        
//            System.out.println("Masukkan Kode Buku : ");
//            String KodeSepatu = input.next();
//
//            System.out.println("Masukkan Merek : ");
//            String Merek = input.next();
//
//            System.out.println("Masukkan Ukuran : ");
//            int Ukuran = input.nextInt();
//
//            System.out.println("Masukkan Harga : ");
//            String Harga = input.next();
//            
//            System.out.println("Jumlah Stok : ");
//            int Jumbarang = input.nextInt();
//
//            sepatu.update(selectIndex, new Sepatu(KodeSepatu,Merek, Ukuran, Harga, Jumbarang));
//            System.out.println("Data Sepatu Berhasil Diubah !!\n");
//        }else{
//            System.out.println("Data Sepatu Kosong\n");
//        }
//    }
//
//     void delete() { 
//        if(sepatu.sepatu_m.getDataSepatu().size()>0){
//            for (int nospt_i = 0; nospt_i < sepatu.sepatu_m.getDataSsepatu().size(); nospt_i++) {
//                System.out.println("["+nospt_i+"] "+sepatu.sepatu_m.getDataSepatu().get(nospt_i).getMerek());
//            }
//            
//            System.out.println("Pilih Index Buku : ");
//            int selectIndex = input.nextInt();
//            
//            sepatu.sepatu_m.getDataSepatu().remove(selectIndex);
//            System.out.print("Data Sepatu Berhasil Dihapus !!\n");
//        }else{
//            System.out.println("Data Sepatu Kosong\n");
//        }
//    }
//     
//     ======================= MENU ANGGOTA =======================
//    void menuAnggota(){
//        int pilihan;
//        do{
//                System.out.println("");
//                System.out.println("===== TRANSAKSI =====");
//                System.out.println("1. Tambah");
//                System.out.println("2. Lihat");
//                System.out.println("3. Hapus");
//                System.out.println("0. Keluar");
//                System.out.println("Pilih : ");
//                pilihan = input.nextInt();
//                switch(pilihan){
//                   case 1 :
//                           cekSepatu();
//                       break;
//                   case 2 : 
//                           viewAnggota();
//                       break;
//                   case 3 : 
//                           deleteAnggota();
//                       break;
//                   }  
//        }while(pilihan!=0);
//    }
//     private void cekSepatu() {
//       int keterangan = -1;
//        if(cari.getDataSepatu().size()>0){
//            for(int i=0;i<cari.getDataSepatu().size();i++){
//             if(KodeSepatu.equals(cari.getDataSepatu().get(i).getKodeSepatu())){
//                 keterangan = i;
//                 break;
//             }else{
//                 keterangan = -1;
//             }
//            }
//        }
//        return keterangan;
//    }
//    
//    void insertAnggota(){
//   
//        System.out.println("Masukkan Kode Sepatu :  ");
//        String Kode = input.next();
//        
//        
//        sepatu.cekSepatu(Kode);
//        System.out.println("Dicari !!\n");
// 
//    
//    }
////    public Sepatu showDaftarBuku(int index){
//        return sepatu.getDataSepatu().get(index);
//    }
//
//   
//}
//    }
//    
//    void viewAnggota(){
//        if(sepatu.mrksep_m.getDataSepatu().size()>0){
//            int nospt = 0;
//            for (int i = 0; i < anggota.anggota_m.getDataAnggota().size(); i++) {
//                noUrut++;
//                System.out.println("\n"
//                +"[Anggota " + dian07111_noUrut + "]" + "\n"
//                +"No ID      : "+anggota.anggota_m.getDataAnggota().get(i).getNo_id()+ "\n"
//                +"Nama       : "+anggota.anggota_m.getDataAnggota().get(i).getNama()+ "\n"
//                +"Alamat     : "+anggota.anggota_m.getDataAnggota().get(i).getAlamat()+ "\n"
//                +"No Telepon : "+anggota.anggota_m.getDataAnggota().get(i).getNo_Telp());
//            }
//        }else{
//            System.out.println("Data Kosong!!");
//        }
//    }
//    
//    void deleteAnggota(){
//        if(anggota.anggota_m.getDataAnggota().size()>0){
//            for (int nospt_i = 0; nospt_i < anggota.anggota_m.getDataAnggota().size(); nospt_i++) {
//                System.out.println("["+nospt_i+"] "+anggota.anggota_m.getDataAnggota().get(nospt_i).getNama());
//            }
//            
//            System.out.println("Pilih Index Nama : ");
//            int selectIndex = input.nextInt();
//            
//            anggota.anggota_m.getDataAnggota().remove(selectIndex);
//            System.out.print("Data Anggota Berhasil Dihapus !!\n");
//        }else{
//            System.out.println("Data Anggota Kosong\n");
//        }
//    }
//    
//    }
} 
 