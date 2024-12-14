package librarymanagementsystem.GUI;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.net.URL;
public class WelcomeGUI extends javax.swing.JFrame{
    /**
     * Creates new form WelcomeGUI
     * @param name
     */
    
    public WelcomeGUI(String name) {
        /** Bug **/
        //if (name.substring(0, 2).equals("QL")){
        //    name = new QLNhanVienBUS().getNhanVien(name).getHoTen();
        //}
        initComponents(name);
        setSize(640, 434);
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(String name) {
        System.out.println("Welcome");
        jPanel1 = new javax.swing.JPanel();
        Welcome_icon = new javax.swing.JLabel();
        welcome_content_1 = new javax.swing.JLabel();
        welcome_content_2 = new javax.swing.JLabel(name, SwingConstants.CENTER);
        line_label = new javax.swing.JLabel();
        exit_btn = new javax.swing.JLabel();
        Welcome_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        URL iconUrl = getClass().getResource("../images/congratulation.png");
        if (iconUrl != null) {
            Welcome_icon.setIcon(new javax.swing.ImageIcon(iconUrl)); // Set the icon only if the resource exists
        } else {
            System.out.println("Image not found: ../images/congratulation.png"); // Optional: log a message if the image is not found
        }

        Welcome_icon.setBounds(237, 60, 160, 134);
        jPanel1.add(Welcome_icon);

        welcome_content_1.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        welcome_content_1.setText("Chào Mừng ");
        welcome_content_1.setBounds(230, 208, 187, 44);
        jPanel1.add(welcome_content_1);

        welcome_content_2.setFont(new java.awt.Font("Calibri", 3, 32)); // NOI18N
        welcome_content_2.setBounds(160, 260, 300, 40);
        //welcome_content_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(welcome_content_2);

        URL lineImageUrl = getClass().getResource("../images/line_320_1.png");
        if (lineImageUrl != null) {
            line_label.setIcon(new javax.swing.ImageIcon(lineImageUrl)); // Set the icon only if the resource exists
        } else {
            System.out.println("Image not found: ../images/line_320_1.png"); // Optional: log a message if the image is not found
        }
        line_label.setBounds(157, 316, 320, 1);
        jPanel1.add(line_label);

        URL exitImageUrl = getClass().getResource("../images/exit_2_btn_20_17.png");
        if (exitImageUrl != null) {
            exit_btn.setIcon(new javax.swing.ImageIcon(exitImageUrl)); // Set the icon only if the resource exists
        } else {
            System.out.println("Image not found: ../images/exit_2_btn_20_17.png"); // Optional: log a message if the image is not found
        }

        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btnMouseClicked(evt);
            }
        });
        exit_btn.setBounds(570, 40, 20, 17);
        jPanel1.add(exit_btn);

        URL welcomeImageUrl = getClass().getResource("../images/WelcomeGUI.png");
        if (welcomeImageUrl != null) {
            Welcome_Label.setIcon(new javax.swing.ImageIcon(welcomeImageUrl)); // Set the icon only if the resource exists
        } else {
            System.out.println("Image not found: ../images/WelcomeGUI.png"); // Log a message if the image is not found
        }

        Welcome_Label.setBounds(0, 0, 640, 434);
        jPanel1.add(Welcome_Label);
        jPanel1.setBounds(0, 0, 640, 434);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>                        

    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {                                      
        this.dispose();
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
            java.util.logging.Logger.getLogger(WelcomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new WelcomeGUI("No info").setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Welcome_Label;
    private javax.swing.JLabel Welcome_icon;
    private javax.swing.JLabel exit_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel line_label;
    private javax.swing.JLabel welcome_content_1;
    private javax.swing.JLabel welcome_content_2;
    // End of variables declaration   
}
