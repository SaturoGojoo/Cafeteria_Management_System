import javax.swing.*;
public class simpleFrame{
    public static void main(String args[]){ 
        JFrame frame = new JFrame();
        frame.setTitle("Simple Frame"); 
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null); 
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button = new JButton();
        button.setText("Click me!");
        button.setBounds(50, 500, 150, 50);
        frame.add(button);
        frame.setVisible(true);
    }
}
        //JButton button2 = new JButton();
        //button2.setText("Close");
        //button2.setBounds(600, 500, 150, 50);
        //frame.add(button2);