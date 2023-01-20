package Model;

import Entity.Petugas;
import java.util.ArrayList;

public class PetugasModel implements InterfacesModel{
    public ArrayList<Petugas> DataPetugas;
    
    public PetugasModel(){
        DataPetugas = new ArrayList<>();
    }
    public ArrayList<Petugas> getDataPetugas(){
        return DataPetugas;
    }
   @Override
    public void view(){
    
    }
    @Override
    public void insert(Object x){
        DataPetugas.add((Petugas) x);
    }
    @Override
    public void update(int index, Object x){
        DataPetugas.set(index ,(Petugas) x);
    }
    @Override
    public void delete(int index){
        DataPetugas.remove(index);
    }
    
    public Petugas showDataPetugas(int index){
        return DataPetugas.get(index);
    }

    public int cekPetugas(String idus, String pws){
        int loop = 0;
        for(Petugas petugasEntity : getDataPetugas()){
            if(petugasEntity.getUser_id().equals(idus) && petugasEntity.getPassword().equals(pws)){
                break;
            }else{
                  loop++;
            }
        }
        return loop;
    };
}
