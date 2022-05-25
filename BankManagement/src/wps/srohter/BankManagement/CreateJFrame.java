package wps.srohter.BankManagement;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Skylar Rohter
 * @return Created JFrame
 * @since Version 0.1
 */
public class CreateJFrame {
    public int width, height;

    public CreateJFrame(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void CreateFrame()  {
        JFrame mainFrame = new JFrame("BM Manager");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(width, height);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        // Add Buttons
        JButton manage = new JButton("Manage");    
        manage.hashCode(); 
    }
}
