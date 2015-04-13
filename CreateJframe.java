/*
Carlos F. Meneses
04/08/2015
Bergen Community College
Advanced Java Programming
*/
/**
CreateJFrame.java: Creates a custom JFrame that contains JLabels, JTextFields, 
a JButton, and ToolTip for the main app (see also: HelloAgePlus10.java).
*/

import javax.swing.*;

public class CreateJframe extends JFrame
{
   final int JFRAME_WIDTH = 250;
   final int JFRAME_HEIGHT = 120;
   
   public CreateJframe()
   {
   super("Your Age 10 Years From Now");
   setSize(JFRAME_WIDTH, JFRAME_HEIGHT);
   setResizable(false);
   setVisible(true);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}