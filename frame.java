//Program to Panel, Frame and button
package com.mycompany.javaproject1;
import java.awt.*;
import javax.swing.*;
public class Example{
public static void main(String args[])
{
JFrame a = new JFrame("Frame 1");
JPanel p = new JPanel();
p.setBounds(40,70,200,200);
JButton b = new JButton("click me");
b.setBounds(60,50,80,40);
p.add(b);
a.add(p);
a.setSize(400,400);
a.setLayout(null);
a.setVisible(true);
}
}
