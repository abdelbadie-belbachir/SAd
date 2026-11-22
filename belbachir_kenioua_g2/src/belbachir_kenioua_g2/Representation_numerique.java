package belbachir_kenioua_g2;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Representation_numerique extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Representation_numerique.class.getName());

    private int cardinalite;
    private String[] elements;
    private boolean[][] matriceS;

    public Representation_numerique() {
        initComponents();
        R2.addActionListener(e -> afficherMatrice());
        afficherResume("S = { }", "Aucun");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P1 = new javax.swing.JPanel();
        R11 = new javax.swing.JComboBox<>();
        A2 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        P3 = new javax.swing.JPanel();
        L5 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        R2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB = new javax.swing.JTable();
        P2 = new javax.swing.JPanel();
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        T1 = new javax.swing.JTextField();
        L1 = new javax.swing.JLabel();
        T3 = new javax.swing.JTextField();
        L4 = new javax.swing.JLabel();
        btnOKActionPerformed = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        P1.setBackground(new java.awt.Color(153, 178, 182));

        R11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ordre totale ", "preordre totale", "semi_ordre" }));
        R11.addActionListener(this::R11ActionPerformed);

        A2.setText("Modele :");

        A1.setForeground(new java.awt.Color(0, 102, 102));
        A1.setText("choix du moddele");

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(R11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(P1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R11)
                    .addComponent(A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        P3.setBackground(new java.awt.Color(127, 161, 167));

        L5.setBackground(new java.awt.Color(255, 255, 255));
        L5.setForeground(new java.awt.Color(82, 111, 107));
        L5.setText("Representation matricielle");

        L6.setText("Relation :");

        R2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "P", "I" }));

        TB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Alger", null, null, null},
                {"Telemcen", null, null, null},
                {"Mosta", null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "S", "Alger", "Telemcen", "Mosta"
            }
        ));
        TB.setShowHorizontalLines(true);
        TB.setShowVerticalLines(true);
        jScrollPane1.setViewportView(TB);

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P3Layout.createSequentialGroup()
                        .addComponent(L6)
                        .addGap(73, 73, 73)
                        .addComponent(R2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        P2.setBackground(new java.awt.Color(120, 155, 171));

        L2.setText("Element");

        L3.setText("valeur");

        T2.addActionListener(this::T2ActionPerformed);

        T1.addActionListener(this::T1ActionPerformed);

        L1.setForeground(new java.awt.Color(20, 22, 22));
        L1.setText("Saisir une valeur de A");

        T3.addActionListener(this::T3ActionPerformed);

        L4.setText("Seuil Q");

        btnOKActionPerformed.setText("Valider");
        btnOKActionPerformed.addActionListener(this::btnOKActionPerformedActionPerformed);

        jButton2.setText("Annuler");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P2Layout.createSequentialGroup()
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(P2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P2Layout.createSequentialGroup()
                        .addContainerGap(60, Short.MAX_VALUE)
                        .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(P2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P2Layout.createSequentialGroup()
                        .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(P2Layout.createSequentialGroup()
                        .addComponent(btnOKActionPerformed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(59, 59, 59))))
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L2)
                    .addComponent(L3)
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L4)
                    .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOKActionPerformed)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
        );

        TB1.setBackground(new java.awt.Color(152, 174, 188));
        TB1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Distance", null, null, null}
            },
            new String [] {
                "Ville", "Alger", "Telemcen", "Mosta"
            }
        ));
        TB1.setShowHorizontalLines(true);
        TB1.setShowVerticalLines(true);
        jScrollPane2.setViewportView(TB1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        btnOKActionPerformed.doClick();
    }//GEN-LAST:event_T1ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        T1.requestFocusInWindow();
    }//GEN-LAST:event_T2ActionPerformed

    private void T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T3ActionPerformed
        try {
            int n = Integer.parseInt(T3.getText().trim());

            if (n < 1 || n > 20) {
                JOptionPane.showMessageDialog(this, "Saisissez une cardinalité entre 1 et 20.");
                return;
            }

            cardinalite = n;
            elements = new String[n];
            matriceS = new boolean[n][n];

            for (int i = 0; i < n; i++) {
                if (i < 26) {
                    elements[i] = String.valueOf((char) ('a' + i));
                } else {
                    elements[i] = "a" + (i - 25);
                }
            }

            actualiserAffichage();
            afficherResume("S = { }", "Aucun");
            JOptionPane.showMessageDialog(this, "A = " + Arrays.toString(elements));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Veuillez saisir un entier valide.");
        }
    }//GEN-LAST:event_T3ActionPerformed

    private void btnOKActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformedActionPerformed
        if (elements == null) {
            JOptionPane.showMessageDialog(this, "Définissez d'abord la cardinalité de A.");
            return;
        }

        int i = Arrays.asList(elements).indexOf(T2.getText().trim());
        int j = Arrays.asList(elements).indexOf(T1.getText().trim());

        if (i == -1 || j == -1) {
            JOptionPane.showMessageDialog(this, "Éléments invalides. Vérifiez les éléments de A.");
            return;
        }

        matriceS[i][j] = true;
        actualiserAffichage();

        T2.setText("");
        T1.setText("");
        T2.requestFocusInWindow();
    }//GEN-LAST:event_btnOKActionPerformedActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (elements == null) {
            JOptionPane.showMessageDialog(this, "Définissez d'abord la cardinalité de A.");
            return;
        }

        int i = Arrays.asList(elements).indexOf(T2.getText().trim());
        int j = Arrays.asList(elements).indexOf(T1.getText().trim());

        if (i == -1 || j == -1) {
            JOptionPane.showMessageDialog(this, "Veuillez saisir un couple valide.");
            return;
        }

        if (!matriceS[i][j]) {
            JOptionPane.showMessageDialog(this, "Ce couple n'existe pas dans S.");
            return;
        }

        matriceS[i][j] = false;
        actualiserAffichage();

        T2.setText("");
        T1.setText("");
        T2.requestFocusInWindow();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void R11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R11ActionPerformed
    }//GEN-LAST:event_R11ActionPerformed

    private void afficherMatrice() {
        if (elements == null || matriceS == null) {
            return;
        }

        String relation = (String) R2.getSelectedItem();

        String[] colonnes = new String[cardinalite + 1];
        colonnes[0] = relation;
        for (int j = 0; j < cardinalite; j++) {
            colonnes[j + 1] = elements[j];
        }

        Object[][] donnees = new Object[cardinalite][cardinalite + 1];
        for (int i = 0; i < cardinalite; i++) {
            donnees[i][0] = elements[i];
            for (int j = 0; j < cardinalite; j++) {
                boolean valeur = false;
                switch (relation) {
                    case "S":
                        valeur = matriceS[i][j];
                        break;
                    case "P":
                        valeur = matriceS[i][j] && !matriceS[j][i];
                        break;
                    case "I":
                        valeur = matriceS[i][j] && matriceS[j][i];
                        break;
                }
                donnees[i][j + 1] = valeur ? 1 : 0;
            }
        }

        TB.setModel(new DefaultTableModel(donnees, colonnes) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }

    private void afficherResume(String ensembliste, String modele) {
        TB1.setModel(new DefaultTableModel(new Object[][]{{ensembliste, modele}}, new String[]{"Représentation ensembliste", "Modèle détecté"}) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        TB1.getColumnModel().getColumn(0).setPreferredWidth(300);
        TB1.getColumnModel().getColumn(1).setPreferredWidth(143);
    }

    private String construireEnsembliste() {
        StringBuilder sb = new StringBuilder("S = {");
        boolean premier = true;
        for (int x = 0; x < cardinalite; x++) {
            for (int y = 0; y < cardinalite; y++) {
                if (matriceS[x][y]) {
                    if (!premier) {
                        sb.append(", ");
                    }
                    sb.append("(").append(elements[x]).append(", ").append(elements[y]).append(")");
                    premier = false;
                }
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private void actualiserAffichage() {
        R2.setSelectedItem("S");
        afficherMatrice();
        afficherResume(construireEnsembliste(), detecterModele());
    }

    private boolean estReflexive() {
        for (int i = 0; i < cardinalite; i++) {
            if (!matriceS[i][i]) {
                return false;
            }
        }
        return true;
    }

    private boolean estComplete() {
        for (int i = 0; i < cardinalite; i++) {
            for (int j = i + 1; j < cardinalite; j++) {
                if (!matriceS[i][j] && !matriceS[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean estAntisymetrique() {
        for (int i = 0; i < cardinalite; i++) {
            for (int j = i + 1; j < cardinalite; j++) {
                if (matriceS[i][j] && matriceS[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean estTransitive() {
        for (int i = 0; i < cardinalite; i++) {
            for (int j = 0; j < cardinalite; j++) {
                for (int k = 0; k < cardinalite; k++) {
                    if (matriceS[i][j] && matriceS[j][k] && !matriceS[i][k]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private String detecterModele() {
        boolean reflexive = estReflexive();
        boolean complete = estComplete();
        boolean antisymetrique = estAntisymetrique();
        boolean transitive = estTransitive();

        if (reflexive && complete && antisymetrique && transitive) {
            return "Ordre total";
        } else if (reflexive && antisymetrique && transitive) {
            return "Ordre partiel";
        } else if (reflexive && complete && transitive) {
            return "Préordre total";
        } else if (reflexive && transitive) {
            return "Préordre partiel";
        }
        return "Aucun des modèles testés";
    }

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new Representation_numerique().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel P3;
    private javax.swing.JComboBox<String> R11;
    private javax.swing.JComboBox<String> R2;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTable TB;
    private javax.swing.JTable TB1;
    private javax.swing.JButton btnOKActionPerformed;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
