/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.com.ordemservico.visao;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Soto.Jr
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        manCadCli = new javax.swing.JMenuItem();
        manCadFunc = new javax.swing.JMenuItem();
        manCadOs = new javax.swing.JMenuItem();
        manRel = new javax.swing.JMenu();
        manRealCli = new javax.swing.JMenuItem();
        manRealOs = new javax.swing.JMenuItem();
        manRealFunc = new javax.swing.JMenuItem();
        manSobre = new javax.swing.JMenu();
        manSobSis = new javax.swing.JMenuItem();
        manSobAutor = new javax.swing.JMenuItem();
        manAjuda = new javax.swing.JMenu();
        manAjudaSist = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        manOpc = new javax.swing.JMenu();
        manOpcSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("DATA");

        lblData.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUsuario.setText("Usurname");

        lblPerfil.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPerfil.setText("Perfil");
        lblPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        menCad.setText("Cadastro");
        menCad.setEnabled(false);

        manCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        manCadCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/com/ordemservico/icones/user/Add.png"))); // NOI18N
        manCadCli.setText("Cliente");
        manCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manCadCliActionPerformed(evt);
            }
        });
        menCad.add(manCadCli);

        manCadFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        manCadFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/com/ordemservico/icones/user/Add.png"))); // NOI18N
        manCadFunc.setText("Funcionario");
        manCadFunc.setEnabled(false);
        menCad.add(manCadFunc);

        manCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        manCadOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/com/ordemservico/icones/user/Add.png"))); // NOI18N
        manCadOs.setText("Ordem de Servico");
        manCadOs.setEnabled(false);
        menCad.add(manCadOs);

        menuPrincipal.add(menCad);

        manRel.setText("Relatorio");
        manRel.setEnabled(false);

        manRealCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        manRealCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/com/ordemservico/icones/user/impressora2.jpg"))); // NOI18N
        manRealCli.setText("Cliente");
        manRel.add(manRealCli);

        manRealOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        manRealOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/com/ordemservico/icones/user/impressora2.jpg"))); // NOI18N
        manRealOs.setText("Os");
        manRealOs.setEnabled(false);
        manRel.add(manRealOs);

        manRealFunc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        manRealFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/com/ordemservico/icones/user/impressora2.jpg"))); // NOI18N
        manRealFunc.setText("Funcionario");
        manRel.add(manRealFunc);

        menuPrincipal.add(manRel);

        manSobre.setText("Sobre");

        manSobSis.setText("Sistema");
        manSobre.add(manSobSis);

        manSobAutor.setText("Autor");
        manSobre.add(manSobAutor);

        menuPrincipal.add(manSobre);

        manAjuda.setText("Ajuda");

        manAjudaSist.setText("Sistema");
        manAjuda.add(manAjudaSist);

        jMenuItem2.setText("jMenuItem2");
        manAjuda.add(jMenuItem2);

        menuPrincipal.add(manAjuda);

        manOpc.setText("Opcoes");

        manOpcSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        manOpcSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/com/ordemservico/icones/user/Exit.png"))); // NOI18N
        manOpcSair.setText("Sair");
        manOpcSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manOpcSairActionPerformed(evt);
            }
        });
        manOpc.add(manOpcSair);

        menuPrincipal.add(manOpc);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3477, 3477, 3477))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuario)
                                    .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(775, 775, 775)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
            .addComponent(desktop)
        );

        setSize(new java.awt.Dimension(912, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void manCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manCadCliActionPerformed
        // TODO add your handling code here:
        //Chamando a tela Cliente
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_manCadCliActionPerformed

    private void manOpcSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manOpcSairActionPerformed
        // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(null, "Tem A certeza que Deseja Sair do Sistema?","Atencao",JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Encerrando O Sistema!!!");
             System.exit(0);
     
        }
       
    }//GEN-LAST:event_manOpcSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        //puchando a data substituido a label data pela data do Sistema automaticamente ao inicializar o formulario
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblPerfil;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu manAjuda;
    private javax.swing.JMenuItem manAjudaSist;
    private javax.swing.JMenuItem manCadCli;
    public static javax.swing.JMenuItem manCadFunc;
    public static javax.swing.JMenuItem manCadOs;
    private javax.swing.JMenu manOpc;
    private javax.swing.JMenuItem manOpcSair;
    private javax.swing.JMenuItem manRealCli;
    private javax.swing.JMenuItem manRealFunc;
    public static javax.swing.JMenuItem manRealOs;
    public static javax.swing.JMenu manRel;
    private javax.swing.JMenuItem manSobAutor;
    private javax.swing.JMenuItem manSobSis;
    private javax.swing.JMenu manSobre;
    public static javax.swing.JMenu menCad;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
