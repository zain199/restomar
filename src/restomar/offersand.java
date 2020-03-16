/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restomar;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author etc
 */
public class offersand  extends JFrame{
    
    Date date = new Date();
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
    public offersand() {
        
        creation();
        proprities();
        addcom();
        
        s1plusButton();
        s1minusButton();
        s2plusButton();
        s2minusButton();
        s3plusButton();
        s3minusButton();
        saveButton();
    }

    private void creation() {
        background = new JLabel(new ImageIcon(getClass().getResource("pablo2 - Copy.png")));
        ts1=new JTextField("0");
        ts2 = new JTextField("0");
        ts3= new JTextField("0");
        s1plus=new JButton("+");
        s1minus = new JButton("-");
        s2plus=new JButton("+");
        s2minus=new JButton("-");
        s3plus=new JButton("+");
        s3minus=new JButton("-");
        s1= new JLabel();
        s2= new JLabel();
        s3= new JLabel();
        save = new JButton("Save");
        
    }

    private void addcom() {
        
        add(ts1);
        add(ts2);
        add(ts3);
        add(s1plus);
        add(s1minus);
        add(s2plus);
        add(s2minus);
        add(s3plus);
        add(s3minus);
        add(s1);
        add(save);
        add(s2);
        add(s3);
        add(background);
    }

    private void proprities() {
        
        //kebda 
        s1.setBounds(175, 25, 170, 50);
        s1.setText("سندوتش كبدة");
        s1.setFont(new Font("Tahoma",Font.BOLD,24));
        s1.setForeground(Color.white);         
        s1.setBackground(Color.black);
        
        
        //sgo2
        s2.setBounds(173, 130, 190, 50);
        s2.setText("سندوتش سجق");
        s2.setFont(new Font("Tahoma",Font.BOLD,24));
        s2.setForeground(Color.white);         
        s2.setBackground(Color.black);
        
        //hot dog
        s3.setBounds(155, 250, 230, 50);
        s3.setText("سندوتش هوت دوج");
        s3.setFont(new Font("Tahoma",Font.BOLD,24));
        s3.setForeground(Color.white);         
        s3.setBackground(Color.black);
        
        //save button
        save.setBounds(185,400,110,40);
        save.setFont(new java.awt.Font("Tahoma", 0, 15));
        save.setBackground(new java.awt.Color(0, 0, 0));  
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        // s1 text and + and - buttons 
        
        ts1.setBounds(160 , 90 , 170 , 30);
        ts1.setFont(new java.awt.Font("Tahoma", 0, 15));
        ts1.setBackground(Color.white);
        ts1.setEditable(false);
        ts1.setHorizontalAlignment(JTextField.CENTER);
        
        s1plus.setBounds(340, 90, 50, 30);
        s1plus.setFont(new java.awt.Font("Tahoma", 0, 15));
        s1plus.setBackground(new java.awt.Color(0, 0, 0));  
        s1plus.setForeground(new java.awt.Color(255, 255, 255));
        s1plus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        s1minus.setBounds(100, 90, 50, 30);
        s1minus.setFont(new java.awt.Font("Tahoma", 0, 15));
        s1minus.setBackground(new java.awt.Color(0, 0, 0));  
        s1minus.setForeground(new java.awt.Color(255, 255, 255));
        s1minus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        // s2 text and + and - buttons 
        
        ts2.setBounds(160 , 195 , 170 , 30);
        ts2.setFont(new java.awt.Font("Tahoma", 0, 15));
        ts2.setBackground(Color.white);
        ts2.setEditable(false);
        ts2.setHorizontalAlignment(JTextField.CENTER);
        
        s2plus.setBounds(340, 195, 50, 30);
        s2plus.setFont(new java.awt.Font("Tahoma", 0, 15));
        s2plus.setBackground(new java.awt.Color(0, 0, 0));  
        s2plus.setForeground(new java.awt.Color(255, 255, 255));
        s2plus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        s2minus.setBounds(100, 195, 50, 30);
        s2minus.setFont(new java.awt.Font("Tahoma", 0, 15));
        s2minus.setBackground(new java.awt.Color(0, 0, 0));  
        s2minus.setForeground(new java.awt.Color(255, 255, 255));
        s2minus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        // s2 text and + and - buttons 
        
        ts3.setBounds(160 , 315 , 170 , 30);
        ts3.setFont(new java.awt.Font("Tahoma", 0, 15));
        ts3.setBackground(Color.white);
        ts3.setEditable(false);
        ts3.setHorizontalAlignment(JTextField.CENTER);
        
        s3plus.setBounds(340, 315, 50, 30);
        s3plus.setFont(new java.awt.Font("Tahoma", 0, 15));
        s3plus.setBackground(new java.awt.Color(0, 0, 0));  
        s3plus.setForeground(new java.awt.Color(255, 255, 255));
        s3plus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        s3minus.setBounds(100, 315, 50, 30);
        s3minus.setFont(new java.awt.Font("Tahoma", 0, 15));
        s3minus.setBackground(new java.awt.Color(0, 0, 0));  
        s3minus.setForeground(new java.awt.Color(255, 255, 255));
        s3minus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        //background
        background.setBounds(0, 0, 500  , 500);
        
        
        setTitle("offers sandwich");
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);   
        setVisible(true);
        setResizable(false);
    }
    
    void s1plusButton()
    {
        s1plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int val = Integer.valueOf(ts1.getText());
                ts1.setText(String.valueOf(val+1));
            }
        });
    }
    
    void s1minusButton()
    {
        s1minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                int val = Integer.valueOf(ts1.getText());
                
                if(val > 0)
                ts1.setText(String.valueOf(val-1));
                
            }
        });
    }
    
    void s2plusButton()
    {
        s2plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int val = Integer.valueOf(ts2.getText());
                ts2.setText(String.valueOf(val+1));
            }
        });
    }
    
    void s2minusButton()
    {
        s2minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                int val = Integer.valueOf(ts2.getText());
                
                if(val > 0)
                ts2.setText(String.valueOf(val-1));
                
            }
        });
    }
    
    void s3plusButton()
    {
        s3plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int val = Integer.valueOf(ts3.getText());
                ts3.setText(String.valueOf(val+1));
            }
        });
    }
    
    void s3minusButton()
    {
        s3minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                int val = Integer.valueOf(ts3.getText());
                
                if(val > 0)
                ts3.setText(String.valueOf(val-1));
                
            }
        });
    }
    
    void saveButton()
    {
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    
                    String meal1="كبده";
                    String meal2="سجق";
                    String meal3="هوت_دوج";
                   String dir = System.getProperty("user.dir");
                    try {
                        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                    con = DriverManager.getConnection("jdbc:derby:"+dir+"\\Rest", "omar", "omar");
                    }
                    catch(ClassNotFoundException | SQLException ex) {
                           JOptionPane.showMessageDialog(getContentPane(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    String today= s.format(date); 
                
                    try {
                    st = con.prepareStatement("SELECT count(day) FROM OMAR.OFFERS where day = '"+today+"'");
                    ResultSet res = st.executeQuery();
                    res.next();
                    if(res.getInt(1)==0)
                    {
                        st = con.prepareStatement("insert into OMAR.OFFERS(day) values ('"+today+"')");
                        st.execute();
                    }
                    } catch (SQLException ex) {
                               JOptionPane.showMessageDialog(getContentPane(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
               
                    }
                    
                    try {
                      
                          st = con.prepareStatement("update OMAR.OFFERS set كبده = (select كبده from omar.offers WHERE day = '"+today+"' )+"+Integer.valueOf(ts1.getText())+" WHERE day = '"+today+"'");
                          st.executeUpdate();
                          
                           st = con.prepareStatement("update OMAR.OFFERS set سجق = (select سجق  from omar.offers WHERE day = '"+today+"' )+"+Integer.valueOf(ts2.getText())+" WHERE day = '"+today+"'");
                          st.executeUpdate();
                          
                           st = con.prepareStatement("update OMAR.OFFERS set هوت_دوج = (select هوت_دوج  from omar.offers WHERE day = '"+today+"' )+"+Integer.valueOf(ts3.getText())+" WHERE day = '"+today+"'");
                          st.executeUpdate();
                          
                          JOptionPane.showMessageDialog(getContentPane(), "DONE", "Message", JOptionPane.INFORMATION_MESSAGE);

                          
                    } catch (SQLException ex) {
                          JOptionPane.showMessageDialog(getContentPane(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }  
                                        
            }
        });
    }
    
    private JLabel background,s1,s2,s3 ;
    private JTextField ts1,ts2,ts3;
    private JButton save,s1plus,s1minus,s2plus,s2minus,s3plus,s3minus;
     private Connection con;
    private PreparedStatement st;
    
    //main
    public static void main(String[] args) {
        new offersand();
      
    }
}
