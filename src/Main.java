
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;


/**
 *
 * @author Mostafa Mounir Shehab
 * 
 * User Name : Super Mari000
 * 
 */

class Calculator extends JFrame {
    
    private Container container,containerSub;
    private GroupLayout groupLayout;
    private JPanel panel1;
    private GridBagConstraints gbc;
    private JTextField tField;
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, 
                    btnback, btnclear, btnleft, btnright, btnplus, btnminus, btnmulti,
                    btndiv, btnequal, btnpow, btnsqrt, btnpoint, btnpi, btne, btnmod,
                    btnsin, btncos, btntan, btnasin, btnacos, btnatan, btnlog, btnln, btnbase;
    
    private Font font1 = new Font(Font.SANS_SERIF, Font.BOLD, 17),
                 font2 = new Font(Font.SANS_SERIF, Font.BOLD, 12),
                 font3 = new Font(Font.SANS_SERIF, Font.BOLD, 10);
    private String oldStr,myStr;
    
    public Calculator() {
        CreatUIManger();
        creatBtn();
        
        container = this.getContentPane();
        container.setBackground(Color.black);
        groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);
        
       
        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);
        groupLayout.preferredLayoutSize(container);
        
        
        groupLayout.setHorizontalGroup(
            groupLayout.createSequentialGroup()
                
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(tField)
                    .addGap(40)
                    .addComponent(panel1)
                  
                )
                
        );
        groupLayout.setVerticalGroup(
            groupLayout.createSequentialGroup()
                
                .addGap(20)
                    
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(tField)
                )
                    
                .addGap(20)
                    
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(panel1)
                )   
                .addGap(5)  
                
        );
        
        
        addActions();
        
        this.setTitle("❤ Super Mari000 ❤");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        
    }
    
    private void CreatUIManger(){
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (Exception e) { }
    }
    
    private void creatBtn(){
        panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(Color.BLACK);
        
        gbc = new GridBagConstraints();
        gbc.insets=new Insets(2,2,2,2);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.ipadx=4;
        gbc.ipady=4;
        
 
        
        
        
        tField=new JTextField();
        tField.setHorizontalAlignment(JTextField.RIGHT);
        tField.setFont(new Font("Monospaced", Font.BOLD, 20));
        tField.setBackground(Color.lightGray);
        tField.setMargin(new Insets(15,5,15,5));
        
        
        
        
        btn0=new JButton("0");
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");
        btn5=new JButton("5");
        btn6=new JButton("6");
        btn7=new JButton("7");
        btn8=new JButton("8");
        btn9=new JButton("9");
        btnln=new JButton("Ln");
        btnlog=new JButton("Log");
        btnsin=new JButton("Sin");
        btncos=new JButton("Cos");
        btntan=new JButton("Tan");
        btnasin=new JButton("aSin");
        btnacos=new JButton("aCos");
        btnatan=new JButton("aTan");
        btnback=new JButton("DEL");
        btnclear=new JButton("AC");
        btnpi=new JButton("π");
        btne=new JButton("e");
        btnleft=new JButton("(");
        btnright=new JButton(")");
        btnpow=new JButton("^");
        btnmod=new JButton("%");
        btnsqrt=new JButton("Sqrt");
        btnplus=new JButton("+");
        btnminus=new JButton("-");
        btndiv=new JButton("÷");
        btnmulti=new JButton("*");
        btnpoint=new JButton(".");
        btnequal=new JButton("=");
        btnbase=new JButton("Bas");
        
        
        btn0.setFont(font1);
        btn1.setFont(font1);
        btn2.setFont(font1);
        btn3.setFont(font1);
        btn4.setFont(font1);
        btn5.setFont(font1);
        btn6.setFont(font1);
        btn7.setFont(font1);
        btn8.setFont(font1);
        btn9.setFont(font1);
        btnln.setFont(font3);
        btnlog.setFont(font3);
        btnsin.setFont(font3);
        btncos.setFont(font3);
        btntan.setFont(font3);
        btnasin.setFont(font3);
        btnacos.setFont(font3);
        btnatan.setFont(font3);
        btnsqrt.setFont(font3); 
        btnpi.setFont(font1);
        btne.setFont(font1);
        btnleft.setFont(font1);
        btnright.setFont(font1);
        btnpow.setFont(font1);
        btnmod.setFont(font1);
        btnplus.setFont(font1);
        btnminus.setFont(font1);
        btndiv.setFont(font1);
        btnmulti.setFont(font1);
        btnpoint.setFont(font1);
        btnequal.setFont(font1);
        btnback.setFont(font2);
        btnclear.setFont(font2);
        btnbase.setFont(font2);
        
        
        btn0.setForeground(Color.WHITE);
        btn1.setForeground(Color.WHITE);
        btn2.setForeground(Color.WHITE);
        btn3.setForeground(Color.WHITE);
        btn4.setForeground(Color.WHITE);
        btn5.setForeground(Color.WHITE);
        btn6.setForeground(Color.WHITE);
        btn7.setForeground(Color.WHITE);
        btn8.setForeground(Color.WHITE);
        btn9.setForeground(Color.WHITE);
        btnln.setForeground(Color.WHITE);
        btnlog.setForeground(Color.WHITE);
        btnsin.setForeground(Color.WHITE);
        btncos.setForeground(Color.WHITE);
        btntan.setForeground(Color.WHITE);
        btnasin.setForeground(Color.WHITE);
        btnacos.setForeground(Color.WHITE);
        btnatan.setForeground(Color.WHITE);
        btnsqrt.setForeground(Color.WHITE); 
        btnpi.setForeground(Color.WHITE);
        btne.setForeground(Color.WHITE);
        btnleft.setForeground(Color.WHITE);
        btnright.setForeground(Color.WHITE);
        btnpow.setForeground(Color.WHITE);
        btnmod.setForeground(Color.WHITE);
        btnplus.setForeground(Color.WHITE);
        btnminus.setForeground(Color.WHITE);
        btndiv.setForeground(Color.WHITE);
        btnmulti.setForeground(Color.WHITE);
        btnpoint.setForeground(Color.WHITE);
        btnequal.setForeground(Color.WHITE);
        btnback.setForeground(Color.WHITE);
        btnclear.setForeground(Color.WHITE);
        btnbase.setForeground(Color.WHITE);
        
        btn0.setBackground(Color.darkGray);
        btn1.setBackground(Color.darkGray);
        btn2.setBackground(Color.darkGray);
        btn3.setBackground(Color.darkGray);
        btn4.setBackground(Color.darkGray);
        btn5.setBackground(Color.darkGray);
        btn6.setBackground(Color.darkGray);
        btn7.setBackground(Color.darkGray);
        btn8.setBackground(Color.darkGray);
        btn9.setBackground(Color.darkGray);
        btnln.setBackground(Color.black);
        btnlog.setBackground(Color.black);
        btnsin.setBackground(Color.black);
        btncos.setBackground(Color.black);
        btntan.setBackground(Color.black);
        btnasin.setBackground(Color.black);
        btnacos.setBackground(Color.black);
        btnatan.setBackground(Color.black);
        btnsqrt.setBackground(Color.black); 
        btnpi.setBackground(Color.black);
        btne.setBackground(Color.black);
        btnleft.setBackground(Color.black);
        btnright.setBackground(Color.black);
        btnpow.setBackground(Color.black);
        btnmod.setBackground(Color.black);
        btnplus.setBackground(Color.black);
        btnminus.setBackground(Color.black);
        btndiv.setBackground(Color.black);
        btnmulti.setBackground(Color.black);
        btnpoint.setBackground(Color.darkGray);
        btnequal.setBackground(Color.black);
        btnback.setBackground(new Color(255, 128, 0));
        btnclear.setBackground(new Color(223, 1, 1));
        btnbase.setBackground(Color.GREEN);
        
        
        tField.setFocusable(false);
        btn0.setFocusable(false);
        btn1.setFocusable(false);
        btn2.setFocusable(false);
        btn3.setFocusable(false);
        btn4.setFocusable(false);
        btn5.setFocusable(false);
        btn6.setFocusable(false);
        btn7.setFocusable(false);
        btn8.setFocusable(false);
        btn9.setFocusable(false);
        btnln.setFocusable(false);
        btnlog.setFocusable(false);
        btnsin.setFocusable(false);
        btncos.setFocusable(false);
        btntan.setFocusable(false);
        btnasin.setFocusable(false);
        btnacos.setFocusable(false);
        btnatan.setFocusable(false);
        btnsqrt.setFocusable(false); 
        btnpi.setFocusable(false);
        btne.setFocusable(false);
        btnleft.setFocusable(false);
        btnright.setFocusable(false);
        btnpow.setFocusable(false);
        btnmod.setFocusable(false);
        btnplus.setFocusable(false);
        btnminus.setFocusable(false);
        btndiv.setFocusable(false);
        btnmulti.setFocusable(false);
        btnpoint.setFocusable(false);
        btnequal.setFocusable(false);
        btnback.setFocusable(false);
        btnclear.setFocusable(false);
        btnbase.setFocusable(false);
        
        
        gbc.gridwidth = 1;
        gbc.gridheight = 1; 
        panel1.add(btnsin, gbc);
        panel1.add(btncos, gbc);
        panel1.add(btntan, gbc);
        panel1.add(btnbase, gbc);
        panel1.add(btnback, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        panel1.add(btnclear, gbc);
        
        
        gbc.gridwidth = 1;
        panel1.add(btnasin, gbc);
        panel1.add(btnacos, gbc);
        panel1.add(btnatan, gbc);
        panel1.add(btnlog, gbc);
        panel1.add(btnln, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        panel1.add(btnsqrt, gbc);
        
        
        gbc.gridwidth = 1;
        panel1.add(btn7, gbc);
        panel1.add(btn8, gbc);
        panel1.add(btn9, gbc);
        panel1.add(btnplus, gbc);
        panel1.add(btnleft, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        panel1.add(btnright, gbc);
        
        
        gbc.gridwidth = 1;
        panel1.add(btn4, gbc);
        panel1.add(btn5, gbc);
        panel1.add(btn6, gbc);
        panel1.add(btnminus, gbc);
        panel1.add(btnpi, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        panel1.add(btne, gbc);
        
        gbc.gridwidth = 1;
        panel1.add(btn1, gbc);
        panel1.add(btn2, gbc);
        panel1.add(btn3, gbc);
        panel1.add(btnmulti, gbc);
        panel1.add(btnmod, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        panel1.add(btnpow, gbc);
        
        gbc.gridwidth = 2;
        panel1.add(btn0, gbc);
        gbc.gridwidth = 1;
        panel1.add(btnpoint, gbc);
        panel1.add(btndiv, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        panel1.add(btnequal, gbc);
        
        
        
    }
    
    private void addActions(){
        
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("0","Number");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("1","Number");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("2","Number");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("3","Number");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("4","Number");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("5","Number");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("6","Number");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("7","Number");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("8","Number");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("9","Number");
            }
        });
        btnsin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("Sin","Symbol");
            }
        });
        btncos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    btnNum_isClicked("Cos","Symbol");
            }
        });
        btntan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("Tan","Symbol");
            }
        });
        btnasin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("aSin","Symbol");
            }
        });
        btnacos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    btnNum_isClicked("aCos","Symbol");
            }
        });
        btnatan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("aTan","Symbol");
            }
        });
        btnlog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("Log","Symbol");
            }
        });
        btnln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    btnNum_isClicked("Ln","Symbol");
            }
        });
        btnsqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("Sqrt","Symbol");
            }
        });
        btnpi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("π","Symbol");
            }
        });
        btne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    btnNum_isClicked("e","Symbol");
            }
        });
        btnplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("+","Operand");
            }
        });
        btnminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNum_isClicked("-","Operand");
            }
        });
        btndiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDiv_isClicked("÷","Operand");
            }
        });
        btnmulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDiv_isClicked("*","Operand");
            }
        });
        btnmod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDiv_isClicked("%","Operand");
            }
        });
        btnpow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPow_isClicked("^");
            }
        });
        btnpoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPoint_isClicked("point");
            }
        });
        btnright.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnRight_isClicked();
            }
        });
        btnleft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnLeft_isClicked();
            }
        });
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClear_isClicked();
            }
        });
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnBack_isClicked();
            }
        });
        btnequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnEqual_isClicked();
            }
        });
        btnbase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NumberConvert();
            }
        });
        
    }
                
    private void btnNum_isClicked(String click,String type){
        autoAddOrRemove(type);
        tField.setText(tField.getText() + click);
    }
    private void btnDiv_isClicked(String click,String type){
        if (!tField.getText().isEmpty()) {
            autoAddOrRemove(type);
            tField.setText(tField.getText() + click);
        }
    }
    private void btnPow_isClicked(String click){
        if (tField.getText().matches(".*[0-9eπ)]$"))
            tField.setText(tField.getText() + click);
        
    }
    private void btnPoint_isClicked(String type){
        String str = tField.getText();
        if (tField.getText().isEmpty()) {
            tField.setText("0.");
        }
        else {
            int lastPointIndex = str.lastIndexOf(".");
            int lastPlusIndex = str.lastIndexOf("+");
            int lastMinusIndex = str.lastIndexOf("-");
            int lastMultipleIndex = str.lastIndexOf("×");
            int lastDivideIndex = str.lastIndexOf("÷");
            int lastModuloIndex = str.lastIndexOf("%");
                       
            if(lastPointIndex <= lastPlusIndex ||
               lastPointIndex <= lastMinusIndex ||
               lastPointIndex <= lastMultipleIndex ||
               lastPointIndex <= lastDivideIndex ||
               lastPointIndex <= lastModuloIndex ) {
                    autoAddOrRemove(type);
                    tField.setText(tField.getText() + ".");
            }
        }
    }
    private void btnRight_isClicked(){
        if(tField.getText().matches(".*[^nstgn(]$")) {
            int LparentesesCounter = 0, RparentesesCounter = 0;
            for(char c: tField.getText().toCharArray()) {
                if( c == '(')
                    LparentesesCounter++;
                else if ( c == ')')
                    RparentesesCounter++;
            }
            if(LparentesesCounter > RparentesesCounter)
                tField.setText(tField.getText() + ")");
                 
        }
    }
    private void btnLeft_isClicked(){
        autoAddOrRemove("Symbol");
        tField.setText(tField.getText() + "(");
    }
    private void btnClear_isClicked(){
        tField.setText("");
    }
    private void btnBack_isClicked(){
        
        String temp = tField.getText();
        char lastChar;

        if (temp.equals("Error") || temp.equals("cannot divide by 0"))
            tField.setText(oldStr);
        
        else if (!temp.isEmpty()) {
            lastChar = temp.charAt(temp.length()-1);
            
            if(lastChar == 'g')
                tField.setText(temp.substring(0,temp.length()-3));
            else if(lastChar == 't')
                tField.setText(temp.substring(0,temp.length()-4));
            else if(lastChar == 's'){
                
                if(temp.length() > 3 && temp.substring(temp.length()-4,temp.length()).equals("aCos"))
                    tField.setText(temp.substring(0,temp.length()-4));
                else
                    tField.setText(temp.substring(0,temp.length()-3));
                
            }else if(lastChar == 'n'){
                
                if(temp.substring(temp.length()-2,temp.length()).equals("Ln"))
                    tField.setText(temp.substring(0,temp.length()-2));
                else if(temp.length() > 3 && temp.substring(temp.length()-4,temp.length()).equals("aTan"))
                    tField.setText(temp.substring(0,temp.length()-4));
                else if(temp.length() > 3&& temp.substring(temp.length()-4,temp.length()).equals("aSin"))
                    tField.setText(temp.substring(0,temp.length()-4));
                else if(temp.substring(temp.length()-3,temp.length()).equals("Sin"))
                    tField.setText(temp.substring(0,temp.length()-3));
                else if(temp.substring(temp.length()-3,temp.length()).equals("Tan"))
                    tField.setText(temp.substring(0,temp.length()-3));
            }else
                tField.setText(temp.substring(0, temp.length()-1));

            
        }
    }
    private void btnEqual_isClicked(){
        if (!tField.getText().isEmpty()) {
            oldStr = tField.getText();
            
            try {
                Double ans = eval(tField.getText());
                if (ans.isInfinite()) 
                    tField.setText("cannot divide by 0");
                else if (ans.isNaN())
                    tField.setText("Error");
                else 
                    tField.setText(ans.toString());
                    
                
            }
            catch (Exception ex) {
                tField.setText("Error");
                
            }
            
        }
    }
    
    private void autoAddOrRemove(String button) {
        if (!tField.getText().isEmpty()) {
            myStr=tField.getText();
            char lastCharacter = myStr.charAt(myStr.length() - 1);

            switch (button) {
                
                case "Symbol":
                    switch (lastCharacter) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case 'e':
                        case 'π':
                            tField.setText(tField.getText() + "*");
                            break;
                        case '.':
                            tField.setText(tField.getText() + "0*");
                            break;
                    }
                    break;
                    
                case "Number":
                    switch (lastCharacter) {
                        case 'e':
                        case 'π':
                            tField.setText(tField.getText() + "*");
                            break;
                        case '0':
                            if(
                                    myStr.equals("0") ||
                                    myStr.endsWith("+0") ||
                                    myStr.endsWith("-0") ||
                                    myStr.endsWith("*0") ||
                                    myStr.endsWith("÷0") ||
                                    myStr.endsWith("%0") ||
                                    myStr.endsWith("^0") ||
                                    myStr.endsWith("Sqrt0") ||
                                    myStr.endsWith("(0") ||
                                    myStr.endsWith("Cos0") ||
                                    myStr.endsWith("Sin0") ||
                                    myStr.endsWith("Tan0") ||
                                    myStr.endsWith("aCos0") ||
                                    myStr.endsWith("aSin0") ||
                                    myStr.endsWith("aTan0") ||
                                    myStr.endsWith("Ln0") ||
                                    myStr.endsWith("Log0")
                                )
                                tField.setText(myStr.substring(0, myStr.length()-1));
                            break;
                    }
                    break;
                    
                case "Operand":
                    switch (lastCharacter) {
                        case '+':
                        case '-':
                        case '*':
                        case '÷':
                        case '%':
                        case '.':
                            tField.setText(myStr.substring(0, myStr.length()-1));
                            break;
                    }
                    break;
                    
                case "Point":
                    switch(lastCharacter) {
                        case '+':
                        case '-':
                        case '*':
                        case '÷':
                        case '%':
                        case '(':
                        case 'π':
                        case 's':
                        case 'n':
                        case 't':
                        case 'g':
                        case '^':
                            tField.setText(myStr + "0");
                            break;
                        case ')':
                            tField.setText(myStr + "×0");
                            break;
                        case '.':
                            tField.setText(myStr.substring(0, myStr.length()-1));
                            break;
                    }
                break;
            }

        }
    }
    
    public double eval(final String str) {
        
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') {
                    nextChar();
                }
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                return x;
            }
            
            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if (eat('+')) {
                        x += parseTerm();
                    } 
                    else if (eat('-')) {
                        x -= parseTerm();
                    } 
                    else {
                        return x;
                    }
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (eat('*')) {
                        x *= parseFactor();
                    } 
                    else if (eat('÷')) {
                        x /= parseFactor();
                    } 
                    else if (eat('%')) {
                        x %= parseFactor();
                    } 
                    else {
                        return x;
                    }
                }
            }

            double parseFactor() {
                if (eat('+')) {
                    return parseFactor();
                }
                if (eat('-')) {
                    return -parseFactor();
                }
                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                }
                else if (eat('e')) {
                    x = Math.E;
                }
                else if (eat('π')) {
                    x = Math.PI;
                }
                else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') {
                        nextChar();
                    }
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                }
                else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                        nextChar();
                    }
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    switch (func) {
                        case "Sqrt":
                            x = Math.sqrt(x);
                            break;
                        case "Sin":
                            x = Math.sin(Math.toRadians(x));
                            break;
                        case "Cos":
                            x = Math.cos(Math.toRadians(x));
                            break;
                        case "Tan":
                            x = Math.tan(Math.toRadians(x));
                            break;
                        case "aSin":
                            x = Math.toDegrees(Math.asin(x));
                            break;
                        case "aCos":
                            x = Math.toDegrees(Math.acos(x));
                            break;
                        case "aTan":
                            x = Math.toDegrees(Math.atan(x));
                            break;
                        case "Log":
                            x = Math.log(x);
                            break;
                        case "Ln":
                            x = Math.log1p(x-1);
                            break;
                        default:
                            throw new RuntimeException("Unknown function: " + func);
                    }
                }
                else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                if (eat('^')) {
                    x = Math.pow(x, parseFactor());
                }
                return x;

            }
            
        }.parse();
        
    }
}





public class Main{

    
    public static void main(String[] args) {
        new Calculator();
    }
    
}
