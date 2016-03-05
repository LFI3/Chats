/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chats;

/**
 *
 * @author Hachem
 */
public class Chats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        chatServer s = new chatServer();
       s.setBounds(700, 100, 500, 500);
        s.setVisible(true);
        
        chatClient c = new chatClient();
        c.setBounds(100, 100, 500, 500);
        c.setVisible(true);

    }
    
}
