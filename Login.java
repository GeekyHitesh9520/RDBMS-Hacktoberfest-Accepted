import javax.swing.*;    
import java.awt.event.*; 
import java.awt.*; 
public class AhsvLogin {  
    public static void main(String[] args) { 
         Frame f = new Frame("  AHSV rEsTo.");
      
        f.setLocationByPlatform(true);
       Font fo = new Font("Gabriola",Font.BOLD,30);
        JLabel l1 = new JLabel("AHSV ReStO                                            ");
     l1.setBounds(200,35,400,50);
      l1.setFont(fo);
    
       
    
     
     final JPasswordField pv = new JPasswordField();   
     pv.setBounds(200,175,100,30);   
     JLabel c1=new JLabel(" Name:-");    
        c1.setBounds(110,120, 80,30);    
        JLabel p=new JLabel("Password:-");    
        p.setBounds(130,175, 80,30);    
        JButton b = new JButton("Login");  
        b.setBounds(210,210, 80,30);    
        final JTextField text = new JTextField();  
        text.setBounds(200,120, 100,30); 
        
        
              f.add(text);   f.add(c1); f.add(l1); 
              f.add(p);f.add(b);  f.add(pv); 
                f.setSize(500,300);    
                f.setLayout(null);    
                f.setVisible(true);  
                 f.setBackground(Color.yellow);
                b.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) {       
                  new Ahsv(); 
                 
                }  
             });   
}  
}