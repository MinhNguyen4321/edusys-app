/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.dao.NguoiHocDAO;
import com.edusys.entity.NguoiHoc;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XDate;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.validator.GenericValidator;

/**
 *
 * @author MinIT
 */
public class NguoiHocJDialog extends javax.swing.JDialog {

    /**
     * Creates new form NguoiHocJDialog
     */
    public NguoiHocJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlEdit = new javax.swing.JPanel();
        lblMaNH = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblDienThoai = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblGhiChu = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDienThoai = new javax.swing.JTextField();
        txtMaNH = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        pnlGioiTinh = new javax.swing.JPanel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        pnlBtnEdit = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        pnlBtnDirectional = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        pnlList = new javax.swing.JPanel();
        pnlTimKiem = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 204));
        lblTitle.setText("QUẢN LÝ NGƯỜI HỌC");

        lblMaNH.setText("Mã người học");

        lblHoTen.setText("Họ và tên");

        lblEmail.setText("Địa chỉ email");

        lblDienThoai.setText("Điện thoại");

        lblNgaySinh.setText("Ngày sinh");

        lblGioiTinh.setText("Giới tính");

        lblGhiChu.setText("Ghi chú");

        txtNgaySinh.setToolTipText("Nhập theo định dạng mm/dd/yyyy");

        pnlGioiTinh.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        buttonGroup.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");
        pnlGioiTinh.add(rdoNam);

        buttonGroup.add(rdoNu);
        rdoNu.setText("Nữ");
        pnlGioiTinh.add(rdoNu);

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        pnlBtnEdit.setLayout(new java.awt.GridLayout(1, 0, 6, 0));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlBtnEdit.add(btnThem);

        btnSua.setText("Sửa");
        btnSua.setMaximumSize(new java.awt.Dimension(61, 23));
        btnSua.setMinimumSize(new java.awt.Dimension(61, 23));
        btnSua.setPreferredSize(new java.awt.Dimension(61, 23));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        pnlBtnEdit.add(btnSua);

        btnXoa.setText("Xóa");
        btnXoa.setMaximumSize(new java.awt.Dimension(61, 23));
        btnXoa.setMinimumSize(new java.awt.Dimension(61, 23));
        btnXoa.setPreferredSize(new java.awt.Dimension(61, 23));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlBtnEdit.add(btnXoa);

        btnMoi.setText("Mới");
        btnMoi.setMaximumSize(new java.awt.Dimension(61, 23));
        btnMoi.setMinimumSize(new java.awt.Dimension(61, 23));
        btnMoi.setPreferredSize(new java.awt.Dimension(61, 23));
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        pnlBtnEdit.add(btnMoi);

        pnlBtnDirectional.setLayout(new java.awt.GridLayout(1, 0, 6, 0));

        btnFirst.setText("|<");
        btnFirst.setMaximumSize(new java.awt.Dimension(49, 23));
        btnFirst.setMinimumSize(new java.awt.Dimension(49, 23));
        btnFirst.setPreferredSize(new java.awt.Dimension(49, 23));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        pnlBtnDirectional.add(btnFirst);

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        pnlBtnDirectional.add(btnPrev);

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        pnlBtnDirectional.add(btnNext);

        btnLast.setText(">|");
        btnLast.setMaximumSize(new java.awt.Dimension(49, 23));
        btnLast.setMinimumSize(new java.awt.Dimension(49, 23));
        btnLast.setPreferredSize(new java.awt.Dimension(49, 23));
        pnlBtnDirectional.add(btnLast);

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaNH)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMaNH)
                            .addComponent(lblHoTen)
                            .addComponent(lblGioiTinh)
                            .addComponent(lblDienThoai)
                            .addComponent(pnlGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(txtDienThoai))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNgaySinh)
                            .addGroup(pnlEditLayout.createSequentialGroup()
                                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblNgaySinh))
                                .addGap(0, 282, Short.MAX_VALUE))))
                    .addComponent(txtHoTen)
                    .addComponent(jScrollPane2)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(lblGhiChu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditLayout.createSequentialGroup()
                        .addComponent(pnlBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addComponent(pnlBtnDirectional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaNH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh)
                    .addComponent(lblNgaySinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDienThoai)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGhiChu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBtnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBtnDirectional, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabs.addTab("CẬP NHẬT", pnlEdit);

        pnlTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder("TÌM KIẾM"));

        btnTimKiem.setText("Tìm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTimKiemLayout = new javax.swing.GroupLayout(pnlTimKiem);
        pnlTimKiem.setLayout(pnlTimKiemLayout);
        pnlTimKiemLayout.setHorizontalGroup(
            pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiem)
                .addContainerGap())
        );
        pnlTimKiemLayout.setVerticalGroup(
            pnlTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemLayout.createSequentialGroup()
                .addComponent(btnTimKiem)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlTimKiemLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(txtTimKiem))
        );

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ NH", "HỌ VÀ TÊN", "GIỚI TÍNH", "NGÀY SINH", "ĐIỆN THOẠI", "EMAIL", "MA NV", "NGÀY ĐK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNguoiHoc.setRowHeight(25);
        tblNguoiHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNguoiHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNguoiHoc);

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                    .addComponent(pnlTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("DANH SÁCH", pnlList);

        tabs.setSelectedIndex(1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblNguoiHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNguoiHocMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() >= 2){
            this.row = tblNguoiHoc.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblNguoiHocMouseClicked

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
            java.util.logging.Logger.getLogger(NguoiHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NguoiHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NguoiHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NguoiHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NguoiHocJDialog dialog = new NguoiHocJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDienThoai;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaNH;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBtnDirectional;
    private javax.swing.JPanel pnlBtnEdit;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlGioiTinh;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPanel pnlTimKiem;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNH;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    NguoiHocDAO dao = new NguoiHocDAO();
    int row = -1;

    void init() {
        setLocationRelativeTo(null);

        this.fillTable();
        this.updateStatus();
    }

    void insert() {
        if(isValidated()){
            NguoiHoc nh = getForm();
            try {
                dao.insert(nh);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Thêm người học mới thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại!");
            }
        }
    }

    void update() {
        if(isValidated()){
            NguoiHoc nh = getForm();
            try {
                dao.update(nh);
                this.fillTable();
                this.updateStatus();
                MsgBox.alert(this, "Cập nhật thông tin thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    void delete() {
        if(!Auth.isManager()){
           MsgBox.alert(this, "Bạn không có quyền xóa người học!");
        }
        else if(MsgBox.confirm(this, "Bạn thực sự muốn xóa người học này?")){
            String maNH = txtMaNH.getText();
            try {
                dao.delete(maNH);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa người học thành công!");
            } 
            catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
            }            
        }  
    }

    void clearForm() {
        NguoiHoc nh = new NguoiHoc();
        nh.setMaNV(Auth.user.getMaNV());
        nh.setNgayDK(new Date());
        this.setForm(nh);
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < (tblNguoiHoc.getRowCount() - 1)) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblNguoiHoc.getRowCount() - 1;
        this.edit();
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0);
        String keyword = txtTimKiem.getText();
        List<NguoiHoc> list = dao.selectByKeyword(keyword);
        try {
            for (NguoiHoc nh : list) {
                model.addRow(new Object[]{
                    nh.getMaNH(),
                    nh.getHoTen(),
                    nh.isGioiTinh() ? "Nam" : "Nữ",
                    XDate.toString(nh.getNgaySinh(), "dd-MM-yyyy"),
                    nh.getDienThoai(),
                    nh.getEmail(),
                    nh.getMaNV(),
                    XDate.toString(nh.getNgayDK(), "dd-MM-yyyy")
                });
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void setForm(NguoiHoc nh) {
        txtMaNH.setText(nh.getMaNH());
        txtHoTen.setText(nh.getHoTen());
        if (nh.isGioiTinh()) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtNgaySinh.setText(XDate.toString(nh.getNgaySinh(), "dd-MM-yyyy"));
        txtDienThoai.setText(nh.getDienThoai());
        txtEmail.setText(nh.getEmail());
        txtGhiChu.setText(nh.getGhiChu());
    }

    NguoiHoc getForm() {
        NguoiHoc nh = new NguoiHoc();
        nh.setMaNH(txtMaNH.getText());
        nh.setHoTen(txtHoTen.getText());
        nh.setGioiTinh(rdoNam.isSelected());
        nh.setNgaySinh(XDate.toDate(txtNgaySinh.getText(), "dd-MM-yyyy"));
        nh.setDienThoai(txtDienThoai.getText());
        nh.setEmail(txtEmail.getText());
        nh.setGhiChu(txtGhiChu.getText());
        nh.setMaNV(Auth.user.getMaNV());
        nh.setNgayDK(new Date());
        return nh;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblNguoiHoc.getRowCount() - 1);

        if (edit) {
            tblNguoiHoc.setRowSelectionInterval(row, row);
        }

        txtMaNH.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    void edit() {
        String maNH = (String) tblNguoiHoc.getValueAt(row, 0);
        NguoiHoc nh = dao.selectById(maNH);
        this.setForm(nh);
        this.updateStatus();
        tabs.setSelectedIndex(0);
    }

    void search() {
        this.fillTable();
        this.clearForm();
        this.row = -1;
        updateStatus();
    }

    boolean isValidated() {
        String maNH = txtMaNH.getText();
        String email = txtEmail.getText();
        String dienThoai = txtDienThoai.getText();
        if (maNH.length() == 0) {
            MsgBox.alert(this, "Mã người học không được để trống!");
        } else if (dao.selectById(maNH) != null) {
            MsgBox.alert(this, "Mã người học đã tồn tại!");
        } else if (txtHoTen.getText().length() == 0) {
            MsgBox.alert(this, "Họ và tên không được để trống!");
        } else if (txtNgaySinh.getText().length() == 0) {
            MsgBox.alert(this, "Ngày sinh không được để trống!");
        } else if (!GenericValidator.isDate(txtNgaySinh.getText(), "dd-MM-yyyy", true)) {
            MsgBox.alert(this, "Ngày sinh không hợp lệ (dd-MM-yyyy)!");
        } else if (dienThoai.length() == 0) {
            MsgBox.alert(this, "Điện thoại không được để trống!");
        } else if (!dienThoai.matches("((84)|(0))\\d{9}")) {
            MsgBox.alert(this, "Số điện thoại không hợp lệ!");
        } else if (email.length() == 0) {
            MsgBox.alert(this, "Email không được bỏ trống!");
        } else if (!GenericValidator.isEmail(email)) {
            MsgBox.alert(this, "Email không hợp lệ!");
        } else {
            return true;
        }
        return false;
    }
}
