import java.awt.*;
import javax.swing.*;

public class Apple extends JPanel throws IOExeption {

    public Apple() {
        // set the layout in the constructor
        super(new FlowLayout(FlowLayout.LEADING));

        // best not to set size OR preferred size!
        setPreferredSize( new Dimension(200,200) );

        JLabel lab1 = new JLabel("User Name");
        add(lab1);
    }

    public static void main(String[] args) {
        try {
        
        // construct the GUI on the EDT
        SwingUtilities.invokeLater( new Runnable() {
            public void run() {
                JFrame frame = new JFrame("User Details");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.getContentPane().add(new Apple());
                // important!
                frame.pack();

                frame.setVisible(true);
                
            } catch (IOExeption i) {
                System.out.println("An IOExeption was caught :" + i.getMessage());
                i.printStackTrace();
            }}
        });
    }
}

