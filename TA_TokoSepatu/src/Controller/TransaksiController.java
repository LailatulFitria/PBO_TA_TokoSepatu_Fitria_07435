package Controller;

import Entity.Sepatu;
import Model.TransaksiModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.*;

public class TransaksiController {
        public TransaksiModel cari_m = new TransaksiModel();

    public TransaksiController(){
        
    }
        
    public ArrayList<Sepatu> view(){
        return cari_m.getDataAnggota();
    }
    
    public DefaultTableModel ListSepatu(){
    DefaultTableModel carlistsepat = new DefaultTableModel();
    Object[] kolom ={"Kode Sepatu","Merek","Ukuran","Harga","Jumlah"};
    carlistsepat.setColumnIdentifiers(kolom);
    int size = AllObjController.sepatu.view().size();
    for (int i=0; i<size; i++){
        Object [] cari = new Object[10];
        cari[0] = AllObjController.sepatu.view().get(i).getKodeSepatu();
        cari[1] = AllObjController.sepatu.view().get(i).getMerek();
        cari[2] = AllObjController.sepatu.view().get(i).getUkuran();
        cari[3] = AllObjController.sepatu.view().get(i).getHarga();
        cari[4] = AllObjController.sepatu.view().get(i).getJumBarang();
        carlistsepat.addRow(cari);
    }
    return carlistsepat;
}
    
    public int cekSepatu(String kodesepat){
        int keterangan = -1;
        if(cari_m.getDataAnggota().size()>0){
            for(int i=0;i<cari_m.getDataAnggota().size();i++){
             if(kodesepat.equals(cari_m.getDataAnggota().get(i).getKodeSepatu())){
                 keterangan = i;
                 break;
             }else{
                 keterangan = -1;
             }
            }
        }
        return keterangan;
    }
    public Sepatu showDaftarAnggota(int index){
        return cari_m.getDataAnggota().get(index);
    }
}
