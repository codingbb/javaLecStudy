package ex07.example;

import javax.swing.*;
import java.awt.*;


public class MyFrameEx01 {

    static int num = 1;

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        //jf.setLayout(new BorderLayout());
        jf.setSize(300,500);

        JButton btn1 = new JButton("더하기");
        JButton btn2 = new JButton("빼기");

        JLabel la1 = new JLabel(num+"");  //label에는 String만 넣을 수 있다.

        jf.add("North", btn1);
        jf.add("South", btn2);
        jf.add("Center", la1);

        btn1.addActionListener(e -> {
            num++;
            la1.setText(num+"");
        });

        btn2.addActionListener(e -> {
            num--;
            if (num < 0) {
                num = 0;
            }
            la1.setText(num + "");
        });

        //jf.add(btn1);     // (=jf.add(new JButton("클릭"));)

        jf.setVisible(true);

    }
}
