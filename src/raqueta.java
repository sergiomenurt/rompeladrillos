

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class raqueta extends JFrame {

    public raqueta()
    {
        add(new tablero());
        setTitle("rompe ladrillos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(comun.WIDTH, comun.HEIGTH);
        setLocationRelativeTo(null);
        setIgnoreRepaint(true);
        setResizable(false);
        setVisible(true);
        
        
        
    }

    public static void main(String[] args) {
         raqueta raqueta1 = new raqueta();
    }
}
