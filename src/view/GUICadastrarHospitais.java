/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import modelo.HospitalVO;
import servicos.HospitalServicos;
import servicos.ServicosFactory;

/**
 *
 * @author cruza
 */
public class GUICadastrarHospitais extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUIEstoqueBS
     */
    public GUICadastrarHospitais() {
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

        jLabel1 = new javax.swing.JLabel();
        jtfNomeHosp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfAMais = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfAMenos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfBMais = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfBMenos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfABMais = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfABMenos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfOMais = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfOMenos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jbtnCadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Hospitais");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("Instituição Hospitalar");

        jLabel2.setText("A+");

        jtfAMais.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel3.setText("A-");

        jtfAMenos.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel4.setText("B+");

        jtfBMais.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel5.setText("B-");

        jtfBMenos.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel6.setText("AB+");

        jtfABMais.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel7.setText("AB-");

        jtfABMenos.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel8.setText("O+");

        jtfOMais.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel9.setText("O-");

        jtfOMenos.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Quantidade de Bolsas de Sangue por Tipo Sanguíneo");

        jbtnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnCadastrar.setText("Cadastrar");
        jbtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(213, 213, 213))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNomeHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(261, 261, 261)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfBMais, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfBMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfAMais, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfAMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(61, 61, 61)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfABMais, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfABMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfOMais, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfOMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jbtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNomeHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfAMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtfAMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtfBMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtfBMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfABMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jtfABMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfOMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtfOMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(jbtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarHospitais() {
        try {
            HospitalVO chVO = new HospitalVO();
            
            if (jtfNomeHosp.getText().isEmpty()
                    || jtfAMais.getText().isEmpty() || jtfAMenos.getText().isEmpty()
                    || jtfBMais.getText().isEmpty() || jtfBMenos.getText().isEmpty()
                    || jtfABMais.getText().isEmpty() || jtfABMenos.getText().isEmpty()
                    || jtfOMais.getText().isEmpty() || jtfOMenos.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null,
                        "Não deixe campos vazios!",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            } else {
                chVO.setNomeHosp(jtfNomeHosp.getText());
                chVO.setQtdSangueAMais(Integer.parseInt(jtfAMais.getText()));
                chVO.setQtdSangueAMenos(Integer.parseInt(jtfAMenos.getText()));
                chVO.setQtdSangueBMais(Integer.parseInt(jtfBMais.getText()));
                chVO.setQtdSangueBMenos(Integer.parseInt(jtfBMenos.getText()));
                chVO.setQtdSangueABMais(Integer.parseInt(jtfABMais.getText()));
                chVO.setQtdSangueABMenos(Integer.parseInt(jtfABMenos.getText()));
                chVO.setQtdSangueOMais(Integer.parseInt(jtfOMais.getText()));
                chVO.setQtdSangueOMenos(Integer.parseInt(jtfOMenos.getText()));

                HospitalServicos hs = ServicosFactory.getHospitalServicos();
                hs.cadastrarHospital(chVO);

                JOptionPane.showMessageDialog(null, "Hospital cadastrado com sucesso! ");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar! GUICadastrarHospitais.cadastrarHospital " + e.getMessage());
        }
    }

    public void limparCampos() {
        jtfNomeHosp.setText(null);
        jtfAMais.setText(null);
        jtfAMenos.setText(null);
        jtfBMais.setText(null);
        jtfBMenos.setText(null);
        jtfABMais.setText(null);
        jtfABMenos.setText(null);
        jtfOMais.setText(null);
        jtfOMenos.setText(null);
    }


    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
        // TODO add your handling code here:
        cadastrarHospitais();
        limparCampos();
    }//GEN-LAST:event_jbtnCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JTextField jtfABMais;
    private javax.swing.JTextField jtfABMenos;
    private javax.swing.JTextField jtfAMais;
    private javax.swing.JTextField jtfAMenos;
    private javax.swing.JTextField jtfBMais;
    private javax.swing.JTextField jtfBMenos;
    private javax.swing.JTextField jtfNomeHosp;
    private javax.swing.JTextField jtfOMais;
    private javax.swing.JTextField jtfOMenos;
    // End of variables declaration//GEN-END:variables
}