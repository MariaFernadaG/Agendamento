/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author maria
 */
public class Agenda extends javax.swing.JFrame {

    private final AgendaController controller;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jComboBoxservico = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        observacao = new javax.swing.JTextArea();
        table = new javax.swing.JScrollPane();
        tableAgendamento = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(980, 520));
        setMinimumSize(new java.awt.Dimension(980, 520));
        setPreferredSize(new java.awt.Dimension(980, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setText("0");
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 200, -1));

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 200, -1));
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 200, -1));

        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 200, -1));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel3.setText("Serviço");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel4.setText("Cliente ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel5.setText("Valor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel6.setText("Data");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel7.setText("Hora");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agendar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 340, 30));

        jLabel8.setText("Observação:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 200, -1));

        jComboBoxservico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxservicoItemStateChanged(evt);
            }
        });
        jComboBoxservico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxservicoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxservico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 200, -1));

        observacao.setColumns(20);
        observacao.setRows(5);
        jScrollPane2.setViewportView(observacao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 340, 120));

        tableAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Cliente", "Serviço", "Valor $", "Data", "Hora", "Observação"
            }
        ));
        tableAgendamento.setShowGrid(true);
        table.setViewportView(tableAgendamento);

        getContentPane().add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 710, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Agenda-PainelFundo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 850, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void jComboBoxservicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxservicoItemStateChanged
        // TODO add your handling code here:
        controller.atualizaValor();
    }//GEN-LAST:event_jComboBoxservicoItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.controller.Agendar();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jComboBoxservicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxservicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxservicoActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxservico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea observacao;
    private javax.swing.JScrollPane table;
    private javax.swing.JTable tableAgendamento;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
    this.controller.atualizaTabela();
    this.controller.atualizaCliente();
    this.controller.atualizarServico();
    this.controller.atualizaValor();
    
    }

    public JTable getTableAgendamento() {
        return tableAgendamento;
    }

    public void setTableAgendamento(JTable tableAgendamento) {
        this.tableAgendamento = tableAgendamento;
    }

    public JComboBox<String> getjComboBoxcliente() {
        return jComboBoxCliente;
    }

    public void setjComboBoxcliente(JComboBox<String> jComboBoxcliente) {
        this.jComboBoxCliente = jComboBoxcliente;
    }

    public JComboBox<String> getjComboBoxservico() {
        return jComboBoxservico;
    }

    public void setjComboBoxservico(JComboBox<String> jComboBoxservico) {
        this.jComboBoxservico = jComboBoxservico;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(JTextField txtValor) {
        this.txtValor = txtValor;
    }

    public JTextField getTxtData() {
        return txtData;
    }

    public void setTxtData(JTextField txtData) {
        this.txtData = txtData;
    }

    public JTextField getTxtHora() {
        return txtHora;
    }

    public void setTxtHora(JTextField txtHora) {
        this.txtHora = txtHora;
    }

    public JTextField getId() {
        return id;
    }

    public void setId(JTextField id) {
        this.id = id;
        
        
    }

   
   

    public JTextArea getObservacao() {
        return observacao;
    }

    public void setObservacao(JTextArea observacao) {
        this.observacao = observacao;
    }

  
    
}
