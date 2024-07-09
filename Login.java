
package loginform;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;




public class Login  extends JFrame{

   private JLabel MainHeadingLabel;
   private JLabel SubHeadingLabel;
   
   private JTextField IDTextField;
   private JPasswordField PasswotdField;
   
   private JButton Login;
   
   private JPanel HeadingPanel;
   private JPanel MainHeadingPanel;
   private JPanel subHeadingPanel;
   
   private JPanel MainPanel;
   private JPanel SubPanel;
   
   private JPanel IdPasswordPanel;
   private JPanel ButtonPanel;
   private JCheckBox seePassword;

    public Login()  {
        
        MainHeadingLabel = new JLabel("Welcome back");
        MainHeadingLabel.setFont(new Font("SANS", Font.BOLD, 20));
        SubHeadingLabel = new JLabel("Your journey starts here.");
        SubHeadingLabel.setFont(new Font("SANS_SERIF", Font.CENTER_BASELINE, 15));

        IDTextField = new JTextField(10);
        
        IDTextField.setText("ID Number");
        PasswotdField = new JPasswordField(10);
        IDTextField.setText("ID Number");
        IDTextField.setBackground(new Color(250,250,245));
      

        IDTextField.setBorder(BorderFactory.createEmptyBorder());
        PasswotdField.setText("Password");
        PasswotdField.setEchoChar('\u0000');
         PasswotdField.addFocusListener(new FocusListenerPasswordField() );
        PasswotdField.setBorder(BorderFactory.createEmptyBorder());
        
        PasswotdField.setBackground(new Color(250,250,245));
        
        
        
       
        IDTextField.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        PasswotdField.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        Login = new JButton("Login");
        Login.setBackground(new Color(180,5,20));
        Login.setForeground(Color.white);
        Login.setFont(new Font("SANS", Font.BOLD, 20));
        
        
       

      Login.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


     Login.setBorder(BorderFactory.createEmptyBorder());
      
        
        
         Login .setFocusable(false);
         Login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
       
         
         Login.setBorderPainted(true);
         Login.addActionListener(new ActionListenerLogin());
         
        
        IDTextField.setBounds(70,10, 370,50);
        IDTextField.setMargin(new Insets(50, 50, 50, 60));
        IDTextField.setFont(new Font("Consoles",Font.CENTER_BASELINE,15));
        PasswotdField.setFont(new Font("Consoles",Font.CENTER_BASELINE,15));
        PasswotdField.setBounds(70,70, 370,50);
         seePassword=new JCheckBox("");
         seePassword.setBounds(440,70,60,50);
         seePassword.setFocusable(false);
         seePassword.addActionListener(new ActionListenerSeePasssword() );
        Login .setBounds(70,130, 370,50);
        
        
        MainHeadingPanel = new JPanel();
        MainHeadingPanel.add(MainHeadingLabel);
        MainHeadingPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
        
        subHeadingPanel = new JPanel();
        subHeadingPanel.add(SubHeadingLabel);
        
        HeadingPanel = new JPanel();
        
        HeadingPanel.setLayout(new GridLayout(2,1,1,1));
        HeadingPanel.add(MainHeadingPanel);
        HeadingPanel.add(subHeadingPanel);
         HeadingPanel.add(subHeadingPanel);
        

     
        SubPanel = new JPanel();
        SubPanel.setPreferredSize(new Dimension(50,50));
        SubPanel.setLayout(null);
        SubPanel.add(IDTextField);
        SubPanel.add(PasswotdField);
        SubPanel.add(seePassword);
        SubPanel.add(Login);
        
        seePassword.setBackground(Color.white);
        MainHeadingPanel.setBackground(Color.white);
        subHeadingPanel.setBackground(Color.white);
        HeadingPanel.setBackground(Color.white);
        SubPanel.setBackground(Color.white);
        //MainPanel.setBackground(Color.white);
        
        
        //SubPanel.add(ButtonPanel);
        MainPanel = new JPanel();
        
        
        MainPanel.setLayout(new BorderLayout());
        MainPanel.add(HeadingPanel, BorderLayout.NORTH);
        MainPanel.add(SubPanel, BorderLayout.CENTER);
        
        

          MainPanel.setBackground(Color.YELLOW);
           
         
         //Frame
         this.setTitle("Login");
         this.setSize(500,400);
         this.setLocation(500,200);
         this.setResizable(false);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         this.add(MainPanel);
       

         this.setVisible(true);
         
         

         
         
         
         
         
         
         
         
         
         
         
        
        
    }
    
    
     private class  ActionListenerSeePasssword implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(seePassword.isSelected()){
                 PasswotdField.setEchoChar('\u0000');
            }
            else{
               PasswotdField.setEchoChar('*'); 
            }
        }
         
     }
   
   private class  FocusListenerIDTextField  implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
           
            IDTextField.setText("");
        }

        @Override
        public void focusLost(FocusEvent e) {
            IDTextField.setText("ID number");
        }
   
   }
   
   
   
    private class ActionListenerLogin implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Welcome Back");
             IDTextField.setText("ID number");
             PasswotdField.setText("PassWord");
        }

       
      
  }       
           
           
  private class FocusListenerPasswordField implements  FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
           PasswotdField.setEchoChar('*');
        }

        @Override
        public void focusLost(FocusEvent e) {
           PasswotdField.setEchoChar('*');
        }
      
  }
}
