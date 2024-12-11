import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Label {

    JLabel lb;
    Panel pn;


    Label(){
        lb = new JLabel();
        pn = new Panel();

        lb.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lb.setVerticalAlignment(JLabel.BOTTOM);
        lb.setHorizontalAlignment(JLabel.CENTER);
        lb.setVisible(false);
        pn.c1.add(lb);



    }
}
