import javax.swing.*;
import java.awt.FlowLayout;

public class calculator {

   public static void main(String[] args) {
      JPanel windowcontent = new JPanel();
      FlowLayout fl = new FlowLayout();
      windowcontent.setLayout(fl);
      JLabel label1 = new JLabel("первое число");
      JTextField field1 = new JTextField(10);
      JLabel label2 = new JLabel("второе число");
      JTextField field2 = new JTextField(10);
      JLabel label3 = new JLabel("результат");
      JTextField result = new JTextField(10);
      JButton go = new JButton("сложить");
      windowcontent.add(label1);
      windowcontent.add(field1);
      windowcontent.add(label2);
      windowcontent.add(field2);
      windowcontent.add(label3);
      windowcontent.add(result);
      windowcontent.add(go);
      JFrame frame = new JFrame("mycalc");
      frame.setContentPane(windowcontent);
      frame.setSize(500, 100);
      frame.setVisible(true);
   }
}
