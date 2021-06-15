package Vista;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
        //setLocationRelativeTo(null); centra el programa
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperation = new javax.swing.JLabel();
        txtResult = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JButtonAvanzado = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonTres = new javax.swing.JButton();
        jButtonElevado = new javax.swing.JButton();
        jButtonPorcentaje = new javax.swing.JButton();
        jButtonDivido = new javax.swing.JButton();
        jButtonFactorial = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jButtonSuma = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonNueve = new javax.swing.JButton();
        jButtonDos = new javax.swing.JButton();
        jButtonPunto = new javax.swing.JButton();
        jButtonCuatro = new javax.swing.JButton();
        jButtonCinco = new javax.swing.JButton();
        jButtonSeis = new javax.swing.JButton();
        jButtonSiete = new javax.swing.JButton();
        jButtonOcho = new javax.swing.JButton();
        jButtonUno = new javax.swing.JButton();
        jButtonCero = new javax.swing.JButton();
        jButtonMultiplicacion1 = new javax.swing.JButton();
        jButtonRaiz = new javax.swing.JButton();
        jButtonParentesisIzquierdo = new javax.swing.JButton();
        jButtonParentesisDerecho = new javax.swing.JButton();
        jButtonln = new javax.swing.JButton();
        jButtonLog = new javax.swing.JButton();
        jButtonPi = new javax.swing.JButton();
        jButtone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Java");
        setBackground(new java.awt.Color(51, 51, 51));
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(100, 100));

        jPanel1.setBackground(new java.awt.Color(21, 13, 91));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperation.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 20)); // NOI18N
        txtOperation.setForeground(new java.awt.Color(211, 190, 0));
        txtOperation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 230, 40));

        txtResult.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 36)); // NOI18N
        txtResult.setForeground(new java.awt.Color(0, 205, 205));
        txtResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 300, 60));

        jPanel2.setBackground(new java.awt.Color(12, 9, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonAvanzado.setFont(new java.awt.Font("DejaVu Sans Light", 3, 14)); // NOI18N
        JButtonAvanzado.setForeground(new java.awt.Color(255, 255, 255));
        JButtonAvanzado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAvanzado.jpg"))); // NOI18N
        JButtonAvanzado.setText("AVANZADO ");
        JButtonAvanzado.setActionCommand("Avanzado");
        JButtonAvanzado.setBorder(null);
        JButtonAvanzado.setFocusPainted(false);
        JButtonAvanzado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JButtonAvanzado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAvanzadoOn.png"))); // NOI18N
        JButtonAvanzado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAvanzadoActionPerformed(evt);
            }
        });
        jPanel2.add(JButtonAvanzado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 50));

        jButtonIgual.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonIgual.setForeground(new java.awt.Color(211, 169, 0));
        jButtonIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDorado.png"))); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.setAutoscrolls(true);
        jButtonIgual.setBorderPainted(false);
        jButtonIgual.setContentAreaFilled(false);
        jButtonIgual.setDefaultCapable(false);
        jButtonIgual.setFocusPainted(false);
        jButtonIgual.setFocusable(false);
        jButtonIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIgual.setRequestFocusEnabled(false);
        jButtonIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDoradoOn.png"))); // NOI18N
        jButtonIgual.setVerifyInputWhenFocusTarget(false);
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 50, 50));

        jButtonTres.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonTres.setForeground(new java.awt.Color(0, 205, 205));
        jButtonTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonTres.setText("3");
        jButtonTres.setAutoscrolls(true);
        jButtonTres.setBorderPainted(false);
        jButtonTres.setContentAreaFilled(false);
        jButtonTres.setDefaultCapable(false);
        jButtonTres.setFocusPainted(false);
        jButtonTres.setFocusable(false);
        jButtonTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTresActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 50, 50));

        jButtonElevado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonElevado.setForeground(new java.awt.Color(255, 255, 255));
        jButtonElevado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonElevado.setText("^");
        jButtonElevado.setBorderPainted(false);
        jButtonElevado.setContentAreaFilled(false);
        jButtonElevado.setDefaultCapable(false);
        jButtonElevado.setFocusPainted(false);
        jButtonElevado.setFocusable(false);
        jButtonElevado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonElevado.setRequestFocusEnabled(false);
        jButtonElevado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGrisOn.png"))); // NOI18N
        jButtonElevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonElevadoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonElevado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        jButtonPorcentaje.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonPorcentaje.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonPorcentaje.setText("%");
        jButtonPorcentaje.setBorderPainted(false);
        jButtonPorcentaje.setContentAreaFilled(false);
        jButtonPorcentaje.setDefaultCapable(false);
        jButtonPorcentaje.setFocusPainted(false);
        jButtonPorcentaje.setFocusable(false);
        jButtonPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPorcentaje.setRequestFocusEnabled(false);
        jButtonPorcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGrisOn.png"))); // NOI18N
        jButtonPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 50, 50));

        jButtonDivido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonDivido.setForeground(new java.awt.Color(211, 169, 0));
        jButtonDivido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonDivido.setText("÷");
        jButtonDivido.setAutoscrolls(true);
        jButtonDivido.setBorderPainted(false);
        jButtonDivido.setContentAreaFilled(false);
        jButtonDivido.setDefaultCapable(false);
        jButtonDivido.setFocusPainted(false);
        jButtonDivido.setFocusable(false);
        jButtonDivido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDivido.setRequestFocusEnabled(false);
        jButtonDivido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDoradoOn.png"))); // NOI18N
        jButtonDivido.setVerifyInputWhenFocusTarget(false);
        jButtonDivido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDivido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 50, 50));

        jButtonFactorial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonFactorial.setForeground(new java.awt.Color(211, 169, 0));
        jButtonFactorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonFactorial.setText("!");
        jButtonFactorial.setAutoscrolls(true);
        jButtonFactorial.setBorderPainted(false);
        jButtonFactorial.setContentAreaFilled(false);
        jButtonFactorial.setDefaultCapable(false);
        jButtonFactorial.setFocusPainted(false);
        jButtonFactorial.setFocusable(false);
        jButtonFactorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFactorial.setRequestFocusEnabled(false);
        jButtonFactorial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDoradoOn.png"))); // NOI18N
        jButtonFactorial.setVerifyInputWhenFocusTarget(false);
        jButtonFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFactorialActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonFactorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 50, 50));

        jButtonResta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonResta.setForeground(new java.awt.Color(211, 169, 0));
        jButtonResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonResta.setText("-");
        jButtonResta.setAutoscrolls(true);
        jButtonResta.setBorderPainted(false);
        jButtonResta.setContentAreaFilled(false);
        jButtonResta.setDefaultCapable(false);
        jButtonResta.setFocusPainted(false);
        jButtonResta.setFocusable(false);
        jButtonResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonResta.setRequestFocusEnabled(false);
        jButtonResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDoradoOn.png"))); // NOI18N
        jButtonResta.setVerifyInputWhenFocusTarget(false);
        jButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 50, 50));

        jButtonSuma.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonSuma.setForeground(new java.awt.Color(211, 169, 0));
        jButtonSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonSuma.setText("+");
        jButtonSuma.setAutoscrolls(true);
        jButtonSuma.setBorderPainted(false);
        jButtonSuma.setContentAreaFilled(false);
        jButtonSuma.setDefaultCapable(false);
        jButtonSuma.setFocusPainted(false);
        jButtonSuma.setFocusable(false);
        jButtonSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSuma.setRequestFocusEnabled(false);
        jButtonSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDoradoOn.png"))); // NOI18N
        jButtonSuma.setVerifyInputWhenFocusTarget(false);
        jButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 50, 50));

        jButtonC.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonC.setForeground(new java.awt.Color(255, 255, 255));
        jButtonC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonC.setText("C");
        jButtonC.setAutoscrolls(true);
        jButtonC.setBorderPainted(false);
        jButtonC.setContentAreaFilled(false);
        jButtonC.setDefaultCapable(false);
        jButtonC.setFocusPainted(false);
        jButtonC.setFocusable(false);
        jButtonC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGrisOn.png"))); // NOI18N
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 50, 50));

        jButtonNueve.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonNueve.setForeground(new java.awt.Color(0, 205, 205));
        jButtonNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonNueve.setText("9");
        jButtonNueve.setAutoscrolls(true);
        jButtonNueve.setBorderPainted(false);
        jButtonNueve.setContentAreaFilled(false);
        jButtonNueve.setDefaultCapable(false);
        jButtonNueve.setFocusPainted(false);
        jButtonNueve.setFocusable(false);
        jButtonNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNueveActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 50, 50));

        jButtonDos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonDos.setForeground(new java.awt.Color(0, 205, 205));
        jButtonDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonDos.setText("2");
        jButtonDos.setAutoscrolls(true);
        jButtonDos.setBorderPainted(false);
        jButtonDos.setContentAreaFilled(false);
        jButtonDos.setDefaultCapable(false);
        jButtonDos.setFocusPainted(false);
        jButtonDos.setFocusable(false);
        jButtonDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDosActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 50, 50));

        jButtonPunto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonPunto.setForeground(new java.awt.Color(0, 205, 205));
        jButtonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonPunto.setText(".");
        jButtonPunto.setAutoscrolls(true);
        jButtonPunto.setBorderPainted(false);
        jButtonPunto.setContentAreaFilled(false);
        jButtonPunto.setDefaultCapable(false);
        jButtonPunto.setFocusPainted(false);
        jButtonPunto.setFocusable(false);
        jButtonPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 50, 50));

        jButtonCuatro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonCuatro.setForeground(new java.awt.Color(0, 205, 205));
        jButtonCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonCuatro.setText("4");
        jButtonCuatro.setAutoscrolls(true);
        jButtonCuatro.setBorderPainted(false);
        jButtonCuatro.setContentAreaFilled(false);
        jButtonCuatro.setDefaultCapable(false);
        jButtonCuatro.setFocusPainted(false);
        jButtonCuatro.setFocusable(false);
        jButtonCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuatroActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 50, 50));

        jButtonCinco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonCinco.setForeground(new java.awt.Color(0, 205, 205));
        jButtonCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonCinco.setText("5");
        jButtonCinco.setAutoscrolls(true);
        jButtonCinco.setBorderPainted(false);
        jButtonCinco.setContentAreaFilled(false);
        jButtonCinco.setDefaultCapable(false);
        jButtonCinco.setFocusPainted(false);
        jButtonCinco.setFocusable(false);
        jButtonCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCincoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 50, 50));

        jButtonSeis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonSeis.setForeground(new java.awt.Color(0, 205, 205));
        jButtonSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonSeis.setText("6");
        jButtonSeis.setAutoscrolls(true);
        jButtonSeis.setBorderPainted(false);
        jButtonSeis.setContentAreaFilled(false);
        jButtonSeis.setDefaultCapable(false);
        jButtonSeis.setFocusPainted(false);
        jButtonSeis.setFocusable(false);
        jButtonSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSeis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeisActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 50, 50));

        jButtonSiete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonSiete.setForeground(new java.awt.Color(0, 205, 205));
        jButtonSiete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonSiete.setText("7");
        jButtonSiete.setAutoscrolls(true);
        jButtonSiete.setBorderPainted(false);
        jButtonSiete.setContentAreaFilled(false);
        jButtonSiete.setDefaultCapable(false);
        jButtonSiete.setFocusPainted(false);
        jButtonSiete.setFocusable(false);
        jButtonSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSiete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSieteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 50, 50));

        jButtonOcho.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonOcho.setForeground(new java.awt.Color(0, 205, 205));
        jButtonOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonOcho.setText("8");
        jButtonOcho.setAutoscrolls(true);
        jButtonOcho.setBorderPainted(false);
        jButtonOcho.setContentAreaFilled(false);
        jButtonOcho.setDefaultCapable(false);
        jButtonOcho.setFocusPainted(false);
        jButtonOcho.setFocusable(false);
        jButtonOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonOcho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOchoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 50, 50));

        jButtonUno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonUno.setForeground(new java.awt.Color(0, 205, 205));
        jButtonUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonUno.setText("1");
        jButtonUno.setAutoscrolls(true);
        jButtonUno.setBorderPainted(false);
        jButtonUno.setContentAreaFilled(false);
        jButtonUno.setDefaultCapable(false);
        jButtonUno.setFocusPainted(false);
        jButtonUno.setFocusable(false);
        jButtonUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 50, 50));

        jButtonCero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonCero.setForeground(new java.awt.Color(0, 205, 205));
        jButtonCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonCero.setText("0");
        jButtonCero.setAutoscrolls(true);
        jButtonCero.setBorderPainted(false);
        jButtonCero.setContentAreaFilled(false);
        jButtonCero.setDefaultCapable(false);
        jButtonCero.setFocusPainted(false);
        jButtonCero.setFocusable(false);
        jButtonCero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCeroActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 50, 50));

        jButtonMultiplicacion1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonMultiplicacion1.setForeground(new java.awt.Color(211, 169, 0));
        jButtonMultiplicacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonMultiplicacion1.setText("x");
        jButtonMultiplicacion1.setAutoscrolls(true);
        jButtonMultiplicacion1.setBorderPainted(false);
        jButtonMultiplicacion1.setContentAreaFilled(false);
        jButtonMultiplicacion1.setDefaultCapable(false);
        jButtonMultiplicacion1.setFocusPainted(false);
        jButtonMultiplicacion1.setFocusable(false);
        jButtonMultiplicacion1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMultiplicacion1.setRequestFocusEnabled(false);
        jButtonMultiplicacion1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDoradoOn.png"))); // NOI18N
        jButtonMultiplicacion1.setVerifyInputWhenFocusTarget(false);
        jButtonMultiplicacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacion1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonMultiplicacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 50, 50));

        jButtonRaiz.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonRaiz.setForeground(new java.awt.Color(211, 169, 0));
        jButtonRaiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonRaiz.setText(" √");
        jButtonRaiz.setAutoscrolls(true);
        jButtonRaiz.setBorderPainted(false);
        jButtonRaiz.setContentAreaFilled(false);
        jButtonRaiz.setDefaultCapable(false);
        jButtonRaiz.setFocusPainted(false);
        jButtonRaiz.setFocusable(false);
        jButtonRaiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRaiz.setRequestFocusEnabled(false);
        jButtonRaiz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDoradoOn.png"))); // NOI18N
        jButtonRaiz.setVerifyInputWhenFocusTarget(false);
        jButtonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRaizActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 50, 50));

        jButtonParentesisIzquierdo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonParentesisIzquierdo.setForeground(new java.awt.Color(211, 169, 0));
        jButtonParentesisIzquierdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonParentesisIzquierdo.setText("(");
        jButtonParentesisIzquierdo.setAutoscrolls(true);
        jButtonParentesisIzquierdo.setBorderPainted(false);
        jButtonParentesisIzquierdo.setContentAreaFilled(false);
        jButtonParentesisIzquierdo.setDefaultCapable(false);
        jButtonParentesisIzquierdo.setFocusPainted(false);
        jButtonParentesisIzquierdo.setFocusable(false);
        jButtonParentesisIzquierdo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonParentesisIzquierdo.setRequestFocusEnabled(false);
        jButtonParentesisIzquierdo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDoradoOn.png"))); // NOI18N
        jButtonParentesisIzquierdo.setVerifyInputWhenFocusTarget(false);
        jButtonParentesisIzquierdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParentesisIzquierdoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonParentesisIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 50, 50));

        jButtonParentesisDerecho.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonParentesisDerecho.setForeground(new java.awt.Color(211, 169, 0));
        jButtonParentesisDerecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonParentesisDerecho.setText(")");
        jButtonParentesisDerecho.setAutoscrolls(true);
        jButtonParentesisDerecho.setBorderPainted(false);
        jButtonParentesisDerecho.setContentAreaFilled(false);
        jButtonParentesisDerecho.setDefaultCapable(false);
        jButtonParentesisDerecho.setFocusPainted(false);
        jButtonParentesisDerecho.setFocusable(false);
        jButtonParentesisDerecho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonParentesisDerecho.setRequestFocusEnabled(false);
        jButtonParentesisDerecho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDoradoOn.png"))); // NOI18N
        jButtonParentesisDerecho.setVerifyInputWhenFocusTarget(false);
        jButtonParentesisDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParentesisDerechoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonParentesisDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 50, 50));

        jButtonln.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonln.setForeground(new java.awt.Color(211, 169, 0));
        jButtonln.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonln.setText("ln");
        jButtonln.setAutoscrolls(true);
        jButtonln.setBorderPainted(false);
        jButtonln.setContentAreaFilled(false);
        jButtonln.setDefaultCapable(false);
        jButtonln.setFocusPainted(false);
        jButtonln.setFocusable(false);
        jButtonln.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonln.setRequestFocusEnabled(false);
        jButtonln.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDoradoOn.png"))); // NOI18N
        jButtonln.setVerifyInputWhenFocusTarget(false);
        jButtonln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlnActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonln, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 50, 50));

        jButtonLog.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButtonLog.setForeground(new java.awt.Color(211, 169, 0));
        jButtonLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonLog.setText("Log");
        jButtonLog.setAutoscrolls(true);
        jButtonLog.setBorderPainted(false);
        jButtonLog.setContentAreaFilled(false);
        jButtonLog.setDefaultCapable(false);
        jButtonLog.setFocusPainted(false);
        jButtonLog.setFocusable(false);
        jButtonLog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLog.setRequestFocusEnabled(false);
        jButtonLog.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDoradoOn.png"))); // NOI18N
        jButtonLog.setVerifyInputWhenFocusTarget(false);
        jButtonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 50, 50));

        jButtonPi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonPi.setForeground(new java.awt.Color(211, 169, 0));
        jButtonPi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonPi.setText("π");
        jButtonPi.setAutoscrolls(true);
        jButtonPi.setBorderPainted(false);
        jButtonPi.setContentAreaFilled(false);
        jButtonPi.setDefaultCapable(false);
        jButtonPi.setFocusPainted(false);
        jButtonPi.setFocusable(false);
        jButtonPi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPi.setRequestFocusEnabled(false);
        jButtonPi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDoradoOn.png"))); // NOI18N
        jButtonPi.setVerifyInputWhenFocusTarget(false);
        jButtonPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPiActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 50, 50));

        jButtone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtone.setForeground(new java.awt.Color(211, 169, 0));
        jButtone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtone.setText("e");
        jButtone.setAutoscrolls(true);
        jButtone.setBorderPainted(false);
        jButtone.setContentAreaFilled(false);
        jButtone.setDefaultCapable(false);
        jButtone.setFocusPainted(false);
        jButtone.setFocusable(false);
        jButtone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtone.setRequestFocusEnabled(false);
        jButtone.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDoradoOn.png"))); // NOI18N
        jButtone.setVerifyInputWhenFocusTarget(false);
        jButtone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneActionPerformed(evt);
            }
        });
        jPanel2.add(jButtone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(360, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonAvanzadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAvanzadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonAvanzadoActionPerformed

    private void jButtonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPuntoActionPerformed
        // TODO add your handling code here:
        addNumber(".");
    }//GEN-LAST:event_jButtonPuntoActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPiActionPerformed
        // TODO add your handling code here:
        addNumber("π");
    }//GEN-LAST:event_jButtonPiActionPerformed

    private void jButtonlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlnActionPerformed
        // TODO add your handling code here:
        addNumber("ln");
    }//GEN-LAST:event_jButtonlnActionPerformed

    private void jButtoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneActionPerformed
        // TODO add your handling code here:a
        addNumber("e");
    }//GEN-LAST:event_jButtoneActionPerformed

    private void jButtonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogActionPerformed
        // TODO add your handling code here:a
        addNumber("log");
    }//GEN-LAST:event_jButtonLogActionPerformed

    private void jButtonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCeroActionPerformed
        // TODO add your handling code here:
        addNumber("0");
    }//GEN-LAST:event_jButtonCeroActionPerformed

    private void jButtonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnoActionPerformed
        // TODO add your handling code here:
        addNumber("1");
    }//GEN-LAST:event_jButtonUnoActionPerformed

    private void jButtonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDosActionPerformed
        // TODO add your handling code here:}
        addNumber("2");
    }//GEN-LAST:event_jButtonDosActionPerformed

    private void jButtonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTresActionPerformed
        // TODO add your handling code here:
        addNumber("3");
    }//GEN-LAST:event_jButtonTresActionPerformed

    private void jButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumaActionPerformed
        // TODO add your handling code here:
        addNumber("+");
    }//GEN-LAST:event_jButtonSumaActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        // TODO add your handling code here:
        addNumber("-");
    }//GEN-LAST:event_jButtonRestaActionPerformed

    private void jButtonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeisActionPerformed
        // TODO add your handling code here:
        addNumber("6");
    }//GEN-LAST:event_jButtonSeisActionPerformed

    private void jButtonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCincoActionPerformed
        // TODO add your handling code here:
        addNumber("5");
    }//GEN-LAST:event_jButtonCincoActionPerformed

    private void jButtonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuatroActionPerformed
        // TODO add your handling code here:
        addNumber("4");
    }//GEN-LAST:event_jButtonCuatroActionPerformed

    private void jButtonParentesisDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParentesisDerechoActionPerformed
        // TODO add your handling code here:
        addNumber(")");
    }//GEN-LAST:event_jButtonParentesisDerechoActionPerformed

    private void jButtonParentesisIzquierdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParentesisIzquierdoActionPerformed
        // TODO add your handling code here:
        addNumber("(");
    }//GEN-LAST:event_jButtonParentesisIzquierdoActionPerformed

    private void jButtonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRaizActionPerformed
        // TODO add your handling code here:
        addNumber("√");
    }//GEN-LAST:event_jButtonRaizActionPerformed

    private void jButtonFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFactorialActionPerformed
        // TODO add your handling code here:a
        addNumber("!");
    }//GEN-LAST:event_jButtonFactorialActionPerformed

    private void jButtonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSieteActionPerformed
        // TODO add your handling code here:
        addNumber("7");
    }//GEN-LAST:event_jButtonSieteActionPerformed

    private void jButtonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOchoActionPerformed
        // TODO add your handling code here:
        addNumber("8");
    }//GEN-LAST:event_jButtonOchoActionPerformed

    private void jButtonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNueveActionPerformed
        // TODO add your handling code here:
        addNumber("9");
    }//GEN-LAST:event_jButtonNueveActionPerformed

    private void jButtonMultiplicacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacion1ActionPerformed
        // TODO add your handling code here:
        addNumber("x");
    }//GEN-LAST:event_jButtonMultiplicacion1ActionPerformed

    private void jButtonDividoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividoActionPerformed
        // TODO add your handling code here:
        addNumber("÷");
    }//GEN-LAST:event_jButtonDividoActionPerformed

    private void jButtonPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorcentajeActionPerformed
        // TODO add your handling code here:
        addNumber("%");
    }//GEN-LAST:event_jButtonPorcentajeActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        // TODO add your handling code here:
        txtOperation.setText("");
        txtResult.setText("");
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonElevadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonElevadoActionPerformed
        // TODO add your handling code here:
        addNumber("^");
    }//GEN-LAST:event_jButtonElevadoActionPerformed

  
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
    
    public void addNumber(String digito){
        txtOperation.setText(txtOperation.getText() + digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAvanzado;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonCero;
    private javax.swing.JButton jButtonCinco;
    private javax.swing.JButton jButtonCuatro;
    private javax.swing.JButton jButtonDivido;
    private javax.swing.JButton jButtonDos;
    private javax.swing.JButton jButtonElevado;
    private javax.swing.JButton jButtonFactorial;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonLog;
    private javax.swing.JButton jButtonMultiplicacion1;
    private javax.swing.JButton jButtonNueve;
    private javax.swing.JButton jButtonOcho;
    private javax.swing.JButton jButtonParentesisDerecho;
    private javax.swing.JButton jButtonParentesisIzquierdo;
    private javax.swing.JButton jButtonPi;
    private javax.swing.JButton jButtonPorcentaje;
    private javax.swing.JButton jButtonPunto;
    private javax.swing.JButton jButtonRaiz;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonSeis;
    private javax.swing.JButton jButtonSiete;
    private javax.swing.JButton jButtonSuma;
    private javax.swing.JButton jButtonTres;
    private javax.swing.JButton jButtonUno;
    private javax.swing.JButton jButtone;
    private javax.swing.JButton jButtonln;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperation;
    private javax.swing.JLabel txtResult;
    // End of variables declaration//GEN-END:variables
}
