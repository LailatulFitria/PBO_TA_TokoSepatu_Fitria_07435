package Entity;

public abstract class Barang {
    protected String kode_sepatu, merek;
    protected int ukuran;
    
    public Barang(String kode_sepatu, String merek, int ukuran){
        this.kode_sepatu = kode_sepatu;
        this.merek = merek;
        this.ukuran = ukuran;
    }
    
    public Barang(){
    
    }
    public void setKode_sepatu(String kode_sepatu) {
        this.kode_sepatu = kode_sepatu;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }
    
    public String getKodeSepatu(){
        return this.kode_sepatu;
    }
    
   public String getMerek(){
        return this.merek;
    }
    
    public int getUkuran(){
        return this.ukuran;
    }
}
