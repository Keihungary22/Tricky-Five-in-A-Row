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
public class board10 extends javax.swing.JFrame {

    boolean turn = true;
    int[][] piece = new int[12][12];
    ArrayList<Integer> intX = new ArrayList<>();
    ArrayList<Integer> intO = new ArrayList<>();
    javax.swing.JButton[] buttons = new javax.swing.JButton[100];
    /**
     * Creates new form board10
     */
    public board10() {
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
buttons[36] = bt37;
buttons[37] = bt38;
buttons[38] = bt39;
buttons[39] = bt40;
buttons[40] = bt41;
buttons[41] = bt42;
buttons[42] = bt43;
buttons[43] = bt44;
buttons[44] = bt45;
buttons[45] = bt46;
buttons[46] = bt47;
buttons[47] = bt48;
buttons[48] = bt49;
buttons[49] = bt50;
buttons[50] = bt51;
buttons[51] = bt52;
buttons[52] = bt53;
buttons[53] = bt54;
buttons[54] = bt55;
buttons[55] = bt56;
buttons[56] = bt57;
buttons[57] = bt58;
buttons[58] = bt59;
buttons[59] = bt60;
buttons[60] = bt61;
buttons[61] = bt62;
buttons[62] = bt63;
buttons[63] = bt64;
buttons[64] = bt65;
buttons[65] = bt66;
buttons[66] = bt67;
buttons[67] = bt68;
buttons[68] = bt69;
buttons[69] = bt70;
buttons[70] = bt71;
buttons[71] = bt72;
buttons[72] = bt73;
buttons[73] = bt74;
buttons[74] = bt75;
buttons[75] = bt76;
buttons[76] = bt77;
buttons[77] = bt78;
buttons[78] = bt79;
buttons[79] = bt80;
buttons[80] = bt81;
buttons[81] = bt82;
buttons[82] = bt83;
buttons[83] = bt84;
buttons[84] = bt85;
buttons[85] = bt86;
buttons[86] = bt87;
buttons[87] = bt88;
buttons[88] = bt89;
buttons[89] = bt90;
buttons[90] = bt91;
buttons[91] = bt92;
buttons[92] = bt93;
buttons[93] = bt94;
buttons[94] = bt95;
buttons[95] = bt96;
buttons[96] = bt97;
buttons[97] = bt98;
buttons[98] = bt99;
buttons[99] = bt100;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                piece[i][j] = 0;
            }
        }

    }

    
    public void operation(int ind){
        int fir;
        int sec;
        if(ind % 10 == 0){
            fir = ind / 10;
            sec = 10;
        }else{
            fir = ind / 10 + 1;
            sec = ind % 10;
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
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
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
        if(del % 10 == 0){
            fir = del / 10;
            sec = 10;
        }else{
            fir = del / 10 + 1;
            sec = del % 10;
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
        if(del % 10 == 0){
            fir = del / 10;
            sec = 10;
        }else{
            fir = del / 10 + 1;
            sec = del % 10;
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

        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
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
        bt37 = new javax.swing.JButton();
        bt38 = new javax.swing.JButton();
        bt39 = new javax.swing.JButton();
        bt40 = new javax.swing.JButton();
        bt41 = new javax.swing.JButton();
        bt42 = new javax.swing.JButton();
        bt43 = new javax.swing.JButton();
        bt44 = new javax.swing.JButton();
        bt45 = new javax.swing.JButton();
        bt46 = new javax.swing.JButton();
        bt47 = new javax.swing.JButton();
        bt48 = new javax.swing.JButton();
        bt49 = new javax.swing.JButton();
        bt50 = new javax.swing.JButton();
        bt51 = new javax.swing.JButton();
        bt52 = new javax.swing.JButton();
        bt53 = new javax.swing.JButton();
        bt54 = new javax.swing.JButton();
        bt55 = new javax.swing.JButton();
        bt56 = new javax.swing.JButton();
        bt57 = new javax.swing.JButton();
        bt58 = new javax.swing.JButton();
        bt59 = new javax.swing.JButton();
        bt60 = new javax.swing.JButton();
        bt61 = new javax.swing.JButton();
        bt62 = new javax.swing.JButton();
        bt63 = new javax.swing.JButton();
        bt64 = new javax.swing.JButton();
        bt65 = new javax.swing.JButton();
        bt66 = new javax.swing.JButton();
        bt67 = new javax.swing.JButton();
        bt68 = new javax.swing.JButton();
        bt69 = new javax.swing.JButton();
        bt70 = new javax.swing.JButton();
        bt71 = new javax.swing.JButton();
        bt72 = new javax.swing.JButton();
        bt73 = new javax.swing.JButton();
        bt74 = new javax.swing.JButton();
        bt75 = new javax.swing.JButton();
        bt76 = new javax.swing.JButton();
        bt77 = new javax.swing.JButton();
        bt78 = new javax.swing.JButton();
        bt79 = new javax.swing.JButton();
        bt80 = new javax.swing.JButton();
        bt81 = new javax.swing.JButton();
        bt82 = new javax.swing.JButton();
        bt83 = new javax.swing.JButton();
        bt84 = new javax.swing.JButton();
        bt85 = new javax.swing.JButton();
        bt86 = new javax.swing.JButton();
        bt87 = new javax.swing.JButton();
        bt88 = new javax.swing.JButton();
        bt89 = new javax.swing.JButton();
        bt90 = new javax.swing.JButton();
        bt91 = new javax.swing.JButton();
        bt92 = new javax.swing.JButton();
        bt93 = new javax.swing.JButton();
        bt94 = new javax.swing.JButton();
        bt95 = new javax.swing.JButton();
        bt96 = new javax.swing.JButton();
        bt97 = new javax.swing.JButton();
        bt98 = new javax.swing.JButton();
        bt99 = new javax.swing.JButton();
        bt100 = new javax.swing.JButton();

        jButton6.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton8.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton7.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton5.setPreferredSize(new java.awt.Dimension(50, 50));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("X's turn");

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

        bt37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt37ActionPerformed(evt);
            }
        });

        bt38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt38ActionPerformed(evt);
            }
        });

        bt39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt39ActionPerformed(evt);
            }
        });

        bt40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt40ActionPerformed(evt);
            }
        });

        bt41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt41ActionPerformed(evt);
            }
        });

        bt42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt42ActionPerformed(evt);
            }
        });

        bt43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt43ActionPerformed(evt);
            }
        });

        bt44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt44ActionPerformed(evt);
            }
        });

        bt45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt45ActionPerformed(evt);
            }
        });

        bt46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt46ActionPerformed(evt);
            }
        });

        bt47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt47ActionPerformed(evt);
            }
        });

        bt48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt48ActionPerformed(evt);
            }
        });

        bt49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt49ActionPerformed(evt);
            }
        });

        bt50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt50ActionPerformed(evt);
            }
        });

        bt51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt51ActionPerformed(evt);
            }
        });

        bt52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt52ActionPerformed(evt);
            }
        });

        bt53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt53ActionPerformed(evt);
            }
        });

        bt54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt54ActionPerformed(evt);
            }
        });

        bt55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt55ActionPerformed(evt);
            }
        });

        bt56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt56ActionPerformed(evt);
            }
        });

        bt57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt57ActionPerformed(evt);
            }
        });

        bt58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt58ActionPerformed(evt);
            }
        });

        bt59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt59ActionPerformed(evt);
            }
        });

        bt60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt60ActionPerformed(evt);
            }
        });

        bt61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt61ActionPerformed(evt);
            }
        });

        bt62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt62ActionPerformed(evt);
            }
        });

        bt63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt63ActionPerformed(evt);
            }
        });

        bt64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt64ActionPerformed(evt);
            }
        });

        bt65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt65ActionPerformed(evt);
            }
        });

        bt66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt66ActionPerformed(evt);
            }
        });

        bt67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt67ActionPerformed(evt);
            }
        });

        bt68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt68ActionPerformed(evt);
            }
        });

        bt69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt69ActionPerformed(evt);
            }
        });

        bt70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt70ActionPerformed(evt);
            }
        });

        bt71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt71ActionPerformed(evt);
            }
        });

        bt72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt72ActionPerformed(evt);
            }
        });

        bt73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt73ActionPerformed(evt);
            }
        });

        bt74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt74ActionPerformed(evt);
            }
        });

        bt75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt75ActionPerformed(evt);
            }
        });

        bt76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt76ActionPerformed(evt);
            }
        });

        bt77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt77ActionPerformed(evt);
            }
        });

        bt78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt78ActionPerformed(evt);
            }
        });

        bt79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt79ActionPerformed(evt);
            }
        });

        bt80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt80ActionPerformed(evt);
            }
        });

        bt81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt81ActionPerformed(evt);
            }
        });

        bt82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt82ActionPerformed(evt);
            }
        });

        bt83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt83ActionPerformed(evt);
            }
        });

        bt84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt84ActionPerformed(evt);
            }
        });

        bt85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt85ActionPerformed(evt);
            }
        });

        bt86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt86ActionPerformed(evt);
            }
        });

        bt87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt87ActionPerformed(evt);
            }
        });

        bt88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt88ActionPerformed(evt);
            }
        });

        bt89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt89ActionPerformed(evt);
            }
        });

        bt90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt90ActionPerformed(evt);
            }
        });

        bt91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt91ActionPerformed(evt);
            }
        });

        bt92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt92ActionPerformed(evt);
            }
        });

        bt93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt93ActionPerformed(evt);
            }
        });

        bt94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt94ActionPerformed(evt);
            }
        });

        bt95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt95ActionPerformed(evt);
            }
        });

        bt96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt96ActionPerformed(evt);
            }
        });

        bt97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt97ActionPerformed(evt);
            }
        });

        bt98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt98ActionPerformed(evt);
            }
        });

        bt99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt99ActionPerformed(evt);
            }
        });

        bt100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt100ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(bt18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(bt36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt82, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt83, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt84, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt85, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt86, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt87, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt88, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt89, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt90, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt91, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt92, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt93, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt94, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt95, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt96, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt97, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt98, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt99, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt100, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt82, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt83, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt84, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt85, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt86, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt87, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt88, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt89, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt90, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt91, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt92, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt93, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt94, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt95, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt96, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt97, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt98, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt99, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt100, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
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
        // TODO add your handling code here:
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

    private void bt37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt37ActionPerformed
        // TODO add your handling code here:
        operation(37);
    }//GEN-LAST:event_bt37ActionPerformed

    private void bt38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt38ActionPerformed
        // TODO add your handling code here:
        operation(38);
    }//GEN-LAST:event_bt38ActionPerformed

    private void bt39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt39ActionPerformed
        // TODO add your handling code here:
        operation(39);
    }//GEN-LAST:event_bt39ActionPerformed

    private void bt40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt40ActionPerformed
        // TODO add your handling code here:
        operation(40);
    }//GEN-LAST:event_bt40ActionPerformed

    private void bt41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt41ActionPerformed
        // TODO add your handling code here:
        operation(41);
    }//GEN-LAST:event_bt41ActionPerformed

    private void bt42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt42ActionPerformed
        // TODO add your handling code here:
        operation(42);
    }//GEN-LAST:event_bt42ActionPerformed

    private void bt43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt43ActionPerformed
        // TODO add your handling code here:
        operation(43);
    }//GEN-LAST:event_bt43ActionPerformed

    private void bt44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt44ActionPerformed
        // TODO add your handling code here:
        operation(44);
    }//GEN-LAST:event_bt44ActionPerformed

    private void bt45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt45ActionPerformed
        // TODO add your handling code here:
        operation(45);
    }//GEN-LAST:event_bt45ActionPerformed

    private void bt46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt46ActionPerformed
        // TODO add your handling code here:
        operation(46);
    }//GEN-LAST:event_bt46ActionPerformed

    private void bt47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt47ActionPerformed
        // TODO add your handling code here:
        operation(47);
    }//GEN-LAST:event_bt47ActionPerformed

    private void bt48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt48ActionPerformed
        // TODO add your handling code here:
        operation(48);
    }//GEN-LAST:event_bt48ActionPerformed

    private void bt49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt49ActionPerformed
        // TODO add your handling code here:
        operation(49);
    }//GEN-LAST:event_bt49ActionPerformed

    private void bt50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt50ActionPerformed
        // TODO add your handling code here:
        operation(50);
    }//GEN-LAST:event_bt50ActionPerformed

    private void bt51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt51ActionPerformed
        // TODO add your handling code here:
        operation(51);
    }//GEN-LAST:event_bt51ActionPerformed

    private void bt52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt52ActionPerformed
        // TODO add your handling code here:
        operation(52);
    }//GEN-LAST:event_bt52ActionPerformed

    private void bt53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt53ActionPerformed
        // TODO add your handling code here:
        operation(53);
    }//GEN-LAST:event_bt53ActionPerformed

    private void bt54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt54ActionPerformed
        // TODO add your handling code here:
        operation(54);
    }//GEN-LAST:event_bt54ActionPerformed

    private void bt55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt55ActionPerformed
        // TODO add your handling code here:
        operation(55);
    }//GEN-LAST:event_bt55ActionPerformed

    private void bt56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt56ActionPerformed
        // TODO add your handling code here:
        operation(56);
    }//GEN-LAST:event_bt56ActionPerformed

    private void bt57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt57ActionPerformed
        // TODO add your handling code here:
        operation(57);
    }//GEN-LAST:event_bt57ActionPerformed

    private void bt58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt58ActionPerformed
        // TODO add your handling code here:
        operation(58);
    }//GEN-LAST:event_bt58ActionPerformed

    private void bt59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt59ActionPerformed
        // TODO add your handling code here:
        operation(59);
    }//GEN-LAST:event_bt59ActionPerformed

    private void bt60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt60ActionPerformed
        // TODO add your handling code here:
        operation(60);
    }//GEN-LAST:event_bt60ActionPerformed

    private void bt61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt61ActionPerformed
        // TODO add your handling code here:
        operation(61);
    }//GEN-LAST:event_bt61ActionPerformed

    private void bt62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt62ActionPerformed
        // TODO add your handling code here:
        operation(62);
    }//GEN-LAST:event_bt62ActionPerformed

    private void bt63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt63ActionPerformed
        // TODO add your handling code here:
        operation(63);
    }//GEN-LAST:event_bt63ActionPerformed

    private void bt64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt64ActionPerformed
        // TODO add your handling code here:
        operation(64);
    }//GEN-LAST:event_bt64ActionPerformed

    private void bt74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt74ActionPerformed
        // TODO add your handling code here:
        operation(74);
    }//GEN-LAST:event_bt74ActionPerformed

    private void bt65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt65ActionPerformed
        // TODO add your handling code here:
        operation(65);
    }//GEN-LAST:event_bt65ActionPerformed

    private void bt66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt66ActionPerformed
        // TODO add your handling code here:
        operation(66);
    }//GEN-LAST:event_bt66ActionPerformed

    private void bt67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt67ActionPerformed
        // TODO add your handling code here:
        operation(67);
    }//GEN-LAST:event_bt67ActionPerformed

    private void bt68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt68ActionPerformed
        // TODO add your handling code here:
        operation(68);
    }//GEN-LAST:event_bt68ActionPerformed

    private void bt69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt69ActionPerformed
        // TODO add your handling code here:
        operation(69);
    }//GEN-LAST:event_bt69ActionPerformed

    private void bt70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt70ActionPerformed
        // TODO add your handling code here:
        operation(70);
    }//GEN-LAST:event_bt70ActionPerformed

    private void bt71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt71ActionPerformed
        // TODO add your handling code here:
        operation(71);
    }//GEN-LAST:event_bt71ActionPerformed

    private void bt72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt72ActionPerformed
        // TODO add your handling code here:
        operation(72);
    }//GEN-LAST:event_bt72ActionPerformed

    private void bt73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt73ActionPerformed
        // TODO add your handling code here:
        operation(73);
    }//GEN-LAST:event_bt73ActionPerformed

    private void bt75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt75ActionPerformed
        // TODO add your handling code here:
        operation(75);
    }//GEN-LAST:event_bt75ActionPerformed

    private void bt76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt76ActionPerformed
        // TODO add your handling code here:
        operation(76);
    }//GEN-LAST:event_bt76ActionPerformed

    private void bt77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt77ActionPerformed
        // TODO add your handling code here:
        operation(77);
    }//GEN-LAST:event_bt77ActionPerformed

    private void bt78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt78ActionPerformed
        // TODO add your handling code here:
        operation(78);
    }//GEN-LAST:event_bt78ActionPerformed

    private void bt79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt79ActionPerformed
        // TODO add your handling code here:
        operation(79);
    }//GEN-LAST:event_bt79ActionPerformed

    private void bt80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt80ActionPerformed
        // TODO add your handling code here:
        operation(80);
    }//GEN-LAST:event_bt80ActionPerformed

    private void bt81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt81ActionPerformed
        // TODO add your handling code here:
        operation(81);
    }//GEN-LAST:event_bt81ActionPerformed

    private void bt82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt82ActionPerformed
        // TODO add your handling code here:
        operation(82);
    }//GEN-LAST:event_bt82ActionPerformed

    private void bt83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt83ActionPerformed
        // TODO add your handling code here:
        operation(83);
    }//GEN-LAST:event_bt83ActionPerformed

    private void bt84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt84ActionPerformed
        // TODO add your handling code here:
        operation(84);
    }//GEN-LAST:event_bt84ActionPerformed

    private void bt85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt85ActionPerformed
        // TODO add your handling code here:
        operation(85);
    }//GEN-LAST:event_bt85ActionPerformed

    private void bt86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt86ActionPerformed
        // TODO add your handling code here:
        operation(86);
    }//GEN-LAST:event_bt86ActionPerformed

    private void bt87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt87ActionPerformed
        // TODO add your handling code here:
        operation(87);
    }//GEN-LAST:event_bt87ActionPerformed

    private void bt88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt88ActionPerformed
        // TODO add your handling code here:
        operation(88);
    }//GEN-LAST:event_bt88ActionPerformed

    private void bt89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt89ActionPerformed
        // TODO add your handling code here:
        operation(89);
    }//GEN-LAST:event_bt89ActionPerformed

    private void bt90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt90ActionPerformed
        // TODO add your handling code here:
        operation(90);
    }//GEN-LAST:event_bt90ActionPerformed

    private void bt91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt91ActionPerformed
        // TODO add your handling code here:
        operation(91);
    }//GEN-LAST:event_bt91ActionPerformed

    private void bt92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt92ActionPerformed
        // TODO add your handling code here:
        operation(92);
    }//GEN-LAST:event_bt92ActionPerformed

    private void bt93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt93ActionPerformed
        // TODO add your handling code here:
        operation(93);
    }//GEN-LAST:event_bt93ActionPerformed

    private void bt94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt94ActionPerformed
        // TODO add your handling code here:
        operation(94);
    }//GEN-LAST:event_bt94ActionPerformed

    private void bt95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt95ActionPerformed
        // TODO add your handling code here:
        operation(95);
    }//GEN-LAST:event_bt95ActionPerformed

    private void bt96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt96ActionPerformed
        // TODO add your handling code here:
        operation(96);
    }//GEN-LAST:event_bt96ActionPerformed

    private void bt97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt97ActionPerformed
        // TODO add your handling code here:
        operation(97);
    }//GEN-LAST:event_bt97ActionPerformed

    private void bt98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt98ActionPerformed
        // TODO add your handling code here:
        operation(98);
    }//GEN-LAST:event_bt98ActionPerformed

    private void bt99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt99ActionPerformed
        // TODO add your handling code here:
        operation(99);
    }//GEN-LAST:event_bt99ActionPerformed

    private void bt100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt100ActionPerformed
        // TODO add your handling code here:
        operation(100);
    }//GEN-LAST:event_bt100ActionPerformed

    
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
            java.util.logging.Logger.getLogger(board10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(board10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(board10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(board10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new board10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt100;
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
    private javax.swing.JButton bt37;
    private javax.swing.JButton bt38;
    private javax.swing.JButton bt39;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt40;
    private javax.swing.JButton bt41;
    private javax.swing.JButton bt42;
    private javax.swing.JButton bt43;
    private javax.swing.JButton bt44;
    private javax.swing.JButton bt45;
    private javax.swing.JButton bt46;
    private javax.swing.JButton bt47;
    private javax.swing.JButton bt48;
    private javax.swing.JButton bt49;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt50;
    private javax.swing.JButton bt51;
    private javax.swing.JButton bt52;
    private javax.swing.JButton bt53;
    private javax.swing.JButton bt54;
    private javax.swing.JButton bt55;
    private javax.swing.JButton bt56;
    private javax.swing.JButton bt57;
    private javax.swing.JButton bt58;
    private javax.swing.JButton bt59;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt60;
    private javax.swing.JButton bt61;
    private javax.swing.JButton bt62;
    private javax.swing.JButton bt63;
    private javax.swing.JButton bt64;
    private javax.swing.JButton bt65;
    private javax.swing.JButton bt66;
    private javax.swing.JButton bt67;
    private javax.swing.JButton bt68;
    private javax.swing.JButton bt69;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt70;
    private javax.swing.JButton bt71;
    private javax.swing.JButton bt72;
    private javax.swing.JButton bt73;
    private javax.swing.JButton bt74;
    private javax.swing.JButton bt75;
    private javax.swing.JButton bt76;
    private javax.swing.JButton bt77;
    private javax.swing.JButton bt78;
    private javax.swing.JButton bt79;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt80;
    private javax.swing.JButton bt81;
    private javax.swing.JButton bt82;
    private javax.swing.JButton bt83;
    private javax.swing.JButton bt84;
    private javax.swing.JButton bt85;
    private javax.swing.JButton bt86;
    private javax.swing.JButton bt87;
    private javax.swing.JButton bt88;
    private javax.swing.JButton bt89;
    private javax.swing.JButton bt9;
    private javax.swing.JButton bt90;
    private javax.swing.JButton bt91;
    private javax.swing.JButton bt92;
    private javax.swing.JButton bt93;
    private javax.swing.JButton bt94;
    private javax.swing.JButton bt95;
    private javax.swing.JButton bt96;
    private javax.swing.JButton bt97;
    private javax.swing.JButton bt98;
    private javax.swing.JButton bt99;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
