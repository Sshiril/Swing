//Program to create a scroll bar
package com.mycompany.javaproject1;
/**
 *
 * @author sshiril
 */
import javax.swing.*;
public class NewMain4 {

public static void main(String args[]){

JFrame a = new JFrame("Scroll bar");
JScrollBar b = new JScrollBar();
b.setBounds(90,90,40,90);
a.add(b);
a.setSize(300,300);
a.setLayout(null);
a.setVisible(true);
}
}  
