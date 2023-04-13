/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;


public abstract class Tembakau {
   protected  final String asal = " asli Indonesia"; // final pada atribut 
   private String nama;
   private String rasa;
   private float harga;

    public Tembakau(String nama, String rasa, float harga ){
        this.nama = nama;
        this.rasa = rasa;
        this.harga = harga;
        
    }

    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }

 
    public String getRasa() {
        return rasa;
    }


    public void setRasa(String rasa) {
        this.rasa = rasa;
    }


    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }
    
    //Overloading
    public void info(String nama){
        System.out.println("\tData Tembakau " + nama + "  berhasil ditambahkan!" );
    }
    
    
    // abstract method  
    public abstract void Tampil();
} 

   
