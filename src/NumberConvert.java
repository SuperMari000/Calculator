
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


/**
 *
 * @author Mostafa Mounir Shehab
 * 
 * User Name : Super Mari000
 * 
 */

public class NumberConvert extends JFrame {
    
    private Container container;
    private GroupLayout groupLayout; 
    private JTextField tfDec, tfBin, tfHex, tfOct;
    private JLabel lbDec, lbBin, lbHex, lbOct;
    private JButton convert, close;
    private NumberBase num;
    
    public NumberConvert(){
        
        num = new NumberBase();
        
        
        lbDec=new JLabel("DEC");
        lbDec.setFont(new Font(Font.SANS_SERIF,30,13));
        lbDec.setHorizontalAlignment(SwingConstants.CENTER);
        
        tfDec = new JTextField();
        tfDec.setBackground(new Color(211, 211, 211));
        tfDec.setHorizontalAlignment(SwingConstants.CENTER);
        tfDec.setFont(new Font("Dialog", Font.BOLD, 13));
        tfDec.setMargin(new Insets(3,3,3,3));
        tfDec.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearData();
            }
        });
        tfDec.setColumns(11);
        
        
        
        lbBin=new JLabel("BIN");
        lbBin.setFont(new Font(Font.SANS_SERIF,30,13));
        lbBin.setHorizontalAlignment(SwingConstants.CENTER);
        
        tfBin = new JTextField();
        tfBin.setBackground(new Color(211, 211, 211));
        tfBin.setHorizontalAlignment(SwingConstants.CENTER);
        tfBin.setFont(new Font("Dialog", Font.BOLD, 13));
        tfBin.setMargin(new Insets(3,3,3,3));
        tfBin.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearData();
            }
        });
        tfBin.setColumns(11);
        
        
        lbHex=new JLabel("HEX");
        lbHex.setFont(new Font(Font.SANS_SERIF,30,13));
        lbHex.setHorizontalAlignment(SwingConstants.CENTER);
        
        tfHex = new JTextField();
        tfHex.setBackground(new Color(211, 211, 211));
        tfHex.setHorizontalAlignment(SwingConstants.CENTER);
        tfHex.setFont(new Font("Dialog", Font.BOLD, 13));
        tfHex.setMargin(new Insets(3,3,3,3));
        tfHex.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                clearData();
            }
        });
        tfHex.setColumns(11);
        
        
        lbOct=new JLabel("OCT");
        lbOct.setFont(new Font(Font.SANS_SERIF,30,13));
        lbOct.setHorizontalAlignment(SwingConstants.CENTER);
        
        tfOct = new JTextField();
        tfOct.setBackground(new Color(211, 211, 211));
        tfOct.setHorizontalAlignment(SwingConstants.CENTER);
        tfOct.setFont(new Font("Dialog", Font.BOLD, 13));
        tfOct.setMargin(new Insets(3,3,3,3));
        tfOct.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                    clearData();
            }
        });
        tfOct.setColumns(11);
        
        
        convert=new JButton("Convert");
        convert.setBackground(Color.GREEN);
        convert.setForeground(Color.WHITE);
        
        close=new JButton("Close");
        close.setBackground(Color.RED);
        close.setForeground(Color.WHITE);
        
        
        creatLayout();
        actions();
        
        
        setTitle("❤ Number BASE ❤");
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    
    public void actions(){
        
        convert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tf_dec= tfDec.getText();
                String tf_oct= tfOct.getText();
                String tf_bin= tfBin.getText();
                String tf_hex= tfHex.getText();
                if(tf_dec.length()>0) {
                    num.set_dec(tf_dec);
                    setData();
                }
                else if(tf_bin.length()>0) {
                    num.set_bin(tf_bin);
                    setData();
                }
                else if(tf_hex.length()>0) {
                    num.set_hex(tf_hex);
                    setData();
                }
                else if(tf_oct.length()>0) {
                    num.set_oct(tf_oct);
                    setData();
                }
                else {
                    setData();
                }

            }
        });

        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });
    }
    
    public void creatLayout(){
        container = this.getContentPane();
        groupLayout = new GroupLayout(container);
        container.setLayout(groupLayout);
        
      
        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);
        groupLayout.preferredLayoutSize(container);
        
        
        groupLayout.setHorizontalGroup(
            groupLayout.createSequentialGroup()
                
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lbDec)
                    .addComponent(lbBin)
                    .addComponent(lbHex)
                    .addComponent(lbOct)
                )
                
                .addGap(30)   
                
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(tfDec, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBin, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHex, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfOct, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
 
                    
                    .addGroup(groupLayout.createSequentialGroup()
                        .addComponent(convert, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addGap(40)
                        .addComponent(close, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    )
                )
        );
        
        groupLayout.setVerticalGroup(
            groupLayout.createSequentialGroup()
                
                .addGap(30)
                    
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDec)
                    .addComponent(tfDec, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                )
                    
                .addGap(30)
                    
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBin)
                    .addComponent(tfBin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                )
                    
                .addGap(30)    
                    
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHex)
                    .addComponent(tfHex, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                )
                    
                .addGap(30)
                    
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOct)
                    .addComponent(tfOct, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                )
                    
                .addGap(30)
                    
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(convert, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                )
                .addGap(30)
        );
    }
    
    public void setData() {
        clearData();
        tfDec.setText(num.get_dec());
        tfOct.setText(num.get_oct());
        tfBin.setText(num.get_bin());
        tfHex.setText(num.get_hex());
    }
    
    public void clearData() {
        tfDec.setText("");
        tfOct.setText("");
        tfBin.setText("");
        tfHex.setText("");
    }
    
}
