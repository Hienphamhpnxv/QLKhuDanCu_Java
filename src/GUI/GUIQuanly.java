/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.CuDanBLL;
import BLL.HoDanCuBLL;
import BLL.KhuDanCuBLL;
import DLL.*;
import Enities.CuDan;
import java.sql.SQLException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADM
 */
public class GUIQuanly extends javax.swing.JFrame {

     DefaultTableModel dtmCuDan= new DefaultTableModel();
    public static GUIQuanly it;
    public GUIQuanly() {
        initComponents();
        it = this; //Sử dụng biến static trỏ đến đối tượng của QuanLyGUI
       show_KhuDanCu();
       show_HoDanCu();
       show_CuDan();
       
         
        
    }
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();// đối tượng thao tác với ô trong table
     
    public void enabledFrame(){
        this.setEnabled(true);
    }// hàm cho phép thao tác trên frame này

public void show_KhuDanCu(){
         addMakhu();
        tblKhuDanCu.setModel(KhuDanCuBLL.show()); 
         renderer.setHorizontalAlignment( JLabel.CENTER );
        tblKhuDanCu.setDefaultRenderer(Object.class, renderer);
        //cbMakhu.setModel(KhuDanCuBLL.cbb_show());
    }
  
public void show_HoDanCu(){
    addMaHoDan();
    tblHoDanCu.setModel(HoDanCuBLL.show());
     renderer.setHorizontalAlignment( JLabel.CENTER );
     tblHoDanCu.setDefaultRenderer(Object.class, renderer);
     cbKhuDanCu.setModel(HoDanCuBLL.cbb_show());
}
public void show_CuDan()
{
    addMaCuDan();
    tblCuDan.setModel(CuDanBLL.show());
    renderer.setHorizontalAlignment(jLabel1.CENTER);
    tblCuDan.setDefaultRenderer(Object.class, renderer);
    cbHodancu.setModel(CuDanBLL.cbb_show());
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPKhuDanCu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhuDanCu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenKhu = new javax.swing.JTextField();
        txtDiaChiKhu = new javax.swing.JTextField();
        txtSoHo = new javax.swing.JTextField();
        btnThemKhu = new javax.swing.JButton();
        btnSuaKhu = new javax.swing.JButton();
        btnXoaKhu = new javax.swing.JButton();
        btnTimKiemKhu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTiemKiemKhu = new javax.swing.JTextField();
        txtMakhu = new javax.swing.JTextField();
        btnShowKhuDanCu = new javax.swing.JButton();
        jPHoDanCu = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMaHoDan = new javax.swing.JTextField();
        txtDiaChiHoDan = new javax.swing.JTextField();
        txtDientich = new javax.swing.JTextField();
        txtSoThanhVien = new javax.swing.JTextField();
        cbKhuDanCu = new javax.swing.JComboBox<>();
        btnThemHoDancu = new javax.swing.JButton();
        txtSuaHoDanCu = new javax.swing.JButton();
        btnXoaHoDanCu = new javax.swing.JButton();
        btnShowBangHoDanCu = new javax.swing.JButton();
        btnTimkiemHoDanCu = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtTiemkiemHoDan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoDanCu = new javax.swing.JTable();
        jPCuDan = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtHovaTen = new javax.swing.JTextField();
        txtMaCuDan = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        txtNgheNghiep = new javax.swing.JTextField();
        txtSoCMT = new javax.swing.JTextField();
        cbHodancu = new javax.swing.JComboBox<>();
        txtTimKiemCuDan = new javax.swing.JTextField();
        btnTimKiemCuDan = new javax.swing.JButton();
        btnThemCuDan = new javax.swing.JButton();
        btnSuaCuDan = new javax.swing.JButton();
        btnXoaCuDan = new javax.swing.JButton();
        btnShowCuDan = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCuDan = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N

        tblKhuDanCu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "MÃ KHU", "TÊN KHU", "ĐỊA CHỈ", "SỐ HỘ"
            }
        ));
        tblKhuDanCu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhuDanCuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhuDanCu);
        if (tblKhuDanCu.getColumnModel().getColumnCount() > 0) {
            tblKhuDanCu.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblKhuDanCu.getColumnModel().getColumn(1).setResizable(false);
            tblKhuDanCu.getColumnModel().getColumn(1).setPreferredWidth(30);
            tblKhuDanCu.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblKhuDanCu.getColumnModel().getColumn(3).setResizable(false);
            tblKhuDanCu.getColumnModel().getColumn(3).setPreferredWidth(250);
            tblKhuDanCu.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel2.setText("MÃ KHU:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel3.setText("TÊN KHU:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel4.setText("SỐ HỘ:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel5.setText("ĐỊA CHỈ:");

        txtTenKhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhuActionPerformed(evt);
            }
        });

        txtDiaChiKhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiKhuActionPerformed(evt);
            }
        });

        btnThemKhu.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnThemKhu.setText("THÊM");
        btnThemKhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKhuActionPerformed(evt);
            }
        });

        btnSuaKhu.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnSuaKhu.setText("SỬA");
        btnSuaKhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaKhuActionPerformed(evt);
            }
        });

        btnXoaKhu.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnXoaKhu.setText("XÓA");
        btnXoaKhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKhuActionPerformed(evt);
            }
        });

        btnTimKiemKhu.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnTimKiemKhu.setText("TÌM KIẾM");
        btnTimKiemKhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemKhuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel6.setText("TÌM KIẾM:");

        txtTiemKiemKhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiemKiemKhuActionPerformed(evt);
            }
        });

        txtMakhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMakhuActionPerformed(evt);
            }
        });

        btnShowKhuDanCu.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnShowKhuDanCu.setText("HIỂN THỊ");
        btnShowKhuDanCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowKhuDanCuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPKhuDanCuLayout = new javax.swing.GroupLayout(jPKhuDanCu);
        jPKhuDanCu.setLayout(jPKhuDanCuLayout);
        jPKhuDanCuLayout.setHorizontalGroup(
            jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPKhuDanCuLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPKhuDanCuLayout.createSequentialGroup()
                        .addGroup(jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMakhu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKhu))
                        .addGap(121, 121, 121))
                    .addGroup(jPKhuDanCuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThemKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoaKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowKhuDanCu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)))
                .addGroup(jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiaChiKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPKhuDanCuLayout.createSequentialGroup()
                        .addComponent(txtTiemKiemKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnTimKiemKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSoHo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPKhuDanCuLayout.setVerticalGroup(
            jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPKhuDanCuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMakhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiaChiKhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtTenKhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSoHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThemKhu)
                        .addComponent(btnSuaKhu)
                        .addComponent(btnXoaKhu)
                        .addComponent(btnShowKhuDanCu))
                    .addGroup(jPKhuDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTiemKiemKhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTimKiemKhu)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("KHU DÂN CƯ", jPKhuDanCu);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel7.setText("MÃ HỘ DÂN:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel8.setText("ĐỊA CHỈ:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel9.setText("DIỆN TÍCH:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel10.setText("SỐ TV:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel11.setText("MÃ KHU:");

        txtMaHoDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHoDanActionPerformed(evt);
            }
        });

        txtDiaChiHoDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiHoDanActionPerformed(evt);
            }
        });

        cbKhuDanCu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbKhuDanCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKhuDanCuActionPerformed(evt);
            }
        });

        btnThemHoDancu.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnThemHoDancu.setText("THÊM");
        btnThemHoDancu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHoDancuActionPerformed(evt);
            }
        });

        txtSuaHoDanCu.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtSuaHoDanCu.setText("SỬA");
        txtSuaHoDanCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuaHoDanCuActionPerformed(evt);
            }
        });

        btnXoaHoDanCu.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnXoaHoDanCu.setText("XÓA");
        btnXoaHoDanCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHoDanCuActionPerformed(evt);
            }
        });

        btnShowBangHoDanCu.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnShowBangHoDanCu.setText("HIỂN THỊ");
        btnShowBangHoDanCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowBangHoDanCuActionPerformed(evt);
            }
        });

        btnTimkiemHoDanCu.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnTimkiemHoDanCu.setText("TÌM KIẾM");
        btnTimkiemHoDanCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemHoDanCuActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel12.setText("TÌM KIẾM:");

        tblHoDanCu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MÃ HỘ DÂN", "ĐỊA CHỈ", "DIỆN TÍCH", "SỐ TV", "MÃ KHU"
            }
        ));
        tblHoDanCu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoDanCuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHoDanCu);
        if (tblHoDanCu.getColumnModel().getColumnCount() > 0) {
            tblHoDanCu.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblHoDanCu.getColumnModel().getColumn(1).setPreferredWidth(20);
            tblHoDanCu.getColumnModel().getColumn(2).setPreferredWidth(250);
            tblHoDanCu.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblHoDanCu.getColumnModel().getColumn(4).setPreferredWidth(20);
            tblHoDanCu.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPHoDanCuLayout = new javax.swing.GroupLayout(jPHoDanCu);
        jPHoDanCu.setLayout(jPHoDanCuLayout);
        jPHoDanCuLayout.setHorizontalGroup(
            jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPHoDanCuLayout.createSequentialGroup()
                .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPHoDanCuLayout.createSequentialGroup()
                        .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPHoDanCuLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPHoDanCuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDientich, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPHoDanCuLayout.createSequentialGroup()
                                .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnShowBangHoDanCu, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMaHoDan, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDiaChiHoDan, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPHoDanCuLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel10))
                                    .addGroup(jPHoDanCuLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addGroup(jPHoDanCuLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbKhuDanCu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPHoDanCuLayout.createSequentialGroup()
                                .addComponent(txtTiemkiemHoDan, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTimkiemHoDanCu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSoThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPHoDanCuLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnThemHoDancu, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txtSuaHoDanCu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnXoaHoDanCu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPHoDanCuLayout.setVerticalGroup(
            jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHoDanCuLayout.createSequentialGroup()
                .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPHoDanCuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaHoDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPHoDanCuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChiHoDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(cbKhuDanCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDientich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtTiemkiemHoDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemHoDanCu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPHoDanCuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemHoDancu)
                    .addComponent(txtSuaHoDanCu)
                    .addComponent(btnXoaHoDanCu)
                    .addComponent(btnShowBangHoDanCu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("HỘ DÂN CƯ", jPHoDanCu);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel13.setText("MÃ CƯ DÂN:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel14.setText("HỌ VÀ TÊN:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel15.setText("TUỔI:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel16.setText("GIỚI TÍNH:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel17.setText("NGHỀ NGHIỆP:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel18.setText("SỐ CMT:");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel19.setText("MÃ HỘ DÂN:");

        txtMaCuDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaCuDanActionPerformed(evt);
            }
        });

        radNam.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        radNam.setSelected(true);
        radNam.setText("NAM");
        radNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radNamMouseClicked(evt);
            }
        });

        radNu.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        radNu.setText("NỮ");
        radNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNuActionPerformed(evt);
            }
        });

        cbHodancu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbHodancu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbHodancuItemStateChanged(evt);
            }
        });
        cbHodancu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbHodancuMouseClicked(evt);
            }
        });
        cbHodancu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHodancuActionPerformed(evt);
            }
        });

        btnTimKiemCuDan.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnTimKiemCuDan.setText("TÌM KIẾM");
        btnTimKiemCuDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemCuDanActionPerformed(evt);
            }
        });

        btnThemCuDan.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnThemCuDan.setText("THÊM");
        btnThemCuDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCuDanActionPerformed(evt);
            }
        });

        btnSuaCuDan.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnSuaCuDan.setText("SỬA");
        btnSuaCuDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCuDanActionPerformed(evt);
            }
        });

        btnXoaCuDan.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnXoaCuDan.setText("XÓA");
        btnXoaCuDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCuDanActionPerformed(evt);
            }
        });

        btnShowCuDan.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        btnShowCuDan.setText("HIỂN THỊ");
        btnShowCuDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowCuDanActionPerformed(evt);
            }
        });

        tblCuDan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MÃ CƯ DÂN", "HỌ VÀ TÊN", "TUỔI", "GIỚI TÍNH", "NGHỀ NGHIỆP", "SỐ CMT", "MÃ HỘ DÂN"
            }
        ));
        tblCuDan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuDanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCuDan);
        if (tblCuDan.getColumnModel().getColumnCount() > 0) {
            tblCuDan.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblCuDan.getColumnModel().getColumn(1).setPreferredWidth(20);
            tblCuDan.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblCuDan.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblCuDan.getColumnModel().getColumn(4).setPreferredWidth(20);
            tblCuDan.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblCuDan.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblCuDan.getColumnModel().getColumn(7).setPreferredWidth(20);
        }

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel20.setText("TÌM KIẾM:");

        javax.swing.GroupLayout jPCuDanLayout = new javax.swing.GroupLayout(jPCuDan);
        jPCuDan.setLayout(jPCuDanLayout);
        jPCuDanLayout.setHorizontalGroup(
            jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCuDanLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCuDanLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaCuDan, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPCuDanLayout.createSequentialGroup()
                        .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHovaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPCuDanLayout.createSequentialGroup()
                                .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(radNam)
                                .addGap(18, 18, 18)
                                .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radNu)
                                    .addComponent(btnShowCuDan)))))
                    .addGroup(jPCuDanLayout.createSequentialGroup()
                        .addComponent(btnThemCuDan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnSuaCuDan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnXoaCuDan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel20)
                        .addComponent(jLabel19)))
                .addGap(18, 18, 18)
                .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgheNghiep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPCuDanLayout.createSequentialGroup()
                        .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTimKiemCuDan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbHodancu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoCMT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addComponent(btnTimKiemCuDan)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPCuDanLayout.setVerticalGroup(
            jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCuDanLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMaCuDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtNgheNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtHovaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtSoCMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(radNam)
                        .addComponent(radNu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCuDanLayout.createSequentialGroup()
                        .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(cbHodancu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCuDanLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemCuDan)
                            .addComponent(btnSuaCuDan)
                            .addComponent(btnXoaCuDan)
                            .addComponent(btnShowCuDan)))
                    .addGroup(jPCuDanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiemCuDan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTimKiemCuDan)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("CƯ DÂN", jPCuDan);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CHƯƠNG TRÌNH QUẢN LÍ KHU DÂN CƯ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenKhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhuActionPerformed

    private void txtDiaChiKhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiKhuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiKhuActionPerformed

    private void btnSuaKhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaKhuActionPerformed
     try{
        if(txtTenKhu.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Tên khu không được bỏ trống!");
        }else if(txtDiaChiKhu.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Địa chỉ không được bỏ trống!");
        }else{
            if(KhuDanCuBLL.update(Integer.parseInt(txtMakhu.getText()),txtTenKhu.getText(),txtDiaChiKhu.getText(),Integer.parseInt(txtSoHo.getText()))){
                show_KhuDanCu();
                  cbKhuDanCu.setModel(HoDanCuBLL.cbb_show());
                JOptionPane.showMessageDialog(null,"Sửa thành công!");
                clearALLControlHoDanCu();
            }else{
                JOptionPane.showMessageDialog(null,"Không sửa được!");
            }
        }
     }catch(NumberFormatException e)
     {
           JOptionPane.showMessageDialog(null,"Vui lòng nhập đúng định dạng số!");
     }
    }//GEN-LAST:event_btnSuaKhuActionPerformed

    private void btnXoaKhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKhuActionPerformed
       
        if(KhuDanCuBLL.checkEmpty()){
            JOptionPane.showMessageDialog(this, "Chưa có khu dan cu nào!", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }else{
            Object[] items = {"Xác nhận","Hủy"};
            int rs = JOptionPane.showOptionDialog(null,"Xóa khu và tất cả thông tin liên quan!","Xóa khu căn hộ",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, items,items[0]);
            if(rs==JOptionPane.YES_OPTION){
                
                  boolean check =   KhuDanCuBLL.delete(Integer.parseInt(txtMakhu.getText()));
                  if(check == true)
                  {
                    show_KhuDanCu();
                    JOptionPane.showMessageDialog(null, "Xóa thành công!");
                    
                   // clearAllControl_KhuCanHo();
                   // clearAllControl_CanHo();
                   cbKhuDanCu.setModel(HoDanCuBLL.cbb_show());
                  }else
                  {
                      JOptionPane.showMessageDialog(null, "Bạn phải xóa hộ hết hộ dân trong khu thì mới có thể xóa được Khu dân cư !");
                  }
                    }else{
                        JOptionPane.showMessageDialog(null, "Không xóa được!");
                    }
                }

    }//GEN-LAST:event_btnXoaKhuActionPerformed

    private void txtTiemKiemKhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiemKiemKhuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiemKiemKhuActionPerformed

    private void btnTimKiemKhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemKhuActionPerformed
        try {
            tblKhuDanCu.setModel(KhuDanCuBLL.search(txtTiemKiemKhu.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(GUIQuanly.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimKiemKhuActionPerformed
   private void addMakhu()
   {
       int Makhu = (KhuDanCuDLL.show().size() > 0) ? (KhuDanCuDLL.show().size() + 1) : 1;
                 txtMakhu.setText(String.valueOf(Makhu));
                
   }
   private void addMaHoDan()
   {
       int Mahodan = (HoDanCuDLL.show().size() > 0) ? (HoDanCuDLL.show().size() + 1) : 1;
                 txtMaHoDan.setText(String.valueOf(Mahodan));
   }
   private void addMaCuDan()
   {
      int Macudan=  (CuDanDLL.show().size()>0) ? (CuDanDLL.show().size()+1):1;
      txtMaCuDan.setText(String.valueOf(Macudan));
   }
   //Them Khu dan cu
    private void btnThemKhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKhuActionPerformed
       try{
        
           if(txtMakhu.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Ma khu trống!");
           }
           
            if(KhuDanCuBLL.checkNotDuplicateAreaName(txtTenKhu.getText())){ 
                JOptionPane.showMessageDialog(null,"Tên khu đã tồn tại!");
            }else if(txtTenKhu.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Tên khu trống!");
            }else if(txtTenKhu.getText().length()>50){
                JOptionPane.showMessageDialog(null,"Tên khu quá dài!");
        
            }else if(txtDiaChiKhu.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Địa chỉ trống!");
            }else if(txtDiaChiKhu.getText().length()>100){
                JOptionPane.showMessageDialog(null,"Địa chỉ quá dài!");
            
            }else if(txtSoHo.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Số phòng trống");
            }else if(Integer.parseInt(txtSoHo.getText())<1){
                JOptionPane.showMessageDialog(null,"Vui lòng số phòng là số dương!");
            }else{
               
                boolean check = KhuDanCuBLL.insert(Integer.parseInt(txtMakhu.getText()),txtTenKhu.getText(),txtDiaChiKhu.getText(),Integer.parseInt(txtSoHo.getText()) );
                GUIQuanly.it.show_KhuDanCu(); 
                
                if(check){
                    JOptionPane.showMessageDialog(null,"Thêm thành công khu " +"'"+txtTenKhu.getText()+"'"
                       ,"Notification",JOptionPane.INFORMATION_MESSAGE);
                    
                    clearAllControlKhuDanCu();
                      cbKhuDanCu.setModel(HoDanCuBLL.cbb_show());
                    
                }else{
                    JOptionPane.showMessageDialog(null,"Vui lòng xem lại thông tin!"); 
                }
             
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đúng định dạng số!");
        }
    }//GEN-LAST:event_btnThemKhuActionPerformed

    private void txtMakhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMakhuActionPerformed
      
    }//GEN-LAST:event_txtMakhuActionPerformed

    private void tblKhuDanCuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhuDanCuMouseClicked
       txtMakhu.setText(tblKhuDanCu.getValueAt(tblKhuDanCu.getSelectedRow(),1).toString()); 
        txtTenKhu.setText(tblKhuDanCu.getValueAt(tblKhuDanCu.getSelectedRow(),2).toString());
        txtDiaChiKhu.setText(tblKhuDanCu.getValueAt(tblKhuDanCu.getSelectedRow(),3).toString());
        txtSoHo.setText(tblKhuDanCu.getValueAt(tblKhuDanCu.getSelectedRow(),4).toString());
    }//GEN-LAST:event_tblKhuDanCuMouseClicked

    private void btnShowKhuDanCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowKhuDanCuActionPerformed
       tblKhuDanCu.setModel(KhuDanCuBLL.show()); 
         renderer.setHorizontalAlignment( JLabel.CENTER );
        tblKhuDanCu.setDefaultRenderer(Object.class, renderer);
    }//GEN-LAST:event_btnShowKhuDanCuActionPerformed

    private void txtDiaChiHoDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiHoDanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiHoDanActionPerformed

    private void txtMaHoDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHoDanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHoDanActionPerformed
//Them Ho dan cu
    private void btnThemHoDancuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHoDancuActionPerformed
       try{

           if(txtMaHoDan.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Ma khu trống!");
           }else
           
            if(HoDanCuBLL.checkNotDuplicateAreaName(txtDiaChiHoDan.getText())){ 
                JOptionPane.showMessageDialog(null,"Dia chi đã tồn tại!");
            }else if(txtDiaChiHoDan.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Dia chi trống!");
            }else if(txtDiaChiHoDan.getText().length()>150){
                JOptionPane.showMessageDialog(null,"Dia chi quá dài!");
        
            }else if(txtDientich.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Dien tich trống!");
            }else if(Float.parseFloat(txtDientich.getText())<1){
                JOptionPane.showMessageDialog(null,"Dien tich phai la so duong!");
            
            }else if(txtSoThanhVien.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Số thanh vien trống");
            }else if(Integer.parseInt(txtSoThanhVien.getText())<1){
                JOptionPane.showMessageDialog(null,"Vui lòng số thanh vien là số dương!");
            }else{
               
                boolean check  = HoDanCuBLL.insert(Integer.parseInt(txtMaHoDan.getText()),txtDiaChiHoDan.getText(),Float.parseFloat(txtDientich.getText()),
                        Integer.parseInt(txtSoThanhVien.getText()),Integer.parseInt(cbKhuDanCu.getSelectedItem().toString()) );
                GUIQuanly.it.show_HoDanCu();
                
                if(check){
                    JOptionPane.showMessageDialog(null,"Thêm thành công ho dan cu moi !"
                       ,"Notification",JOptionPane.INFORMATION_MESSAGE);
                    
                    clearALLControlHoDanCu();
                    cbHodancu.setModel(CuDanBLL.cbb_show());
                    
                }else{
                    JOptionPane.showMessageDialog(null,"Không thể thêm mới( Kiểm tra lại mã dân cư hoặc số lượng hộ dân trong khu)!"); 
                }
             
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đúng định dạng số!");
        }
    }//GEN-LAST:event_btnThemHoDancuActionPerformed
// Sua ho dan cu
    private void txtSuaHoDanCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuaHoDanCuActionPerformed
        try{
        
            if(txtDiaChiHoDan.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Dia chi trống!");
            }else if(txtDiaChiHoDan.getText().length()>150){
                JOptionPane.showMessageDialog(null,"Tên khu quá dài!");
        
            }else if(txtDientich.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Dien tich trống!");
            }else if(Float.parseFloat(txtDientich.getText())<1){
                JOptionPane.showMessageDialog(null,"Dien tich phai la so duong!");
            
            }else if(txtSoThanhVien.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Số thanh vien trống");
            }else if(Integer.parseInt(txtSoThanhVien.getText())<1){
                JOptionPane.showMessageDialog(null,"Vui lòng số thanh vien là số dương!");
        }else{
            if(HoDanCuBLL.update(Integer.parseInt(txtMaHoDan.getText()),txtDiaChiHoDan.getText(),Float.parseFloat(txtDientich.getText()),Integer.parseInt(txtSoThanhVien.getText()),Integer.parseInt(cbKhuDanCu.getSelectedItem().toString()))){
                GUIQuanly.it.show_HoDanCu();
                cbHodancu.setModel(CuDanBLL.cbb_show());
                JOptionPane.showMessageDialog(null,"Sửa thành công!");
            }else{
                JOptionPane.showMessageDialog(null,"Không sửa được!");
            }
        }
        }catch(NumberFormatException e)
        {
              JOptionPane.showMessageDialog(null,"Vui lòng nhập đúng định dạng số!");
        }
    }//GEN-LAST:event_txtSuaHoDanCuActionPerformed

    private void tblHoDanCuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoDanCuMouseClicked
       txtMaHoDan.setText(tblHoDanCu.getValueAt(tblHoDanCu.getSelectedRow(),1).toString()); 
        txtDiaChiHoDan.setText(tblHoDanCu.getValueAt(tblHoDanCu.getSelectedRow(),2).toString()); 
         txtDientich.setText(tblHoDanCu.getValueAt(tblHoDanCu.getSelectedRow(),3).toString()); 
          txtSoThanhVien.setText(tblHoDanCu.getValueAt(tblHoDanCu.getSelectedRow(),4).toString()); 
          
    }//GEN-LAST:event_tblHoDanCuMouseClicked
//Xoa Ho dan Cu
    private void btnXoaHoDanCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHoDanCuActionPerformed
        if(HoDanCuBLL.checkEmpty()){
            JOptionPane.showMessageDialog(this, "Chưa có hộ dân cư nào!", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }else{
            Object[] items = {"Xác nhận","Hủy"};
            int rs = JOptionPane.showOptionDialog(null,"Xóa hộ và tất cả thông tin liên quan!","Xóa hộ dân cư",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, items,items[0]);
            if(rs==JOptionPane.YES_OPTION){
                
                  boolean check = HoDanCuBLL.delete(Integer.parseInt(txtMaHoDan.getText()));
                  if(check==true){
                    show_HoDanCu();
                 
                    JOptionPane.showMessageDialog(null, "Xóa thành công!");
                   // clearAllControl_KhuCanHo();
                   // clearAllControl_CanHo();
                   cbHodancu.setModel(CuDanBLL.cbb_show());
                  }else
                  {
                      JOptionPane.showMessageDialog(null, "Bạn phải xóa thành viên trước khi xóa Hộ Dân Cư!");
                  }
                      
                    }else{
                        JOptionPane.showMessageDialog(null, "Không xóa được!");
                    }
                }
        
    }//GEN-LAST:event_btnXoaHoDanCuActionPerformed

    private void btnShowBangHoDanCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowBangHoDanCuActionPerformed
        show_HoDanCu();
        clearALLControlHoDanCu();
    }//GEN-LAST:event_btnShowBangHoDanCuActionPerformed

    private void btnTimkiemHoDanCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemHoDanCuActionPerformed
         try {
            tblHoDanCu.setModel(HoDanCuBLL.search(txtTiemkiemHoDan.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(GUIQuanly.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimkiemHoDanCuActionPerformed

    private void cbKhuDanCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKhuDanCuActionPerformed
        tblHoDanCu.setModel(HoDanCuBLL.showControlWithCombobox(Integer.parseInt(cbKhuDanCu.getSelectedItem().toString())));
    }//GEN-LAST:event_cbKhuDanCuActionPerformed

    private void txtMaCuDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaCuDanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaCuDanActionPerformed

    private void btnXoaCuDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCuDanActionPerformed
        if(CuDanBLL.checkEmpty()){
            JOptionPane.showMessageDialog(this, "Chưa có cư dân nào!", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }else{
            Object[] items = {"Xác nhận","Hủy"};
            int rs = JOptionPane.showOptionDialog(null,"Xóa cư dân và tất cả thông tin liên quan!","Xóa cư dân",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, items,items[0]);
            if(rs==JOptionPane.YES_OPTION){
                
                  boolean check = CuDanBLL.delete(Integer.parseInt(txtMaCuDan.getText()));
                  if(check==true){
                    show_CuDan();
                 
                    JOptionPane.showMessageDialog(null, "Xóa thành công!");
                    clearAllControlDanCu();
                    
                    
                 
                  }
                    }else{
                        JOptionPane.showMessageDialog(null, "Không xóa được!");
                    }
                }
    }//GEN-LAST:event_btnXoaCuDanActionPerformed

    private void btnShowCuDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowCuDanActionPerformed
      show_CuDan();
      clearALLControlHoDanCu();
    }//GEN-LAST:event_btnShowCuDanActionPerformed
//Them Cu Dan Moi
    public String checkgt(){
        String gt =null;
        if(radNam.isSelected()){
            gt="Nam";
        }
        return gt;
    }
    private void btnThemCuDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCuDanActionPerformed
        try{
        
           if(txtMaCuDan.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Mã cư dân trống!");
           }
            if(txtHovaTen.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Họ và tên bị bỏ trống !");
            }
            else if(txtHovaTen.getText().length()>150){
                JOptionPane.showMessageDialog(null,"Tên quá dài!");
        
            }else if(txtTuoi.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Tuổi trống!");
            }else if(Integer.parseInt(txtTuoi.getText())<1){
                JOptionPane.showMessageDialog(null,"Tuổi phải là số dương!");
            
            }else if(!radNam.isSelected() && !radNu.isSelected() ){
                JOptionPane.showMessageDialog(null,"Bạn phải chọn Nam  Hoặc Nữ");
            }
            else if(txtNgheNghiep.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nghề nghiệp trống !");
                
            }else if(txtNgheNghiep.getText().length()>150){
                JOptionPane.showMessageDialog(null,"Nghề nghiệp quá dài !");
            } if(CuDanBLL.checkNotDuplicateAreaName(txtSoCMT.getText())){ 
                JOptionPane.showMessageDialog(null,"Số chứng minh thư đã tồn tại!");
            }else if(txtSoCMT.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Số CMT trống!");
            }
           else if(txtSoCMT.getText().length()>15 || txtSoCMT.getText().length()<10){
               JOptionPane.showMessageDialog(null, "Số chứng minh phải nhỏ hơn 15 số và lớn hơn 10 !");
               
           }
            else{

                boolean check = CuDanBLL.insert(Integer.parseInt(txtMaCuDan.getText()),txtHovaTen.getText(),Integer.parseInt(txtTuoi.getText()),checkgt(),
                        txtNgheNghiep.getText(),txtSoCMT.getText(),Integer.parseInt(cbHodancu.getSelectedItem().toString()));
                      
                GUIQuanly.it.show_CuDan();
                
                if(check){
                    JOptionPane.showMessageDialog(null,"Thêm thành công cư dân mới !"
                       ,"Notification",JOptionPane.INFORMATION_MESSAGE);
                    
                    clearAllControlDanCu();
                }else{
                    JOptionPane.showMessageDialog(null,"Vui lòng xem lại thông tin( Mã cư dân hoặc số lượng cư dân đã có trong hộ !)"); 
                }
             
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đúng định dạng số!");
        }
    }//GEN-LAST:event_btnThemCuDanActionPerformed

    private void radNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radNamMouseClicked
        
    }//GEN-LAST:event_radNamMouseClicked

    private void tblCuDanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuDanMouseClicked
         txtMaCuDan.setText(tblCuDan.getValueAt(tblCuDan.getSelectedRow(),1).toString()); 
         txtHovaTen.setText(tblCuDan.getValueAt(tblCuDan.getSelectedRow(),2).toString());
         txtTuoi.setText(tblCuDan.getValueAt(tblCuDan.getSelectedRow(),3).toString());
         txtNgheNghiep.setText(tblCuDan.getValueAt(tblCuDan.getSelectedRow(),5).toString());
         txtSoCMT.setText(tblCuDan.getValueAt(tblCuDan.getSelectedRow(),6).toString());
       
    }//GEN-LAST:event_tblCuDanMouseClicked

    private void btnSuaCuDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCuDanActionPerformed
     try{
        
           if(txtMaCuDan.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Mã cư dân trống!");
           }
            if(txtHovaTen.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Họ và tên bị bỏ trống !");
            }
            else if(txtHovaTen.getText().length()>150){
                JOptionPane.showMessageDialog(null,"Tên quá dài!");
        
            }else if(txtTuoi.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Tuổi trống!");
            }else if(Integer.parseInt(txtTuoi.getText())<1){
                JOptionPane.showMessageDialog(null,"Tuổi phải là số dương!");
            
            }else if(!radNam.isSelected() && !radNu.isSelected() ){
                JOptionPane.showMessageDialog(null,"Bạn phải chọn 1 trong 2");
            }
            else if(txtNgheNghiep.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nghề nghiệp trống !");
                
            }else if(txtNgheNghiep.getText().length()>150){
                JOptionPane.showMessageDialog(null,"Nghề nghiệp quá dài !");
            }
            
            else if(txtSoCMT.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Số CMT trống!");
            }
           else if(txtSoCMT.getText().length()>15 || txtSoCMT.getText().length()<10){
               JOptionPane.showMessageDialog(null, "Số chứng minh phải nhỏ hơn 15 số và lớn hơn 10 !");
               
           }
           

            else{

                boolean check = CuDanBLL.update(Integer.parseInt(txtMaCuDan.getText()),txtHovaTen.getText(),Integer.parseInt(txtTuoi.getText()),checkgt(),
                        txtNgheNghiep.getText(),txtSoCMT.getText(),Integer.parseInt(cbHodancu.getSelectedItem().toString()));
                      
                GUIQuanly.it.show_CuDan();
                
                if(check){
                    JOptionPane.showMessageDialog(null,"Sửa thành công !"
                       ,"Notification",JOptionPane.INFORMATION_MESSAGE);
                    
                    clearAllControlDanCu();
                }else{
                    JOptionPane.showMessageDialog(null,"Vui lòng xem lại thông tin !"); 
                     clearAllControlDanCu();
                }
             
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đúng định dạng số!");
        }
    }//GEN-LAST:event_btnSuaCuDanActionPerformed

    private void btnTimKiemCuDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemCuDanActionPerformed
        try {
            tblCuDan.setModel(CuDanBLL.search(txtTimKiemCuDan.getText()));
            clearALLControlHoDanCu();
        } catch (SQLException ex) {
            Logger.getLogger(GUIQuanly.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimKiemCuDanActionPerformed

    private void cbHodancuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbHodancuItemStateChanged
      
    }//GEN-LAST:event_cbHodancuItemStateChanged

    private void cbHodancuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbHodancuMouseClicked
      
    }//GEN-LAST:event_cbHodancuMouseClicked

    private void cbHodancuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHodancuActionPerformed
       tblCuDan.setModel(CuDanBLL.showControlWithCombobox(Integer.parseInt(cbHodancu.getSelectedItem().toString())));
    }//GEN-LAST:event_cbHodancuActionPerformed

    private void radNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radNuActionPerformed
   public void clearAllControlKhuDanCu(){
  
        txtDiaChiKhu.setText("");
        txtSoHo.setText("");
        txtTenKhu.setText("");
        txtDiaChiKhu.requestFocus();
    }
   public void clearALLControlHoDanCu(){
       txtDiaChiHoDan.setText("");
       txtDientich.setText("");
       txtSoThanhVien.setText("");
       txtDiaChiHoDan.requestFocus();
   }
    public void clearAllControlDanCu()
    {
         txtHovaTen.setText("");
         txtTuoi.setText("");
         radNam.isCursorSet();
         txtNgheNghiep.setText("");
         txtSoCMT.setText("");
         txtHovaTen.requestFocus();
         
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIQuanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIQuanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIQuanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIQuanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIQuanly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowBangHoDanCu;
    private javax.swing.JButton btnShowCuDan;
    private javax.swing.JButton btnShowKhuDanCu;
    private javax.swing.JButton btnSuaCuDan;
    private javax.swing.JButton btnSuaKhu;
    private javax.swing.JButton btnThemCuDan;
    private javax.swing.JButton btnThemHoDancu;
    private javax.swing.JButton btnThemKhu;
    private javax.swing.JButton btnTimKiemCuDan;
    private javax.swing.JButton btnTimKiemKhu;
    private javax.swing.JButton btnTimkiemHoDanCu;
    private javax.swing.JButton btnXoaCuDan;
    private javax.swing.JButton btnXoaHoDanCu;
    private javax.swing.JButton btnXoaKhu;
    private javax.swing.JComboBox<String> cbHodancu;
    private javax.swing.JComboBox<String> cbKhuDanCu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPCuDan;
    private javax.swing.JPanel jPHoDanCu;
    private javax.swing.JPanel jPKhuDanCu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JTable tblCuDan;
    private javax.swing.JTable tblHoDanCu;
    private javax.swing.JTable tblKhuDanCu;
    private javax.swing.JTextField txtDiaChiHoDan;
    private javax.swing.JTextField txtDiaChiKhu;
    private javax.swing.JTextField txtDientich;
    private javax.swing.JTextField txtHovaTen;
    private javax.swing.JTextField txtMaCuDan;
    private javax.swing.JTextField txtMaHoDan;
    private javax.swing.JTextField txtMakhu;
    private javax.swing.JTextField txtNgheNghiep;
    private javax.swing.JTextField txtSoCMT;
    private javax.swing.JTextField txtSoHo;
    private javax.swing.JTextField txtSoThanhVien;
    private javax.swing.JButton txtSuaHoDanCu;
    private javax.swing.JTextField txtTenKhu;
    private javax.swing.JTextField txtTiemKiemKhu;
    private javax.swing.JTextField txtTiemkiemHoDan;
    private javax.swing.JTextField txtTimKiemCuDan;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
