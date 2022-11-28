//Program to create a Menu bar with multiple options
package com.mycompany.javaproject1;
/**
 *
 * @author sshiril
 */
import javax.swing.*;
public class NewMain4 {

public static void main(String args[])

JMenu menu;
JMenuItem a1,a2;

JFrame a = new JFrame("Example");
menu = new JMenu("options");   // click on the options to look at the 
JMenuBar m1 = new JMenuBar();
a1 = new JMenuItem("menu item1");
a2 = new JMenuItem("menu item 2");
menu.add(a1);
menu.add(a2);
m1.add(menu);
a.setJMenuBar(m1);
a.setSize(400,400);
a.setLayout(null);
a.setVisible(true);
}
}  

