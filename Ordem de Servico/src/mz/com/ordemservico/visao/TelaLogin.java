/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.com.ordemservico.visao;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import mz.com.ordemservico.conexao.ModuloConexao;

/**
 *
 * @author Soto.Jr
 */
public class TelaLogin extends javax.swing.JFrame {

    //chamando as varias de acesso ao abanco ade dados
    Connection conexao = null; // ainda esta sem conexao
    //tres freamwork da biblioteca sql
    PreparedStatement pst = null;  //varialvel responsavel por fazer pesquisa no banco de dados
    ResultSet rs = null; // variavel responsavel por trazer a o resultado da pesquisa e actualizar tabela no banco ade dados
   
    //metodo para fazer login
    
    public void logar(){
        //variavel para fazer a pesquisa do usuario e a senha corresnpondente
        String sql = "select * from tbusuarios where login=? and senha=?";
        
        try {
            // linhas abaixo servem para fazer a consulta no banco de dados e substituindo os dados dos
            //txtUsuario e txtsenha por ??????
            pst = conexao.prepareStatement(sql); //
            pst.setString(1, txtUsuario.getText());// diz que deve levat o conteudo do txtUsuario ou campo 1 a armazenado no PST
            pst.setString(2, txtSenha.getText());
            //funcao para executar a consulta ao banco de dados <select><from><L e S>
            
            rs = pst.executeQuery();
           
            
            if(rs.next()){
                 //a linha a baixo obtem o conteudo do campo perfil da tabela tbusuario
            // onde pega a variavel perfil e faz a pesquisa dele no campo 7 da tabela no banco de dados
            String perfil = rs.getString(7);
            
            System.out.println(perfil);
               
            //se existir o usuario e uma senha correspondente ao que foi digitado nos campos txtuser e senha
            
                JOptionPane.showMessageDialog(null,"Credencias Validos!"); 
                //fazendo o tratamento do campo Perfi
                if(perfil.equals("Administrador")){
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.menCad.setEnabled(true);
                    TelaPrincipal.manCadOs.setEnabled(true);
                    TelaPrincipal.manRel.setEnabled(true);
                    TelaPrincipal.manCadFunc.setEnabled(true);
                    TelaPrincipal.manRealOs.setEnabled(true);
                //chamando o nome do usuario Logado e setando no campo lblUser;
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                TelaPrincipal.lblPerfil.setText(rs.getString(7));
                TelaPrincipal.lblPerfil.setForeground(Color.BLUE);
                dispose();
                
                }else{
                    if(perfil.equals("Usuario")){
                        TelaPrincipal principal = new TelaPrincipal();
                        principal.setVisible(true);
                        TelaPrincipal.menCad.setEnabled(true);
                        
                        TelaPrincipal.manRel.setEnabled(true);
                       
                         TelaPrincipal.manRealOs.setEnabled(true);
                         TelaPrincipal.lblUsuario.setText(rs.getString(2));
                         TelaPrincipal.lblPerfil.setText(rs.getString(7));
                         TelaPrincipal.lblPerfil.setForeground(Color.RED);
                         dispose();
                    }else{
                        if(perfil.equals("Tecnico")){
                            TelaPrincipal principal = new TelaPrincipal();
                            principal.setVisible(true);
                            TelaPrincipal.menCad.setEnabled(true);
                            TelaPrincipal.manCadOs.setEnabled(true);
                            TelaPrincipal.manRel.setEnabled(true);
                             TelaPrincipal.lblUsuario.setText(rs.getString(2));
                             TelaPrincipal.lblPerfil.setText(rs.getString(7));
                             TelaPrincipal.lblPerfil.setForeground(Color.GREEN);
                            dispose();
                         }
                    }
                }
                
            }else{
                JOptionPane.showMessageDialog(null,"Usuario e ou Senha Invalido(s)!");
                //txtUsuario.setText("");
                txtSenha.setText("");
            }
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "Problema com a Sintaxe do SQL ou os campos pst.SetString!");
        
        }
    }
    
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
       
        //metodo responsavel para permitir a conexao com o banco de dados
        
        conexao = ModuloConexao.conector();
       // System.out.println(conexao);
       if (conexao != null){
       lblSms.setText("Conectado!");
       lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/com/ordemservico/icones/green_up.png")));
       }else{
           lblSms.setText("Nao conectado");
           lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mz/com/ordemservico/icones/red_down.png")));
       }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cMap1 = new com.itextpdf.text.pdf.fonts.cmaps.CMap();
        qRCode1 = new com.itextpdf.text.pdf.qrcode.QRCode();
        paragraph1 = new com.itextpdf.text.Paragraph();
        pdfContentReaderTool1 = new com.itextpdf.text.pdf.parser.PdfContentReaderTool();
        htmlTags1 = new com.itextpdf.text.html.HtmlTags();
        uJPanelImagem1 = new componentes.UJPanelImagem();
        txtUsuario = new componentes.UJTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnSair = new javax.swing.JButton();
        btnAcessar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblSms = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setResizable(false);

        uJPanelImagem1.setImagem(new java.io.File("C:\\Users\\Soto.Jr\\Documents\\NetBeansProjects\\imagens projeto learn java brazil\\imagens projeto learn java brazil\\fundotelaLogin.png"));

        txtUsuario.setToolTipText("Coloque um Usuario valido!");
        txtUsuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Senha:");

        txtSenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSenha.setToolTipText("Digite uma senha Que Corresponde ao usuario Digitado!");

        btnSair.setBackground(new java.awt.Color(255, 51, 51));
        btnSair.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setToolTipText("Clique Para sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnAcessar.setBackground(new java.awt.Color(51, 204, 0));
        btnAcessar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAcessar.setText("Acessar");
        btnAcessar.setToolTipText("Clique para Acesasar");
        btnAcessar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });

        jLabel3.setText("Desenvolvido Por Arsenio jose Soto Junior");

        lblSms.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(102, 255, 153));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Sistema Para Controlo de Ordem de Servico");

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                                .addComponent(btnSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAcessar))
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSms, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem1Layout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnAcessar))
                .addGap(38, 38, 38)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSms, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(802, 392));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
        // TODO add your handling code here:
        logar();
        
    }//GEN-LAST:event_btnAcessarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(null, "Tem A certeza que Deseja Sair do Sistema?","Atencao",JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Encerrando O Sistema!!!");
             System.exit(0);
     
        }
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnSair;
    private com.itextpdf.text.pdf.fonts.cmaps.CMap cMap1;
    private com.itextpdf.text.html.HtmlTags htmlTags1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblSms;
    private com.itextpdf.text.Paragraph paragraph1;
    private com.itextpdf.text.pdf.parser.PdfContentReaderTool pdfContentReaderTool1;
    private com.itextpdf.text.pdf.qrcode.QRCode qRCode1;
    private javax.swing.JPasswordField txtSenha;
    private componentes.UJTextField txtUsuario;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
