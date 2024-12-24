// This file contains the functionalities of the calculator

package javacalculator;
import java.awt.Color;

public class CalcFrame extends javax.swing.JFrame {
    
    // Initializing global variabels
    double num1 = 0, num2 = 0, value = 0;
    int equalcount = 0;
    char operator;
    
    public CalcFrame() {
        initComponents();
        
        // Centers the frame
        setLocationRelativeTo(null); 
        mode2.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        exitbar = new javax.swing.JPanel();
        previous = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        clear = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        negative = new javax.swing.JLabel();
        field = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        percent = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        divide = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        n8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        multiply = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        minus = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        plus = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        n0 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        equal = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        n7 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        n9 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        n4 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        n5 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        n6 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        n1 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        n2 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        n3 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        dot = new javax.swing.JLabel();
        mode1 = new javax.swing.JLabel();
        mode2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background.setLayout(null);

        exitbar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                exitbarMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout exitbarLayout = new javax.swing.GroupLayout(exitbar);
        exitbar.setLayout(exitbarLayout);
        exitbarLayout.setHorizontalGroup(
            exitbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        exitbarLayout.setVerticalGroup(
            exitbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        background.add(exitbar);
        exitbar.setBounds(140, 670, 150, 6);

        previous.setEditable(false);
        previous.setBackground(new java.awt.Color(51, 51, 51));
        previous.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        previous.setForeground(new java.awt.Color(255, 255, 255));
        previous.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        previous.setBorder(null);
        previous.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        previous.setFocusable(false);
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });
        background.add(previous);
        previous.setBounds(40, 60, 350, 60);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        clear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        clear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clear.setText("AC");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel3);
        jPanel3.setBounds(40, 230, 75, 60);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        negative.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        negative.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        negative.setText("+/-");
        negative.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                negativeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(negative, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(negative, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel4);
        jPanel4.setBounds(130, 230, 75, 60);

        field.setEditable(false);
        field.setBackground(new java.awt.Color(51, 51, 51));
        field.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        field.setForeground(new java.awt.Color(255, 255, 255));
        field.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        field.setText("0");
        field.setBorder(null);
        field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        field.setFocusable(false);
        field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldActionPerformed(evt);
            }
        });
        background.add(field);
        field.setBounds(40, 130, 350, 60);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        percent.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        percent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percent.setText("%");
        percent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                percentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(percent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(percent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel5);
        jPanel5.setBounds(220, 230, 75, 60);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        divide.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        divide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        divide.setText("÷");
        divide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divideMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(divide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(divide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel6);
        jPanel6.setBounds(310, 230, 75, 60);

        n8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        n8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n8.setText("8");
        n8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel7);
        jPanel7.setBounds(130, 310, 75, 60);

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));

        multiply.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        multiply.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        multiply.setText("×");
        multiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(multiply, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(multiply, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel10);
        jPanel10.setBounds(310, 310, 75, 60);

        jPanel14.setBackground(new java.awt.Color(153, 153, 153));

        minus.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        minus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus.setText("-");
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(minus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(minus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel14);
        jPanel14.setBounds(310, 390, 75, 60);

        jPanel18.setBackground(new java.awt.Color(153, 153, 153));

        plus.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        plus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus.setText("+");
        plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(plus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(plus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel18);
        jPanel18.setBounds(310, 470, 75, 60);

        n0.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        n0.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        n0.setText("  0");
        n0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n0MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n0, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n0, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel19);
        jPanel19.setBounds(40, 550, 165, 60);

        jPanel21.setBackground(new java.awt.Color(153, 153, 153));

        equal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        equal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equal.setText("=");
        equal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(equal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(equal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel21);
        jPanel21.setBounds(310, 550, 75, 60);

        n7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        n7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n7.setText("7");
        n7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel22);
        jPanel22.setBounds(40, 310, 75, 60);

        n9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        n9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n9.setText("9");
        n9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel23);
        jPanel23.setBounds(220, 310, 75, 60);

        n4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        n4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n4.setText("4");
        n4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n4, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel24);
        jPanel24.setBounds(40, 390, 75, 60);

        n5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        n5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n5.setText("5");
        n5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel25);
        jPanel25.setBounds(130, 390, 75, 60);

        n6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        n6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n6.setText("6");
        n6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel26);
        jPanel26.setBounds(220, 390, 75, 60);

        n1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        n1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n1.setText("1");
        n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel27);
        jPanel27.setBounds(40, 470, 75, 60);

        n2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        n2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n2.setText("2");
        n2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel28);
        jPanel28.setBounds(130, 470, 75, 60);

        n3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        n3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n3.setText("3");
        n3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(n3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel29);
        jPanel29.setBounds(220, 470, 75, 60);

        dot.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        dot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dot.setText(".");
        dot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dotMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        background.add(jPanel30);
        jPanel30.setBounds(220, 550, 75, 60);

        mode1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mode1.setForeground(new java.awt.Color(255, 255, 255));
        mode1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mode1.setText("◌");
        mode1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mode1MouseClicked(evt);
            }
        });
        background.add(mode1);
        mode1.setBounds(380, 0, 50, 40);

        mode2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mode2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mode2.setText("◌");
        mode2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mode2MouseClicked(evt);
            }
        });
        background.add(mode2);
        mode2.setBounds(380, 0, 50, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbarMouseDragged
        System.exit(0);
    }//GEN-LAST:event_exitbarMouseDragged

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_previousActionPerformed

    private void fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldActionPerformed

    private void n0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n0MouseClicked
        // Executes when 0 is clicked
        if(field.getText().equals("0")){
            field.setText("0");
            previous.setText("");
        }
        else{
            field.setText(field.getText().concat("0"));
        }
    }//GEN-LAST:event_n0MouseClicked

    private void dotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotMouseClicked
        // Executes when dot is clicked
        if(equalcount == 1){
            field.setText(".");
            previous.setText("");
            equalcount = 0;
        }
        else{
            field.setText(field.getText().concat("."));
        }
    }//GEN-LAST:event_dotMouseClicked

    private void n1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MouseClicked
        // Executes when 1 is clicked 
        if(field.getText().equals("0") || equalcount == 1){
            field.setText("1");
            previous.setText("");
            equalcount = 0;
        }
        else{
            field.setText(field.getText().concat("1"));
        }
    }//GEN-LAST:event_n1MouseClicked

    private void n2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n2MouseClicked
        // Executes when 2 is clicked
        if(field.getText().equals("0") || equalcount == 1){
            field.setText("2");
            previous.setText("");
            equalcount = 0;
        }
        else{
            field.setText(field.getText().concat("2"));
        } 
    }//GEN-LAST:event_n2MouseClicked

    private void n3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n3MouseClicked
        // Executes when 3 is clicked
        if(field.getText().equals("0") || equalcount == 1){
            field.setText("3");
            previous.setText("");
            equalcount = 0;
        }
        else{
            field.setText(field.getText().concat("3"));
        }
    }//GEN-LAST:event_n3MouseClicked

    private void n4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n4MouseClicked
        // Executes when 4 is clicked
        if(field.getText().equals("0") || equalcount == 1){
            field.setText("4");
            previous.setText("");
            equalcount = 0;
        }
        else{
            field.setText(field.getText().concat("4"));
        }
    }//GEN-LAST:event_n4MouseClicked

    private void n5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n5MouseClicked
        // Executes when 5 is clicked
        if(field.getText().equals("0") || equalcount == 1){
            field.setText("5");
            previous.setText("");
            equalcount = 0;
        }
        else{
            field.setText(field.getText().concat("5"));
        }
    }//GEN-LAST:event_n5MouseClicked

    private void n6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n6MouseClicked
        // Executes when 6 is clicked
        if(field.getText().equals("0") || equalcount == 1){
            field.setText("6");
            previous.setText("");
            equalcount = 0;
        }
        else{
            field.setText(field.getText().concat("6"));
        }
    }//GEN-LAST:event_n6MouseClicked

    private void n7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n7MouseClicked
       // Executes when 7 is clicked
        if(field.getText().equals("0") || equalcount == 1){
            field.setText("7");
            previous.setText("");
            equalcount = 0;
        }
        else{
            field.setText(field.getText().concat("7"));
        }
    }//GEN-LAST:event_n7MouseClicked

    private void n8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n8MouseClicked
        // Executes when 8 is clicked
        if(field.getText().equals("0") || equalcount == 1){
            field.setText("8");
            previous.setText("");
            equalcount = 0;
        }
        else{
            field.setText(field.getText().concat("8"));
        }
    }//GEN-LAST:event_n8MouseClicked

    private void n9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n9MouseClicked
        // Executes when 9 is clicked
        if(field.getText().equals("0") || equalcount == 1){
            field.setText("9");
            previous.setText("");
            equalcount = 0;
        }
        else{
            field.setText(field.getText().concat("9"));
        }
    }//GEN-LAST:event_n9MouseClicked

    private void plusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMouseClicked
        // Executes when plus is clicked
        num1 = Double.parseDouble(field.getText());
        field.setText("0");
        operator = '+';
    }//GEN-LAST:event_plusMouseClicked

    private void minusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseClicked
        // Executes when minus is clicked
        num1 = Double.parseDouble(field.getText());
        field.setText("0");
        operator = '-';
    }//GEN-LAST:event_minusMouseClicked

    private void multiplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyMouseClicked
        // Executes when multiply is clicked
        num1 = Double.parseDouble(field.getText());
        field.setText("0");
        operator = '*';
    }//GEN-LAST:event_multiplyMouseClicked

    private void divideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideMouseClicked
        // Executes when divide is clicked
        num1 = Double.parseDouble(field.getText());
        field.setText("0");
        operator = '/';
    }//GEN-LAST:event_divideMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // Executes when clear button is clicked
        field.setText("0");
        previous.setText("");
    }//GEN-LAST:event_clearMouseClicked

    private void equalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalMouseClicked
        // Executes when equal sign is clicked
        if(equalcount == 1){
            equalcount = 0;
        }
        num2 = Double.parseDouble(field.getText());
        
        // Performs the calculation and displaying result
        switch(operator){
            case '+': value = num1 + num2; 
                if(value == 0.0){
                    field.setText("0");
                }
                else{
                    if(value % 1 == 0){
                        field.setText(String.valueOf(String.format("%.0f",value))); previous.setText(String.valueOf(num1 +" + "+ num2 + " = "));
                    }
                    else{
                        field.setText(String.valueOf(String.format("%.1f",value))); previous.setText(String.valueOf(num1 +" + "+ num2 + " = "));
                    }               
                }
                break;
            case '-': value = num1 - num2; 
                if(value == 0.0){
                    field.setText("0");
                }
                else{
                    if(value % 1 == 0){
                        field.setText(String.valueOf(String.format("%.0f",value))); previous.setText(String.valueOf(num1 +" - "+ num2 + " = "));
                    }
                    else{
                        field.setText(String.valueOf(String.format("%.1f",value))); previous.setText(String.valueOf(num1 +" - "+ num2 + " = "));
                    }  
                }
                break;
            case '*': value = num1 * num2; 
                if(value == 0.0){
                    field.setText(String.valueOf(String.format("%.0f",value))); previous.setText(String.valueOf(num1 +" × "+ num2 + " = "));
                }
                else{
                    if(value % 1 == 0){
                        field.setText(String.valueOf(String.format("%.0f",value))); previous.setText(String.valueOf(num1 +" × "+ num2 + " = "));
                    }
                    else{
                        field.setText(String.valueOf(String.format("%.1f",value))); previous.setText(String.valueOf(num1 +" × "+ num2 + " = "));
                    }   
                }
                break;
            case '/': value = num1 / num2; 
                if(value == 0.0 || num2 == 0){
                    field.setText(String.valueOf(String.format("Error"))); previous.setText(String.valueOf(num1 +" ÷ "+ num2 + " = "));
                }
                else{
                    if(value % 1 == 0){
                        field.setText(String.valueOf(String.format("%.0f",value))); previous.setText(String.valueOf(num1 +" ÷ "+ num2 + " = "));
                    }
                    else{
                        field.setText(String.valueOf(String.format("%.1f",value))); previous.setText(String.valueOf(num1 +" ÷ "+ num2 + " = "));
                    } 
                }
                break;
        }
        equalcount += 1;
        num1 = value;
        operator = 'x';
    }//GEN-LAST:event_equalMouseClicked

    private void percentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_percentMouseClicked
        // Executes when percent sign is clicked
        if(field.getText().equals("0")){
            field.setText("0");
        } 
        else{
            double percentage = Double.parseDouble(field.getText());
            percentage/=100;  
            field.setText(String.valueOf(percentage));   
        }
    }//GEN-LAST:event_percentMouseClicked

    private void negativeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_negativeMouseClicked
        // Executes when negative sign is clicked
        if(field.getText().equals("0")){
            field.setText("0");
        } 
        else{
            double negative = Double.parseDouble(field.getText());
            negative*=-1;  
            if(negative % 1 == 0)
                field.setText(String.valueOf((int)negative)); 
            else{
                field.setText(String.valueOf(negative)); 
            }
        }
    }//GEN-LAST:event_negativeMouseClicked

    private void mode1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mode1MouseClicked
        // Light Mode
        background.setBackground(new java.awt.Color(235,235,235));
        field.setBackground(new java.awt.Color(235,235,235));
        field.setForeground(Color.black);
        previous.setBackground(new java.awt.Color(235,235,235));
        previous.setForeground(Color.black);
        exitbar.setBackground(Color.black);
        mode2.setVisible(true);
        mode1.setVisible(false);
    }//GEN-LAST:event_mode1MouseClicked

    private void mode2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mode2MouseClicked
        // Dark Mode
        background.setBackground(new java.awt.Color(51,51,51));
        field.setBackground(new java.awt.Color(51,51,51));
        field.setForeground(Color.white);
        previous.setBackground(new java.awt.Color(51,51,51));
        previous.setForeground(Color.white);
        exitbar.setBackground(Color.white);
        mode2.setVisible(false);
        mode1.setVisible(true);
    }//GEN-LAST:event_mode2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel divide;
    private javax.swing.JLabel dot;
    private javax.swing.JLabel equal;
    private javax.swing.JPanel exitbar;
    private javax.swing.JTextField field;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel minus;
    private javax.swing.JLabel mode1;
    private javax.swing.JLabel mode2;
    private javax.swing.JLabel multiply;
    private javax.swing.JLabel n0;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel n6;
    private javax.swing.JLabel n7;
    private javax.swing.JLabel n8;
    private javax.swing.JLabel n9;
    private javax.swing.JLabel negative;
    private javax.swing.JLabel percent;
    private javax.swing.JLabel plus;
    private javax.swing.JTextField previous;
    // End of variables declaration//GEN-END:variables
}
