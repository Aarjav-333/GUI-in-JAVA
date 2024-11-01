import javax.swing.*;
import java.awt.*;

public class b_main {
    public static void main(String[] args) {

        // label
        JLabel jb = new JLabel(); // label instance
        jb.setText("Thalapathy Vijay"); // label text
        ImageIcon image = new ImageIcon("VJ.jpg"); // initialize image to ImageIcon instance
        jb.setIcon(image);// set image
        jb.setBackground(Color.black); // label background
        jb.setOpaque(true); // set opacity to full(then only we canm see the colours)
        jb.setFont(new Font("MV boli", Font.BOLD, 100)); // set font
        Color cr = Color.decode("#fc0505"); // decode hexadecimal colour value
        jb.setForeground(cr); // set font colour
        jb.setHorizontalTextPosition(JLabel.CENTER); // horizontal position of the text inside the frame
        jb.setVerticalTextPosition(JLabel.TOP);// vertical position of the text inside the frame
        jb.setBounds(280, 70, 900, 900); // set the boundary of the frame

        // Frame
        JFrame jf = new JFrame();
        jf.setTitle("HI THERE"); // title name
        jf.setSize(700, 700); // frame size
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close button function
        jf.setResizable(true); // frame resizability enable or disable
        ImageIcon img = new ImageIcon("VJ.jpg"); // frame logo change code
        jf.setIconImage(img.getImage()); // change icon
        Color red = Color.decode("#fc4705"); //deocde hexadecimal colour values
        jf.getContentPane().setBackground(red); // change the backgrond colour of the frame
        jf.setLayout(null);// set layout
        jf.add(jb); // add label to the frame
        jf.setVisible(true); // visibility

    }
}
