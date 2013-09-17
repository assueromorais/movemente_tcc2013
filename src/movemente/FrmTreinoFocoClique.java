/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package movemente;

import Cronometro.Cronometro;
import Cronometro.CronometroEvento;
import Cronometro.CronometroOuvinte;
import iGeradorComandos.enmTipoComando;
import iGeradorComandos.iGeradorComandosOuvinte;
import java.awt.KeyboardFocusManager;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Date;
import javax.swing.JInternalFrame;
import util.JFrameExtensaoComandos;

/**
 *
 * @author ASSUERO
 */
public class FrmTreinoFocoClique extends javax.swing.JInternalFrame implements iGeradorComandosOuvinte, FocusListener, CronometroOuvinte {

    /**
     * Objeto responsável por alterar o foco para o próximo item da tela.
     */
    KeyboardFocusManager _gerenciadorFoco = KeyboardFocusManager.getCurrentKeyboardFocusManager();
    /**
     * Cronometro responsável por abrir novamente o treino de foco. O cronômetro
     * irá iniciar quando o último botão for exibido.
     */
    private Cronometro _crnEtapaReiniciar = null;
    /**
     * Data e hora em que o formulário irá iniciar.
     *
     */
    Date _dtInicioProsseguir;

    /**
     * Creates new form FrmTreinoFocoClique
     */
    public FrmTreinoFocoClique() {
        initComponents();
        btnFocoClique2.setEnabled(false);
        btnFocoClique3.setEnabled(false);
        btnIniciar.setVisible(false);
        lblMsgFinal.setVisible(false);
        this.lblReiniciarTreino.setVisible(false);
        MoveMente.Comandos.AdicionarOuvinte(this);
        _crnEtapaReiniciar = new Cronometro(1000);
        _crnEtapaReiniciar.adicionarOuvinte(this);
        //this.setLocationRelativeTo(null);
        btnFocoClique3.addFocusListener(this);
        btnFocoClique1.addFocusListener(this);
        util.JFrameExtensaoComandos.ConfigurarBordaBotoes(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciar = new javax.swing.JButton();
        lblMsgFinal = new javax.swing.JLabel();
        btnInicioDoFoco = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblReiniciarTreino = new javax.swing.JLabel();
        lblExplicativo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnFocoClique1 = new javax.swing.JButton();
        btnFocoClique2 = new javax.swing.JButton();
        btnFocoClique3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnIniciar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        lblMsgFinal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMsgFinal.setText("<html>Parabéns, você chegou ao final do treinamento! <br/>Agora está apto a utilizar o aplicativo. <br/><br/>Clique em \"Iniciar\" para abrir a tela de controle.</html>");

        btnInicioDoFoco.setBorder(null);
        btnInicioDoFoco.setBorderPainted(false);
        btnInicioDoFoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioDoFocoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setText("ETAPA 3 - FOCAR E CLICAR");

        lblReiniciarTreino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblReiniciarTreino.setText("Aguarde 25 segundos para esta etapa ser reiniciada.");

        lblExplicativo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblExplicativo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExplicativo.setText("<html>Para mudar o foco de um botão para outro, <br/>basta piscar o olho com força uma vez em um intervalo de 3 segundos.</html>");

        jPanel1.setMaximumSize(new java.awt.Dimension(556, 135));
        jPanel1.setMinimumSize(new java.awt.Dimension(556, 135));
        jPanel1.setPreferredSize(new java.awt.Dimension(556, 135));

        btnFocoClique1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFocoClique1.setText("Focar e clicar 1");
        btnFocoClique1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFocoClique1ActionPerformed(evt);
            }
        });

        btnFocoClique2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFocoClique2.setText("Focar e clicar 2");
        btnFocoClique2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFocoClique2ActionPerformed(evt);
            }
        });

        btnFocoClique3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFocoClique3.setText("Focar e clicar 3");
        btnFocoClique3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFocoClique3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFocoClique1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFocoClique2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(btnFocoClique3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFocoClique1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFocoClique2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFocoClique3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInicioDoFoco, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIniciar)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMsgFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblReiniciarTreino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblExplicativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnInicioDoFoco, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblExplicativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(lblMsgFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReiniciarTreino))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFocoClique1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFocoClique1ActionPerformed
        btnFocoClique2.setEnabled(true);
    }//GEN-LAST:event_btnFocoClique1ActionPerformed

    private void btnFocoClique2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFocoClique2ActionPerformed
        btnFocoClique3.setEnabled(true);
    }//GEN-LAST:event_btnFocoClique2ActionPerformed

    private void btnFocoClique3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFocoClique3ActionPerformed
        lblMsgFinal.setVisible(true);
        btnIniciar.setVisible(true);
        _crnEtapaReiniciar.Iniciar();
        _dtInicioProsseguir = new Date();
        this.lblReiniciarTreino.setVisible(true);
    }//GEN-LAST:event_btnFocoClique3ActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        MoveMente.Container.AdicionarFrame(new FrmDispositivos());
        MoveMente.Comandos.RemoverOuvinte(this);
        FecharFrame();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnInicioDoFocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioDoFocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioDoFocoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTreinoFocoClique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTreinoFocoClique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTreinoFocoClique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTreinoFocoClique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTreinoFocoClique().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFocoClique1;
    private javax.swing.JButton btnFocoClique2;
    private javax.swing.JButton btnFocoClique3;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnInicioDoFoco;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblExplicativo;
    private javax.swing.JLabel lblMsgFinal;
    private javax.swing.JLabel lblReiniciarTreino;
    // End of variables declaration//GEN-END:variables

    /**
     * Altera o foco dos itens da tela, normalmente botões. Muda o foco do item
     * que está atualmente com o foco para o próximo item da direita.
     *
     * @param args the command line arguments
     */
    private void MudarFoco() {
        JFrameExtensaoComandos.MudarFoco();
    }

    private void FecharFrame() {
        _crnEtapaReiniciar.removerOuvinte(this);
        this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        this.hide();
        this.dispose();
    }

    @Override
    public void ReceberComando(enmTipoComando Comando, String mensagem) {
        switch (Comando) {
            case MudarFoco:
                MudarFoco();
                break;
            case SelecionarItem:
                JFrameExtensaoComandos.SelecionarBotaoFocado(this);
                break;
            case DesconectouCabeca:
                break;
            case BateriaCritica:
                break;
            case PortaDesconectada:
                break;
        }
    }

    @Override
    public void IntervaloOcorreu(CronometroEvento evt) {
        double lnDif = util.Data.DiferencaEmSegundos(_dtInicioProsseguir, new Date());
        if (lnDif >= 25) {
            new FrmTreinoFocoClique().setVisible(true);
            FecharFrame();
        } else {
            lblReiniciarTreino.setText("Em " + (int) (25 - lnDif) + " segundos esta etapa será reiniciada.");
        }

    }

    @Override
    public void focusGained(FocusEvent fe) {
        if (fe.getComponent() == btnFocoClique3) {
            btnInicioDoFoco.setFocusable(false);
            btnFocoClique1.setFocusable(false);
            btnFocoClique2.setFocusable(false);
        } else {
            if (fe.getComponent() == btnFocoClique1) {
                btnInicioDoFoco.setFocusable(false);
                btnInicioDoFoco.setVisible(false);
            }
        }
    }

    @Override
    public void focusLost(FocusEvent fe) {
        if (fe.getComponent() == btnFocoClique3) {
            btnFocoClique3.setFocusable(false);
        }
    }
}
