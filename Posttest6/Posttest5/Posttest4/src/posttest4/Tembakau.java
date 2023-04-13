/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest4;

/**
 *
 * @author Swift 3x
 */
 
class Tembakau {
   String nama;
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
    

    
    public void Tampil(){
        System.out.println("Nama Tembakau : " + nama );
        System.out.println("Rasa Tembakau  : " + rasa );
        System.out.println("Harga Tembakau  : " + harga );
    }
} 

   
