package source;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class calculator {

   JPanel windowContent;
   JTextField displayField;
   JButton button0;
   JButton buttonPoint;
   JButton buttonEqual;
   JButton buttonplus;
   JButton buttonminus;
   JButton buttonmultiplication;
   JButton buttondivision;
   JPanel p1;
   JPanel p2;

   calculator() {
      calcengine engine = new calcengine(this);
      p1 = new JPanel();
      p2 = new JPanel();
      GridLayout gl = new GridLayout(4, 3);
      p1.setLayout(gl);
      p2.setLayout(gl);

      int i, n = 9;
      n++;
      JButton[] buttons = new JButton[n];
      for (i = 1; i < n; i++) {
         buttons[i] = new JButton("" + i);
         buttons[i].addActionListener(engine);
         p1.add(buttons[i]);
      }
      windowContent = new JPanel();
      BorderLayout bl = new BorderLayout();
      windowContent.setLayout(bl);
      displayField = new JTextField(30);
      displayField.setHorizontalAlignment(SwingConstants.RIGHT);
      windowContent.add("North", displayField);
      button0 = new JButton("0");
      button0.addActionListener(engine);
      p1.add(button0);
      buttonPoint = new JButton(".");
      buttonPoint.addActionListener(engine);
      buttonEqual = new JButton("=");
      buttonEqual.addActionListener(engine);
      p1.add(buttonPoint);
      p1.add(buttonEqual);
      buttonplus = new JButton("+");
      buttonplus.addActionListener(engine);
      p2.add(buttonplus);
      buttonminus = new JButton("-");
      buttonminus.addActionListener(engine);
      p2.add(buttonminus);
      buttondivision = new JButton("/");
      buttondivision.addActionListener(engine);
      p2.add(buttondivision);
      buttonmultiplication = new JButton("*");
      buttonmultiplication.addActionListener(engine);
      p2.add(buttonmultiplication);
      windowContent.add("East", p2);
      windowContent.add("Center", p1);

      JFrame frame = new JFrame("Calculator");
      frame.setContentPane(windowContent);
      frame.pack();
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      calculator calc = new calculator();

   }
}
