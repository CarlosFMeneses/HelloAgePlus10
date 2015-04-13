/*
Carlos F. Meneses
04/08/2015
Bergen Community College
Advanced Java Programming
*/
/**
HelloAgePlus10.java: Application which prompts user to enter their name and 
their age. Displays the message "Hello <name>, you will be <age + 10> in 10 
years when the button is clicked. Contains a secondary event, which uses a 
KeyListener, that changes the output JLabel when the user changes the name or 
age in the JTextFields. When user changes the name, a message displays "Please 
Click the Button"; If user changes the age, a message displays "Hello <name>" 
without the age value. (see also: CreateJFrame.java).
*/

import javax.swing.plaf.metal.*;
import javax.swing.*;
import java.awt.*;

public class HelloAgePlus10
{
   public static void main(String[] args)
   {
      CreateJframe frame = new CreateJframe();
      JLabel promptName = new JLabel("What is your name?");
      JLabel promptAge = new JLabel("What is your age?");

      frame.add(promptName);
      frame.validate();
      
      // Need to figure out how to accept user input
   }
}