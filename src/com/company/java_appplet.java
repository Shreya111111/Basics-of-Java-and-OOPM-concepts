package com.company;
import org.w3c.dom.Text;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class java_appplet extends Applet implements ActionListener {
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    public java_appplet(){
        Label l1 = new Label("First Number");
        Label l2 = new Label("Second Number");
        Label l3 = new Label("Result");
        setLayout(new GridLayout(3,2));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
    t2.addActionListener(this);
    }

        public void actionPerformed(ActionEvent){
        String s1= t1.getText();
        Double d1 = Double.parseDouble(s1);
        String s2 = t2.getText();
        Double d2 = Double.parseDouble(s2);
        Double res = d1 + d2;
        t3.setText("Sum is "+ res);





    }
}
