package assignmentsof301;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Designqlsv extends javax.swing.JFrame {

    private QlDAO listsv = new QlDAO();
    String[] thead = {"Mã Sv", "Họ Tên", "Giới Tính", "Địa Chỉ", "Phone", "Email"};
    DefaultTableModel model = new DefaultTableModel(thead, 0);
    Sqlsever sql = new Sqlsever();
    String namefile;

    public Designqlsv() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.tblqlsv.setModel(model);
        displaydata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        radionam = new javax.swing.JRadioButton();
        radionu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdiachi = new javax.swing.JTextPane();
        txtphone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtmasv = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        pnlimg = new javax.swing.JPanel();
        btnimg = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblqlsv = new javax.swing.JTable();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Quản Lí Sinh Viên");

        jLabel2.setText("Masv");

        jLabel3.setText("Họ Tên");

        jLabel4.setText("Email");

        jLabel5.setText("Số ĐT");

        jLabel6.setText("Giới TÍnh");

        jLabel7.setText("Địa Chỉ");

        buttonGroup1.add(radionam);
        radionam.setSelected(true);
        radionam.setText("Nam");

        buttonGroup1.add(radionu);
        radionu.setText("Nữ");

        jScrollPane1.setViewportView(txtdiachi);

        txtmasv.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtmasv.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlimg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlimg.setLayout(new java.awt.GridLayout());

        btnimg.setToolTipText("");
        btnimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimgActionPerformed(evt);
            }
        });
        pnlimg.add(btnimg);

        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignmentsof301/img/addicon.jpg"))); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignmentsof301/img/save.jpg"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignmentsof301/img/iconx.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignmentsof301/img/iconbut.jpg"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        tblqlsv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblqlsv.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tblqlsvMouseMoved(evt);
            }
        });
        tblqlsv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblqlsvMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblqlsv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radionam)
                                .addGap(18, 18, 18)
                                .addComponent(radionu))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtmasv, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtphone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(pnlimg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btndelete)
                                    .addComponent(btnadd))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnsave)
                                    .addComponent(btnupdate)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(radionam)
                                    .addComponent(radionu))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnadd)
                                            .addComponent(btnsave))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btndelete)
                                            .addComponent(btnupdate))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(99, 99, 99)))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        if (check() == true && checktontai() == true) {
            Sinhvien sv = new Sinhvien();
            sv.setAddress(this.txtdiachi.getText());
            sv.setEmail(this.txtEmail.getText());
            sv.setMasv(this.txtmasv.getText());
            sv.setName(this.txtname.getText());
            sv.setSdt(this.txtphone.getText());
            sv.setImg(namefile);
            System.out.println(namefile);
            if (this.radionam.isSelected()) {
                sv.setGender("Nam");
            } else {
                sv.setGender("Nữ");
            }
            listsv.themsv(sv);
            listtable();
            reset();
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int row = this.tblqlsv.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "xin mời chọn sv để xóa");
        } else {
            try {
                this.listsv.deletesv(row, this.tblqlsv.getValueAt(row, 0).toString());
                listtable();
                reset();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "xóa thất bại");
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tblqlsvMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblqlsvMouseMoved

    }//GEN-LAST:event_tblqlsvMouseMoved

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        int row = this.tblqlsv.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "xin mời chọn sv để cập nhật");
        } else {
            if (check()) {
                try {
                    String phai;
                    
                    if (this.radionam.isSelected()) {
                        this.tblqlsv.setValueAt("Nam", row, 2);
                        phai="Nam";
                    } else {
                        this.tblqlsv.setValueAt("nữ", row, 2);
                        phai="Nữ";
                    }
                    this.tblqlsv.setValueAt(this.txtname.getText(), row, 1);
                    this.tblqlsv.setValueAt(this.txtEmail.getText(), row, 5);
                    this.tblqlsv.setValueAt(this.txtdiachi.getText(), row, 3);
                    this.tblqlsv.setValueAt(this.txtmasv.getText(), row, 0);
                    this.tblqlsv.setValueAt(this.txtphone.getText(), row, 4);
                   /* this.listsv.xuatdssv().get(row).setName(this.txtname.getText());
                    this.listsv.xuatdssv().get(row).setEmail(this.txtEmail.getText());
                    this.listsv.xuatdssv().get(row).setAddress(this.txtdiachi.getText());
                    this.listsv.xuatdssv().get(row).setMasv(this.txtmasv.getText());
                    this.listsv.xuatdssv().get(row).setSdt(this.txtphone.getText());
                    this.listsv.xuatdssv().get(row).setImg(namefile);*/
                    listsv.updatesv(this.txtmasv.getText(),this.txtname.getText(),this.txtEmail.getText(),this.txtdiachi.getText(),
                            this.txtphone.getText(),phai,namefile,row);
                    listtable();
                    reset();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "cập nhật thất bại");
                }
            }
        }
    }//GEN-LAST:event_btnupdateActionPerformed


    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            sql.createdatabase(this.listsv);
            JOptionPane.showMessageDialog(this, "Lưu Thành Công", "Thông báo", JOptionPane.NO_OPTION);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lưu thất bại", "Thông báo", JOptionPane.NO_OPTION);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tblqlsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblqlsvMouseClicked
        int row = this.tblqlsv.getSelectedRow();
        this.txtEmail.setText(this.tblqlsv.getValueAt(row, 5) + "");
        this.txtdiachi.setText(this.tblqlsv.getValueAt(row, 3) + "");
        this.txtmasv.setText(this.tblqlsv.getValueAt(row, 0) + "");
        this.txtname.setText(this.tblqlsv.getValueAt(row, 1) + "");
        this.txtphone.setText(this.tblqlsv.getValueAt(row, 4) + "");
        try {
            this.btnimg.setIcon(new ImageIcon(this.listsv.xuatdatadssv().get(row).getImg()));
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "sinh viên không có ảnh thẻ");
        }
        String readgender = this.tblqlsv.getValueAt(row, 2) + "";
        if (readgender.equalsIgnoreCase("Nam")) {
            this.radionam.setSelected(true);
        } else {
            this.radionu.setSelected(true);
        }
    }//GEN-LAST:event_tblqlsvMouseClicked

    private void btnimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimgActionPerformed
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("img", "png", "jpg");
        jfc.setFileFilter(fnef);
        jfc.setMultiSelectionEnabled(false);
        int ktr = jfc.showDialog(this, "chọn file");
        if (ktr == JFileChooser.APPROVE_OPTION) {
            File f = jfc.getSelectedFile();
            namefile = f.getAbsolutePath();
            this.btnimg.setIcon(new ImageIcon(namefile));

        }
    }//GEN-LAST:event_btnimgActionPerformed

    private void displaydata() {

        try {
            listsv.xuatdatadssv();
            listtable();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không có dữ liệu");
        }
    }

    private boolean check() {
        if (this.txtEmail.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Email Không được bỏ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (this.txtdiachi.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Địa Chỉ Không được bỏ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (this.txtmasv.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mã SV Không được bỏ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (this.txtname.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Họ Tên Không được bỏ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (this.txtphone.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Số ĐT Không được bỏ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private boolean checktontai() {
        for (Sinhvien x : listsv.xuatdssv()) {
            if (x.getMasv().equalsIgnoreCase(this.txtmasv.getText())) {
                JOptionPane.showMessageDialog(this, "Số ĐT mã sinh viên đã đồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    private void reset() {
        this.txtEmail.setText("");
        this.txtdiachi.setText("");
        this.txtmasv.setText("");
        this.txtname.setText("");
        this.txtphone.setText("");
        this.radionam.setSelected(true);
    }

    private void listtable() {
        model.setRowCount(0);
        for (Sinhvien x : this.listsv.xuatdssv()) {
            Object[] row;
            row = new Object[]{x.getMasv(), x.getName(), x.getGender(), x.getAddress(), x.getSdt(), x.getEmail()};
            model.addRow(row);
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Designqlsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Designqlsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Designqlsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Designqlsv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Designqlsv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnimg;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlimg;
    private javax.swing.JRadioButton radionam;
    private javax.swing.JRadioButton radionu;
    private javax.swing.JTable tblqlsv;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextPane txtdiachi;
    private javax.swing.JTextField txtmasv;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
