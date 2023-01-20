package Model;

import Entity.Sepatu;
import java.util.ArrayList;

public class SepatuModel implements InterfacesModel{
    private ArrayList<Sepatu> DataSepatu;
    public ArrayList<Sepatu> getDataSepatu;
    
    public SepatuModel(){
        DataSepatu = new ArrayList<>();
        }
    public ArrayList<Sepatu> getDataSepatu(){
        return DataSepatu;
        }
    @Override
    public void view(){
    
    }
    @Override
    public void insert(Object x){
        DataSepatu.add((Sepatu) x);
    }
    @Override
    public void update(int index, Object x){
        DataSepatu.set(index ,(Sepatu) x);
    }
    @Override
    public void delete(int index){
        DataSepatu.remove(index);
    }

    public void get_where(int index){
        DataSepatu.get(index);
    }    
} 
