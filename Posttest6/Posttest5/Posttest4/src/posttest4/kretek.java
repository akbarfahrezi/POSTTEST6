package Posttest4;

public class kretek extends Tembakau {
    private String status = "kretek";
    private int gram;

    public kretek(String nama, String rasa, float harga, int gram) {
        super(nama, rasa, harga);
        this.gram = gram;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }
    public int getGram() {
        return gram;
    }
    @Override
    public void Tampil() {
        super.Tampil();
        System.out.println("Berat Per-gram : " + gram);
    }

    // overloading method Tampil() dengan tambahan parameter merk
    public void Tampil(String merk) {
        super.Tampil();
        System.out.println("Berat Per-gram : " + gram);
        System.out.println("Merk Tembakau : " + merk);
    }
    
    
  }

