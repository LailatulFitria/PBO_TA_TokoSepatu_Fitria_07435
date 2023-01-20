package Controller;
import Entity.Sepatu;
import Model.SepatuModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.AllObjController;

public class SepatuController {
    public SepatuModel mrksep_m = new SepatuModel();

    public SepatuController(){
        
    }
    public ArrayList<Sepatu> view(){
        return mrksep_m.getDataSepatu();
        }

    public void insert(String kodesepat, String merek, int ukuran, String harga, int jumbarang){
        Sepatu sepatu = new Sepatu();
        sepatu.setKode_sepatu(kodesepat);
        sepatu.setMerek(merek);
        sepatu.setUkuran(ukuran);
        sepatu.setHarga(harga);
        sepatu.setJumBarang(jumbarang);
        mrksep_m.insert(sepatu);
    }
    public void update(int index, String kodesepat, String merek, int ukuran, String harga, int jumbarang){
        Sepatu sepatu = new Sepatu();
        sepatu.setKode_sepatu(kodesepat);
        sepatu.setMerek(merek);
        sepatu.setUkuran(ukuran);
        sepatu.setHarga(harga);
        sepatu.setJumBarang(jumbarang);
        mrksep_m.update(index,sepatu);
    }
    public void delete(int index){
        mrksep_m.delete(index);
    }    
    public DefaultTableModel ListSepatu(){
    DefaultTableModel datmlistsepat = new DefaultTableModel();
    Object[] kolom ={"Kode Sepatu","Merek","Ukuran","Harga","Jumlah"};
    datmlistsepat.setColumnIdentifiers(kolom);
    int size = AllObjController.sepatu.view().size();
    for (int i=0; i<size; i++){
        Object [] sepatu = new Object[10];
        sepatu[0] = AllObjController.sepatu.view().get(i).getKodeSepatu();
        sepatu[1] = AllObjController.sepatu.view().get(i).getMerek();
        sepatu[2] = AllObjController.sepatu.view().get(i).getUkuran();
        sepatu[3] = AllObjController.sepatu.view().get(i).getHarga();
        sepatu[4] = AllObjController.sepatu.view().get(i).getJumBarang();
        datmlistsepat.addRow(sepatu);
    }
    return datmlistsepat;
}
    
    public int cekSepatu(String idSepatu) {
    int keterangan = -1;
        if(mrksep_m.getDataSepatu().size()>0){
            for(int i=0;i<mrksep_m.getDataSepatu().size();i++){
             if(idSepatu.equals(mrksep_m.getDataSepatu().get(i).getKodeSepatu())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    public Sepatu showDaftarBuku(int index){
        return mrksep_m.getDataSepatu().get(index);
    }
}
