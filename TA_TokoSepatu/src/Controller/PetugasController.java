package Controller;

import Model.PetugasModel;
import Entity.Petugas;
import java.util.ArrayList;

public class PetugasController {
    public PetugasModel petugas_m = new PetugasModel();
    int loginPetugas = 0;
     
    public PetugasController(){
    
    }
    
    public ArrayList<Petugas> view(){
        return petugas_m.getDataPetugas();
        }
  
    public void insert(Petugas petugas){
        petugas_m.insert(petugas);
    }

    public void update(int index, Petugas petugas){
        petugas_m.update(index, petugas);
    }

    public void delete(int index){
        petugas_m.delete(index);
    }
    
     public void dataPetugas(){
        String user_id [] = {"07435","07320"};
        String user [] = {"Fitria","Farrellia"};
        String pass [] = {"07435","07320"};
       
        for(int i = 0; i<user.length; i++){
        petugas_m.insert(new Petugas(user_id[i],user[i],pass[i]));
        }
    }
     
     public void cekPetugas(String idus, String pws) {
        loginPetugas = petugas_m.cekPetugas(idus,pws);
     }
     
     public Petugas petugasEntity(){
        return petugas_m.showDataPetugas(loginPetugas);
    }
//     public Dian07111_Petugas petugasEntity(){
//        return petugas_m.showDataAslab(indexLogin);
//    }
}

