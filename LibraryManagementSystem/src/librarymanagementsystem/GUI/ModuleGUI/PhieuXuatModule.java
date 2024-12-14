package librarymanagementsystem.GUI.ModuleGUI;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import librarymanagementsystem.Toolkit.DataProcessing;
import librarymanagementsystem.Toolkit.FileProcessing.*;
import librarymanagementsystem.GUI.Table.*;
import librarymanagementsystem.GUI.HienThiGUI.*;
import librarymanagementsystem.GUI.ThanhPhanGUI.ComboCheckBox;
import librarymanagementsystem.GUI.ThemSuaGUI.*;
import librarymanagementsystem.DTO.*;
import librarymanagementsystem.BUS.*;
import librarymanagementsystem.GUI.*;

import javax.swing.JPanel;

public class PhieuXuatModule {
    private static QLPhieuXuatBUS phieuXuatBUS = new QLPhieuXuatBUS();
    boolean tooglesearch = false;
    
    public JPanel getPhieuXuatModule() {
        initComponents();
        
        return jPanel1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        phieuXuat_Table = new javax.swing.JPanel();
        searchtextfield = new javax.swing.JTextField();
        search_bar = new javax.swing.JLabel();
        them_btn = new javax.swing.JLabel();
        nhapexcel_btn = new javax.swing.JLabel();
        xuatexcel_btn = new javax.swing.JLabel();
        refresh_btn = new javax.swing.JLabel();
        expand_btn = new javax.swing.JLabel();
        checkbox = new ComboCheckBox(new ArrayList<String>(Arrays.asList(phieuXuatBUS.getHeaders())));
        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        jPanel1.setBounds(0, 0, 940, 600);
        //getContentPane().add(jPanel1);
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        jPanel1.setOpaque(false);

        searchtextfield.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        searchtextfield.setForeground(new java.awt.Color(82, 210, 202));
        searchtextfield.setText("Tìm Kiếm...");
        searchtextfield.setBorder(null);
        searchtextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchtextfieldMouseClicked(evt);
            }
        });
        searchtextfield.setBounds(100, 63, 240, 30);
        searchtextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtextfieldKeyReleased(evt);
            }
        });
        
        jPanel1.add(searchtextfield);

        search_bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T185554.332.png"))); // NOI18N
        search_bar.setBounds(40, 55, 320, 46);
        jPanel1.add(search_bar);

        them_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T203841.556.png"))); // NOI18N
        them_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                them_btnMouseClicked(evt);
            }
        });
        them_btn.setBounds(410, 30, 160, 78);
        jPanel1.add(them_btn);

        nhapexcel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T203937.073.png"))); // NOI18N
        nhapexcel_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhapexcel_btnMouseClicked(evt);
            }
        });
        nhapexcel_btn.setBounds(580, 30, 160, 78);
        
        jPanel1.add(nhapexcel_btn);

        xuatexcel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools - 2020-05-28T203932.633.png"))); // NOI18N
        xuatexcel_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xuatexcel_btnMouseClicked(evt);
            }
        });xuatexcel_btn.setBounds(750, 30, 160, 78);
        jPanel1.add(xuatexcel_btn);
        
        /** add Expand and Refresh btn **/
        expand_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools - 2020-06-10T234019.664.png"))); // NOI18N
        expand_btn.setBounds(45, 115, 34, 34);
        expand_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expand_btnMouseClicked(evt);
            }
        });
        jPanel1.add(expand_btn);
        
        refresh_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../../images/output-onlinepngtools - 2020-06-10T234012.187.png"))); // NOI18N
        refresh_btn.setBounds(89, 115, 34, 34);
        refresh_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh_btnMouseClicked(evt);
            }
        });
        jPanel1.add(refresh_btn);
        /** end **/
        
        /** Header Check Box **/
        JPanel cb = checkbox.getCombobox();
        cb.setOpaque(false);
        cb.setBounds(150, 110, 200, 100);
//        cb.setLocation(150, 115);
        jPanel1.add(cb);
        
        phieuXuat_Table = new QLPhieuXuatTable().getTable();
        phieuXuat_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(phieuXuat_Table);
        
        //pack();
    }// </editor-fold>                        

    private void them_btnMouseClicked(java.awt.event.MouseEvent evt) {                                      
        System.out.println("Thêm");
        new ThemPhieuXuatForm().setVisible(true);
    }                                     

    private void nhapexcel_btnMouseClicked(java.awt.event.MouseEvent evt) {                                           
        System.out.println("Nhập Excel");
        new AlertGUI(1, "Thong Bao", "Không Làm Nhập Xuất Excel cho Phiếu Nhập!!!", "Quay Lại").setVisible(true);
//        ArrayList <QLPhieuXuatDTO> sach = new ImportFile().readFileExcel_QLPhieuXuat();
//        
//        boolean finish = true;
//        for (QLPhieuXuatDTO e : sach){
//            if (!phieuXuatBUS.add(e)){
//                finish = false;
//                new AlertGUI(2, "Error", "Lỗi Nhập", "Quay Lại").setVisible(true);
//                break;
//            }
//        }
//        
//        if (finish){
//            new AlertGUI(3, "Success", "Nhập Loại Sách Thành Công!!!", "Quay Lại").setVisible(true);
//        }
    }                                          

    private void xuatexcel_btnMouseClicked(java.awt.event.MouseEvent evt) {                                           
        System.out.println("Xuất Excel");
        new AlertGUI(1, "Thong Bao", "Không Làm Nhập Xuất Excel cho Phiếu Nhập!!!", "Quay Lại").setVisible(true);
//        new ExportFile().writeFileExcel_QLLoaiSach();
    }                                          

    private void searchtextfieldMouseClicked(java.awt.event.MouseEvent evt) {                                                
        if (tooglesearch != true){
            tooglesearch = true;
            searchtextfield.setText("");
        }
        //checkbox.hidePop();
    }       
    
    private void searchtextfieldKeyReleased(java.awt.event.KeyEvent evt) {    
        String search_str = searchtextfield.getText();
        System.out.println("Search: " + search_str);
        //ArrayList <QLPhieuXuatDTO> loaiSach = phieuXuatBUS.search_all(search_str);
        
        /** Testing **/
        ArrayList <String> columns_checked = checkbox.getChecked();
        
        ArrayList <QLPhieuXuatDTO> phieuXuat = phieuXuatBUS.getArrXuatKho();
        ArrayList <QLPhieuXuatDTO> search_res = new ArrayList<>();
        ArrayList <QLPhieuXuatDTO> search_temp = new ArrayList<>();
        for (String e : columns_checked){
            search_temp = phieuXuatBUS.search(e, search_str);
            
            ArrayList <String> pkey_1 = new ArrayList<>();
            ArrayList <String> pKey_2 = new ArrayList<>();
            
            for (QLPhieuXuatDTO ele : search_res){
                pkey_1.add(ele.getMaXuat());
            }
            
            for (QLPhieuXuatDTO ele : search_temp){
                pKey_2.add(ele.getMaXuat());
            }
            
            search_res = phieuXuatBUS.getPhieuXuat_full(new DataProcessing().union_arr(pkey_1, pKey_2));
        }
        
        phieuXuat = search_res;
        /** End Testing **/

        /* Print Ma Sach
        for (QLPhieuXuatDTO e : loaiSach){
            System.out.println(e.getMaSach());
        }*/
        
        jPanel1.remove(phieuXuat_Table);
        jPanel1.repaint();
        jPanel1.revalidate();
        phieuXuat_Table = new QLPhieuXuatTable().getTable(phieuXuat);
        phieuXuat_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(phieuXuat_Table);
    }  
    
    public void paintTable(ArrayList <QLPhieuXuatDTO> phieuXuat){
        jPanel1.remove(phieuXuat_Table);
        jPanel1.repaint();
        jPanel1.revalidate();
        phieuXuat_Table = new QLPhieuXuatTable().getTable(phieuXuat);
        phieuXuat_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(phieuXuat_Table);
    }
    
    private void expand_btnMouseClicked(java.awt.event.MouseEvent evt){
        new QLPhieuXuatTable().expandMode();
    } 
    
    private void refresh_btnMouseClicked(java.awt.event.MouseEvent evt){
        jPanel1.remove(phieuXuat_Table);
        jPanel1.repaint();
        jPanel1.revalidate();
        phieuXuat_Table = new QLPhieuXuatTable().getTable();
        phieuXuat_Table.setBounds(42, 150, 860, 440);
        jPanel1.add(phieuXuat_Table);
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
            java.util.logging.Logger.getLogger(TrangChuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel search_bar;
    private static javax.swing.JTextField searchtextfield;
    private static javax.swing.JLabel them_btn;
    private static javax.swing.JLabel nhapexcel_btn;
    private static javax.swing.JLabel xuatexcel_btn;
    private static javax.swing.JPanel phieuXuat_Table;
    private static javax.swing.JLabel refresh_btn;
    private static javax.swing.JLabel expand_btn;
    private static ComboCheckBox checkbox;
    // End of variables declaration        
}
