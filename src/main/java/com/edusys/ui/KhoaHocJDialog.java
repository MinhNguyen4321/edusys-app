/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.dao.ChuyenDeDAO;
import com.edusys.dao.KhoaHocDAO;
import com.edusys.entity.ChuyenDe;
import com.edusys.entity.KhoaHoc;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XDate;
import java.awt.Color;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MinIT
 */
public class KhoaHocJDialog extends javax.swing.JDialog {

    /**
     * Creates new form KhoaHocJDialog
     */
    public KhoaHocJDialog(java.awt.Frame parent, boolean modal) {
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

        panel = new javax.swing.JPanel();
        pnlChuyenDe = new javax.swing.JPanel();
        cboChuyenDe = new javax.swing.JComboBox<>();
        tabs = new javax.swing.JTabbedPane();
        pnlEdit = new javax.swing.JPanel();
        pnlForm = new javax.swing.JPanel();
        lblTenCD = new javax.swing.JLabel();
        lblNgayKG = new javax.swing.JLabel();
        txtTenCD = new javax.swing.JTextField();
        txtNgayKG = new javax.swing.JTextField();
        lblHocPhi = new javax.swing.JLabel();
        lblMaNV = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        lblNgayTao = new javax.swing.JLabel();
        lblThoiLuong = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        txtThoiLuong = new javax.swing.JTextField();
        lblGhiChu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKhoaHoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Quản lý khoá học");

        panel.setLayout(new java.awt.BorderLayout());

        pnlChuyenDe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHUYÊN ĐỀ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        pnlChuyenDe.setLayout(new java.awt.BorderLayout());

        cboChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChuyenDeActionPerformed(evt);
            }
        });
        pnlChuyenDe.add(cboChuyenDe, java.awt.BorderLayout.CENTER);

        panel.add(pnlChuyenDe, java.awt.BorderLayout.PAGE_START);

        pnlForm.setLayout(new java.awt.GridLayout(0, 2, 5, 5));

        lblTenCD.setText("Chuyên đề");
        pnlForm.add(lblTenCD);

        lblNgayKG.setText("Khai giảng");
        pnlForm.add(lblNgayKG);

        txtTenCD.setEditable(false);
        txtTenCD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTenCD.setForeground(new java.awt.Color(255, 0, 0));
        txtTenCD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtTenCD.setOpaque(false);
        pnlForm.add(txtTenCD);
        pnlForm.add(txtNgayKG);

        lblHocPhi.setText("Học phí");
        pnlForm.add(lblHocPhi);

        lblMaNV.setText("Người tạo");
        pnlForm.add(lblMaNV);

        txtHocPhi.setEditable(false);
        txtHocPhi.setOpaque(false);
        pnlForm.add(txtHocPhi);

        txtMaNV.setOpaque(false);
        pnlForm.add(txtMaNV);

        lblNgayTao.setText("Ngày tạo");
        pnlForm.add(lblNgayTao);

        lblThoiLuong.setText("Thời lượng (giờ)");
        pnlForm.add(lblThoiLuong);

        txtNgayTao.setEditable(false);
        txtNgayTao.setOpaque(false);
        pnlForm.add(txtNgayTao);

        txtThoiLuong.setEditable(false);
        txtThoiLuong.setOpaque(false);
        pnlForm.add(txtThoiLuong);

        lblGhiChu.setText("Ghi chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane1.setViewportView(txtGhiChu);

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
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        pnlBtnDirectional.add(btnLast);

        javax.swing.GroupLayout pnlEditLayout = new javax.swing.GroupLayout(pnlEdit);
        pnlEdit.setLayout(pnlEditLayout);
        pnlEditLayout.setHorizontalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlEditLayout.createSequentialGroup()
                        .addComponent(lblGhiChu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditLayout.createSequentialGroup()
                        .addComponent(pnlBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(pnlBtnDirectional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlEditLayout.setVerticalGroup(
            pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGhiChu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBtnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBtnDirectional, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabs.addTab("CẬP NHẬT", pnlEdit);

        tblKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ KH", "THỜI LƯỢNG", "HỌC PHÍ", "KHAI GIẢNG", "TẠO BỞI", "NGÀY TẠO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhoaHoc.setRowHeight(25);
        tblKhoaHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoaHocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKhoaHoc);

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("DANH SÁCH", pnlList);

        tabs.setSelectedIndex(1);

        panel.add(tabs, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuyenDeActionPerformed
        // TODO add your handling code here:
        chonChuyenDe();
    }//GEN-LAST:event_cboChuyenDeActionPerformed

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

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblKhoaHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoaHocMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() >= 2) {
            this.row = tblKhoaHoc.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblKhoaHocMouseClicked

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
            java.util.logging.Logger.getLogger(KhoaHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhoaHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhoaHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhoaHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KhoaHocJDialog dialog = new KhoaHocJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblNgayKG;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblTenCD;
    private javax.swing.JLabel lblThoiLuong;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel pnlBtnDirectional;
    private javax.swing.JPanel pnlBtnEdit;
    private javax.swing.JPanel pnlChuyenDe;
    private javax.swing.JPanel pnlEdit;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlList;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblKhoaHoc;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgayKG;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtTenCD;
    private javax.swing.JTextField txtThoiLuong;
    // End of variables declaration//GEN-END:variables

    ChuyenDeDAO cddao = new ChuyenDeDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();
    int row = -1;

    void init() {
        setLocationRelativeTo(null);
        this.fillComboBoxChuyenDe();

        txtTenCD.setBackground(new Color(0, 0, 0, 0));
    }

    void fillComboBoxChuyenDe() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChuyenDe.getModel();
        model.removeAllElements();
        List<ChuyenDe> list = cddao.selectAll();
        for (ChuyenDe cd : list) {
            model.addElement(cd);
        }
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblKhoaHoc.getModel();
        model.setRowCount(0);
        try {
            ChuyenDe cd = (ChuyenDe) cboChuyenDe.getSelectedItem();
            List<KhoaHoc> list = khdao.selectByChuyenDe(cd.getMaCD());
            for (KhoaHoc kh : list) {
                model.addRow(new Object[]{
                    kh.getMaKH(),
                    kh.getThoiLuong(),
                    kh.getHocPhi(),
                    XDate.toString(kh.getNgayKG(), "dd-MM-yyyy"),
                    kh.getMaNV(),
                    XDate.toString(kh.getNgayTao(), "dd-MM-yyyy")
                });
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void chonChuyenDe() {
        ChuyenDe cd = (ChuyenDe) cboChuyenDe.getSelectedItem();
        txtThoiLuong.setText(String.valueOf(cd.getThoiLuong()));
        txtHocPhi.setText(String.valueOf(cd.getHocPhi()));
        txtTenCD.setText(cd.getTenCD());
        txtGhiChu.setText(cd.getMoTa());
        txtNgayKG.requestFocus();

        this.fillTable();
        this.updateStatus();
        this.row = -1;
        tabs.setSelectedIndex(1);
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblKhoaHoc.getRowCount() - 1);

        if (edit) {
            tblKhoaHoc.setRowSelectionInterval(row, row);
        }

        txtMaNV.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    KhoaHoc getForm() {
        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
        KhoaHoc kh = new KhoaHoc();

        kh.setMaCD(chuyenDe.getMaCD());
        kh.setNgayKG(XDate.toDate(txtNgayKG.getText(), "dd-MM-yyyy"));
        kh.setHocPhi(Double.valueOf(txtHocPhi.getText()));
        kh.setThoiLuong(Integer.valueOf(txtThoiLuong.getText()));
        kh.setGhiChu(txtGhiChu.getText());
        kh.setMaNV(Auth.user.getMaNV());
        kh.setNgayTao(XDate.toDate(txtNgayTao.getText(), "dd-MM-yyyy"));
        kh.setMaKH(Integer.valueOf(cboChuyenDe.getToolTipText()));

        return kh;
    }

    void setForm(KhoaHoc kh) {
        cboChuyenDe.setToolTipText(String.valueOf(kh.getMaKH()));
        cboChuyenDe.setSelectedItem(cddao.selectById(kh.getMaCD()));
        txtNgayKG.setText(XDate.toString(kh.getNgayKG(), "dd-MM-yyyy"));
        txtHocPhi.setText(String.valueOf(kh.getHocPhi()));
        txtThoiLuong.setText(String.valueOf(kh.getThoiLuong()));
        txtMaNV.setText(kh.getMaNV());
        txtNgayTao.setText(XDate.toString(kh.getNgayTao(), "dd-MM-yyyy"));
        txtGhiChu.setText(kh.getGhiChu());
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
        if (this.row < tblKhoaHoc.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblKhoaHoc.getRowCount() - 1;
        this.edit();
    }

    void edit() {
        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
        Integer maKH = (Integer) tblKhoaHoc.getValueAt(this.row, 0);
        KhoaHoc kh = khdao.selectById(maKH);
        this.setForm(kh);
        tabs.setSelectedIndex(0);
    }

    void insert() {
        if(isValidated()){
            KhoaHoc kh = getForm();
            kh.setNgayTao(new Date());
            try {
                khdao.insert(kh);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Thêm khoá học mới thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại!");
            }
        }
    }

    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa khóa học!");
        } else {
            if (MsgBox.confirm(this, "Bạn chắc chắn xóa khóa học này?")) {
                Integer maKH = Integer.valueOf(cboChuyenDe.getToolTipText());
                try {
                    khdao.delete(maKH);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa khoá học thành công!");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại!");
                    e.printStackTrace();
                }
            }
        }
    }

    void update() {
        if(isValidated()){
            KhoaHoc kh = getForm();
            try {
                khdao.update(kh);
                this.fillTable();
                MsgBox.alert(this, "Cập nhật thông tin thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    void clearForm() {
        ChuyenDe cd = (ChuyenDe) cboChuyenDe.getSelectedItem();
        KhoaHoc kh = new KhoaHoc();

        kh.setMaCD(cd.getMaCD());
        kh.setMaNV(Auth.user.getMaNV());
        kh.setNgayKG(XDate.addDays(new Date(), 30));
        kh.setNgayTao(new Date());
        kh.setThoiLuong(cd.getThoiLuong());
        kh.setGhiChu(cd.getMoTa());
        kh.setHocPhi(cd.getHocPhi());

        this.setForm(kh);
        tabs.setSelectedIndex(0);
    }
    
    boolean isValidated(){
        String ngayKG = txtNgayKG.getText();
        if(ngayKG.length() == 0){
            MsgBox.alert(this, "Chưa nhập ngày khai giảng khoá học!");
        } else if(!XDate.isDate(ngayKG, "dd-MM-yyyy")) {
            MsgBox.alert(this, "Ngày khai giảng không hợp lệ (dd-MM-yyyy)!");
        } else {
            return true;
        }
        return false;
    }
}
