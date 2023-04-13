package posttest6;

public class kretek extends Tembakau implements interfaceBaru {
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
    public void Tampil(){
        System.out.println("Tembakau " + asal);
        System.out.println("Nama Tembakau : " + getNama() );
        System.out.println("Rasa Tembakau  : " + getRasa() );
        System.out.println("Harga Tembakau  : " + getHarga() );
        System.out.println("Berat /gram : " + gram);
         System.out.println("Deskripsi : " + deskripsi());
        System.out.println("Masa Expired : " + expired());
    }
    
    @Override
    public String deskripsi(){
        return "Tembakau kretek adalah jenis Tembakau yang dibuat dengan campuran tembakau  cengkeh, kapur sirih, dan rempah lainnya.";
    }
    @Override
    public String expired(){
        return "11 Bulan ";
    }
  }

