package com.Ejemplo.Ventanas;

import java.util.Locale;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JLabel;

public class NewJFrame extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");

    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonC = new javax.swing.JButton();
        jButtonMasMenos = new javax.swing.JButton();
        jButtonPorcentual = new javax.swing.JButton();
        jButtonDivisor = new javax.swing.JButton();
        jButtonSiete = new javax.swing.JButton();
        jButtonOcho = new javax.swing.JButton();
        jButtonNueve = new javax.swing.JButton();
        jButtonCuatro = new javax.swing.JButton();
        jButtonCinco = new javax.swing.JButton();
        jButtonSeis = new javax.swing.JButton();
        jButtonMultipolicacion = new javax.swing.JButton();
        jButtonUno = new javax.swing.JButton();
        jButtonDos = new javax.swing.JButton();
        jButtonMenos = new javax.swing.JButton();
        jButtonTres = new javax.swing.JButton();
        jButtonCero = new javax.swing.JButton();
        jButtonPunto = new javax.swing.JButton();
        jButtonCE = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonMas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("jfCalculadora"); // NOI18N
        setPreferredSize(new java.awt.Dimension(300, 530));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));

        txtOperacion.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtResultado.setFont(new java.awt.Font("Arial Black", 1, 40)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 160));

        jPanel2.setBackground(new java.awt.Color(239, 252, 249));

        jButtonC.setBackground(new java.awt.Color(0, 0, 0));
        jButtonC.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonC.setForeground(new java.awt.Color(55, 62, 71));
        jButtonC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonC.setText("C");
        jButtonC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonC.setInheritsPopupMenu(true);
        jButtonC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonMasMenos.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMasMenos.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonMasMenos.setForeground(new java.awt.Color(55, 62, 71));
        jButtonMasMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonMasMenos.setText("±");
        jButtonMasMenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMasMenos.setInheritsPopupMenu(true);
        jButtonMasMenos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonMasMenos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonMasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasMenosActionPerformed(evt);
            }
        });

        jButtonPorcentual.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPorcentual.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonPorcentual.setForeground(new java.awt.Color(55, 62, 71));
        jButtonPorcentual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonPorcentual.setText("%");
        jButtonPorcentual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPorcentual.setInheritsPopupMenu(true);
        jButtonPorcentual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonPorcentual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonPorcentual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorcentualActionPerformed(evt);
            }
        });

        jButtonDivisor.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDivisor.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonDivisor.setForeground(new java.awt.Color(55, 62, 71));
        jButtonDivisor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonDivisor.setText("÷");
        jButtonDivisor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDivisor.setInheritsPopupMenu(true);
        jButtonDivisor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonDivisor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonDivisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisorActionPerformed(evt);
            }
        });

        jButtonSiete.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSiete.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonSiete.setForeground(new java.awt.Color(55, 62, 71));
        jButtonSiete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonSiete.setText("7");
        jButtonSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSiete.setInheritsPopupMenu(true);
        jButtonSiete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonSiete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSieteActionPerformed(evt);
            }
        });

        jButtonOcho.setBackground(new java.awt.Color(0, 0, 0));
        jButtonOcho.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonOcho.setForeground(new java.awt.Color(55, 62, 71));
        jButtonOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonOcho.setText("8");
        jButtonOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonOcho.setInheritsPopupMenu(true);
        jButtonOcho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonOcho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOchoActionPerformed(evt);
            }
        });

        jButtonNueve.setBackground(new java.awt.Color(0, 0, 0));
        jButtonNueve.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonNueve.setForeground(new java.awt.Color(55, 62, 71));
        jButtonNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonNueve.setText("9");
        jButtonNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNueve.setInheritsPopupMenu(true);
        jButtonNueve.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonNueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNueveActionPerformed(evt);
            }
        });

        jButtonCuatro.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCuatro.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonCuatro.setForeground(new java.awt.Color(55, 62, 71));
        jButtonCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonCuatro.setText("4");
        jButtonCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCuatro.setInheritsPopupMenu(true);
        jButtonCuatro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonCuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuatroActionPerformed(evt);
            }
        });

        jButtonCinco.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCinco.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonCinco.setForeground(new java.awt.Color(55, 62, 71));
        jButtonCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonCinco.setText("5");
        jButtonCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCinco.setInheritsPopupMenu(true);
        jButtonCinco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonCinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCincoActionPerformed(evt);
            }
        });

        jButtonSeis.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSeis.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonSeis.setForeground(new java.awt.Color(55, 62, 71));
        jButtonSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonSeis.setText("6");
        jButtonSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSeis.setInheritsPopupMenu(true);
        jButtonSeis.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonSeis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeisActionPerformed(evt);
            }
        });

        jButtonMultipolicacion.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMultipolicacion.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonMultipolicacion.setForeground(new java.awt.Color(55, 62, 71));
        jButtonMultipolicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonMultipolicacion.setText("*");
        jButtonMultipolicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMultipolicacion.setInheritsPopupMenu(true);
        jButtonMultipolicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonMultipolicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonMultipolicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultipolicacionActionPerformed(evt);
            }
        });

        jButtonUno.setBackground(new java.awt.Color(0, 0, 0));
        jButtonUno.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonUno.setForeground(new java.awt.Color(55, 62, 71));
        jButtonUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonUno.setText("1");
        jButtonUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUno.setInheritsPopupMenu(true);
        jButtonUno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonUno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnoActionPerformed(evt);
            }
        });

        jButtonDos.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDos.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonDos.setForeground(new java.awt.Color(55, 62, 71));
        jButtonDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonDos.setText("2");
        jButtonDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDos.setInheritsPopupMenu(true);
        jButtonDos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonDos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDosActionPerformed(evt);
            }
        });

        jButtonMenos.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMenos.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonMenos.setForeground(new java.awt.Color(55, 62, 71));
        jButtonMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonMenos.setText("-");
        jButtonMenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMenos.setInheritsPopupMenu(true);
        jButtonMenos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonMenos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosActionPerformed(evt);
            }
        });

        jButtonTres.setBackground(new java.awt.Color(0, 0, 0));
        jButtonTres.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonTres.setForeground(new java.awt.Color(55, 62, 71));
        jButtonTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonTres.setText("3");
        jButtonTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTres.setInheritsPopupMenu(true);
        jButtonTres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonTres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTresActionPerformed(evt);
            }
        });

        jButtonCero.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCero.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonCero.setForeground(new java.awt.Color(55, 62, 71));
        jButtonCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonCero.setText("0");
        jButtonCero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCero.setInheritsPopupMenu(true);
        jButtonCero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonCero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCeroActionPerformed(evt);
            }
        });

        jButtonPunto.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPunto.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonPunto.setForeground(new java.awt.Color(55, 62, 71));
        jButtonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonPunto.setText(".");
        jButtonPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPunto.setInheritsPopupMenu(true);
        jButtonPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuntoActionPerformed(evt);
            }
        });

        jButtonCE.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCE.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButtonCE.setForeground(new java.awt.Color(55, 62, 71));
        jButtonCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonCE.setText("CE");
        jButtonCE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCE.setInheritsPopupMenu(true);
        jButtonCE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonCE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCEActionPerformed(evt);
            }
        });

        jButtonIgual.setBackground(new java.awt.Color(0, 0, 0));
        jButtonIgual.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonIgual.setForeground(new java.awt.Color(55, 62, 71));
        jButtonIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btniGual_Standby.png"))); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIgual.setInheritsPopupMenu(true);
        jButtonIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonMas.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMas.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButtonMas.setForeground(new java.awt.Color(55, 62, 71));
        jButtonMas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        jButtonMas.setText("+");
        jButtonMas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMas.setInheritsPopupMenu(true);
        jButtonMas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_botonPresionado.png"))); // NOI18N
        jButtonMas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_encimadeboton.png"))); // NOI18N
        jButtonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonMasMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPorcentual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonCinco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonDos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonMultipolicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMasMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPorcentual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMultipolicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 300, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("0");
    }//GEN-LAST:event_jButtonCActionPerformed
    public void addNumero(String digito) {
        txtResultado.setText(digito);

    }
    private void jButtonMasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasMenosActionPerformed
        
if (Float.parseFloat(txtResultado.getText())>0)
        txtOperacion.setText( "-"+txtOperacion.getText());
        
    }//GEN-LAST:event_jButtonMasMenosActionPerformed

    private void jButtonPorcentualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorcentualActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "%");
        
    }//GEN-LAST:event_jButtonPorcentualActionPerformed

    private void jButtonDivisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisorActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "/");
        
    }//GEN-LAST:event_jButtonDivisorActionPerformed

    private void jButtonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSieteActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "7");
        jButtonIgual.doClick();
    }//GEN-LAST:event_jButtonSieteActionPerformed

    private void jButtonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOchoActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "8");
        jButtonIgual.doClick();
    }//GEN-LAST:event_jButtonOchoActionPerformed

    private void jButtonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNueveActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "9");
        jButtonIgual.doClick();
    }//GEN-LAST:event_jButtonNueveActionPerformed

    private void jButtonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuatroActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "4");
        jButtonIgual.doClick();
    }//GEN-LAST:event_jButtonCuatroActionPerformed

    private void jButtonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCincoActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "5");
        jButtonIgual.doClick();
    }//GEN-LAST:event_jButtonCincoActionPerformed

    private void jButtonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeisActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "6");
        jButtonIgual.doClick();
    }//GEN-LAST:event_jButtonSeisActionPerformed

    private void jButtonMultipolicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultipolicacionActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "*");
        
    }//GEN-LAST:event_jButtonMultipolicacionActionPerformed

    private void jButtonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnoActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "1");
        jButtonIgual.doClick();
    }//GEN-LAST:event_jButtonUnoActionPerformed

    private void jButtonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDosActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "2");
        jButtonIgual.doClick();
    }//GEN-LAST:event_jButtonDosActionPerformed

    private void jButtonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenosActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "-");
        
    }//GEN-LAST:event_jButtonMenosActionPerformed

    private void jButtonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTresActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "3");
        jButtonIgual.doClick();
    }//GEN-LAST:event_jButtonTresActionPerformed

    private void jButtonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCeroActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "0");
        jButtonIgual.doClick();
    }//GEN-LAST:event_jButtonCeroActionPerformed

    private void jButtonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPuntoActionPerformed
        txtOperacion.setText(txtOperacion.getText() + ".");
        
    }//GEN-LAST:event_jButtonPuntoActionPerformed

    private void jButtonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCEActionPerformed
        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
    }//GEN-LAST:event_jButtonCEActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        try {
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
        } catch (Exception e) {
            jButtonC.doClick();
        }
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "+");
    }//GEN-LAST:event_jButtonMasActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonCE;
    private javax.swing.JButton jButtonCero;
    private javax.swing.JButton jButtonCinco;
    private javax.swing.JButton jButtonCuatro;
    private javax.swing.JButton jButtonDivisor;
    private javax.swing.JButton jButtonDos;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMas;
    private javax.swing.JButton jButtonMasMenos;
    private javax.swing.JButton jButtonMenos;
    private javax.swing.JButton jButtonMultipolicacion;
    private javax.swing.JButton jButtonNueve;
    private javax.swing.JButton jButtonOcho;
    private javax.swing.JButton jButtonPorcentual;
    private javax.swing.JButton jButtonPunto;
    private javax.swing.JButton jButtonSeis;
    private javax.swing.JButton jButtonSiete;
    private javax.swing.JButton jButtonTres;
    private javax.swing.JButton jButtonUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
