package source;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class calcengine implements ActionListener {
   calculator parent;

   calcengine(calculator parent) {
      this.parent = parent;
   }

   public void actionPerformed(ActionEvent e) {
      JButton clickedButton = (JButton) e.getSource();
      String display = parent.displayField.getText();
      String clickedButtonLabel = clickedButton.getText();
      parent.displayField.setText(display + clickedButtonLabel);
   }
}
