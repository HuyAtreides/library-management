package librarymanagementsystem.GUI;

import librarymanagementsystem.GUI.ModuleGUI.*;
import java.awt.Color;

import javax.swing.JPanel;


public class Main extends javax.swing.JFrame {

    int x_Mouse, y_Mouse;
    int current_Module = 0;
    public static String sub_Module = "";
    ExitGUI exitForm;
    TrangChuGUI TrangChuModule = new TrangChuGUI();
    public static javax.swing.JPanel Module_Panel = new javax.swing.JPanel(); 

    public Main() {
        initComponents("");
        setSize(1113, 763);
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
    }

    public Main(String currentUser) {
        System.out.println("Welcome " + currentUser);
        initComponents(currentUser);
        setSize(1113, 763);
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
    }

    public Main(int i) {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents(String currentUser) {

        jPanel1 = new javax.swing.JPanel();
        exit_btn = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        iconuser_label = new javax.swing.JLabel();
        tittleModule = new javax.swing.JLabel();
        movingWindow = new javax.swing.JLabel();
        trangChu_Module = new javax.swing.JLabel();
        sach_Module = new javax.swing.JLabel();
        khachHang_Module = new javax.swing.JLabel();
        nhanVien_Module = new javax.swing.JLabel();
        kho_Module = new javax.swing.JLabel();
        thongKe_Module = new javax.swing.JLabel();
        info_Module = new javax.swing.JLabel();
        mainGUI = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        /**
         * Default Module: TrangChuModule *
         */
        Module = TrangChuGUI.getTrangChuGUI();
        Module.setBounds(0, 0, 940, 600);

        Module_Panel.setOpaque(false);
        Module_Panel.setLayout(null);
        Module_Panel.add(Module);
        Module_Panel.setBounds(110, 100, 940, 600);

        jPanel1.add(Module_Panel);

        exit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (43).png"))); // NOI18N
        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btnMouseClicked(evt);
            }
        });
        exit_btn.setBounds(1015, 75, 20, 20);
        jPanel1.add(exit_btn);

        username_label.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        username_label.setForeground(new java.awt.Color(51, 51, 51));
        username_label.setText(currentUser);
        username_label.setBounds(840, 70, 123, 25);
        jPanel1.add(username_label);

        iconuser_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (39).png"))); // NOI18N
        iconuser_label.setBounds(790, 60, 32, 32);
        jPanel1.add(iconuser_label);

        tittleModule.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/tq.png"))); // NOI18N
        tittleModule.setBounds(140, 58, 180, 41);
        jPanel1.add(tittleModule);

        movingWindow.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingWindowMouseDragged(evt);
            }
        });
        movingWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingWindowMousePressed(evt);
            }
        });
        movingWindow.setBounds(50, 50, 1010, 50);
        jPanel1.add(movingWindow);

        trangChu_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (41).png"))); // NOI18N
        trangChu_Module.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trangChu_ModuleMouseClicked(evt);
            }
        });
        trangChu_Module.setBounds(66, 150, 32, 32);
        jPanel1.add(trangChu_Module);

        sach_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (46).png"))); // NOI18N
        sach_Module.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sach_ModuleMouseClicked(evt);
            }
        });
        sach_Module.setBounds(66, 230, 32, 32);
        jPanel1.add(sach_Module);

        khachHang_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (65).png"))); // NOI18N
        khachHang_Module.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khachHang_ModuleMouseClicked(evt);
            }
        });
        khachHang_Module.setBounds(66, 310, 32, 32);
        jPanel1.add(khachHang_Module);

        nhanVien_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (66).png"))); // NOI18N
        nhanVien_Module.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhanVien_ModuleMouseClicked(evt);
            }
        });
        nhanVien_Module.setBounds(66, 390, 32, 32);
        jPanel1.add(nhanVien_Module);

        kho_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (67).png"))); // NOI18N
        kho_Module.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kho_ModuleMouseClicked(evt);
            }
        });
        kho_Module.setBounds(66, 470, 32, 32);
        jPanel1.add(kho_Module);

        thongKe_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (68).png"))); // NOI18N
        thongKe_Module.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongKe_ModuleMouseClicked(evt);
            }
        });
        thongKe_Module.setBounds(66, 550, 32, 32);
        jPanel1.add(thongKe_Module);

        mainGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (64).png"))); // NOI18N
        mainGUI.setBounds(0, 0, 1113, 763);
        jPanel1.add(mainGUI);
        jPanel1.setBounds(0, 0, 1113, 763);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>                        

    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {
        //System.exit(0);
        if (exitForm == null || !exitForm.isDisplayable()) { // Hiển thị 1 windows tại 1 thời điểm 
            exitForm = new ExitGUI();
            exitForm.setVisible(true);
        }
    }

    private void movingWindowMouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        setLocation(x - x_Mouse - 49, y - y_Mouse - 49);
    }

    private void movingWindowMousePressed(java.awt.event.MouseEvent evt) {
        x_Mouse = evt.getX();
        y_Mouse = evt.getY();
    }

    private void turnOffModule() {
        switch (current_Module) {
            case 0:
                trangChu_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (77).png")));
                break;
            case 1:
                sach_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (46).png")));
                break;
            case 2:
                khachHang_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (65).png")));
                break;
            case 3:
                nhanVien_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (66).png")));
                break;
            case 4:
                kho_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (67).png")));
                break;
            case 5:
                thongKe_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (68).png")));
                break;
            case 6:
                info_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (69).png")));
                break;
        }
    }

    private void trangChu_ModuleMouseClicked(java.awt.event.MouseEvent evt) {
        turnOffModule();
        current_Module = 0;

        Module_Panel.removeAll();
        Module_Panel.repaint();
        Module_Panel.revalidate();
        Module = TrangChuModule.getTrangChuGUI();
        Module.setBounds(0, 0, 940, 600);
        Module_Panel.add(Module);

        tittleModule.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/tq.png")));
        trangChu_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (41).png")));
    }

    private void sach_ModuleMouseClicked(java.awt.event.MouseEvent evt) {
        turnOffModule();
        current_Module = 1;

        Module_Panel.removeAll();
        Module_Panel.repaint();
        Module_Panel.revalidate();
        Module = new Sach_SelectionModule().getSach_SelectionModule();
        Module.setBounds(0, 0, 940, 600);
        Module_Panel.add(Module);

        tittleModule.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/qls.png")));
        sach_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (72).png")));
    }

    private void khachHang_ModuleMouseClicked(java.awt.event.MouseEvent evt) {
        turnOffModule();
        current_Module = 2;

        Module_Panel.removeAll();
        Module_Panel.repaint();
        Module_Panel.revalidate();
        Module = new KhachHangModule().getKhachHangModule();
        Module.setBounds(0, 0, 940, 600);
        Module_Panel.add(Module);

        tittleModule.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/image_2.png")));
        khachHang_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (73).png")));

    }

    private void nhanVien_ModuleMouseClicked(java.awt.event.MouseEvent evt) {
        turnOffModule();
        current_Module = 3;

        Module_Panel.removeAll();
        Module_Panel.repaint();
        Module_Panel.revalidate();
        Module = new NhanVienModule().getNhanVienModule();
        Module.setBounds(0, 0, 940, 600);
        Module_Panel.add(Module);

        tittleModule.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/qlnv.png")));
        nhanVien_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (74).png")));

    }

    private void kho_ModuleMouseClicked(java.awt.event.MouseEvent evt) {
        turnOffModule();
        current_Module = 4;

        Module_Panel.removeAll();
        Module_Panel.repaint();
        Module_Panel.revalidate();
        Module = new Kho_SelectionModule().getKho_SelectionModule();
        Module.setBounds(0, 0, 940, 600);
        Module_Panel.add(Module);

        tittleModule.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/qlk.png")));
        kho_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (75).png")));

    }

    private void thongKe_ModuleMouseClicked(java.awt.event.MouseEvent evt) {
        turnOffModule();
        current_Module = 5;

        Module_Panel.removeAll();
        Module_Panel.repaint();
        Module_Panel.revalidate();
        Module = new ThongKeModule_Sach().getTrangChuGUI();
        Module.setBounds(0, 0, 940, 600);
        Module_Panel.add(new ThongKeModule(0).createTabbedPane());

//        JPanel thongkeModule = new ThongKeModule_Sach().getTrangChuGUI();
//        thongkeModule.setPreferredSize(new Dimension(940, 600));
//        JScrollPane scrollPane = new JScrollPane(thongkeModule);
//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        //scrollPane.setBounds(0, 0, 500, 400);
//        JPanel temp_thongke = new JPanel(new BorderLayout());
//        temp_thongke.add(scrollPane);
////        temp_thongke.add(scrollPane, BorderLayout.CENTER);
//        temp_thongke.setOpaque(false);
//        temp_thongke.setBounds(0, 0, 955, 400);
////        temp_thongke.setPreferredSize( new Dimension(500, 400));
//        Module_Panel.add(temp_thongke);

        tittleModule.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/tk.png")));
        thongKe_Module.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/output-onlinepngtools (76).png")));

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel exit_btn;
    private javax.swing.JLabel iconuser_label;
    private javax.swing.JLabel info_Module;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kho_Module;
    private javax.swing.JLabel mainGUI;
    private javax.swing.JLabel movingWindow;
    private javax.swing.JLabel nhanVien_Module;
    private javax.swing.JLabel sach_Module;
    private javax.swing.JLabel khachHang_Module;
    private javax.swing.JLabel thongKe_Module;
    private javax.swing.JLabel tittleModule;
    private javax.swing.JLabel trangChu_Module;
    private javax.swing.JLabel username_label;
    private javax.swing.JPanel Module;
    // End of variables declaration                   
}
