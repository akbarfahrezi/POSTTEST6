/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Swift 3x
 */
public final class posttest5 {
 static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    
    static ArrayList<kretek> listKretek = new ArrayList<>();
    static ArrayList<filter> listFilter = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        while(true){
        System.out.println("Manajemen Toko Bacco");
        System.out.print(" 1. Tambah Data bacco \n 2. Lihat Data Bacco \n 3. update Data Bacco \n 4. Hapus Data Bacco \n 5. exit \n masukkan pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        
       
        switch (pilihan){
            case 1 -> tambah();
            case 2 -> tampil();
            case 3 -> ubah();
            case 4 -> hapus();
            case 5 -> System.exit(0);
            default -> System.out.println("Input Menu Salah");
        }
            System.out.println("\n\n");
    }
   }
    
    static void tambah()throws IOException{
            System.out.println("kretek / filter : \n 1. tambah tembakau kretek \n 2. tambah tembakau filter ");
            System.out.print("masukkan Pilihan anda : ");
        int pil = Integer.parseInt(br.readLine());
        switch (pil) {
         case 1:
             {
                 System.out.print("Masukkan Nama Tembakau : ");
                 String nama = br.readLine();
                 System.out.print("Masukkan Rasa : ");
                 String rasa = br.readLine();
                 System.out.print("Masukkan harga : ");
                 float harga = Float.parseFloat(br.readLine());
                 System.out.print("Masukkan gram : ");
                 int gram = Integer.parseInt(br.readLine());
                 kretek krt = new kretek(nama, rasa, harga, gram);
                 listKretek.add(krt);
                 krt.info(nama);
                 break;
             }
         case 2:
             {
                 System.out.print("Masukkan Nama Tembakau : ");
                 String nama = br.readLine();
                 System.out.print("Masukkan Rasa : ");
                 String rasa = br.readLine();
                 System.out.print("Masukkan Harga : ");
                 float harga = Float.parseFloat(br.readLine());
                 System.out.print("Masukkan gram : ");
                 int gram = Integer.parseInt(br.readLine());
                 filter flt = new filter(nama, rasa, harga, gram);
                 listFilter.add(flt);
                 flt.info(nama);
                 break;
             }
         default:
             System.out.println("salah wal");
             break;
     }
    }
          
  public static void tampil() {
        if (listKretek.isEmpty() && listFilter.isEmpty()) {
            System.out.println("List Masih Kosong Wal...");
        } else {
            System.out.println("\n");
            System.out.println("kretek");
            for(int i = 0; i < listKretek.size();i++){
                    System.out.println("Data indeks ke-" + (i + 1));
                    listKretek.get(i).Tampil();
            System.out.println("\n\n");
            }
            
            System.out.println("Filter");
            for(int i = 0; i < listFilter.size();i++){
                    System.out.println("Data indeks ke-" + (i + 1));
                    listFilter.get(i).Tampil();
            System.out.println("\n\n");
            }
        }
    }
    static void ubah() throws IOException {
        System.out.println("kretek / filter  : /\n 1. Kretek \n 2. Filter \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            tampil();
            System.out.println("\nMau Ubah Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            System.out.print("Nama Tembakau Baru: ");
            listKretek.get(pilihan).setNama(br.readLine());

            System.out.print("Rasa : ");
            listKretek.get(pilihan).setRasa(br.readLine());

            System.out.print("Harga: ");
            listKretek.get(pilihan).setHarga(Float.parseFloat(br.readLine()));
            
            System.out.println("\nData Berhasil Diubah...");
            
        } else if (pil == 2) {
            tampil();
            System.out.println("\nMau Ubah Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            System.out.print("Nama Tembakau Baru: ");
            listFilter.get(pilihan).setNama(br.readLine());

            System.out.print("Rasa : ");
            listFilter.get(pilihan).setRasa(br.readLine());

            System.out.print("Harga: ");
            listFilter.get(pilihan).setHarga(Float.parseFloat(br.readLine()));

            System.out.println("\nData Berhasil Diubah...");
        }

    }

    static void hapus() throws IOException {
        System.out.println("Kretek /Filter  : /\n 1. Filter \n 2. Kretek \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            tampil();
            System.out.println("\nMau Hapus Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            listKretek.remove(pilihan);
            System.out.println("\nData Berhasil Dihapus");
        } else if (pil == 2) {
            tampil();
            System.out.println("\nMau Hapus Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            listFilter.remove(pilihan);
            System.out.println("\nData Berhasil Dihapus");
        }

    }
}

    


