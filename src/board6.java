/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author nakan
 */
public class board6 extends javax.swing.JFrame {

    boolean turn = true;
    int[][] piece = new int[8][8];
    ArrayList<Integer> intX = new ArrayList<>();
    ArrayList<Integer> intO = new ArrayList<>();
    javax.swing.JButton[] buttons = new javax.swing.JButton[36];
    
    /**
     * Creates new form board6
     */
    public board6() {
        initComponents();
      
        buttons[0] = bt1;
    buttons[1] = bt2;
    buttons[2] = bt3;
    buttons[3] = bt4;
    buttons[4] = bt5;
    buttons[5] = bt6;
    buttons[6] = bt7;
    buttons[7] = bt8;
    buttons[8] = bt9;
    buttons[9] = bt10;
    buttons[10] = bt11;
    buttons[11] = bt12;
    buttons[12] = bt13;
    buttons[13] = bt14;
    buttons[14] = bt15;
    buttons[15] = bt16;
    buttons[16] = bt17;
    buttons[17] = bt18;
    buttons[18] = bt19;
    buttons[19] = bt20;
    buttons[20] = bt21;
    buttons[21] = bt22;
    buttons[22] = bt23;
    buttons[23] = bt24;
    buttons[24] = bt25;
    buttons[25] = bt26;
    buttons[26] = bt27;
    buttons[27] = bt28;
    buttons[28] = bt29;
    buttons[29] = bt30;
    buttons[30] = bt31;
    buttons[31] = bt32;
    buttons[32] = bt33;
    buttons[33] = bt34;
    buttons[34] = bt35;
    buttons[35] = bt36;
        
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                piece[i][j] = 0;
            }
        }
    }
    
    
    public void operation(int ind){
        int fir;
        int sec;
        if(ind % 6 == 0){
            fir = ind / 6;
            sec = 6;
        }else{
            fir = ind / 6 + 1;
            sec = ind % 6;
        }
        
        if(piece[fir][sec] == 0){
            if(turn == true){
                turn = false;
                buttons[ind - 1].setText("X");
                label1.setText("O's turn");
                piece[fir][sec] = 1;
                intX.add(ind);
                
                int log = longest(piece, 1, fir, sec);
                if(log == 3){
                    randomDelX();
                }else if(log == 4){
                    randomDelX();
                    randomDelX();
                }else if(log == 5){
                    showMessageDialog("Player X won this game");
                    start frame = new start();
                    frame.setVisible(true);
                    this.dispose();
                }
                System.out.println(log);
                
                if(draw(piece)){
                    showMessageDialog("Draw");
                    start frame = new start();
                    frame.setVisible(true);
                    this.dispose();
                }
            }else{
                turn = true;
                buttons[ind - 1].setText("O");
                label1.setText("X's turn");
                piece[fir][sec] = 2;
                intO.add(ind);
                
                int log = longest(piece, 2, fir, sec);
                if(log == 3){
                    randomDelO();
                }else if(log == 4){
                    randomDelO();
                    randomDelO();
                }else if(log == 5){
                    showMessageDialog("Player O won this game");
                    start frame = new start();
                    frame.setVisible(true);
                    this.dispose();
                }
                
                System.out.println(log);
                if(draw(piece)){
                    showMessageDialog("Draw");
                    start frame = new start();
                    frame.setVisible(true);
                    this.dispose();
                }
            }
        }
    }
    
    private static void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public boolean draw(int piece[][]){
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                if(piece[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void randomDelX(){
        int randomIndex = new Random().nextInt(intX.size() - 1);
        int del = intX.get(randomIndex);
        
        int fir;
        int sec;
        if(del % 6 == 0){
            fir = del / 6;
            sec = 6;
        }else{
            fir = del / 6 + 1;
            sec = del % 6;
        }
        
        System.out.println(fir);
        System.out.println(sec);
        piece[fir][sec] = 0;
        
        buttons[del - 1].setText("");
        intX.remove(randomIndex);
    }
    
    public void randomDelO(){
        int randomIndex = new Random().nextInt(intO.size() - 1);
        int del = intO.get(randomIndex);
        
        int fir;
        int sec;
        if(del % 6 == 0){
            fir = del / 6;
            sec = 6;
        }else{
            fir = del / 6 + 1;
            sec = del % 6;
        }
        
        System.out.println(fir);
        System.out.println(sec);
        piece[fir][sec] = 0;
        
        buttons[del - 1].setText("");
        intO.remove(randomIndex);
    }
    
    public static int longest(int[][] piece, int value, int first, int second){
        int dia1upfst = first - 1;
        int dia1upsnd = second - 1;
        int dia1dwfst = first + 1;
        int dia1dwsnd = second + 1;
        int dia1 = 0;
        
        while(piece[dia1upfst][dia1upsnd] == value){
            dia1++;
            dia1upfst--;
            dia1upsnd--;
        }
        while(piece[dia1dwfst][dia1dwsnd] == value){
            dia1++;
            dia1dwfst++;
            dia1dwsnd++;
        }
        dia1++;
        //System.out.println(dia1);

        int verupfst = first;
        int verupsnd = second - 1;
        int verdwfst = first;
        int verdwsnd = second + 1;
        int ver = 0;
        
        while(piece[verupfst][verupsnd] == value){
            ver++;
            verupsnd--;
        }
        while(piece[verdwfst][verdwsnd] == value){
            ver++;
            verdwsnd++;
        }
        ver++;
        //System.out.println(ver);

        int dia2upfst = first + 1;
        int dia2upsnd = second - 1;
        int dia2dwfst = first - 1;
        int dia2dwsnd = second + 1;
        int dia2 = 0;
        
        while(piece[dia2upfst][dia2upsnd] == value){
            dia2++;
            dia2upfst++;
            dia2upsnd--;
        }
        while(piece[dia2dwfst][dia2dwsnd] == value){
            dia2++;
            dia2dwfst--;
            dia2dwsnd++;
        }
        dia2++;
        //System.out.println(dia2);

        int holupfst = first - 1;
        int holupsnd = second;
        int holdwfst = first + 1;
        int holdwsnd = second;
        int hol = 0;
        
        while(piece[holupfst][holupsnd] == value){
            hol++;
            holupfst--;
        }
        while(piece[holdwfst][holdwsnd] == value){
            hol++;
            holdwfst++;
        }
        hol++;
        //System.out.println(hol);
        
        int max = 0;
        if(dia1 < dia2){
            max = dia2;
        }else{
            max = dia1;
        }
        if(max < hol){
            max = hol;
        }
        if(max < ver){
            max = ver;
        }
        return max;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt10 = new javax.swing.JButton();
        bt11 = new javax.swing.JButton();
        bt12 = new javax.swing.JButton();
        bt13 = new javax.swing.JButton();
        bt14 = new javax.swing.JButton();
        bt15 = new javax.swing.JButton();
        bt16 = new javax.swing.JButton();
        bt17 = new javax.swing.JButton();
        bt18 = new javax.swing.JButton();
        bt19 = new javax.swing.JButton();
        bt20 = new javax.swing.JButton();
        bt21 = new javax.swing.JButton();
        bt22 = new javax.swing.JButton();
        bt23 = new javax.swing.JButton();
        bt24 = new javax.swing.JButton();
        bt25 = new javax.swing.JButton();
        bt26 = new javax.swing.JButton();
        bt27 = new javax.swing.JButton();
        bt28 = new javax.swing.JButton();
        bt29 = new javax.swing.JButton();
        bt30 = new javax.swing.JButton();
        bt31 = new javax.swing.JButton();
        bt32 = new javax.swing.JButton();
        bt33 = new javax.swing.JButton();
        bt34 = new javax.swing.JButton();
        bt35 = new javax.swing.JButton();
        bt36 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt10ActionPerformed(evt);
            }
        });

        bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt11ActionPerformed(evt);
            }
        });

        bt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt12ActionPerformed(evt);
            }
        });

        bt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt13ActionPerformed(evt);
            }
        });

        bt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt14ActionPerformed(evt);
            }
        });

        bt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt15ActionPerformed(evt);
            }
        });

        bt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt16ActionPerformed(evt);
            }
        });

        bt17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt17ActionPerformed(evt);
            }
        });

        bt18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt18ActionPerformed(evt);
            }
        });

        bt19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt19ActionPerformed(evt);
            }
        });

        bt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt20ActionPerformed(evt);
            }
        });

        bt21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt21ActionPerformed(evt);
            }
        });

        bt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt22ActionPerformed(evt);
            }
        });

        bt23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt23ActionPerformed(evt);
            }
        });

        bt24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt24ActionPerformed(evt);
            }
        });

        bt25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt25ActionPerformed(evt);
            }
        });

        bt26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt26ActionPerformed(evt);
            }
        });

        bt27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt27ActionPerformed(evt);
            }
        });

        bt28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt28ActionPerformed(evt);
            }
        });

        bt29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt29ActionPerformed(evt);
            }
        });

        bt30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt30ActionPerformed(evt);
            }
        });

        bt31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt31ActionPerformed(evt);
            }
        });

        bt32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt32ActionPerformed(evt);
            }
        });

        bt33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt33ActionPerformed(evt);
            }
        });

        bt34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt34ActionPerformed(evt);
            }
        });

        bt35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt35ActionPerformed(evt);
            }
        });

        bt36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt36ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("X's turn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(label1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        operation(1);
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        operation(2);
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
        operation(3);
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
        operation(4);
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
        operation(5);
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        // TODO add your handling code here:
        operation(6);
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        // TODO add your handling code here
        operation(7);
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        // TODO add your handling code here:
        operation(8);
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        // TODO add your handling code here:
        operation(9);
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt10ActionPerformed
        // TODO add your handling code here:
        operation(10);
    }//GEN-LAST:event_bt10ActionPerformed

    private void bt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt11ActionPerformed
        // TODO add your handling code here:
        operation(11);
    }//GEN-LAST:event_bt11ActionPerformed

    private void bt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt12ActionPerformed
        // TODO add your handling code here:
        operation(12);
    }//GEN-LAST:event_bt12ActionPerformed

    private void bt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt13ActionPerformed
        // TODO add your handling code here:
        operation(13);
    }//GEN-LAST:event_bt13ActionPerformed

    private void bt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt14ActionPerformed
        // TODO add your handling code here:
        operation(14);
    }//GEN-LAST:event_bt14ActionPerformed

    private void bt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt15ActionPerformed
        // TODO add your handling code here:
        operation(15);
    }//GEN-LAST:event_bt15ActionPerformed

    private void bt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt16ActionPerformed
        // TODO add your handling code here:
        operation(16);
    }//GEN-LAST:event_bt16ActionPerformed

    private void bt17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt17ActionPerformed
        // TODO add your handling code here:
        operation(17);
    }//GEN-LAST:event_bt17ActionPerformed

    private void bt18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt18ActionPerformed
        // TODO add your handling code here:
        operation(18);
    }//GEN-LAST:event_bt18ActionPerformed

    private void bt19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt19ActionPerformed
        // TODO add your handling code here:
        operation(19);
    }//GEN-LAST:event_bt19ActionPerformed

    private void bt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt20ActionPerformed
        // TODO add your handling code here:
        operation(20);
    }//GEN-LAST:event_bt20ActionPerformed

    private void bt21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt21ActionPerformed
        // TODO add your handling code here:
        operation(21);
    }//GEN-LAST:event_bt21ActionPerformed

    private void bt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt22ActionPerformed
        // TODO add your handling code here:
        operation(22);
    }//GEN-LAST:event_bt22ActionPerformed

    private void bt23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt23ActionPerformed
        // TODO add your handling code here:
        operation(23);
    }//GEN-LAST:event_bt23ActionPerformed

    private void bt24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt24ActionPerformed
        // TODO add your handling code here:
        operation(24);
    }//GEN-LAST:event_bt24ActionPerformed

    private void bt25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt25ActionPerformed
        // TODO add your handling code here:
        operation(25);
    }//GEN-LAST:event_bt25ActionPerformed

    private void bt26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt26ActionPerformed
        // TODO add your handling code here:
        operation(26);
    }//GEN-LAST:event_bt26ActionPerformed

    private void bt27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt27ActionPerformed
        // TODO add your handling code here:
        operation(27);
    }//GEN-LAST:event_bt27ActionPerformed

    private void bt28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt28ActionPerformed
        // TODO add your handling code here:
        operation(28);
    }//GEN-LAST:event_bt28ActionPerformed

    private void bt29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt29ActionPerformed
        // TODO add your handling code here:
        operation(29);
    }//GEN-LAST:event_bt29ActionPerformed

    private void bt30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt30ActionPerformed
        // TODO add your handling code here:
        operation(30);
    }//GEN-LAST:event_bt30ActionPerformed

    private void bt31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt31ActionPerformed
        // TODO add your handling code here:
        operation(31);
    }//GEN-LAST:event_bt31ActionPerformed

    private void bt32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt32ActionPerformed
        // TODO add your handling code here:
        operation(32);
    }//GEN-LAST:event_bt32ActionPerformed

    private void bt33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt33ActionPerformed
        // TODO add your handling code here:
        operation(33);
    }//GEN-LAST:event_bt33ActionPerformed

    private void bt34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt34ActionPerformed
        // TODO add your handling code here:
        operation(34);
    }//GEN-LAST:event_bt34ActionPerformed

    private void bt35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt35ActionPerformed
        // TODO add your handling code here:
        operation(35);
    }//GEN-LAST:event_bt35ActionPerformed

    private void bt36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt36ActionPerformed
        // TODO add your handling code here:
        operation(36);
    }//GEN-LAST:event_bt36ActionPerformed

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
            java.util.logging.Logger.getLogger(board6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(board6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(board6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(board6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new board6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt11;
    private javax.swing.JButton bt12;
    private javax.swing.JButton bt13;
    private javax.swing.JButton bt14;
    private javax.swing.JButton bt15;
    private javax.swing.JButton bt16;
    private javax.swing.JButton bt17;
    private javax.swing.JButton bt18;
    private javax.swing.JButton bt19;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt20;
    private javax.swing.JButton bt21;
    private javax.swing.JButton bt22;
    private javax.swing.JButton bt23;
    private javax.swing.JButton bt24;
    private javax.swing.JButton bt25;
    private javax.swing.JButton bt26;
    private javax.swing.JButton bt27;
    private javax.swing.JButton bt28;
    private javax.swing.JButton bt29;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt30;
    private javax.swing.JButton bt31;
    private javax.swing.JButton bt32;
    private javax.swing.JButton bt33;
    private javax.swing.JButton bt34;
    private javax.swing.JButton bt35;
    private javax.swing.JButton bt36;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
