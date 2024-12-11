import javax.swing.*;
import java.awt.*;

public class Panel {


    JPanel c1;
    JPanel c2;

    Panel(){
        c1 = new JPanel();
        c2 = new JPanel();

        c1.setBackground(Color.white);
        c1.setBounds(0,0,500,250);
        c1.setLayout(new BorderLayout());



        c2.setBackground(Color.white);
        c2.setBounds(0,250,500,250);

    }
}
