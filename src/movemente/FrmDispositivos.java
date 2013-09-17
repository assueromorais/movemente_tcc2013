/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package movemente;

import Cronometro.Cronometro;
import Cronometro.CronometroEvento;
import Cronometro.CronometroOuvinte;
import iGeradorComandos.iGeradorComandosOuvinte;
import java.awt.KeyboardFocusManager;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import util.JFrameExtensaoComandos;

/**
 *
 * @author ASSUERO
 */
public class FrmDispositivos extends javax.swing.JInternalFrame implements iGeradorComandosOuvinte, CronometroOuvinte {
// Variáveis que mantém o estado dos dispositivos

    private static boolean booLampadaLigada = false;
    private static boolean booCampainhaLigada = false;
    private static boolean booMotorLigado = false;
    /**
     * Objeto responsável por alterar o foco para o próximo item da tela.
     */
    KeyboardFocusManager _gerenciadorFoco = KeyboardFocusManager.getCurrentKeyboardFocusManager();
    /**
     * Cronometro utilizado para voltar os botões ao estado inicial após o tempo
     * de execução das funções.
     */
    private Cronometro crnBotao = null;

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
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmDispositivos dispositivos = new FrmDispositivos();
                dispositivos.setVisible(true);
            }
        });
    }

    /**
     * Creates new form FrmDispositivos
     */
    public FrmDispositivos() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {/* If Nimbus is not available, you can set the GUI to another look and feel.*/

        }
        initComponents();
        // Ao receber um comando irá processá-lo
        MoveMente.Comandos.AdicionarOuvinte(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        util.JFrameExtensaoComandos.ConfigurarBordaBotoes(this);
        crnBotao = new Cronometro(2000);
        crnBotao.adicionarOuvinte(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLampada = new javax.swing.JButton();
        btnCampainha = new javax.swing.JButton();
        btnFala = new javax.swing.JButton();
        btnLeito = new javax.swing.JButton();
        btnLeitoSubir = new javax.swing.JButton();
        btnLeitoDescer = new javax.swing.JButton();
        btnDespedida = new javax.swing.JButton();
        btnNao = new javax.swing.JButton();
        btnCumprimento = new javax.swing.JButton();
        btnSim = new javax.swing.JButton();
        btnDor = new javax.swing.JButton();
        mnbMenuSuperior = new javax.swing.JMenuBar();
        menAjuda = new javax.swing.JMenu();
        mniConteudoAjuda = new javax.swing.JMenuItem();
        mniSobre = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 255));
        setTitle("Controle de dispositivos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(658, 452));
        setPreferredSize(new java.awt.Dimension(658, 452));

        btnLampada.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLampada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movemente/Imagens/Lampada_desl.png"))); // NOI18N
        btnLampada.setText("Lâmpada");
        btnLampada.setMaximumSize(new java.awt.Dimension(170, 88));
        btnLampada.setMinimumSize(new java.awt.Dimension(170, 88));
        btnLampada.setPreferredSize(new java.awt.Dimension(170, 88));
        btnLampada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLampadaActionPerformed(evt);
            }
        });

        btnCampainha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCampainha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movemente/Imagens/campainha_desl.png"))); // NOI18N
        btnCampainha.setText("Campainha");
        btnCampainha.setMaximumSize(new java.awt.Dimension(170, 88));
        btnCampainha.setMinimumSize(new java.awt.Dimension(170, 88));
        btnCampainha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampainhaActionPerformed(evt);
            }
        });

        btnFala.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnFala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movemente/Imagens/fala_desl.png"))); // NOI18N
        btnFala.setText("Fala");
        btnFala.setMaximumSize(new java.awt.Dimension(170, 88));
        btnFala.setMinimumSize(new java.awt.Dimension(170, 88));
        btnFala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFalaActionPerformed(evt);
            }
        });

        btnLeito.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLeito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movemente/Imagens/leito_desl.png"))); // NOI18N
        btnLeito.setText("Leito");
        btnLeito.setMaximumSize(new java.awt.Dimension(170, 88));
        btnLeito.setMinimumSize(new java.awt.Dimension(170, 88));
        btnLeito.setNextFocusableComponent(btnFala);
        btnLeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeitoActionPerformed(evt);
            }
        });

        btnLeitoSubir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLeitoSubir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movemente/Imagens/subir_des.png"))); // NOI18N
        btnLeitoSubir.setText("Subir");
        btnLeitoSubir.setEnabled(false);
        btnLeitoSubir.setMaximumSize(new java.awt.Dimension(170, 88));
        btnLeitoSubir.setMinimumSize(new java.awt.Dimension(170, 88));
        btnLeitoSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeitoSubirActionPerformed(evt);
            }
        });

        btnLeitoDescer.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLeitoDescer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movemente/Imagens/descer_des.png"))); // NOI18N
        btnLeitoDescer.setText("Descer");
        btnLeitoDescer.setEnabled(false);
        btnLeitoDescer.setMaximumSize(new java.awt.Dimension(170, 88));
        btnLeitoDescer.setMinimumSize(new java.awt.Dimension(170, 88));
        btnLeitoDescer.setNextFocusableComponent(btnLeito);
        btnLeitoDescer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeitoDescerActionPerformed(evt);
            }
        });

        btnDespedida.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDespedida.setText("Tchau");
        btnDespedida.setEnabled(false);
        btnDespedida.setMaximumSize(new java.awt.Dimension(170, 88));
        btnDespedida.setMinimumSize(new java.awt.Dimension(170, 88));
        btnDespedida.setNextFocusableComponent(btnDor);
        btnDespedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespedidaActionPerformed(evt);
            }
        });

        btnNao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNao.setText("Não");
        btnNao.setEnabled(false);
        btnNao.setMaximumSize(new java.awt.Dimension(170, 88));
        btnNao.setMinimumSize(new java.awt.Dimension(170, 88));
        btnNao.setNextFocusableComponent(btnCumprimento);
        btnNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoActionPerformed(evt);
            }
        });

        btnCumprimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCumprimento.setText("Olá");
        btnCumprimento.setEnabled(false);
        btnCumprimento.setMaximumSize(new java.awt.Dimension(170, 88));
        btnCumprimento.setMinimumSize(new java.awt.Dimension(170, 88));
        btnCumprimento.setNextFocusableComponent(btnDespedida);
        btnCumprimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCumprimentoActionPerformed(evt);
            }
        });

        btnSim.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSim.setText("Sim");
        btnSim.setEnabled(false);
        btnSim.setMaximumSize(new java.awt.Dimension(170, 88));
        btnSim.setMinimumSize(new java.awt.Dimension(170, 88));
        btnSim.setNextFocusableComponent(btnNao);
        btnSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimActionPerformed(evt);
            }
        });

        btnDor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDor.setText("Dor");
        btnDor.setEnabled(false);
        btnDor.setMaximumSize(new java.awt.Dimension(170, 88));
        btnDor.setMinimumSize(new java.awt.Dimension(170, 88));
        btnDor.setNextFocusableComponent(btnFala);
        btnDor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLeito, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLampada, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCampainha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFala, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLeitoDescer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLeitoSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSim, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDespedida, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCumprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLampada, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCampainha, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnLeito, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnFala, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLeitoSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLeitoDescer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSim, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCumprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDespedida, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menAjuda.setText("Ajuda");
        menAjuda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mniConteudoAjuda.setText("Conteúdo da ajuda");
        mniConteudoAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConteudoAjudaActionPerformed(evt);
            }
        });
        menAjuda.add(mniConteudoAjuda);

        mniSobre.setText("Sobre");
        mniSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSobreActionPerformed(evt);
            }
        });
        menAjuda.add(mniSobre);

        mnbMenuSuperior.add(menAjuda);

        setJMenuBar(mnbMenuSuperior);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLampadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLampadaActionPerformed
        // TODO add your handling code here:
        booLampadaLigada = !booLampadaLigada;
        if (booLampadaLigada) {
            EnviarComando("L");
            System.out.println("lampada:ligar");
        } else {
            EnviarComando("D");
            System.out.println("lampada:desligar");
        }
        btnLampada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movemente/Imagens/lampada_" + ((booLampadaLigada) ? "lig" : "desl") + ".png")));
    }//GEN-LAST:event_btnLampadaActionPerformed

    private void btnCampainhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampainhaActionPerformed
        // TODO add your handling code here:
        booCampainhaLigada = !booCampainhaLigada;
        if (booCampainhaLigada) {
            EnviarComando("S");
            System.out.println("campainha:ligar");
        } else {
            EnviarComando("S");
            System.out.println("campainha:desligar");
        }
        btnCampainha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movemente/Imagens/campainha_" + ((booCampainhaLigada) ? "lig" : "desl") + ".png")));
        crnBotao.Iniciar();
    }//GEN-LAST:event_btnCampainhaActionPerformed

    private void btnLeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeitoActionPerformed
        // TODO add your handling code here:
        btnLeitoDescer.setEnabled(!btnLeitoDescer.isEnabled());
        btnLeitoSubir.setEnabled(!btnLeitoSubir.isEnabled());
        if (!btnLeitoSubir.isEnabled()) {
            btnLeito.requestFocus();
            btnLeito.setNextFocusableComponent(btnFala);
        } else {
            btnLeito.setNextFocusableComponent(btnLeitoSubir);
        }
        btnLeito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movemente/Imagens/leito_" + ((btnLeitoSubir.isEnabled()) ? "lig" : "desl") + ".png")));
    }//GEN-LAST:event_btnLeitoActionPerformed

    private void mniSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSobreActionPerformed
        // TODO add your handling code here:
        new FrmSobre().setVisible(true);
        FecharFrame();
    }//GEN-LAST:event_mniSobreActionPerformed

    private void mniConteudoAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConteudoAjudaActionPerformed
        // TODO add your handling code here:
        new FrmAjuda().setVisible(true);
        FecharFrame();
    }//GEN-LAST:event_mniConteudoAjudaActionPerformed

    private void btnLeitoDescerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeitoDescerActionPerformed
        // TODO add your handling code here:
        booMotorLigado = !booMotorLigado;
        btnLeitoDescer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movemente/Imagens/descer.png")));
        if (booMotorLigado) {
            //EnviarComando("motor:desligar");
            EnviarComando("A");
            System.out.println("motor:desligar");
        } else {
            //EnviarComando("motor:ligar");
            EnviarComando("P");
            System.out.println("motor:ligar");
        }
    }//GEN-LAST:event_btnLeitoDescerActionPerformed

    private void btnLeitoSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeitoSubirActionPerformed
        // TODO add your handling code here:
        booMotorLigado = !booMotorLigado;
        btnLeitoSubir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movemente/Imagens/subir.png")));
        if (booMotorLigado) {
            //EnviarComando("motor:desligar");
            EnviarComando("A");
            System.out.println("motor:desligar");
        } else {
            //EnviarComando("motor:ligar");
            EnviarComando("P");
            System.out.println("motor:ligar");
        }

    }//GEN-LAST:event_btnLeitoSubirActionPerformed

    private void btnFalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFalaActionPerformed
        // TODO add your handling code here:
        btnNao.setEnabled(!btnSim.isEnabled());
        btnCumprimento.setEnabled(!btnSim.isEnabled());
        btnDor.setEnabled(!btnSim.isEnabled());
        btnDespedida.setEnabled(!btnSim.isEnabled());
        btnSim.setEnabled(!btnSim.isEnabled());
        btnFala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movemente/Imagens/fala_" + ((btnSim.isEnabled()) ? "lig" : "desl") + ".png")));
    }//GEN-LAST:event_btnFalaActionPerformed

    private void btnCumprimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCumprimentoActionPerformed
        // TODO add your handling code here:
        controladorFala.ControladorFala.EmitirSom();
    }//GEN-LAST:event_btnCumprimentoActionPerformed

    private void btnSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimActionPerformed
        // TODO add your handling code here:
        controladorFala.ControladorFala.EmitirSom();
    }//GEN-LAST:event_btnSimActionPerformed

    private void btnDorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDorActionPerformed
        // TODO add your handling code here
        controladorFala.ControladorFala.EmitirSom();
    }//GEN-LAST:event_btnDorActionPerformed

    private void btnDespedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespedidaActionPerformed
        // TODO add your handling code here:
        controladorFala.ControladorFala.EmitirSom();
    }//GEN-LAST:event_btnDespedidaActionPerformed

    private void btnNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoActionPerformed
        // TODO add your handling code here:
        controladorFala.ControladorFala.EmitirSom();
    }//GEN-LAST:event_btnNaoActionPerformed

    private void FecharFrame() {
        MoveMente.Comandos.RemoverOuvinte(this);
        this.hide();
        this.dispose();
    }

    /**
     * Altera o foco dos itens da tela, normalmente botões. Muda o foco do item
     * que está atualmente com o foco para o próximo item da direita.
     *
     * @param args the command line arguments
     */
    private void MudarFoco() {
        JFrameExtensaoComandos.MudarFoco();
    }

    private void EnviarComando(String strComando) {
        MoveMente.Controlador.EnviarComando(strComando);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCampainha;
    private javax.swing.JButton btnCumprimento;
    private javax.swing.JButton btnDespedida;
    private javax.swing.JButton btnDor;
    private javax.swing.JButton btnFala;
    private javax.swing.JButton btnLampada;
    private javax.swing.JButton btnLeito;
    private javax.swing.JButton btnLeitoDescer;
    private javax.swing.JButton btnLeitoSubir;
    private javax.swing.JButton btnNao;
    private javax.swing.JButton btnSim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menAjuda;
    private javax.swing.JMenuBar mnbMenuSuperior;
    private javax.swing.JMenuItem mniConteudoAjuda;
    private javax.swing.JMenuItem mniSobre;
    // End of variables declaration//GEN-END:variables

    @Override
    public void ReceberComando(iGeradorComandos.enmTipoComando tipoComando, String mensagem) {
        switch (tipoComando) {
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
        booCampainhaLigada = !booCampainhaLigada;
        btnCampainha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movemente/Imagens/campainha_desl.png")));
        crnBotao.Parar();
    }
}
