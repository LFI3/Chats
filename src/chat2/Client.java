package chat2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


import java.net.Socket;



public class Client extends Chat
{
    
    DataInputStream in;
    DataOutputStream out;
    Socket s;
    
    public Client()
    {
    setTitle("Client");
        

        
      bouton.addActionListener(new ActionListener() 
             {public void actionPerformed(ActionEvent e) 
              {
                 try {
                     String ch= "\nclient: "+msg.getText();
                      text.setText(text.getText()+ch); 
                      out.writeUTF(msg.getText());
                     
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
            s =new Socket("localhost", 3333);
             in=new DataInputStream(s.getInputStream());
             out=new DataOutputStream(s.getOutputStream());
            
            while(true)
            { 
             String c=in.readUTF();
             String ch= "\nserveur: "+c;
             text.setText(text.getText()+ch);
             if(c.equals("exit"))
             {
                 in.close();
                 out.close();
                 s.close();
                 System.exit(0);
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
         Client a = new Client();
         a.jouet();
       
        
        
    }
     
}