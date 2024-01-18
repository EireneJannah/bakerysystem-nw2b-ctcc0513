
package bakerysystem;

import java.awt.Image;
import static java.lang.Thread.sleep;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public final class Menu extends javax.swing.JFrame {
static double price;
static String cake1 ="",cupcake ="";
private int[] num = new int[14];
private static final String[] cakeName = {"Moist Chocolate", "Vanila Bean", "Mango Graham", "Avocado Flakes", "Mocha Mocha", "Moist Berries", "Moist Strawberries"};
private static final double[] cakePrice = {550.0, 460.0, 450.0, 580.0, 580.0, 420.0, 580.0};
private static final String[] cupcakeName = {"Red Velvet Vixen", "Vanila Sunshine", "Chocolate Surprise", "Lemon Drop", "Bunny Hugger", "Mocha Motion", "Peppermint Patty"};
private static final double[] cupcakePrice = {95.0, 85.0, 90.0, 80.0, 95.0, 85.0, 85.0};
    
    public Menu() {
        initComponents();
        bttclearorder.setVisible(false); 
        bttconfirmorder.setEnabled(false);  
        setResizable(false);
        setLogo();
    }
    public void setCount(int index, int x){
        this.num[index] += x;
    }
        
    public int getCount(int index){
        return num[index];
    }
    
    public void setLogo(){
        
Image img = new ImageIcon(this.getClass().getResource("cakelogo.png")).getImage();
cakeimage.setIcon(new ImageIcon(img));
Icon i = cakeimage.getIcon();
ImageIcon icon = (ImageIcon)i;
Image image = icon.getImage().getScaledInstance(cakeimage.getWidth(), cakeimage.getHeight(), Image.SCALE_SMOOTH);
cakeimage.setIcon (new ImageIcon (image));



Image img1 = new ImageIcon(this.getClass().getResource("cupcakelogo.png")).getImage();
cupcakeimage.setIcon(new ImageIcon(img1));
Icon i1= cupcakeimage.getIcon();
ImageIcon icon1 = (ImageIcon)i1;
Image image1 = icon1.getImage().getScaledInstance(cupcakeimage.getWidth(), cupcakeimage.getHeight(), Image.SCALE_SMOOTH);
cupcakeimage.setIcon (new ImageIcon (image1));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bttvanilabean = new javax.swing.JButton();
        bttmoistchocolate = new javax.swing.JButton();
        bttavocadoflakes = new javax.swing.JButton();
        bttmangograham = new javax.swing.JButton();
        bttmochamocha = new javax.swing.JButton();
        bttmoistberries = new javax.swing.JButton();
        bttmoiststrawberries = new javax.swing.JButton();
        txtmoiststrawberries = new javax.swing.JLabel();
        txtmoistchocolate = new javax.swing.JLabel();
        txtvanilabean = new javax.swing.JLabel();
        txtmangograham = new javax.swing.JLabel();
        txtavocadoflakes = new javax.swing.JLabel();
        txtmochamocha = new javax.swing.JLabel();
        txtmoistberries = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cakeimage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        bttconfirmorder = new javax.swing.JButton();
        bttclearorder = new javax.swing.JButton();
        txtlemondrop = new javax.swing.JLabel();
        txtchocolatesurprise = new javax.swing.JLabel();
        txtpeppermintpatty = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bttvanilasunshine = new javax.swing.JButton();
        bttpeppermintpatty = new javax.swing.JButton();
        bttchocolatesurprise = new javax.swing.JButton();
        bttredvelvet = new javax.swing.JButton();
        bttbunnyhugger = new javax.swing.JButton();
        bttmochamotion = new javax.swing.JButton();
        bttlemondrop = new javax.swing.JButton();
        txtredvelvetvixen = new javax.swing.JLabel();
        txtvanilasunshine = new javax.swing.JLabel();
        txtbunnyhugger = new javax.swing.JLabel();
        txtmochamotion = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cupcakeimage = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 237, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(252, 229, 227));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttvanilabean.setBackground(new java.awt.Color(255, 204, 204));
        bttvanilabean.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttvanilabean.setForeground(new java.awt.Color(176, 25, 17));
        bttvanilabean.setText("Vanila Bean             P460.0");
        bttvanilabean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttvanilabeanActionPerformed(evt);
            }
        });
        jPanel2.add(bttvanilabean, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 280, 30));

        bttmoistchocolate.setBackground(new java.awt.Color(255, 204, 204));
        bttmoistchocolate.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttmoistchocolate.setForeground(new java.awt.Color(176, 25, 17));
        bttmoistchocolate.setText("Moist Chocolate      P550.0");
        bttmoistchocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttmoistchocolateActionPerformed(evt);
            }
        });
        jPanel2.add(bttmoistchocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, 30));

        bttavocadoflakes.setBackground(new java.awt.Color(255, 204, 204));
        bttavocadoflakes.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttavocadoflakes.setForeground(new java.awt.Color(176, 25, 17));
        bttavocadoflakes.setText("Avocado Flakes        P580.0");
        bttavocadoflakes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttavocadoflakesActionPerformed(evt);
            }
        });
        jPanel2.add(bttavocadoflakes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 280, 30));

        bttmangograham.setBackground(new java.awt.Color(255, 204, 204));
        bttmangograham.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttmangograham.setForeground(new java.awt.Color(176, 25, 17));
        bttmangograham.setText("Mango Graham        P450.0");
        bttmangograham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttmangograhamActionPerformed(evt);
            }
        });
        jPanel2.add(bttmangograham, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 280, 30));

        bttmochamocha.setBackground(new java.awt.Color(255, 204, 204));
        bttmochamocha.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttmochamocha.setForeground(new java.awt.Color(176, 25, 17));
        bttmochamocha.setText("Mocha Mocha          P580.0");
        bttmochamocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttmochamochaActionPerformed(evt);
            }
        });
        jPanel2.add(bttmochamocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 280, 30));

        bttmoistberries.setBackground(new java.awt.Color(255, 204, 204));
        bttmoistberries.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttmoistberries.setForeground(new java.awt.Color(176, 25, 17));
        bttmoistberries.setText("Moist Berries            P420.0");
        bttmoistberries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttmoistberriesActionPerformed(evt);
            }
        });
        jPanel2.add(bttmoistberries, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 280, 30));

        bttmoiststrawberries.setBackground(new java.awt.Color(255, 204, 204));
        bttmoiststrawberries.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttmoiststrawberries.setForeground(new java.awt.Color(176, 25, 17));
        bttmoiststrawberries.setText("Moist Strawberries     P580.0");
        bttmoiststrawberries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttmoiststrawberriesActionPerformed(evt);
            }
        });
        jPanel2.add(bttmoiststrawberries, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 280, 30));

        txtmoiststrawberries.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtmoiststrawberries.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtmoiststrawberries, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 50, 30));

        txtmoistchocolate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtmoistchocolate.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtmoistchocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 50, 30));

        txtvanilabean.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtvanilabean.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtvanilabean, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 50, 30));

        txtmangograham.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtmangograham.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtmangograham, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 50, 30));

        txtavocadoflakes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtavocadoflakes.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtavocadoflakes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 50, 30));

        txtmochamocha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtmochamocha.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtmochamocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 50, 30));

        txtmoistberries.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtmoistberries.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtmoistberries, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 50, 30));

        cakeimage.setBackground(new java.awt.Color(204, 204, 204));
        cakeimage.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        cakeimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cakeimage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cakeimage, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(cakeimage, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 260, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 390, 390));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(176, 25, 17));
        jLabel2.setText("Categories");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jButton7.setBackground(new java.awt.Color(255, 204, 204));
        jButton7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jButton7.setText("Back to main menu");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 200, 30));

        bttconfirmorder.setBackground(new java.awt.Color(255, 204, 204));
        bttconfirmorder.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttconfirmorder.setText("Confirm Order");
        bttconfirmorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttconfirmorderActionPerformed(evt);
            }
        });
        jPanel1.add(bttconfirmorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 200, 30));

        bttclearorder.setBackground(new java.awt.Color(255, 204, 204));
        bttclearorder.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        bttclearorder.setText("Clear Order");
        bttclearorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttclearorderActionPerformed(evt);
            }
        });
        jPanel1.add(bttclearorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 200, 30));

        txtlemondrop.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtlemondrop.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtlemondrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 30, 30));

        txtchocolatesurprise.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtchocolatesurprise.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtchocolatesurprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 30, 30));

        txtpeppermintpatty.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtpeppermintpatty.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtpeppermintpatty, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 30, 30));

        jPanel3.setBackground(new java.awt.Color(252, 229, 227));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttvanilasunshine.setBackground(new java.awt.Color(255, 204, 204));
        bttvanilasunshine.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttvanilasunshine.setForeground(new java.awt.Color(176, 25, 17));
        bttvanilasunshine.setText("Vanila Sunshine       P85.0");
        bttvanilasunshine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttvanilasunshineActionPerformed(evt);
            }
        });
        jPanel3.add(bttvanilasunshine, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 280, 30));

        bttpeppermintpatty.setBackground(new java.awt.Color(255, 204, 204));
        bttpeppermintpatty.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttpeppermintpatty.setForeground(new java.awt.Color(176, 25, 17));
        bttpeppermintpatty.setText("Peppermint Patty    P85.0");
        bttpeppermintpatty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttpeppermintpattyActionPerformed(evt);
            }
        });
        jPanel3.add(bttpeppermintpatty, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 280, 30));

        bttchocolatesurprise.setBackground(new java.awt.Color(255, 204, 204));
        bttchocolatesurprise.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttchocolatesurprise.setForeground(new java.awt.Color(176, 25, 17));
        bttchocolatesurprise.setText(" Chocolate Surprise   P90.0");
        bttchocolatesurprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttchocolatesurpriseActionPerformed(evt);
            }
        });
        jPanel3.add(bttchocolatesurprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 280, 30));

        bttredvelvet.setBackground(new java.awt.Color(255, 204, 204));
        bttredvelvet.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttredvelvet.setForeground(new java.awt.Color(176, 25, 17));
        bttredvelvet.setText("Red Velvet Vixen      P95.0");
        bttredvelvet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttredvelvetActionPerformed(evt);
            }
        });
        jPanel3.add(bttredvelvet, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, 30));

        bttbunnyhugger.setBackground(new java.awt.Color(255, 204, 204));
        bttbunnyhugger.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttbunnyhugger.setForeground(new java.awt.Color(176, 25, 17));
        bttbunnyhugger.setText("Bunny Hugger         P95.0");
        bttbunnyhugger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttbunnyhuggerActionPerformed(evt);
            }
        });
        jPanel3.add(bttbunnyhugger, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 280, 30));

        bttmochamotion.setBackground(new java.awt.Color(255, 204, 204));
        bttmochamotion.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttmochamotion.setForeground(new java.awt.Color(176, 25, 17));
        bttmochamotion.setText("Mocha Motion       P85.0");
        bttmochamotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttmochamotionActionPerformed(evt);
            }
        });
        jPanel3.add(bttmochamotion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 280, 30));

        bttlemondrop.setBackground(new java.awt.Color(255, 204, 204));
        bttlemondrop.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bttlemondrop.setForeground(new java.awt.Color(176, 25, 17));
        bttlemondrop.setText("Lemon Drop            P80.0");
        bttlemondrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttlemondropActionPerformed(evt);
            }
        });
        jPanel3.add(bttlemondrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 280, 30));

        txtredvelvetvixen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtredvelvetvixen.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(txtredvelvetvixen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 30, 30));

        txtvanilasunshine.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtvanilasunshine.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(txtvanilasunshine, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 30, 30));

        txtbunnyhugger.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtbunnyhugger.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(txtbunnyhugger, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 30, 30));

        txtmochamotion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtmochamotion.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(txtmochamotion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 30, 30));

        cupcakeimage.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        cupcakeimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cupcakeimage, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(cupcakeimage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 260, 130));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 370, 390));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 890, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttvanilasunshineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttvanilasunshineActionPerformed
    int index = 1;
    cupcake += cupcakeName[index] + "   P" + cupcakePrice[index] + "\n";
    price += cupcakePrice[index];

    setCount(index, 1);

    bttclearorder.setVisible(true);
    txtvanilasunshine.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("vanillasunshine.jpg")).getImage();
    cupcakeimage.setIcon(new ImageIcon(img));
    Icon i = cupcakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cupcakeimage.getWidth(), cupcakeimage.getHeight(), Image.SCALE_SMOOTH);
    cupcakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttvanilasunshineActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MainMenu mm = new MainMenu();
        try {
            sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        mm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void bttmoistchocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttmoistchocolateActionPerformed
    int index = 0;
    cake1 += cakeName[index] + "   P" + cakePrice[index] + "\n";
    price += cakePrice[index];

    setCount(index, 1);

    bttclearorder.setVisible(true);
    txtmoistchocolate.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("moistchocolatecake.jpg")).getImage();
    cakeimage.setIcon(new ImageIcon(img));
    Icon i = cakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cakeimage.getWidth(), cakeimage.getHeight(), Image.SCALE_SMOOTH);
    cakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttmoistchocolateActionPerformed

    private void bttconfirmorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttconfirmorderActionPerformed
        ConfirmOrder co = new ConfirmOrder();  
      if(bttconfirmorder.isEnabled()){
          
       String sweets = cake1 + "\n" + cupcake;
       String[] sweetsName = sweets.split("\n");
       Arrays.sort(sweetsName, Comparator.comparing(String::toLowerCase));
       String sweetsSort = String.join("\n", sweetsName);
       
       co.confirm_order.setText(sweetsSort);
       co.txttotalamount.setText("P"+price);
       bttconfirmorder.setEnabled(true);
       co.setVisible(true);
       } 
      else{
       bttconfirmorder.setEnabled(false);    
       }
    }//GEN-LAST:event_bttconfirmorderActionPerformed

    private void bttvanilabeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttvanilabeanActionPerformed
    int index = 1;
    cake1 += cakeName[index] + "   P" + cakePrice[index] + "\n";
    price += cakePrice[index];

    setCount(index, 1);

    bttclearorder.setVisible(true);
    txtvanilabean.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("vanillabeancake.jpg")).getImage();
    cakeimage.setIcon(new ImageIcon(img));
    Icon i = cakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cakeimage.getWidth(), cakeimage.getHeight(), Image.SCALE_SMOOTH);
    cakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttvanilabeanActionPerformed

    private void bttmangograhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttmangograhamActionPerformed
    int index = 2;
    cake1 += cakeName[index] + "   P" + cakePrice[index] + "\n";
    price += cakePrice[index];

    setCount(index, 1);

    bttclearorder.setVisible(true);
    txtmangograham.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("mangograham.jpg")).getImage();
    cakeimage.setIcon(new ImageIcon(img));
    Icon i = cakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cakeimage.getWidth(), cakeimage.getHeight(), Image.SCALE_SMOOTH);
    cakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttmangograhamActionPerformed

    private void bttavocadoflakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttavocadoflakesActionPerformed
    int index = 3;
    cake1 += cakeName[index] + "   P" + cakePrice[index] + "\n";
    price += cakePrice[index];

    setCount(index, 1);

    bttclearorder.setVisible(true);
    txtavocadoflakes.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("avocadoflakes.jpg")).getImage();
    cakeimage.setIcon(new ImageIcon(img));
    Icon i = cakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cakeimage.getWidth(), cakeimage.getHeight(), Image.SCALE_SMOOTH);
    cakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttavocadoflakesActionPerformed

    private void bttmochamochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttmochamochaActionPerformed
    int index = 4;
    cake1 += cakeName[index] + "   P" + cakePrice[index] + "\n";
    price += cakePrice[index];

    setCount(index, 1);

    bttclearorder.setVisible(true);
    txtmochamocha.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("mochamocha.jpg")).getImage();
    cakeimage.setIcon(new ImageIcon(img));
    Icon i = cakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cakeimage.getWidth(), cakeimage.getHeight(), Image.SCALE_SMOOTH);
    cakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttmochamochaActionPerformed

    private void bttmoistberriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttmoistberriesActionPerformed
    int index = 5;
    cake1 += cakeName[index] + "   P" + cakePrice[index] + "\n";
    price += cakePrice[index];

    setCount(index, 1);

    bttclearorder.setVisible(true);
    txtmoistberries.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("moistberries.jpg")).getImage();
    cakeimage.setIcon(new ImageIcon(img));
    Icon i = cakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cakeimage.getWidth(), cakeimage.getHeight(), Image.SCALE_SMOOTH);
    cakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttmoistberriesActionPerformed

    private void bttmoiststrawberriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttmoiststrawberriesActionPerformed
    int index = 6;
    cake1 += cakeName[index] + "   P" + cakePrice[index] + "\n";
    price += cakePrice[index];

    setCount(index, 1);

    bttclearorder.setVisible(true);
    txtmoiststrawberries.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("moiststrawberries.jpg")).getImage();
    cakeimage.setIcon(new ImageIcon(img));
    Icon i = cakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cakeimage.getWidth(), cakeimage.getHeight(), Image.SCALE_SMOOTH);
    cakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttmoiststrawberriesActionPerformed

    private void bttredvelvetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttredvelvetActionPerformed
    int index = 0;
    cupcake += cupcakeName[index] + "   P" + cupcakePrice[index] + "\n";
    price += cupcakePrice[index];

    setCount(index, 1);

    bttclearorder.setVisible(true);
    txtredvelvetvixen.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("redvelvetvixen.jpg")).getImage();
    cupcakeimage.setIcon(new ImageIcon(img));
    Icon i = cupcakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cupcakeimage.getWidth(), cupcakeimage.getHeight(), Image.SCALE_SMOOTH);
    cupcakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttredvelvetActionPerformed

    private void bttchocolatesurpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttchocolatesurpriseActionPerformed
    int index = 2;
    cupcake += cupcakeName[index] + "   P" + cupcakePrice[index] + "\n";
    price += cupcakePrice[index];

    setCount(index, 1);

    bttclearorder.setVisible(true);
    txtchocolatesurprise.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("chocolatesurprise.jpg")).getImage();
    cupcakeimage.setIcon(new ImageIcon(img));
    Icon i = cupcakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cupcakeimage.getWidth(), cupcakeimage.getHeight(), Image.SCALE_SMOOTH);
    cupcakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttchocolatesurpriseActionPerformed

    private void bttlemondropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttlemondropActionPerformed
    int index = 3;
    cupcake += cupcakeName[index] + "   P" + cupcakePrice[index] + "\n";
    price += cupcakePrice[index];

    setCount(index, 1);

    bttclearorder.setVisible(true);
    txtlemondrop.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("lemondrop.jpg")).getImage();
    cupcakeimage.setIcon(new ImageIcon(img));
    Icon i = cupcakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cupcakeimage.getWidth(), cupcakeimage.getHeight(), Image.SCALE_SMOOTH);
    cupcakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttlemondropActionPerformed

    private void bttbunnyhuggerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttbunnyhuggerActionPerformed
    int index = 4;
    cupcake += cupcakeName[index] + "   P" + cupcakePrice[index] + "\n";
    price += cupcakePrice[index];

    setCount(index, 1);

    bttclearorder.setVisible(true);
    txtbunnyhugger.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("bunnyhugger.jpg")).getImage();
    cupcakeimage.setIcon(new ImageIcon(img));
    Icon i = cupcakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cupcakeimage.getWidth(), cupcakeimage.getHeight(), Image.SCALE_SMOOTH);
    cupcakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttbunnyhuggerActionPerformed

    private void bttmochamotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttmochamotionActionPerformed
    int index = 5;
    cupcake += cupcakeName[index] + "   P" + cupcakePrice[index] + "\n";
    price += cupcakePrice[index];

    setCount(index, 1);

    bttclearorder.setVisible(true);
    txtmochamotion.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("mochamotion.jpg")).getImage();
    cupcakeimage.setIcon(new ImageIcon(img));
    Icon i = cupcakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cupcakeimage.getWidth(), cupcakeimage.getHeight(), Image.SCALE_SMOOTH);
    cupcakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttmochamotionActionPerformed

    private void bttpeppermintpattyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttpeppermintpattyActionPerformed
    int index = 6;
    cupcake += cupcakeName[index] + "   P" + cupcakePrice[index] + "\n";
    price += cupcakePrice[index];

    setCount(index, 1);
    
    bttclearorder.setVisible(true);
    txtpeppermintpatty.setText("x" + getCount(index));
    bttconfirmorder.setEnabled(true);

    Image img = new ImageIcon(this.getClass().getResource("peppermintpatty.jpg")).getImage();
    cupcakeimage.setIcon(new ImageIcon(img));
    Icon i = cupcakeimage.getIcon();
    ImageIcon icon = (ImageIcon) i;
    Image image = icon.getImage().getScaledInstance(cupcakeimage.getWidth(), cupcakeimage.getHeight(), Image.SCALE_SMOOTH);
    cupcakeimage.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_bttpeppermintpattyActionPerformed

    private void bttclearorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttclearorderActionPerformed
     txtmoistchocolate.setText("");
     txtvanilabean.setText("");
     txtmangograham.setText("");
     txtavocadoflakes.setText("");
     txtmochamocha.setText("");
     txtmoistberries.setText("");
     txtmoiststrawberries.setText("");
     txtredvelvetvixen.setText("");
     txtvanilasunshine.setText("");
     txtchocolatesurprise.setText("");
     txtlemondrop.setText("");
     txtbunnyhugger.setText("");
     txtmochamotion.setText("");
     txtpeppermintpatty.setText("");
     for (int i = 0; i < num.length; i++) {
            num[i] = 0;
        };
           cupcake="";
           cake1 ="";
           price = 0.0;
       bttclearorder.setVisible(false);
       bttconfirmorder.setEnabled(false);
       setLogo();
    }//GEN-LAST:event_bttclearorderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttavocadoflakes;
    private javax.swing.JButton bttbunnyhugger;
    private javax.swing.JButton bttchocolatesurprise;
    private javax.swing.JButton bttclearorder;
    static javax.swing.JButton bttconfirmorder;
    private javax.swing.JButton bttlemondrop;
    private javax.swing.JButton bttmangograham;
    private javax.swing.JButton bttmochamocha;
    private javax.swing.JButton bttmochamotion;
    private javax.swing.JButton bttmoistberries;
    private javax.swing.JButton bttmoistchocolate;
    private javax.swing.JButton bttmoiststrawberries;
    private javax.swing.JButton bttpeppermintpatty;
    private javax.swing.JButton bttredvelvet;
    private javax.swing.JButton bttvanilabean;
    private javax.swing.JButton bttvanilasunshine;
    private javax.swing.JLabel cakeimage;
    private javax.swing.JLabel cupcakeimage;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel txtavocadoflakes;
    private javax.swing.JLabel txtbunnyhugger;
    private javax.swing.JLabel txtchocolatesurprise;
    private javax.swing.JLabel txtlemondrop;
    private javax.swing.JLabel txtmangograham;
    private javax.swing.JLabel txtmochamocha;
    private javax.swing.JLabel txtmochamotion;
    private javax.swing.JLabel txtmoistberries;
    private javax.swing.JLabel txtmoistchocolate;
    private javax.swing.JLabel txtmoiststrawberries;
    private javax.swing.JLabel txtpeppermintpatty;
    private javax.swing.JLabel txtredvelvetvixen;
    private javax.swing.JLabel txtvanilabean;
    private javax.swing.JLabel txtvanilasunshine;
    // End of variables declaration//GEN-END:variables

    private void setCount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
