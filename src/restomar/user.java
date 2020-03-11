package restomar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PrinterException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


public class user extends JFrame{
    
 
     
   public static JTextArea reciept = new JTextArea();  
    HashMap<String, String> mp = new HashMap<>();
    HashMap<String, String> bill = new HashMap<>();
    Date date = new Date();
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
    
    user()
    {
        creation();
        proprities();
        addcom();
        initMap();
        btn1OnClick();btn2OnClick();btn3OnClick();btn4OnClick();
        btn5OnClick();btn7OnClick();btn6OnClick();
        pen1OnClick();pen2OnClick();pen3OnClick();
        btn8OnClick();btn9OnClick();btn10OnClick();
        btn11OnClick();btn12OnClick();btn13OnClick();
        btn14OnClick();btn15OnClick();btn16OnClick();
        btn17OnClick();clearOnClick();removeOnClick();
        totalOnClick();printOnClick();offer4OnClick();
        
        
    }
    

    private void initMap()
    {
        mp.put("سجق","سجق");
        mp.put("كبدة", "كبده");
        mp.put("هوت دوج", "هوت_دوج");
        mp.put("سكلانس", "سكلانس");
        mp.put("مكرونة كبدة اسباجتي", "مكرونه_كبده_اسباكتي");
        mp.put("مكرونة كبدة بينا", "مكرونه_كبده_بينا");
        mp.put("مكرونه سجق اسباجتي", "مكرونه_سجق_اسباكتي");
        mp.put("مكرونه سجق بينا", "مكرونه_سجق_بينا");
        mp.put("مكرونه هوت دوج بينا", "مكرونه_هوت_دوج_بينا");
        mp.put("مكرونه هوت دوج اسباجتي", "مكرونه_هوت_دوج_اسباكتي");          
        mp.put("2 سندوتش+ مكرونه  + بطاطس + بيبسي ", "العرض_الاول");
        mp.put("4 سندوتش + مكرونه بالجبنه + بطاطس + بيبسي", "العرض_التاني");
        mp.put("20 سندوتش ", "العرض_التالت");
        mp.put("بطاطس وسط", "بطاطس_وسط");
        mp.put("بطاطس كبير", "بطاطس_كبير");
        mp.put("بيبسي", "بيبسي");
        mp.put("جبنة", "جبنه");
        mp.put("مخلل", "مخلل");
        mp.put("حلاوة قشطة", "حلاوة_قشطة");
        mp.put("مربي", "مربي");
        mp.put(offer4.getText(), "العرض_الرابع");
        
        
        bill.put("سجق","sausage");
        bill.put("كبدة", "liver");
        bill.put("هوت دوج", "Hot dog");
        bill.put("سكلانس", "Sklans");
        bill.put("مكرونة كبدة اسباجتي", "Spaghetti Liver");
        bill.put("مكرونة كبدة بينا", "Penna Liver");
        bill.put("مكرونه سجق اسباجتي", "Spaghetti Sausage");
        bill.put("مكرونه سجق بينا", "Penna Sausage");
        bill.put("مكرونه هوت دوج بينا", "Penne hot dog");
        bill.put("مكرونه هوت دوج اسباجتي", "Hot dog spaghetti");          
        bill.put("4 سندوتش + مكرونه بالجبنه + بطاطس + بيبسي", "4 sandwich + pasta + fries + Pepsi");
        bill.put(btn10.getText(), "20 sandwiches + fries + Pepsi");
        bill.put("بطاطس وسط", "Medium fries");
        bill.put("بطاطس كبير", "Large fries");
        bill.put("بيبسي", "Pepsi");
        bill.put("مخلل", "pickled");
        bill.put("حلاوة قشطة", "Sour cream");
        bill.put("مربي", "Jam");
        bill.put(offer4.getText(), "4 sandwich + fries + Pepsi");
    }
    
   
  
  
    /* ------------------------ creation --------------*/
    private void creation()
    {
           sandwitsh= new JLabel();
           Macarons= new JLabel();
           offers= new JLabel();
           background= new JLabel();
           additions=new JLabel();
           btn1=new JButton("سجق");
           btn2=new JButton("كبدة");
           btn3=new JButton("هوت دوج");
           btn4=new JButton("سكلانس");
           btn5=new JButton("مكرونة كبدة");
           btn6=new JButton("مكرونه سجق");
           btn7=new JButton("مكرونه هوت دوج");
           btn8=new JButton("2 سندوتش+ مكرونه  + بطاطس + بيبسي ");
           btn9=new JButton("4 سندوتش + مكرونه بالجبنه + بطاطس + بيبسي");
           btn10=new JButton("20 سندوتش ");
           btn11 =new JButton("بطاطس وسط");
           btn12=new JButton("بطاطس كبير");
           btn13=new JButton("بيبسي");
           btn14=new JButton("جبنة");
           btn15=new JButton("مخلل");
           btn16=new JButton("حلاوة قشطة");
           offer4= new JButton("4 سندوتش + بطاطس + بيبسي");
           btn17=new JButton("مربي");
           jScrollPane1 = new javax.swing.JScrollPane();
           jTable1 = new javax.swing.JTable();
           print =new JButton("Print");
           clear=new JButton("Clear");
           remove=new JButton("Remove");
           total= new JButton("Total");
           tprice= new JLabel();
           spaghetti= new JLabel();
           penna = new JLabel();
           p= new JPanel();
           pen1=new JButton("مكرونة كبدة");
           pen2=new JButton("مكرونه سجق");
           pen3=new JButton("مكرونه هوت دوج");
         
    }
    
    /* ----------------------------properties----------------------------------- */
    private void proprities ()
    {
        //label sandwitch
        sandwitsh.setBounds(1075, 5, 100, 50);
        sandwitsh.setEnabled(true);
        sandwitsh.setText("Sandwich");
        sandwitsh.setFont(new Font("Arial Narrow",Font.BOLD,25));
        sandwitsh.setForeground(Color.white);         
        sandwitsh.setBackground(Color.black);
        
        // sandwith buttons 
        btn1.setBounds(1070,75,110,40);
        btn1.setBackground(new java.awt.Color(0, 0, 0));  
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        btn2.setBounds(930,75,110,40);
        btn2.setBackground(new java.awt.Color(0, 0, 0));  
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        btn3.setBounds(790,75,110,40);
        btn3.setBackground(new java.awt.Color(0, 0, 0));  
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        btn4.setBounds(650,75,110,40);
        btn4.setBackground(new java.awt.Color(0, 0, 0));  
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        //macron label
        Macarons.setBounds(1075,135, 100, 50);
        Macarons.setEnabled(true);
        Macarons.setText("Macarons");
        Macarons.setFont(new Font("Arial Narrow",Font.BOLD,25));
        Macarons.setForeground(Color.white);         
        Macarons.setBackground(Color.black);
        
        //spaghatti label
        spaghetti.setBounds(800,165, 100, 50);
        spaghetti.setEnabled(true);
        spaghetti.setText("Spaghetti");
        spaghetti.setFont(new Font("Arial Narrow",Font.BOLD,20));
        spaghetti.setForeground(Color.white);         
        spaghetti.setBackground(Color.black);
        
        //spaghetti buttons
        btn5.setBounds(1070,205,110,40);
        btn5.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn5.setBackground(new java.awt.Color(0, 0, 0));  
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        btn6.setBounds(930,205,110,40);
        btn6.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn6.setBackground(new java.awt.Color(0, 0, 0));  
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        btn7.setBounds(790,205,110,40);
        btn7.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn7.setBackground(new java.awt.Color(0, 0, 0));  
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        //penna label
        penna.setBounds(800,240, 100, 50);
        penna.setEnabled(true);
        penna.setText("Penna");
        penna.setFont(new Font("Arial Narrow",Font.BOLD,20));
        penna.setForeground(Color.white);         
        penna.setBackground(Color.black);
        
        //penna buttons
        pen1.setBounds(1070,280,110,40);
        pen1.setFont(new java.awt.Font("Tahoma", 0, 15));
        pen1.setBackground(new java.awt.Color(0, 0, 0));  
        pen1.setForeground(new java.awt.Color(255, 255, 255));
        pen1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        pen2.setBounds(930,280,110,40);
        pen2.setFont(new java.awt.Font("Tahoma", 0, 15));
        pen2.setBackground(new java.awt.Color(0, 0, 0));  
        pen2.setForeground(new java.awt.Color(255, 255, 255));
        pen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        pen3.setBounds(790,280,110,40);
        pen3.setFont(new java.awt.Font("Tahoma", 0, 15));
        pen3.setBackground(new java.awt.Color(0, 0, 0));  
        pen3.setForeground(new java.awt.Color(255, 255, 255));
        pen3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        
        //offers label
        offers.setBounds(1090, 340, 100, 50);
        offers.setEnabled(true);
        offers.setText("Offers");
        offers.setFont(new Font("Arial Narrow",Font.BOLD,25));
        offers.setForeground(Color.white);         
        offers.setBackground(Color.black);
        
        //offers buttons 
       /* btn8.setBounds(810,390,350,40);
        btn8.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn8.setBackground(new java.awt.Color(0, 0, 0));  
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));*/
        btn9.setBounds(810,390,350,40);
        btn9.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn9.setBackground(new java.awt.Color(0, 0, 0));  
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        btn10.setBounds(810,450,350,40);
        btn10.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn10.setBackground(new java.awt.Color(0, 0, 0));  
        btn10.setForeground(new java.awt.Color(255, 255, 255));
        btn10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        offer4.setBounds(810,510,350,40);
        offer4.setFont(new java.awt.Font("Tahoma", 0, 15));
        offer4.setBackground(new java.awt.Color(0, 0, 0));  
        offer4.setForeground(new java.awt.Color(255, 255, 255));
        offer4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        //label additions 
        additions.setBounds(450, 5, 100, 50);
        additions.setEnabled(true);
        additions.setText("Additions");
        additions.setFont(new Font("Arial Narrow",Font.BOLD,25));
        additions.setForeground(Color.white);         
        additions.setBackground(Color.black);
        
        //additions buttons 
        btn11.setBounds(450,75,110,40);
        btn11.setBackground(new java.awt.Color(0, 0, 0));  
        btn11.setForeground(new java.awt.Color(255, 255, 255));
        btn11.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        btn12.setBounds(310,75,110,40);
        btn12.setBackground(new java.awt.Color(0, 0, 0));  
        btn12.setForeground(new java.awt.Color(255, 255, 255));
        btn12.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        btn13.setBounds(170,75,110,40);
        btn13.setBackground(new java.awt.Color(0, 0, 0));  
        btn13.setForeground(new java.awt.Color(255, 255, 255));
        btn13.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
      /*  btn14.setBounds(30,75,110,40);
        btn14.setBackground(new java.awt.Color(0, 0, 0));  
        btn14.setForeground(new java.awt.Color(255, 255, 255));
        btn14.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));*/
        btn15.setBounds(450,135,110,40);
        btn15.setBackground(new java.awt.Color(0, 0, 0));  
        btn15.setForeground(new java.awt.Color(255, 255, 255));
        btn15.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        btn16.setBounds(310,135,110,40);
        btn16.setBackground(new java.awt.Color(0, 0, 0));  
        btn16.setForeground(new java.awt.Color(255, 255, 255));
        btn16.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        btn17.setBounds(170,135,110,40);
        btn17.setBackground(new java.awt.Color(0, 0, 0));  
        btn17.setForeground(new java.awt.Color(255, 255, 255));
        btn17.setFont(new java.awt.Font("Tahoma", 0, 15));
        btn17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        
        //table
        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
               
            },
            new String [] {
                "العدد", "الصنف", "السعر"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };
            
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
       
        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        jScrollPane1.setBounds(50,200,500,300);
        
        
        //button total
        total.setBounds(60, 510, 100, 35);
        total.setBackground(new java.awt.Color(0, 0, 0));  
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setFont(new java.awt.Font("Tahoma", 0, 15));
        total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        //label tprice
        tprice.setBounds(185, 500, 100, 50);
        tprice.setEnabled(true);
        tprice.setText("0");
        tprice.setFont(new Font("Arial Narrow",Font.BOLD,25));
        tprice.setForeground(Color.white);         
        tprice.setBackground(Color.black);
        
        //print button 
        print.setBounds(80,580,135,40);
        print.setBackground(new java.awt.Color(0, 0, 0));  
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setFont(new java.awt.Font("Tahoma", Font.BOLD, 17));
        print.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        //clear button 
        clear.setBounds(225,580,135,40);
        clear.setBackground(new java.awt.Color(0, 0, 0));  
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Tahoma", Font.BOLD, 17));
        clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        //remove button 
        remove.setBounds(370,580,135,40);
        remove.setBackground(new java.awt.Color(0, 0, 0));  
        remove.setForeground(new java.awt.Color(255, 255, 255));
        remove.setFont(new java.awt.Font("Tahoma", Font.BOLD, 17));
        remove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(190, 20, 20), 2));
        
        //background
        background.setBounds(0, 0, 1200, 700);
        background.setIcon(new ImageIcon(getClass().getResource("pablo2.png")));
        
        p.setBounds(0,0, 1200, 700);
        p.setLayout(null);
        
        setTitle("Menu");
        setLayout(null);
        setSize(1200, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);   
        setVisible(true);
        setResizable(false);
        
    }
    
    
        /* -------------------------add component---------------------------- */
    private void addcom()
    {
        
        add(sandwitsh);
        add(Macarons);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(offers);
        add(btn8);
        add(btn9);
        add(btn10);
        add(additions);
        add(btn11);
        add(btn12);
        add(btn13);
        add(btn14);
        add(btn15);
        add(offer4);
        add(btn16);
        add(btn17);
        add(total);
        add(tprice);
        add(print);
        add(remove);
        add(clear);
        add(spaghetti);
        add(penna);
        add(pen1);
        add(pen2);
        add(pen3);
         add(jScrollPane1);
         
         add(background);
     
       
        
        
        
       
    
    }
    
    
    /**************** handled buttons *******************/
    private void btn1OnClick()
    {
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn1.getText().toString(),6});
            }
        });
    }
    
    private void btn2OnClick()
    {
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn2.getText().toString(),8});
                
            }
        });
    }
    
    private void btn3OnClick()
    {
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn3.getText().toString(),6});
                
            }
        });
    }
    
    private void btn4OnClick()
    {
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn4.getText().toString(),6});
                
            }
        });
    }
    
    private void btn5OnClick()
    {
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn5.getText()+" اسباجتي".toString(),20});
                
            }
        });
    }
    
    private void btn6OnClick()
    {
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn6.getText().toString()+" اسباجتي",20});
                
            }
        });
    }
    
    private void btn7OnClick()
    {
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn7.getText()+" اسباجتي".toString(),20});
                
            }
        });
    }
    
    private void pen1OnClick()
    {
        pen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,pen1.getText()+" بينا".toString(),20});
                
            }
        });
    }
    
    private void pen2OnClick()
    {
        pen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,pen2.getText()+" بينا".toString(),20});
                
            }
        });
    }
    
    private void pen3OnClick()
    {
        pen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,pen3.getText()+" بينا".toString(),20});
                
            }
        });
    }
    
    private void btn8OnClick()
    {
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn8.getText().toString(),35});
                
            }
        });
    }
    
    private void btn9OnClick()
    {
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn9.getText().toString(),50});
                
            }
        });
    }
    
    private void btn10OnClick()
    {
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn10.getText().toString(),120});
                
            }
        });
    }
    
    private void offer4OnClick()
    {
        offer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,offer4.getText().toString(),30});
                
            }
        });
    }
    
    private void btn11OnClick()
    {
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn11.getText().toString(),7});
                
            }
        });
    }
    
    private void btn12OnClick()
    {
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn12.getText().toString(),10});
                
            }
        });
    }
    
    private void btn13OnClick()
    {
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn13.getText().toString(),5});
                
            }
        });
    }
    
    private void btn14OnClick()
    {
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn14.getText().toString(),5});
                
            }
        });
    }
    
    private void btn15OnClick()
    {
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn15.getText().toString(),1});
                
            }
        });
    }
    
    private void btn16OnClick()
    {
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn16.getText(),5});
                
            }
        });
    }
    
    private void btn17OnClick()
    {
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(new Object[]{1,btn17.getText().toString(),5});
                
            }
        });
    }
    
    private void clearOnClick()
    {
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
                if(model.getRowCount()==0)
                {
                   JOptionPane.showMessageDialog(getContentPane(), "No Order Yet", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);

                }else 
                {
                        tprice.setText("0");
                        jTable1.setModel(new DefaultTableModel(
                      new Object [][] {

                      },
                      new String [] {
                          "العدد", "الصنف", "السعر"
                      }
                  ) {
                      Class[] types = new Class [] {
                          java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
                      };
                      boolean[] canEdit = new boolean [] {
                          true, false, false
                      };

                      @Override
                      public Class getColumnClass(int columnIndex) {
                          return types [columnIndex];
                      }

                      @Override
                      public boolean isCellEditable(int rowIndex, int columnIndex) {
                          return canEdit [columnIndex];
                      }
                  });
                }
           
                
            }
        });
        
        
    }
    
    private void removeOnClick()
    {
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
                if(model.getRowCount()==0)
                {
                   JOptionPane.showMessageDialog(getContentPane(), "No Order Yet", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);

                }else 
                {
                for(int i = 0 ; i < model.getRowCount();++i)
                {
                    if(jTable1.isRowSelected(i))
                    {
                        int val = Integer.parseInt(tprice.getText()); 
                        val = val - ((int)model.getValueAt(i, 0)*(int)model.getValueAt(i, 2));
                        val= Math.max(val,0);
                        tprice.setText(Integer.toString(val));
                        model.removeRow(jTable1.getSelectedRow());
                    }
                }
                
            }
            }
        });
    }

    private void totalOnClick()
    {
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                int tot = 0 ;
                for( int i = 0 ; i < model.getRowCount();++i)
                        tot += ((int)model.getValueAt(i,0)*(int)model.getValueAt(i,2));
                
                tprice.setText(Integer.toString(tot));
                
             
                
            }
        });
    }    
    
    
     private void printOnClick()
    {
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                if(model.getRowCount()>0)
                {
                    String dir = System.getProperty("user.dir");
                    try {
                    Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                    con = DriverManager.getConnection("jdbc:derby:"+dir+"\\Rest", "omar", "omar");
                } catch (ClassNotFoundException | SQLException ex) {
                           JOptionPane.showMessageDialog(getContentPane(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                String today= s.format(date); 
                
                    try {
                    st = con.prepareStatement("SELECT count(day) FROM OMAR.MENU where day = '"+today+"'");
                    ResultSet res = st.executeQuery();
                    res.next();
                    if(res.getInt(1)==0)
                    {
                        st = con.prepareStatement("insert into omar.MENU(day) values ('"+today+"')");
                        st.execute();
                    }
                    } catch (SQLException ex) {
                               JOptionPane.showMessageDialog(getContentPane(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
               
                    }
             
                
                
               int num = 0 ; String meal="" ,meal2="" ;
               
               boolean ok = true;
                for( int i = 0 ; i < model.getRowCount();++i)
                {
                    num = ((int)model.getValueAt(i,0));
                    meal = ((String)model.getValueAt(i,1));
                    meal2 = mp.get(meal);
                    
                    
                   
                    try {
                      
                          st = con.prepareStatement("update omar.menu set "+meal2+"= (select "+meal2+" from omar.menu WHERE day = '"+today+"' )+"+num+" WHERE day = '"+today+"'");
                          st.executeUpdate();
                           
                    
                    } catch (SQLException ex) {
                        ok = false ;
                               JOptionPane.showMessageDialog(getContentPane(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }                   
                } 
                if(ok)
                {
                    
                    
                try {
                    
                   reciept.setFont(new java.awt.Font("Calibri Light", 0, 8));
                     reciept.setText("********************************************\n"
                             + "                              اكل لوكال\n"
                             + "********************************************\n"
                             + " num            item             price \n"
                             + "********************************************\n"
          
                     );
                      
                     for( int i = 0 ; i < model.getRowCount();++i)
                    {
                        
                        
                        reciept.setText(reciept.getText()+" "+model.getValueAt(i,0).toString());
                        for (int xx = model.getValueAt(i,0).toString().length() ; xx <5;++xx)
                             reciept.setText(reciept.getText()+" ");
                        
                        
                        String temp = bill.get(model.getValueAt(i,1).toString());
                        /*for(int xx = temp.length() ; xx<32 ;++xx)
                            temp+=" ";*/
                         reciept.setText(reciept.getText()+temp);
                        
                        for (int xx = bill.get(model.getValueAt(i,1).toString()).length() ; xx<35;++xx)
                             reciept.setText(reciept.getText()+" ");
                        
                        
                        
                         reciept.setText(reciept.getText()+model.getValueAt(i,2).toString());
                        for (int xx = model.getValueAt(i,2).toString().trim().length() ; xx <3;++xx)
                            reciept.append(" ");
                        
                         reciept.setText(reciept.getText()+"\n");
                    }
                     
                      reciept.setText(reciept.getText()+"********************************************\n");
                      reciept.setText(reciept.getText()+"TOTAL                                   "+tprice.getText()+" LE\n");
                      reciept.setText(reciept.getText()+"********************************************\n");
                      reciept.setText(reciept.getText()+"   DATE : "+s.format(date).toString()+"\n");
                      s= new SimpleDateFormat("hh:mm:ss");
                      reciept.setText(reciept.getText()+"   TIME : "+s.format(date).toString()+"  \n\n");
                     
                     
                      reciept.setText(reciept.getText()+"          copyrights reserved for O.A team\n");
                      reciept.setText(reciept.getText()+"                            Thank You\n");
                     reciept.setText(reciept.getText()+"********************************************\n");
                    
                     /*test f1 = new test();
                     f1.setVisible(true);*/
                    
                     
                    reciept.print();
                    s= new SimpleDateFormat("yyyy-MM-dd");
                } catch (PrinterException ex) {
                    Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
                }
                    JOptionPane.showMessageDialog(getContentPane(), "Printed Success", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                else 
                     JOptionPane.showMessageDialog(getContentPane(), "There Is a Ploblem", "Error", JOptionPane.ERROR_MESSAGE);
                
                }else 
                     JOptionPane.showMessageDialog(getContentPane(), "No Order", "Error", JOptionPane.ERROR_MESSAGE);
                    
                
                
            }
        });
    } 
       
                    
                
               
                 
                
                
    // ui    
    private JLabel sandwitsh,background,Macarons,offers,additions, tprice,spaghetti , penna ;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17;
    private JButton print , clear , remove, total,pen1,pen2,pen3,offer4;
    private JPanel p;
    private JTable jTable1;
    private JScrollPane jScrollPane1;
    private Connection con;
    private PreparedStatement st;

    //main
    public static void main(String[] args) {
        new user();
      
    }
}