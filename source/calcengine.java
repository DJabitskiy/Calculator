package source;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class calcengine implements ActionListener {
   calculator parent;

   char action = ' ';
   double result = 0;

   calcengine(calculator parent) {
      this.parent = parent;
   }

   public void actionPerformed(ActionEvent e) {
      JButton clickedButton = (JButton) e.getSource();
      String dispFieldText = parent.displayField.getText();
      double displayValue = 0;
      if (!"".equals(dispFieldText)) {
         displayValue = Double.parseDouble(dispFieldText);
      }
      Object src = e.getSource();
      if (src == parent.buttonplus) {
         action = '+';
         result = displayValue;
         parent.displayField.setText("");
      } else if (src == parent.buttonminus) {
         action = '-';
         result = displayValue;
         parent.displayField.setText("");
      } else if (src == parent.buttondivision) {
         action = '/';
         result = displayValue;
         parent.displayField.setText("");
      } else if (src == parent.buttonmultiplication) {
         action = '*';
         result = displayValue;
         parent.displayField.setText("");
      } else if (src == parent.buttonEqual) {
         if (action == '+') {
            result += displayValue;
            parent.displayField.setText("" + result);
         } else if (action == '-') {
            result -= displayValue;
            parent.displayField.setText("" + result);
         } else if (action == '/') {
            result /= displayValue;
            parent.displayField.setText("" + result);
         } else if (action == '*') {
            result *= displayValue;
            parent.displayField.setText("" + result);
         }
      } else {
         String clickedButtonLabel = clickedButton.getText();
         parent.displayField.setText(dispFieldText + clickedButtonLabel);
      }
   }
}