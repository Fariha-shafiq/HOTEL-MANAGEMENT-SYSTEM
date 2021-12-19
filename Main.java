/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//creating class for login 
 class Login extends JFrame  implements  ActionListener{
  
   private JLabel l1,l2;
   private JTextField t1;
   private JPasswordField t2;
   private JButton b1,b2;
   //creating constructor
    Login(){
   
        super("Login");

        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        l1.setForeground(Color.WHITE);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        l2.setForeground(Color.WHITE);
        add(l2);
 
        t1=new JTextField(); //textfield for username
        t1.setBounds(150,20,150,30);
        add(t1);

        t2=new JPasswordField(); // password field
        t2.setBounds(150,70,150,30);
        add(t2);
        
      

        b1 = new JButton("Login");// button for log in
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
 
   
    
        @Override
         public void actionPerformed(ActionEvent ae){
            if (ae.getSource() == b1) {
            String userText;
            String pwdText;
            userText = t1.getText();
            pwdText = t2.getText();
            if (userText.equalsIgnoreCase("admin") && pwdText.equalsIgnoreCase("1234")) { //set password for login
               new hotel().setVisible(true);//giving reference of bookin class
                this.setVisible(false);
             }else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password"); // display message if password or username is invalid
            }
             

}
         if (ae.getSource() == b2) {
         System.exit(0);
         
         }}}



public class Main extends Login implements ActionListener{ //this class inherits login class and display main window of project

        private JLabel l1;
    
     
        public Main() {
		
               setSize(1256,430);          
                setLayout(null);
                setLocation(300,300);

		l1 = new JLabel("");
                
				
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("\\javaapplication35\\hotel.jpg"));

                Image i3 = i1.getImage().getScaledInstance(1366, 1500,Image.SCALE_AREA_AVERAGING);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                
                    JLabel lid=new JLabel("FK HOTEL");
                    lid.setBounds(30,300,1500,100);
                lid.setFont(new Font("ALGERIAN",Font.PLAIN,70));
                lid.setForeground(Color.white);
                l1.add(lid);
                
              
		l1.setBounds(0, 0, 1366, 390);
		add(l1);
 
      
	}
     
        public static void main(String[] args) {
              
                Main window = new Main();
                window.setLayout(null);
                window.setVisible(true);
                window.setLocationRelativeTo(null);

}
}
