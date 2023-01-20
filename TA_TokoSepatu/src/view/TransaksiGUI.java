package view;

import Controller.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.*;

public class TransaksiGUI {
    private static TransaksiController cari_c = new TransaksiController();
    JFrame Sepatu = new JFrame();
    JLabel top,tambahsepatu,labelkodesepatu,labelmerek,labelukuran,labeljumbarang,labelharga,labelKodesepatu;
    JTextField textkodesepatu,textmerek,textukuran,textharga,textjumbarang,hapustext;
    JButton btntranssepatu,btnhapus,btnback,btncarisepatu; 
    JTable tabelsepatu = new JTable();
    JScrollPane scrolsepatu = new JScrollPane(tabelsepatu);
    int index;
     
    public TransaksiGUI(){
        
        Sepatu.setSize(900,700);
        Sepatu.setLayout(null);
        Sepatu.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("DATA SEPATU");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,35));
        Sepatu.add(top);
            
        scrolsepatu.setBounds(300,180,600,270);
        tabelsepatu.setModel(cari_c.ListSepatu());
        Sepatu.add(scrolsepatu);
        
        labelkodesepatu = new JLabel("KODE");
        labelkodesepatu.setBounds(30,150,100,30);
        Sepatu.add(labelkodesepatu);
        
        textkodesepatu = new JTextField();
        textkodesepatu.setBounds(30,180,200,30);
        Sepatu.add(textkodesepatu);
                
        labelmerek = new JLabel("MEREK");
        labelmerek.setBounds(30,210,100,30);
        Sepatu.add(labelmerek);
        
        textmerek = new JTextField();
        textmerek.setBounds(30,240,200,30);
        Sepatu.add(textmerek);
        
        labelukuran = new JLabel("UKURAN");
        labelukuran.setBounds(30,270,100,30);
        Sepatu.add(labelukuran);
        
        textukuran = new JTextField();
        textukuran.setBounds(30,300,200,30);
        Sepatu.add(textukuran);
        
        labelharga = new JLabel("HARGA");
        labelharga.setBounds(30,390,200,30);
        Sepatu.add(labelharga);
        
        textharga = new JTextField();
        textharga.setBounds(30,420,200,30);
        Sepatu.add(textharga);
        
        labeljumbarang = new JLabel("JUMLAH");
        labeljumbarang.setBounds(30,330,200,30);
        Sepatu.add(labeljumbarang);
        
        textjumbarang = new JTextField();
        textjumbarang.setBounds(30,360,200,30);
        Sepatu.add(textjumbarang);
        
        btncarisepatu = new JButton("Tambah Sepatu");
        btncarisepatu.setBounds(50,470,150,30);
        Sepatu.add(btncarisepatu);
        
        btntranssepatu = new JButton("Total");
        btntranssepatu.setBounds(50,510,150,30);
        Sepatu.add(btntranssepatu);
        
        btnhapus = new JButton("Hapus Sepatu");
        btnhapus.setBounds(50,550,150,30);
        Sepatu.add(btnhapus);              
               
        btnback = new JButton("back");
        btnback.setBounds(30, 600, 100, 30);
        btnback.setBackground(Color.red);
        Sepatu.add(btnback);
               
        Sepatu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Sepatu.setVisible(true);
        Sepatu.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sepatu.dispose();
                PetugasGUI ptgs = new PetugasGUI();
            }
        });
        
        btncarisepatu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String kodesepatu = textkodesepatu.getText();
                    String merek =  textmerek.getText();
                    int ukuran = Integer.valueOf(textukuran.getText());
                    String harga = textharga.getText();
                    int jumbarang = Integer.valueOf(textjumbarang.getText());
                    AllObjController.sepatu.cekSepatu(kodesepatu);
                    JOptionPane.showMessageDialog(null,"Input Sepatu Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    reset();
                    tabelsepatu.setModel(AllObjController.sepatu.ListSepatu());
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } );
        
        btntranssepatu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } );
        tabelsepatu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelsepatu.getSelectedRow();
                index=i;
                textkodesepatu.setText(AllObjController.sepatu.ListSepatu().getValueAt(i, 0).toString());
                textmerek.setText(AllObjController.sepatu.ListSepatu().getValueAt(i, 1).toString());
                textukuran.setText(AllObjController.sepatu.ListSepatu().getValueAt(i, 2).toString());
                textharga.setText(AllObjController.sepatu.ListSepatu().getValueAt(i, 3).toString());
                textjumbarang.setText(AllObjController.sepatu.ListSepatu().getValueAt(i, 4).toString()); 
            }            
        });
        
        btnhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    
                    AllObjController.sepatu.delete(index);
                    JOptionPane.showMessageDialog(null,"Hapus Sepatu Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                    tabelsepatu.setModel(AllObjController.sepatu.ListSepatu());
                    reset();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
    }
    void reset(){
        textkodesepatu.setText(null);//ISI
        textmerek.setText(null);
        textukuran.setText(null);
        textharga.setText(null);
        textjumbarang.setText(null);
    }
}