
package AWT_Examples;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

 
 class myframe5 extends Frame implements ActionListener {
     private Button b1;
     private Button b2;
    myframe5(){
        setTitle("My Frame");
        setBounds(100,200,400,400);
        b1=new Button("Change Color");
       b2=new Button("Quit App");
       
      
        
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
       
        b1.addActionListener(this);
         b2.addActionListener(this);
        
         setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
       Random rd=new Random();
       if(ae.getSource()==b1)
       {
           setBackground(new Color(rd.nextInt(255),rd.nextInt(255),rd.nextInt(255)));
       }else{
           System.exit(0);
       }
    }
    
    
    
}
public class Assignment1{
    public static void main(String[] args) {
       myframe5 mf=new myframe5(); 
       
    }
}
