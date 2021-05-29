import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class calculator {

   JPanel windowContent;
   JTextField displayField;
   JButton buttonPoint;
   JButton buttonEqual;
   JButton buttonplus;
   JButton buttonminus;
   JButton buttonmultiplication;
   JButton buttondivision;
   JPanel p1;
   JPanel p2;

   calculator() {
      p1 = new JPanel();
      p2 = new JPanel();
      GridLayout gl = new GridLayout(4, 3);
      p1.setLayout(gl);
      p2.setLayout(gl);

      int i, n = 9;
      n++;
      JButton[] buttons = new JButton[n];
      n = n - 1;
      for (i = 0; i <= n; i++) {
         buttons[i] = new JButton("" + i);
         p1.add(buttons[i]);
      }
      windowContent = new JPanel();
      BorderLayout bl = new BorderLayout();
      windowContent.setLayout(bl);
      displayField = new JTextField(30);
      windowContent.add("North", displayField);
      buttonPoint = new JButton(".");
      buttonEqual = new JButton("=");
      p1.add(buttonPoint);
      p1.add(buttonEqual);
      buttonplus = new JButton("+");
      p2.add(buttonplus);
      buttonminus = new JButton("-");
      p2.add(buttonminus);
      buttondivision = new JButton("/");
      p2.add(buttondivision);
      buttonmultiplication = new JButton("*");
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
