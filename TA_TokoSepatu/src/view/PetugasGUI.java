  package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class PetugasGUI {
    JFrame LogReg = new JFrame();
    JLabel top;
    JButton btnbuku,btnanggota,btnpeminjaman,btnback,btnpengembalian;
    
    public PetugasGUI(){
        LogReg.setSize(900,700);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("=MENU=");
        top.setBounds(270,10,700,40);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        LogReg.add(top);
         
        btnbuku = new JButton("Data Sepatu");
        btnbuku.setBounds(270,150,300,50);
        btnbuku.setBackground(Color.CYAN);
        LogReg.add(btnbuku);
        
        //====== ANGGOTA =========        
        btnanggota = new JButton("TRANSAKSI");
        btnanggota.setBounds(270,250,300,50);
        btnanggota.setBackground(Color.CYAN);
        LogReg.add(btnanggota);
        
        //===== EXIT =====
        btnback = new JButton("EXIT");
        btnback.setBounds(30, 600, 100, 30);
        btnback.setBackground(Color.red);
        LogReg.add(btnback);
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LogReg.dispose();
                LoginGUI gui = new LoginGUI();
            }
        });
        btnbuku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SepatuGUI bukugui = new SepatuGUI();
            }
        });
        
        btnanggota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TransaksiGUI anggotagui = new TransaksiGUI();
            }
        });
        
    }
}
