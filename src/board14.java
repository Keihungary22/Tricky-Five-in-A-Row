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
public class board14 extends javax.swing.JFrame {

    boolean turn = true;
    int[][] piece = new int[16][16];
    ArrayList<Integer> intX = new ArrayList<>();
    ArrayList<Integer> intO = new ArrayList<>();
    javax.swing.JButton[] buttons = new javax.swing.JButton[196];
    
    /**
     * Creates new form board14
     */
    public board14() {
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
buttons[100] = bt101;
buttons[101] = bt102;
buttons[102] = bt103;
buttons[103] = bt104;
buttons[104] = bt105;
buttons[105] = bt106;
buttons[106] = bt107;
buttons[107] = bt108;
buttons[108] = bt109;
buttons[109] = bt110;
buttons[110] = bt111;
buttons[111] = bt112;
buttons[112] = bt113;
buttons[113] = bt114;
buttons[114] = bt115;
buttons[115] = bt116;
buttons[116] = bt117;
buttons[117] = bt118;
buttons[118] = bt119;
buttons[119] = bt120;
buttons[120] = bt121;
buttons[121] = bt122;
buttons[122] = bt123;
buttons[123] = bt124;
buttons[124] = bt125;
buttons[125] = bt126;
buttons[126] = bt127;
buttons[127] = bt128;
buttons[128] = bt129;
buttons[129] = bt130;
buttons[130] = bt131;
buttons[131] = bt132;
buttons[132] = bt133;
buttons[133] = bt134;
buttons[134] = bt135;
buttons[135] = bt136;
buttons[136] = bt137;
buttons[137] = bt138;
buttons[138] = bt139;
buttons[139] = bt140;
buttons[140] = bt141;
buttons[141] = bt142;
buttons[142] = bt143;
buttons[143] = bt144;
buttons[144] = bt145;
buttons[145] = bt146;
buttons[146] = bt147;
buttons[147] = bt148;
buttons[148] = bt149;
buttons[149] = bt150;
buttons[150] = bt151;
buttons[151] = bt152;
buttons[152] = bt153;
buttons[153] = bt154;
buttons[154] = bt155;
buttons[155] = bt156;
buttons[156] = bt157;
buttons[157] = bt158;
buttons[158] = bt159;
buttons[159] = bt160;
buttons[160] = bt161;
buttons[161] = bt162;
buttons[162] = bt163;
buttons[163] = bt164;
buttons[164] = bt165;
buttons[165] = bt166;
buttons[166] = bt167;
buttons[167] = bt168;
buttons[168] = bt169;
buttons[169] = bt170;
buttons[170] = bt171;
buttons[171] = bt172;
buttons[172] = bt173;
buttons[173] = bt174;
buttons[174] = bt175;
buttons[175] = bt176;
buttons[176] = bt177;
buttons[177] = bt178;
buttons[178] = bt179;
buttons[179] = bt180;
buttons[180] = bt181;
buttons[181] = bt182;
buttons[182] = bt183;
buttons[183] = bt184;
buttons[184] = bt185;
buttons[185] = bt186;
buttons[186] = bt187;
buttons[187] = bt188;
buttons[188] = bt189;
buttons[189] = bt190;
buttons[190] = bt191;
buttons[191] = bt192;
buttons[192] = bt193;
buttons[193] = bt194;
buttons[194] = bt195;
buttons[195] = bt196;

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                piece[i][j] = 0;
            }
        }


    }
    
    
    public void operation(int ind){
        int fir;
        int sec;
        if(ind % 14 == 0){
            fir = ind / 14;
            sec = 14;
        }else{
            fir = ind / 14 + 1;
            sec = ind % 14;
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
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
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
        if(del % 14 == 0){
            fir = del / 14;
            sec = 14;
        }else{
            fir = del / 14 + 1;
            sec = del % 14;
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
        if(del % 14 == 0){
            fir = del / 14;
            sec = 14;
        }else{
            fir = del / 14 + 1;
            sec = del % 14;
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
        bt29 = new javax.swing.JButton();
        bt30 = new javax.swing.JButton();
        bt31 = new javax.swing.JButton();
        bt32 = new javax.swing.JButton();
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
        bt101 = new javax.swing.JButton();
        bt102 = new javax.swing.JButton();
        bt103 = new javax.swing.JButton();
        bt104 = new javax.swing.JButton();
        bt105 = new javax.swing.JButton();
        bt106 = new javax.swing.JButton();
        bt107 = new javax.swing.JButton();
        bt108 = new javax.swing.JButton();
        bt109 = new javax.swing.JButton();
        bt110 = new javax.swing.JButton();
        bt111 = new javax.swing.JButton();
        bt112 = new javax.swing.JButton();
        bt113 = new javax.swing.JButton();
        bt114 = new javax.swing.JButton();
        bt115 = new javax.swing.JButton();
        bt116 = new javax.swing.JButton();
        bt117 = new javax.swing.JButton();
        bt118 = new javax.swing.JButton();
        bt119 = new javax.swing.JButton();
        bt120 = new javax.swing.JButton();
        bt121 = new javax.swing.JButton();
        bt122 = new javax.swing.JButton();
        bt123 = new javax.swing.JButton();
        bt124 = new javax.swing.JButton();
        bt125 = new javax.swing.JButton();
        bt126 = new javax.swing.JButton();
        bt127 = new javax.swing.JButton();
        bt128 = new javax.swing.JButton();
        bt129 = new javax.swing.JButton();
        bt130 = new javax.swing.JButton();
        bt131 = new javax.swing.JButton();
        bt132 = new javax.swing.JButton();
        bt133 = new javax.swing.JButton();
        bt134 = new javax.swing.JButton();
        bt135 = new javax.swing.JButton();
        bt136 = new javax.swing.JButton();
        bt137 = new javax.swing.JButton();
        bt138 = new javax.swing.JButton();
        bt139 = new javax.swing.JButton();
        bt140 = new javax.swing.JButton();
        bt141 = new javax.swing.JButton();
        bt142 = new javax.swing.JButton();
        bt143 = new javax.swing.JButton();
        bt144 = new javax.swing.JButton();
        bt145 = new javax.swing.JButton();
        bt146 = new javax.swing.JButton();
        bt147 = new javax.swing.JButton();
        bt148 = new javax.swing.JButton();
        bt149 = new javax.swing.JButton();
        bt150 = new javax.swing.JButton();
        bt151 = new javax.swing.JButton();
        bt152 = new javax.swing.JButton();
        bt153 = new javax.swing.JButton();
        bt154 = new javax.swing.JButton();
        bt155 = new javax.swing.JButton();
        bt156 = new javax.swing.JButton();
        bt157 = new javax.swing.JButton();
        bt158 = new javax.swing.JButton();
        bt159 = new javax.swing.JButton();
        bt160 = new javax.swing.JButton();
        bt161 = new javax.swing.JButton();
        bt162 = new javax.swing.JButton();
        bt163 = new javax.swing.JButton();
        bt164 = new javax.swing.JButton();
        bt165 = new javax.swing.JButton();
        bt166 = new javax.swing.JButton();
        bt167 = new javax.swing.JButton();
        bt168 = new javax.swing.JButton();
        bt169 = new javax.swing.JButton();
        bt170 = new javax.swing.JButton();
        bt171 = new javax.swing.JButton();
        bt172 = new javax.swing.JButton();
        bt173 = new javax.swing.JButton();
        bt174 = new javax.swing.JButton();
        bt175 = new javax.swing.JButton();
        bt176 = new javax.swing.JButton();
        bt177 = new javax.swing.JButton();
        bt178 = new javax.swing.JButton();
        bt179 = new javax.swing.JButton();
        bt180 = new javax.swing.JButton();
        bt181 = new javax.swing.JButton();
        bt182 = new javax.swing.JButton();
        bt183 = new javax.swing.JButton();
        bt184 = new javax.swing.JButton();
        bt185 = new javax.swing.JButton();
        bt186 = new javax.swing.JButton();
        bt187 = new javax.swing.JButton();
        bt188 = new javax.swing.JButton();
        bt189 = new javax.swing.JButton();
        bt190 = new javax.swing.JButton();
        bt191 = new javax.swing.JButton();
        bt192 = new javax.swing.JButton();
        bt193 = new javax.swing.JButton();
        bt194 = new javax.swing.JButton();
        bt195 = new javax.swing.JButton();
        bt196 = new javax.swing.JButton();

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

        bt101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt101ActionPerformed(evt);
            }
        });

        bt102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt102ActionPerformed(evt);
            }
        });

        bt103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt103ActionPerformed(evt);
            }
        });

        bt104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt104ActionPerformed(evt);
            }
        });

        bt105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt105ActionPerformed(evt);
            }
        });

        bt106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt106ActionPerformed(evt);
            }
        });

        bt107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt107ActionPerformed(evt);
            }
        });

        bt108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt108ActionPerformed(evt);
            }
        });

        bt109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt109ActionPerformed(evt);
            }
        });

        bt110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt110ActionPerformed(evt);
            }
        });

        bt111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt111ActionPerformed(evt);
            }
        });

        bt112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt112ActionPerformed(evt);
            }
        });

        bt113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt113ActionPerformed(evt);
            }
        });

        bt114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt114ActionPerformed(evt);
            }
        });

        bt115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt115ActionPerformed(evt);
            }
        });

        bt116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt116ActionPerformed(evt);
            }
        });

        bt117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt117ActionPerformed(evt);
            }
        });

        bt118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt118ActionPerformed(evt);
            }
        });

        bt119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt119ActionPerformed(evt);
            }
        });

        bt120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt120ActionPerformed(evt);
            }
        });

        bt121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt121ActionPerformed(evt);
            }
        });

        bt122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt122ActionPerformed(evt);
            }
        });

        bt123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt123ActionPerformed(evt);
            }
        });

        bt124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt124ActionPerformed(evt);
            }
        });

        bt125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt125ActionPerformed(evt);
            }
        });

        bt126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt126ActionPerformed(evt);
            }
        });

        bt127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt127ActionPerformed(evt);
            }
        });

        bt128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt128ActionPerformed(evt);
            }
        });

        bt129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt129ActionPerformed(evt);
            }
        });

        bt130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt130ActionPerformed(evt);
            }
        });

        bt131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt131ActionPerformed(evt);
            }
        });

        bt132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt132ActionPerformed(evt);
            }
        });

        bt133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt133ActionPerformed(evt);
            }
        });

        bt134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt134ActionPerformed(evt);
            }
        });

        bt135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt135ActionPerformed(evt);
            }
        });

        bt136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt136ActionPerformed(evt);
            }
        });

        bt137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt137ActionPerformed(evt);
            }
        });

        bt138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt138ActionPerformed(evt);
            }
        });

        bt139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt139ActionPerformed(evt);
            }
        });

        bt140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt140ActionPerformed(evt);
            }
        });

        bt141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt141ActionPerformed(evt);
            }
        });

        bt142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt142ActionPerformed(evt);
            }
        });

        bt143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt143ActionPerformed(evt);
            }
        });

        bt144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt144ActionPerformed(evt);
            }
        });

        bt145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt145ActionPerformed(evt);
            }
        });

        bt146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt146ActionPerformed(evt);
            }
        });

        bt147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt147ActionPerformed(evt);
            }
        });

        bt148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt148ActionPerformed(evt);
            }
        });

        bt149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt149ActionPerformed(evt);
            }
        });

        bt150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt150ActionPerformed(evt);
            }
        });

        bt151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt151ActionPerformed(evt);
            }
        });

        bt152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt152ActionPerformed(evt);
            }
        });

        bt153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt153ActionPerformed(evt);
            }
        });

        bt154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt154ActionPerformed(evt);
            }
        });

        bt155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt155ActionPerformed(evt);
            }
        });

        bt156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt156ActionPerformed(evt);
            }
        });

        bt157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt157ActionPerformed(evt);
            }
        });

        bt158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt158ActionPerformed(evt);
            }
        });

        bt159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt159ActionPerformed(evt);
            }
        });

        bt160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt160ActionPerformed(evt);
            }
        });

        bt161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt161ActionPerformed(evt);
            }
        });

        bt162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt162ActionPerformed(evt);
            }
        });

        bt163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt163ActionPerformed(evt);
            }
        });

        bt164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt164ActionPerformed(evt);
            }
        });

        bt165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt165ActionPerformed(evt);
            }
        });

        bt166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt166ActionPerformed(evt);
            }
        });

        bt167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt167ActionPerformed(evt);
            }
        });

        bt168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt168ActionPerformed(evt);
            }
        });

        bt169.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt169ActionPerformed(evt);
            }
        });

        bt170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt170ActionPerformed(evt);
            }
        });

        bt171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt171ActionPerformed(evt);
            }
        });

        bt172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt172ActionPerformed(evt);
            }
        });

        bt173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt173ActionPerformed(evt);
            }
        });

        bt174.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt174ActionPerformed(evt);
            }
        });

        bt175.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt175ActionPerformed(evt);
            }
        });

        bt176.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt176ActionPerformed(evt);
            }
        });

        bt177.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt177ActionPerformed(evt);
            }
        });

        bt178.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt178ActionPerformed(evt);
            }
        });

        bt179.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt179ActionPerformed(evt);
            }
        });

        bt180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt180ActionPerformed(evt);
            }
        });

        bt181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt181ActionPerformed(evt);
            }
        });

        bt182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt182ActionPerformed(evt);
            }
        });

        bt183.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt183ActionPerformed(evt);
            }
        });

        bt184.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt184ActionPerformed(evt);
            }
        });

        bt185.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt185ActionPerformed(evt);
            }
        });

        bt186.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt186ActionPerformed(evt);
            }
        });

        bt187.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt187ActionPerformed(evt);
            }
        });

        bt188.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt188ActionPerformed(evt);
            }
        });

        bt189.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt189ActionPerformed(evt);
            }
        });

        bt190.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt190ActionPerformed(evt);
            }
        });

        bt191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt191ActionPerformed(evt);
            }
        });

        bt192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt192ActionPerformed(evt);
            }
        });

        bt193.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt193ActionPerformed(evt);
            }
        });

        bt194.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt194ActionPerformed(evt);
            }
        });

        bt195.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt195ActionPerformed(evt);
            }
        });

        bt196.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt196ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt169, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt170, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt171, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt172, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt173, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt174, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt175, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt176, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt177, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt178, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt179, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt180, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt181, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt182, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bt43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bt29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bt57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bt85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bt71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bt99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt101, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt102, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt103, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt104, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt105, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt106, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt107, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bt113, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt114, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt115, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt116, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt117, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt118, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt119, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt120, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt121, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bt80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bt94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt95, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bt108, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt109, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt110, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt111, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt112, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bt122, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt123, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt124, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt125, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bt126, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bt127, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt128, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt129, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt130, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt131, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt132, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt133, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt134, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt135, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt136, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt137, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt138, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt139, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt140, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(bt141, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt142, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt143, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt144, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt145, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt146, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt147, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt148, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt149, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt150, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt151, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt152, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt153, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt154, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(bt155, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt156, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt157, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt158, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt159, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt160, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt161, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt162, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt163, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt164, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt165, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt166, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt167, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt168, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt183, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt184, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt185, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt186, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt187, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt188, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt189, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt190, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt191, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt192, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt193, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt194, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt195, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt196, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt52, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt59, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt78, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt81, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt95, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt101, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt102, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt103, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt104, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt105, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt106, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt107, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt108, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt109, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt110, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt111, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt112, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt114, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt115, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt116, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt117, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt118, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt119, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt120, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt121, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt113, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt122, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt123, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt124, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt125, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt126, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt127, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt128, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt129, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt130, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt131, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt132, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt133, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt134, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt135, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt136, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt138, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt139, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt140, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt137, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt141, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt142, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt143, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt144, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt145, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt146, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt147, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt148, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt149, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt150, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt152, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt153, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt154, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt151, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt155, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt156, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt157, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt158, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt159, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt160, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt161, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt162, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt163, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt164, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt166, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt167, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt168, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt165, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt171, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt172, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt173, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt174, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt175, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt176, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt177, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt178, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt179, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt180, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt182, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt181, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt169, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt170, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt185, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt186, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt187, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt188, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt189, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt190, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt191, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt192, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt193, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt194, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt196, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt195, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt183, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt184, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void bt74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt74ActionPerformed
        // TODO add your handling code here:
        operation(74);
    }//GEN-LAST:event_bt74ActionPerformed

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

    private void bt101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt101ActionPerformed
        // TODO add your handling code here:
        operation(101);
    }//GEN-LAST:event_bt101ActionPerformed

    private void bt102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt102ActionPerformed
        // TODO add your handling code here:
        operation(102);
    }//GEN-LAST:event_bt102ActionPerformed

    private void bt103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt103ActionPerformed
        // TODO add your handling code here:
        operation(103);
    }//GEN-LAST:event_bt103ActionPerformed

    private void bt104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt104ActionPerformed
        // TODO add your handling code here:
        operation(104);
    }//GEN-LAST:event_bt104ActionPerformed

    private void bt105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt105ActionPerformed
        // TODO add your handling code here:
        operation(105);
    }//GEN-LAST:event_bt105ActionPerformed

    private void bt106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt106ActionPerformed
        // TODO add your handling code here:
        operation(106);
    }//GEN-LAST:event_bt106ActionPerformed

    private void bt107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt107ActionPerformed
        // TODO add your handling code here:
        operation(107);
    }//GEN-LAST:event_bt107ActionPerformed

    private void bt108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt108ActionPerformed
        // TODO add your handling code here:
        operation(108);
    }//GEN-LAST:event_bt108ActionPerformed

    private void bt109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt109ActionPerformed
        // TODO add your handling code here:
        operation(109);
    }//GEN-LAST:event_bt109ActionPerformed

    private void bt110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt110ActionPerformed
        // TODO add your handling code here:
        operation(110);
    }//GEN-LAST:event_bt110ActionPerformed

    private void bt111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt111ActionPerformed
        // TODO add your handling code here:
        operation(111);
    }//GEN-LAST:event_bt111ActionPerformed

    private void bt112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt112ActionPerformed
        // TODO add your handling code here:
        operation(112);
    }//GEN-LAST:event_bt112ActionPerformed

    private void bt113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt113ActionPerformed
        // TODO add your handling code here:
        operation(113);
    }//GEN-LAST:event_bt113ActionPerformed

    private void bt114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt114ActionPerformed
        // TODO add your handling code here:
        operation(114);
    }//GEN-LAST:event_bt114ActionPerformed

    private void bt115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt115ActionPerformed
        // TODO add your handling code here:
        operation(115);
    }//GEN-LAST:event_bt115ActionPerformed

    private void bt116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt116ActionPerformed
        // TODO add your handling code here:
        operation(116);
    }//GEN-LAST:event_bt116ActionPerformed

    private void bt117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt117ActionPerformed
        // TODO add your handling code here:
        operation(117);
    }//GEN-LAST:event_bt117ActionPerformed

    private void bt118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt118ActionPerformed
        // TODO add your handling code here:
        operation(118);
    }//GEN-LAST:event_bt118ActionPerformed

    private void bt119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt119ActionPerformed
        // TODO add your handling code here:
        operation(119);
    }//GEN-LAST:event_bt119ActionPerformed

    private void bt120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt120ActionPerformed
        // TODO add your handling code here:
        operation(120);
    }//GEN-LAST:event_bt120ActionPerformed

    private void bt121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt121ActionPerformed
        // TODO add your handling code here:
        operation(121);
    }//GEN-LAST:event_bt121ActionPerformed

    private void bt122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt122ActionPerformed
        // TODO add your handling code here:
        operation(122);
    }//GEN-LAST:event_bt122ActionPerformed

    private void bt123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt123ActionPerformed
        // TODO add your handling code here:
        operation(123);
    }//GEN-LAST:event_bt123ActionPerformed

    private void bt124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt124ActionPerformed
        // TODO add your handling code here:
        operation(124);
    }//GEN-LAST:event_bt124ActionPerformed

    private void bt125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt125ActionPerformed
        // TODO add your handling code here:
        operation(125);
    }//GEN-LAST:event_bt125ActionPerformed

    private void bt126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt126ActionPerformed
        // TODO add your handling code here:
        operation(126);
    }//GEN-LAST:event_bt126ActionPerformed

    private void bt127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt127ActionPerformed
        // TODO add your handling code here:
        operation(127);
    }//GEN-LAST:event_bt127ActionPerformed

    private void bt128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt128ActionPerformed
        // TODO add your handling code here:
        operation(128);
    }//GEN-LAST:event_bt128ActionPerformed

    private void bt129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt129ActionPerformed
        // TODO add your handling code here:
        operation(129);
    }//GEN-LAST:event_bt129ActionPerformed

    private void bt130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt130ActionPerformed
        // TODO add your handling code here:
        operation(130);
    }//GEN-LAST:event_bt130ActionPerformed

    private void bt131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt131ActionPerformed
        // TODO add your handling code here:
        operation(131);
    }//GEN-LAST:event_bt131ActionPerformed

    private void bt132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt132ActionPerformed
        // TODO add your handling code here:
        operation(132);
    }//GEN-LAST:event_bt132ActionPerformed

    private void bt133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt133ActionPerformed
        // TODO add your handling code here:
        operation(133);
    }//GEN-LAST:event_bt133ActionPerformed

    private void bt134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt134ActionPerformed
        // TODO add your handling code here:
        operation(134);
    }//GEN-LAST:event_bt134ActionPerformed

    private void bt135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt135ActionPerformed
        // TODO add your handling code here:
        operation(135);
    }//GEN-LAST:event_bt135ActionPerformed

    private void bt136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt136ActionPerformed
        // TODO add your handling code here:
        operation(136);
    }//GEN-LAST:event_bt136ActionPerformed

    private void bt137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt137ActionPerformed
        // TODO add your handling code here:
        operation(137);
    }//GEN-LAST:event_bt137ActionPerformed

    private void bt138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt138ActionPerformed
        // TODO add your handling code here:
        operation(138);
    }//GEN-LAST:event_bt138ActionPerformed

    private void bt139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt139ActionPerformed
        // TODO add your handling code here:
        operation(139);
    }//GEN-LAST:event_bt139ActionPerformed

    private void bt140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt140ActionPerformed
        // TODO add your handling code here:
        operation(140);
    }//GEN-LAST:event_bt140ActionPerformed

    private void bt141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt141ActionPerformed
        // TODO add your handling code here:
        operation(141);
    }//GEN-LAST:event_bt141ActionPerformed

    private void bt142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt142ActionPerformed
        // TODO add your handling code here:
        operation(142);
    }//GEN-LAST:event_bt142ActionPerformed

    private void bt143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt143ActionPerformed
        // TODO add your handling code here:
        operation(143);
    }//GEN-LAST:event_bt143ActionPerformed

    private void bt144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt144ActionPerformed
        // TODO add your handling code here:
        operation(144);
    }//GEN-LAST:event_bt144ActionPerformed

    private void bt145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt145ActionPerformed
        // TODO add your handling code here:
        operation(145);
    }//GEN-LAST:event_bt145ActionPerformed

    private void bt146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt146ActionPerformed
        // TODO add your handling code here:
        operation(146);
    }//GEN-LAST:event_bt146ActionPerformed

    private void bt147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt147ActionPerformed
        // TODO add your handling code here:
        operation(147);
    }//GEN-LAST:event_bt147ActionPerformed

    private void bt148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt148ActionPerformed
        // TODO add your handling code here:
        operation(148);
    }//GEN-LAST:event_bt148ActionPerformed

    private void bt149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt149ActionPerformed
        // TODO add your handling code here:
        operation(149);
    }//GEN-LAST:event_bt149ActionPerformed

    private void bt150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt150ActionPerformed
        // TODO add your handling code here:
        operation(150);
    }//GEN-LAST:event_bt150ActionPerformed

    private void bt151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt151ActionPerformed
        // TODO add your handling code here:
        operation(151);
    }//GEN-LAST:event_bt151ActionPerformed

    private void bt152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt152ActionPerformed
        // TODO add your handling code here:
        operation(152);
    }//GEN-LAST:event_bt152ActionPerformed

    private void bt153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt153ActionPerformed
        // TODO add your handling code here:
        operation(153);
    }//GEN-LAST:event_bt153ActionPerformed

    private void bt154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt154ActionPerformed
        // TODO add your handling code here:
        operation(154);
    }//GEN-LAST:event_bt154ActionPerformed

    private void bt155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt155ActionPerformed
        // TODO add your handling code here:
        operation(155);
    }//GEN-LAST:event_bt155ActionPerformed

    private void bt156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt156ActionPerformed
        // TODO add your handling code here:
        operation(156);
    }//GEN-LAST:event_bt156ActionPerformed

    private void bt157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt157ActionPerformed
        // TODO add your handling code here:
        operation(157);
    }//GEN-LAST:event_bt157ActionPerformed

    private void bt158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt158ActionPerformed
        // TODO add your handling code here:
        operation(158);
    }//GEN-LAST:event_bt158ActionPerformed

    private void bt159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt159ActionPerformed
        // TODO add your handling code here:
        operation(159);
    }//GEN-LAST:event_bt159ActionPerformed

    private void bt160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt160ActionPerformed
        // TODO add your handling code here:
        operation(160);
    }//GEN-LAST:event_bt160ActionPerformed

    private void bt161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt161ActionPerformed
        // TODO add your handling code here:
        operation(161);
    }//GEN-LAST:event_bt161ActionPerformed

    private void bt162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt162ActionPerformed
        // TODO add your handling code here:
        operation(162);
    }//GEN-LAST:event_bt162ActionPerformed

    private void bt163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt163ActionPerformed
        // TODO add your handling code here:
        operation(163);
    }//GEN-LAST:event_bt163ActionPerformed

    private void bt164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt164ActionPerformed
        // TODO add your handling code here:
        operation(164);
    }//GEN-LAST:event_bt164ActionPerformed

    private void bt165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt165ActionPerformed
        // TODO add your handling code here:
        operation(165);
    }//GEN-LAST:event_bt165ActionPerformed

    private void bt166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt166ActionPerformed
        // TODO add your handling code here:
        operation(166);
    }//GEN-LAST:event_bt166ActionPerformed

    private void bt167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt167ActionPerformed
        // TODO add your handling code here:
        operation(167);
    }//GEN-LAST:event_bt167ActionPerformed

    private void bt168ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt168ActionPerformed
        // TODO add your handling code here:
        operation(168);
    }//GEN-LAST:event_bt168ActionPerformed

    private void bt169ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt169ActionPerformed
        // TODO add your handling code here:
        operation(169);
    }//GEN-LAST:event_bt169ActionPerformed

    private void bt170ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt170ActionPerformed
        // TODO add your handling code here:
        operation(170);
    }//GEN-LAST:event_bt170ActionPerformed

    private void bt171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt171ActionPerformed
        // TODO add your handling code here:
        operation(171);
    }//GEN-LAST:event_bt171ActionPerformed

    private void bt172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt172ActionPerformed
        // TODO add your handling code here:
        operation(172);
    }//GEN-LAST:event_bt172ActionPerformed

    private void bt173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt173ActionPerformed
        // TODO add your handling code here:
        operation(173);
    }//GEN-LAST:event_bt173ActionPerformed

    private void bt174ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt174ActionPerformed
        // TODO add your handling code here:
        operation(174);
    }//GEN-LAST:event_bt174ActionPerformed

    private void bt175ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt175ActionPerformed
        // TODO add your handling code here:
        operation(175);
    }//GEN-LAST:event_bt175ActionPerformed

    private void bt176ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt176ActionPerformed
        // TODO add your handling code here:
        operation(176);
    }//GEN-LAST:event_bt176ActionPerformed

    private void bt177ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt177ActionPerformed
        // TODO add your handling code here:
        operation(177);
    }//GEN-LAST:event_bt177ActionPerformed

    private void bt178ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt178ActionPerformed
        // TODO add your handling code here:
        operation(178);
    }//GEN-LAST:event_bt178ActionPerformed

    private void bt179ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt179ActionPerformed
        // TODO add your handling code here:
        operation(179);
    }//GEN-LAST:event_bt179ActionPerformed

    private void bt180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt180ActionPerformed
        // TODO add your handling code here:
        operation(180);
    }//GEN-LAST:event_bt180ActionPerformed

    private void bt181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt181ActionPerformed
        // TODO add your handling code here:
        operation(181);
    }//GEN-LAST:event_bt181ActionPerformed

    private void bt182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt182ActionPerformed
        // TODO add your handling code here:
        operation(182);
    }//GEN-LAST:event_bt182ActionPerformed

    private void bt183ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt183ActionPerformed
        // TODO add your handling code here:
        operation(183);
    }//GEN-LAST:event_bt183ActionPerformed

    private void bt184ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt184ActionPerformed
        // TODO add your handling code here:
        operation(184);
    }//GEN-LAST:event_bt184ActionPerformed

    private void bt185ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt185ActionPerformed
        // TODO add your handling code here:
        operation(185);
    }//GEN-LAST:event_bt185ActionPerformed

    private void bt186ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt186ActionPerformed
        // TODO add your handling code here:
        operation(186);
    }//GEN-LAST:event_bt186ActionPerformed

    private void bt187ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt187ActionPerformed
        // TODO add your handling code here:
        operation(187);
    }//GEN-LAST:event_bt187ActionPerformed

    private void bt188ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt188ActionPerformed
        // TODO add your handling code here:
        operation(188);
    }//GEN-LAST:event_bt188ActionPerformed

    private void bt189ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt189ActionPerformed
        // TODO add your handling code here:
        operation(189);
    }//GEN-LAST:event_bt189ActionPerformed

    private void bt190ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt190ActionPerformed
        // TODO add your handling code here:
        operation(190);
    }//GEN-LAST:event_bt190ActionPerformed

    private void bt191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt191ActionPerformed
        // TODO add your handling code here:
        operation(191);
    }//GEN-LAST:event_bt191ActionPerformed

    private void bt192ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt192ActionPerformed
        // TODO add your handling code here:
        operation(192);
    }//GEN-LAST:event_bt192ActionPerformed

    private void bt193ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt193ActionPerformed
        // TODO add your handling code here:
        operation(193);
    }//GEN-LAST:event_bt193ActionPerformed

    private void bt194ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt194ActionPerformed
        // TODO add your handling code here:
        operation(194);
    }//GEN-LAST:event_bt194ActionPerformed

    private void bt195ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt195ActionPerformed
        // TODO add your handling code here:
        operation(195);
    }//GEN-LAST:event_bt195ActionPerformed

    private void bt196ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt196ActionPerformed
        // TODO add your handling code here:
        operation(196);
    }//GEN-LAST:event_bt196ActionPerformed

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
            java.util.logging.Logger.getLogger(board14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(board14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(board14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(board14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new board14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt100;
    private javax.swing.JButton bt101;
    private javax.swing.JButton bt102;
    private javax.swing.JButton bt103;
    private javax.swing.JButton bt104;
    private javax.swing.JButton bt105;
    private javax.swing.JButton bt106;
    private javax.swing.JButton bt107;
    private javax.swing.JButton bt108;
    private javax.swing.JButton bt109;
    private javax.swing.JButton bt11;
    private javax.swing.JButton bt110;
    private javax.swing.JButton bt111;
    private javax.swing.JButton bt112;
    private javax.swing.JButton bt113;
    private javax.swing.JButton bt114;
    private javax.swing.JButton bt115;
    private javax.swing.JButton bt116;
    private javax.swing.JButton bt117;
    private javax.swing.JButton bt118;
    private javax.swing.JButton bt119;
    private javax.swing.JButton bt12;
    private javax.swing.JButton bt120;
    private javax.swing.JButton bt121;
    private javax.swing.JButton bt122;
    private javax.swing.JButton bt123;
    private javax.swing.JButton bt124;
    private javax.swing.JButton bt125;
    private javax.swing.JButton bt126;
    private javax.swing.JButton bt127;
    private javax.swing.JButton bt128;
    private javax.swing.JButton bt129;
    private javax.swing.JButton bt13;
    private javax.swing.JButton bt130;
    private javax.swing.JButton bt131;
    private javax.swing.JButton bt132;
    private javax.swing.JButton bt133;
    private javax.swing.JButton bt134;
    private javax.swing.JButton bt135;
    private javax.swing.JButton bt136;
    private javax.swing.JButton bt137;
    private javax.swing.JButton bt138;
    private javax.swing.JButton bt139;
    private javax.swing.JButton bt14;
    private javax.swing.JButton bt140;
    private javax.swing.JButton bt141;
    private javax.swing.JButton bt142;
    private javax.swing.JButton bt143;
    private javax.swing.JButton bt144;
    private javax.swing.JButton bt145;
    private javax.swing.JButton bt146;
    private javax.swing.JButton bt147;
    private javax.swing.JButton bt148;
    private javax.swing.JButton bt149;
    private javax.swing.JButton bt15;
    private javax.swing.JButton bt150;
    private javax.swing.JButton bt151;
    private javax.swing.JButton bt152;
    private javax.swing.JButton bt153;
    private javax.swing.JButton bt154;
    private javax.swing.JButton bt155;
    private javax.swing.JButton bt156;
    private javax.swing.JButton bt157;
    private javax.swing.JButton bt158;
    private javax.swing.JButton bt159;
    private javax.swing.JButton bt16;
    private javax.swing.JButton bt160;
    private javax.swing.JButton bt161;
    private javax.swing.JButton bt162;
    private javax.swing.JButton bt163;
    private javax.swing.JButton bt164;
    private javax.swing.JButton bt165;
    private javax.swing.JButton bt166;
    private javax.swing.JButton bt167;
    private javax.swing.JButton bt168;
    private javax.swing.JButton bt169;
    private javax.swing.JButton bt17;
    private javax.swing.JButton bt170;
    private javax.swing.JButton bt171;
    private javax.swing.JButton bt172;
    private javax.swing.JButton bt173;
    private javax.swing.JButton bt174;
    private javax.swing.JButton bt175;
    private javax.swing.JButton bt176;
    private javax.swing.JButton bt177;
    private javax.swing.JButton bt178;
    private javax.swing.JButton bt179;
    private javax.swing.JButton bt18;
    private javax.swing.JButton bt180;
    private javax.swing.JButton bt181;
    private javax.swing.JButton bt182;
    private javax.swing.JButton bt183;
    private javax.swing.JButton bt184;
    private javax.swing.JButton bt185;
    private javax.swing.JButton bt186;
    private javax.swing.JButton bt187;
    private javax.swing.JButton bt188;
    private javax.swing.JButton bt189;
    private javax.swing.JButton bt19;
    private javax.swing.JButton bt190;
    private javax.swing.JButton bt191;
    private javax.swing.JButton bt192;
    private javax.swing.JButton bt193;
    private javax.swing.JButton bt194;
    private javax.swing.JButton bt195;
    private javax.swing.JButton bt196;
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
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
