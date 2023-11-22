/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DoadorVO;
import servicos.DoadorServicos;
import servicos.ServicosFactory;

/**
 *
 * @author cruza
 */
public class GUIManutencaoDoador extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUICadastrarSe
     */
    public GUIManutencaoDoador() {
        initComponents();
        preecherTabela();
        //Mascara para o campo data e limitador de caracteres
        jtfNascimento.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (jtfNascimento.getText().length() == 10 || !Character.isDigit(c)) {
                    e.consume(); // Impede a digitação de caracteres não numéricos ou além do limite de 10 caracteres.
                } else if (jtfNascimento.getText().length() == 2 || jtfNascimento.getText().length() == 5) {
                    jtfNascimento.setText(jtfNascimento.getText() + "/");
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoSanguinio = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNascimento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfUF = new javax.swing.JTextField();
        jbtnPreencherCampos = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jrbtnAMais = new javax.swing.JRadioButton();
        jrbtnBMais = new javax.swing.JRadioButton();
        jrbtnABMais = new javax.swing.JRadioButton();
        jrbtnOMais = new javax.swing.JRadioButton();
        jrbtnAMenos = new javax.swing.JRadioButton();
        jrbtnBMenos = new javax.swing.JRadioButton();
        jrbtnABMenos = new javax.swing.JRadioButton();
        jrbtnOMenos = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jbtnAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTInfosDoador = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jtfPesquisaDoador = new javax.swing.JTextField();
        jbtnPreencherTabela = new javax.swing.JButton();
        jbtnDeletarDados = new javax.swing.JButton();
        jcbSelecionarPesquisar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jbrnLimparTabela = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Manutenção Doador");
        setMinimumSize(new java.awt.Dimension(900, 36));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setText("Nome Completo");

        jtfNome.setEnabled(false);

        jLabel2.setText("Data de Nascimento");

        jtfNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfNascimento.setText("30/01/1980");
        jtfNascimento.setToolTipText("Exemplo: 01/01/1980");
        jtfNascimento.setEnabled(false);
        jtfNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfNascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfNascimentoFocusLost(evt);
            }
        });

        jLabel3.setText("Tipo Sanguínio");

        jLabel7.setText("Bairro");

        jtfBairro.setEnabled(false);

        jLabel8.setText("Cidade");

        jtfCidade.setEnabled(false);

        jLabel9.setText("UF");

        jtfUF.setEnabled(false);

        jbtnPreencherCampos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnPreencherCampos.setText("Preencher Campos");
        jbtnPreencherCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPreencherCamposActionPerformed(evt);
            }
        });

        jLabel10.setText("E-mail");

        jtfEmail.setEnabled(false);

        bgTipoSanguinio.add(jrbtnAMais);
        jrbtnAMais.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbtnAMais.setText("A+");
        jrbtnAMais.setActionCommand("A+");
        jrbtnAMais.setEnabled(false);
        jrbtnAMais.setFocusable(false);

        bgTipoSanguinio.add(jrbtnBMais);
        jrbtnBMais.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbtnBMais.setText("B+");
        jrbtnBMais.setActionCommand("B+");
        jrbtnBMais.setEnabled(false);
        jrbtnBMais.setFocusable(false);

        bgTipoSanguinio.add(jrbtnABMais);
        jrbtnABMais.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbtnABMais.setText("AB+");
        jrbtnABMais.setActionCommand("AB+");
        jrbtnABMais.setEnabled(false);
        jrbtnABMais.setFocusable(false);

        bgTipoSanguinio.add(jrbtnOMais);
        jrbtnOMais.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbtnOMais.setText("O+");
        jrbtnOMais.setActionCommand("O+");
        jrbtnOMais.setEnabled(false);
        jrbtnOMais.setFocusable(false);

        bgTipoSanguinio.add(jrbtnAMenos);
        jrbtnAMenos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbtnAMenos.setText("A-");
        jrbtnAMenos.setActionCommand("A-");
        jrbtnAMenos.setEnabled(false);
        jrbtnAMenos.setFocusable(false);

        bgTipoSanguinio.add(jrbtnBMenos);
        jrbtnBMenos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbtnBMenos.setText("B-");
        jrbtnBMenos.setActionCommand("B-");
        jrbtnBMenos.setEnabled(false);
        jrbtnBMenos.setFocusable(false);

        bgTipoSanguinio.add(jrbtnABMenos);
        jrbtnABMenos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbtnABMenos.setText("AB-");
        jrbtnABMenos.setActionCommand("AB-");
        jrbtnABMenos.setEnabled(false);
        jrbtnABMenos.setFocusable(false);

        bgTipoSanguinio.add(jrbtnOMenos);
        jrbtnOMenos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jrbtnOMenos.setText("O-");
        jrbtnOMenos.setActionCommand("O-");
        jrbtnOMenos.setEnabled(false);
        jrbtnOMenos.setFocusable(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jbtnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnAtualizar.setText("Atualizar");
        jbtnAtualizar.setEnabled(false);
        jbtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtualizarActionPerformed(evt);
            }
        });

        jTInfosDoador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTInfosDoador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome Doador", "Data de Nascimento", "Tipo Sanguíneo", "E-mail", "Bairro", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTInfosDoador.setAlignmentX(0.0F);
        jTInfosDoador.setAlignmentY(0.0F);
        jTInfosDoador.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTInfosDoador.setName(""); // NOI18N
        jTInfosDoador.setRowHeight(30);
        jTInfosDoador.setRowMargin(1);
        jTInfosDoador.setShowGrid(true);
        jTInfosDoador.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTInfosDoador);
        if (jTInfosDoador.getColumnModel().getColumnCount() > 0) {
            jTInfosDoador.getColumnModel().getColumn(0).setMinWidth(20);
            jTInfosDoador.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTInfosDoador.getColumnModel().getColumn(1).setMinWidth(110);
            jTInfosDoador.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTInfosDoador.getColumnModel().getColumn(3).setMinWidth(30);
            jTInfosDoador.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTInfosDoador.getColumnModel().getColumn(4).setMinWidth(110);
            jTInfosDoador.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTInfosDoador.getColumnModel().getColumn(7).setPreferredWidth(10);
        }

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Pesquisar Doador");

        jtfPesquisaDoador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisaDoadorKeyReleased(evt);
            }
        });

        jbtnPreencherTabela.setText("Preencher Tabela");
        jbtnPreencherTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPreencherTabelaActionPerformed(evt);
            }
        });

        jbtnDeletarDados.setText("Excluir dados da linha selecionada");
        jbtnDeletarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarDadosActionPerformed(evt);
            }
        });

        jcbSelecionarPesquisar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Data de Nascimento", "Tipo Sanguíneo", "E-mail", "Bairro", "Cidade", "Estado" }));

        jLabel4.setText("Código");

        jtfCodigo.setEditable(false);
        jtfCodigo.setEnabled(false);

        jbrnLimparTabela.setText("Limpar Tabela");
        jbrnLimparTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrnLimparTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPesquisaDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbSelecionarPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnPreencherCampos)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jtfCidade))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jtfBairro))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jtfEmail))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jtfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jtfUF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jbtnAtualizar))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jrbtnAMais)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jrbtnAMenos)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jrbtnBMais)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jrbtnBMenos)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jrbtnABMais)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jrbtnABMenos)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jrbtnOMais)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jrbtnOMenos))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnPreencherTabela)
                                .addGap(18, 18, 18)
                                .addComponent(jbrnLimparTabela)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnDeletarDados)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPesquisaDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jcbSelecionarPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPreencherTabela)
                    .addComponent(jbtnDeletarDados)
                    .addComponent(jbrnLimparTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnPreencherCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jtfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jrbtnABMenos)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbtnOMais)
                        .addComponent(jrbtnOMenos))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jrbtnAMais)
                            .addComponent(jrbtnAMenos))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrbtnABMais, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbtnBMais)
                            .addComponent(jrbtnBMenos))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtfUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preecherTabela() {
        try {
            DoadorServicos ds = ServicosFactory.getDoadorServicos();

            DefaultTableModel dtm = (DefaultTableModel) jTInfosDoador.getModel();
            dtm.setRowCount(0);

            ArrayList<DoadorVO> infoDoador = new ArrayList<>();

            infoDoador = ds.buscarInfoDoador();

            for (int i = 0; i < infoDoador.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(infoDoador.get(i).getIdDoador()),
                    String.valueOf(infoDoador.get(i).getNomeDoador()),
                    String.valueOf(infoDoador.get(i).getDataNascDoadorFormatada()),
                    String.valueOf(infoDoador.get(i).getTipoSanguinioDoador()),
                    String.valueOf(infoDoador.get(i).getEmailDoador()),
                    String.valueOf(infoDoador.get(i).getEndBairroDoador()),
                    String.valueOf(infoDoador.get(i).getEndCidadeDoador()),
                    String.valueOf(infoDoador.get(i).getEndUFDoador())
                });
            }
            //Adicionando o modelo de tabela com os dados na Tabela jtMostrarProdutos
            jTInfosDoador.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro! GUIManutencaoDoador.preencherTabela " + e.getMessage());
        }
    }

    private void pesquisarDoador() {
        try {
            if (jtfPesquisaDoador.getText().isEmpty()) {
                preecherTabela();
            } else {
                DoadorServicos hs = ServicosFactory.getDoadorServicos();
                DefaultTableModel dtm = (DefaultTableModel) jTInfosDoador.getModel();
                dtm.setRowCount(0);

                String selecao = (String) jcbSelecionarPesquisar.getSelectedItem();
                String sqlQuery = null;

                if (selecao.equals("Nome")) {
                    sqlQuery = " where nomeDoador like '%" + jtfPesquisaDoador.getText() + "%'";
                } else if (selecao.equals("Data de Nascimento")) {
                    sqlQuery = " where dataNascimentoDoador like '%" + jtfPesquisaDoador.getText() + "%'";
                } else if (selecao.equals("Tipo Sanguíneo")) {
                    sqlQuery = " where tipoSanguinioDoador like '%" + jtfPesquisaDoador.getText() + "%'";
                } else if (selecao.equals("E-mail")) {
                    sqlQuery = " where emailDoador like '%" + jtfPesquisaDoador.getText() + "%'";
                } else if (selecao.equals("Bairro")) {
                    sqlQuery = " where enderecoBairroDoador like '%" + jtfPesquisaDoador.getText() + "%'";
                } else if (selecao.equals("Cidade")) {
                    sqlQuery = " where enderecoCidadeDoador like '%" + jtfPesquisaDoador.getText() + "%'";
                } else if (selecao.equals("Estado")) {
                    sqlQuery = " where enderecoUFdoador like '%" + jtfPesquisaDoador.getText() + "%'";
                }

                ArrayList<DoadorVO> doadorPesquisado = new ArrayList<>();

                doadorPesquisado = hs.pesquisarDador(sqlQuery);

                for (int i = 0; i < doadorPesquisado.size(); i++) {
                    dtm.addRow(new String[]{
                        String.valueOf(doadorPesquisado.get(i).getIdDoador()),
                        String.valueOf(doadorPesquisado.get(i).getNomeDoador()),
                        String.valueOf(doadorPesquisado.get(i).getDataNascDoador()),
                        String.valueOf(doadorPesquisado.get(i).getTipoSanguinioDoador()),
                        String.valueOf(doadorPesquisado.get(i).getEmailDoador()),
                        String.valueOf(doadorPesquisado.get(i).getEndBairroDoador()),
                        String.valueOf(doadorPesquisado.get(i).getEndCidadeDoador()),
                        String.valueOf(doadorPesquisado.get(i).getEndUFDoador()),});
                }

                //Adicionando o modelo de tabela com os dados na Tabela jtMostrarProdutos
                jTInfosDoador.setModel(dtm);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao Pesquisar Doador! GUIManutencaoDoador.pesquisarDoador " + e.getMessage());
        }
    }

    private void excluirDoador() {
        try {
            int linha = jTInfosDoador.getSelectedRow();

            if (linha == - 1) {
                JOptionPane.showMessageDialog(this, "Por Favor selecione uma linha! ");

            } else {
                DoadorServicos ds = ServicosFactory.getDoadorServicos();
                String codDoador = (String) jTInfosDoador.getValueAt(linha, 0);
                ds.excluirDoador(Integer.parseInt(codDoador));

                JOptionPane.showMessageDialog(this, "Doador excluído com sucesso!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir Doador! GUIManutencaoDoador.excluirDoador " + e.getMessage());
        }
    }

    private void preencherCampos() {
        int linha = jTInfosDoador.getSelectedRow();
        if (linha != - 1) {
            jtfCodigo.setText((String) jTInfosDoador.getValueAt(linha, 0));
            jtfNome.setText((String) jTInfosDoador.getValueAt(linha, 1));
            jtfNascimento.setText((String) jTInfosDoador.getValueAt(linha, 2));

            if (jTInfosDoador.getValueAt(linha, 3).equals("A+")) {
                jrbtnAMais.setSelected(true);
            } else if (jTInfosDoador.getValueAt(linha, 3).equals("A-")) {
                jrbtnAMenos.setSelected(true);
            } else if (jTInfosDoador.getValueAt(linha, 3).equals("B+")) {
                jrbtnBMais.setSelected(true);
            } else if (jTInfosDoador.getValueAt(linha, 3).equals("B-")) {
                jrbtnBMenos.setSelected(true);
            } else if (jTInfosDoador.getValueAt(linha, 3).equals("AB+")) {
                jrbtnABMais.setSelected(true);
            } else if (jTInfosDoador.getValueAt(linha, 3).equals("AB-")) {
                jrbtnABMenos.setSelected(true);
            } else if (jTInfosDoador.getValueAt(linha, 3).equals("O+")) {
                jrbtnOMais.setSelected(true);
            } else if (jTInfosDoador.getValueAt(linha, 3).equals("O-")) {
                jrbtnOMenos.setSelected(true);
            }

            jtfEmail.setText((String) jTInfosDoador.getValueAt(linha, 4));
            jtfBairro.setText((String) jTInfosDoador.getValueAt(linha, 5));
            jtfCidade.setText((String) jTInfosDoador.getValueAt(linha, 6));
            jtfUF.setText((String) jTInfosDoador.getValueAt(linha, 7));

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um valor na tabela!");
        }

        ArrayList<JComponent> habilitarCampos = new ArrayList<>(Arrays.asList(
                jtfNome, jtfNascimento,
                jrbtnAMais, jrbtnAMenos,
                jrbtnBMais, jrbtnBMenos,
                jrbtnABMais, jrbtnABMenos,
                jrbtnOMais, jrbtnOMenos,
                jtfEmail, jtfBairro, jtfCidade, jtfUF, jbtnAtualizar
        ));

        for (int i = 0; i < habilitarCampos.size(); i++) {
            habilitarCampos.get(i).setEnabled(true);
        }
    }

    public void atualizarDoador() {
        try {
            DoadorVO adVO = new DoadorVO();
            if (jtfNome.getText().isEmpty()
                    || jtfNascimento.getText().isEmpty()
                    || bgTipoSanguinio.getSelection().getActionCommand().isEmpty()
                    || jtfEmail.getText().isEmpty()
                    || jtfBairro.getText().isEmpty()
                    || jtfCidade.getText().isEmpty()
                    || jtfUF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Não deixe campos vazios!",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            } else {
                adVO.setIdDoador(Integer.parseInt(jtfCodigo.getText()));
                adVO.setNomeDoador(jtfNome.getText());
                adVO.setDataNascDoadorMySQL(jtfNascimento.getText());
                adVO.setTipoSanguinioDoador(bgTipoSanguinio.getSelection().getActionCommand());
                adVO.setEmailDoador(jtfEmail.getText());
                adVO.setEndBairroDoador(jtfBairro.getText());
                adVO.setEndCidadeDoador(jtfCidade.getText());
                adVO.setEndUFDoador(jtfUF.getText());

                DoadorServicos ds = ServicosFactory.getDoadorServicos();
                ds.atualizarDoador(adVO);

                JOptionPane.showMessageDialog(null, "Doador atualizado com sucesso! ");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar o Doador! GUIManutencaoDoador.atualizarDoador " + e.getMessage());
        }
    }
    
    private void limparTabela() {
        /**
         * Para limpar a tabela temos apenas que setar o numero de linhas
         * para ZERO no nosso default table model
         */
        DefaultTableModel dtm = (DefaultTableModel) jTInfosDoador.getModel();
        dtm.setRowCount(0);   
    }

    private void limparCampos() {
        jtfNome.setText("");
        jtfNascimento.setText("");
        bgTipoSanguinio.clearSelection();
        jtfEmail.setText("");
        jtfBairro.setText("");
        jtfCidade.setText("");
        jtfUF.setText("");

    }


    private void jbtnPreencherCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPreencherCamposActionPerformed
        // TODO add your handling code here:
        preencherCampos();

    }//GEN-LAST:event_jbtnPreencherCamposActionPerformed

    private void jtfNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNascimentoFocusGained
        // TODO add your handling code here:
        jtfNascimento.setText("");
    }//GEN-LAST:event_jtfNascimentoFocusGained

    private void jtfNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNascimentoFocusLost
        // TODO add your handling code here:
        if ("".equals(jtfNascimento.getText())) {
            jtfNascimento.setText("30/01/1980");
        }
    }//GEN-LAST:event_jtfNascimentoFocusLost

    private void jbtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtualizarActionPerformed
        // TODO add your handling code here:
        atualizarDoador();
        limparCampos();
        preecherTabela();
    }//GEN-LAST:event_jbtnAtualizarActionPerformed

    private void jtfPesquisaDoadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaDoadorKeyReleased
        // TODO add your handling code here:
        pesquisarDoador();
    }//GEN-LAST:event_jtfPesquisaDoadorKeyReleased

    private void jbtnPreencherTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPreencherTabelaActionPerformed
        // TODO add your handling code here:
        preecherTabela();
    }//GEN-LAST:event_jbtnPreencherTabelaActionPerformed

    private void jbtnDeletarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarDadosActionPerformed
        // TODO add your handling code here:
        excluirDoador();
        preecherTabela();
    }//GEN-LAST:event_jbtnDeletarDadosActionPerformed

    private void jbrnLimparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrnLimparTabelaActionPerformed
        // TODO add your handling code here:
        limparTabela();
    }//GEN-LAST:event_jbrnLimparTabelaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoSanguinio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTInfosDoador;
    private javax.swing.JButton jbrnLimparTabela;
    private javax.swing.JButton jbtnAtualizar;
    private javax.swing.JButton jbtnDeletarDados;
    private javax.swing.JButton jbtnPreencherCampos;
    private javax.swing.JButton jbtnPreencherTabela;
    private javax.swing.JComboBox<String> jcbSelecionarPesquisar;
    private javax.swing.JRadioButton jrbtnABMais;
    private javax.swing.JRadioButton jrbtnABMenos;
    private javax.swing.JRadioButton jrbtnAMais;
    private javax.swing.JRadioButton jrbtnAMenos;
    private javax.swing.JRadioButton jrbtnBMais;
    private javax.swing.JRadioButton jrbtnBMenos;
    private javax.swing.JRadioButton jrbtnOMais;
    private javax.swing.JRadioButton jrbtnOMenos;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNascimento;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisaDoador;
    private javax.swing.JTextField jtfUF;
    // End of variables declaration//GEN-END:variables
}
