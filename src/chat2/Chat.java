
package chat2;

import javax.swing.*;


public class Chat extends JFrame
{
    public static final int x=500;
    public static final int y1=350;
    public static final int y2=100;
    public static final int x1=350;
    public static final int x2=150;
    
    public  JTextArea text;
    public JTextField msg;
    public JButton bouton;
    
    public Chat()
    {
        text=new JTextArea();
        msg=new JTextField();
        bouton=new JButton("envoyer");
       
        setVisible(true);
        setBounds(100,100,x,x);
        setLayout(null);
        setTitle("fentre");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        text.setBounds(0, 0, x, y1);
        msg.setBounds(0, y1, x1, y2);
        bouton.setBounds(x1, y1, x2, y2);
    
        add(text);
        add(msg);
        add(bouton);
    }
   
}
