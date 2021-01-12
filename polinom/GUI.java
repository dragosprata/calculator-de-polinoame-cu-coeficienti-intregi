/**
 * @author Prata Dragos, grupa 30225 ; email: pratadragos96@yahoo.com
 * Tema 1 - Tehnici de Programare
 * 
 */
package polinom;

import polinom.Operatii;

public class GUI extends javax.swing.JFrame {
    Operatii o = new Operatii();
    
     
     
    public GUI() {
        initComponents();
        paneR.setContentType("text/html");
        paneS.setContentType("text/html");
        paneQ.setContentType("text/html");
        paneP.setContentType("text/html");  
    }

  
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paneQ = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        paneP = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        paneS = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        paneR = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        mesaje = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        coefP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gradP = new javax.swing.JTextField();
        coefQ = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        gradQ = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        calculeaza = new javax.swing.JButton();
        okP = new javax.swing.JButton();
        okQ = new javax.swing.JButton();
        irp = new javax.swing.JButton();
        cQ = new javax.swing.JButton();
        cP = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        rst = new javax.swing.JButton();
        cr = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operatii cu Polinoame - Prata Dragos, grupa 30225");
        setAlwaysOnTop(true);
        setName("Operatii Polinoame - Student: Prata Dragos, grupa 30225");
        setResizable(false);

        jLabel1.setText("Introduceti polinomul P");

        paneQ.setEditable(false);
        jScrollPane1.setViewportView(paneQ);

        jLabel2.setText("Introduceti polinomul Q");

        paneP.setEditable(false);
        jScrollPane2.setViewportView(paneP);

        jLabel3.setText("Polinomul rezultat R");

        paneS.setEditable(false);
        jScrollPane3.setViewportView(paneS);

        jLabel4.setText("Polinomul rezultat S");

        paneR.setEditable(false);
        jScrollPane4.setViewportView(paneR);

        mesaje.setEditable(false);
        mesaje.setColumns(20);
        mesaje.setRows(5);
        jScrollPane5.setViewportView(mesaje);

        jLabel5.setText("Mesaje");

        coefP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); 
        jLabel6.setText("X");

        gradP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        coefQ.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); 
        jLabel7.setText("X");

        gradQ.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        combo.setForeground(new java.awt.Color(255, 255, 100));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adunare", "Scadere", "Inmultire","Derivare" }));

        calculeaza.setBackground(new java.awt.Color(0, 200, 100));
        calculeaza.setFont(new java.awt.Font("Serif", 0, 24));
        calculeaza.setText("Calculeaza");
        calculeaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculeazaActionPerformed(evt);
            }
        });

        okP.setText("OK");
        okP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okPActionPerformed(evt);
            }
        });

        okQ.setText("OK");
        okQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okQActionPerformed(evt);
            }
        });

        irp.setText("P <-> R");
        irp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irpActionPerformed(evt);
            }
        });

        cQ.setText("C");
        cQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cQActionPerformed(evt);
            }
        });

        cP.setText("C");
        cP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPActionPerformed(evt);
            }
        });

        rst.setText("Reset");
        rst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstActionPerformed(evt);
            }
        });

        cr.setText("CR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(irp))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(coefP, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                        .addComponent(coefQ, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                        .addComponent(cr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(gradP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(gradQ, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cQ, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(okQ))
                                        .addComponent(cP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(okP)))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(calculeaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(okP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(coefP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(cP)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(cr))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gradP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(okQ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(coefQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(cQ)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gradQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(irp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rst))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calculeaza, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    private void calculeazaActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            switch (combo.getSelectedItem().toString()) {
                case "Adunare":
                    o.adunare();
                    paneR.setText(o.getR());
                    paneS.setText("");
                    break;
                case "Scadere":
                    o.scadere();
                    paneR.setText(o.getR());
                    paneS.setText("");
                    break;
                case "Inmultire":
                    o.inmultire();
                    paneR.setText(o.getR());
                    paneS.setText("");
                    break;
                case "Derivare":
                    o.derivare();
                    paneR.setText(o.getR());
                    paneS.setText("");
                    break;
                default:
                    mesaje.append("EROARE!");
                    paneS.setText("");
                    paneR.setText("");
                    break;
            }
        } catch (Exception e){
            mesaje.append(e.getMessage()+"\n");
            paneR.setText("");
            paneS.setText("");
        }
    }

    private void okPActionPerformed(java.awt.event.ActionEvent evt) {
        double d;
        int i;
        try{
            if (cr.isSelected())
                d = Double.parseDouble(coefP.getText());
            else
                d = Math.floor(Double.parseDouble(coefP.getText()));
            i = Integer.parseInt(gradP.getText());
            coefP.setText("");
            gradP.setText("");
            if (i < 0){
                i = 2/0;
            }
        } catch (Exception e){
            mesaje.append("Coeficientul trebuie sa fie un numar real iar gradul un intreg pozitiv!\n");
            return;
        }
        o.adaugaP(d,i);
        paneP.setText(o.getP());
    }

    private void okQActionPerformed(java.awt.event.ActionEvent evt) {
        double d;
        int i;
        try{
            if (cr.isSelected())
                d = Double.parseDouble(coefQ.getText());
            else
                d = Math.floor(Double.parseDouble(coefQ.getText()));
            i = Integer.parseInt(gradQ.getText());
            coefQ.setText("");
            gradQ.setText("");
            if (i < 0){
                i = 2/0;
            }
        } catch (Exception e){
            mesaje.append("Coeficientul trebuie sa fie un numar real iar gradul un intreg pozitiv!\n");
            return;
        }
        o.adaugaQ(d,i);
        paneQ.setText(o.getQ());
    }

    private void irpActionPerformed(java.awt.event.ActionEvent evt) {
        o.irp();
        paneP.setText(o.getP());
        paneR.setText("");
    }

    private void cQActionPerformed(java.awt.event.ActionEvent evt) {
        o.resetareP2();
        paneQ.setText("");
    }

    private void cPActionPerformed(java.awt.event.ActionEvent evt) {
        o.resetareP1();
        paneP.setText("");
    }

    private void rstActionPerformed(java.awt.event.ActionEvent evt) {
    	o = new Operatii();
        mesaje.setText("");
        coefQ.setText("");
        coefP.setText("");
        gradQ.setText("");
        gradP.setText("");
        paneR.setText("");
        paneQ.setText("");
        paneP.setText("");
        paneS.setText("");
        combo.setSelectedIndex(0);
        cr.setSelected(false);
    }
    public static void main(String args[]) {
       
         // For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    private javax.swing.JButton cP;
    private javax.swing.JButton cQ;
    private javax.swing.JButton calculeaza;
    private javax.swing.JTextField coefP;
    private javax.swing.JTextField coefQ;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JToggleButton cr;
    private javax.swing.JTextField gradP;
    private javax.swing.JTextField gradQ;
    private javax.swing.JButton irp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea mesaje;
    private javax.swing.JButton okP;
    private javax.swing.JButton okQ;
    private javax.swing.JTextPane paneP;
    private javax.swing.JTextPane paneQ;
    private javax.swing.JTextPane paneR;
    private javax.swing.JTextPane paneS;
    private javax.swing.JButton rst;
}