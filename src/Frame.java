import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Frame {

    JFrame fr;
    Panel pn;
    Button bttn;
    Label ll;

    Frame(){
        fr = new JFrame();
        pn = new Panel();
        bttn = new Button();
        ll = new Label();

        fr.add(bttn.btn);
        fr.add(ll.lb);

        ll.lb.setVisible(false);



        bttn.btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==bttn.btn){
                    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", };

                    Random rnd = new Random();

                    int m1 = rnd.nextInt(12);
                    int year = rnd.nextInt(24)+2000;

                    if (m1 == 0 || m1 == 2 || m1 == 4|| m1 == 7|| m1 == 6|| m1 == 9|| m1 == 11) {
                        int day = rnd.nextInt(31)+1;
                        ll.lb.setText("Happy birthday to those born on " + months[m1] + " " + day + "," + " " + year + "!");
                    }
                    if (m1 == 3 || m1 == 5 || m1 == 8 || m1 == 10) {
                        int day = rnd.nextInt(30)+1;
                        ll.lb.setText("Happy birthday to those born on " + months[m1] + " " + day + "," + " " + year + "!");
                    }
                    if (m1 == 1) {
                        int endswithZero = year % 4;
                        if (endswithZero == 0) {
                            int day = rnd.nextInt(29)+1;
                            ll.lb.setText("Happy birthday to those born on " + months[m1] + " " + day + "," + " " + year + "!");
                        }
                        else{
                            int day = rnd.nextInt(28)+1;
                            ll.lb.setText("Happy birthday to those born on " + months[m1] + " " + day + "," + " " + year + "!");
                        }
                    }
                }
                    ll.lb.setVisible(true);
            }
        });


        pn.c2.add(bttn.btn);
        pn.c1.add(ll.lb);


        fr.setTitle("Happy Birthday Randomizer");
        fr.setVisible(true);
        fr.setLayout(null);
        fr.setSize(516, 539);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(false);

        fr.add(pn.c1);
        fr.add(pn.c2);



    }
}
