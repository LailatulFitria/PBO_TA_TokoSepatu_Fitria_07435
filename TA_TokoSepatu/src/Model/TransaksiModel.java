package Model;

import Entity.Sepatu;
import java.util.ArrayList;

public class TransaksiModel extends Sepatu {
    private ArrayList<Sepatu> DataAnggota;
    
    public TransaksiModel(){
        DataAnggota = new ArrayList<>();
    }
    public ArrayList<Sepatu> getDataAnggota(){
        return DataAnggota;
    }

    public void view(){
    
    }
   
    public void insert(Object x){
        DataAnggota.add((Sepatu) x);
    }
    
    public void update(int index, Object x){
        DataAnggota.set(index ,(Sepatu) x);
    }
  
    public void delete(int index){
        DataAnggota.remove(index);
    }

    public void get_where(int index){
        DataAnggota.get(index);
    }
    
    public void Trans(int index, Object x){
        DataAnggota.set(index ,(Sepatu) x);
    }
}
