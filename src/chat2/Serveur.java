
package chat2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Serveur extends Chat 
{
    private static final int port=3333;
     DataInputStream in;
     DataOutputStream out;
     Socket s;
     ServerSocket ss;
     boolean valide;
     Serveur()
      {
            valide=true;
            setTitle("Serveur");
            bouton.addActionListener(new ActionListener() 
             {public void actionPerformed(ActionEvent e) 
              {
                 try 
                 {
                      String ch= "\nserveur: "+msg.getText();
                      text.setText(text.getText()+ch); 
                      out.writeUTF(msg.getText());
                      if(msg.getText().equals("exit"))
                          valide=false;
                     
                 } catch (IOException ex) 
                 {
                       System.out.println(ex.getMessage());
                 }
              }
             });
        
    
    }
    
    
   public void jouet()
    {
       try 
        {
             ss=new ServerSocket(port); 
           while(true) 
           {
              s=ss.accept();   
              in=new DataInputStream(s.getInputStream());
              out = new DataOutputStream(s.getOutputStream());
              while(valide)
              { 
                String ch= "\nclient: "+in.readUTF();
                text.setText(text.getText()+ch);
              }
              
           }   
        
        } 
        catch (Exception ex) 
        {
            System.out.println("Exception");
        }
    }  
     public static void main(String[] arg)
    {
         Serveur a = new Serveur();
         a. jouet();
         
          
        
     
        
    }

    
}
