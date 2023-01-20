package Entity;

public class Sepatu extends Barang {    
    protected String harga;
    protected int jumbarang;
    
    public Sepatu(String harga, int jumbarang){
        
        this.jumbarang = jumbarang;
        this.harga = harga;
    }
    
    public Sepatu(){
    
    }
    @Override
    public void setKode_sepatu(String kode_sepatu) {
        this.kode_sepatu = kode_sepatu;
    }
    @Override
    public void setMerek(String merek) {
        this.merek = merek;
    }
    @Override
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }
    public void setHarga (String harga) {
        this.harga = harga;
    }
    public void setJumBarang(int jumbarang) {
        this.jumbarang = jumbarang;
    }
   
    @Override
    public String getKodeSepatu(){
        return this.kode_sepatu;
    }
    @Override
    public String getMerek(){
        return this.merek;
    }
    @Override
    public int getUkuran(){
        return this.ukuran;
    }
    public String getHarga(){
        return this.harga;
    }
    
    public int getJumBarang(){
        return this.jumbarang;
    } 
}
