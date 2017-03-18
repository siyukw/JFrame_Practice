import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

// an apple falling from the sky
public class Apple {
    public static void main(String arg[]) throws IOException {
        JFrame bg = new JFrame();
        // sky.setLayout(new GridBagLayout());
        bg.setVisible(true);
        bg.setSize(1000, 800);

        JPanel sky = new JPanel();
        sky.setBackground(new Color(103, 150, 200));
        sky.setLayout(new FlowLayout());
        bg.getContentPane().add(sky);


        BufferedImage apple = ImageIO.read(new File("appleRed.png"));
        JLabel appleDrop = new JLabel(new ImageIcon(apple));
        sky.add(appleDrop);



    }
}
