import java.awt.event.*;
import javax.swing.*;

public class MyActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals("Action"))
			btn.setText("¾×¼Ç");
		else
			btn.setText("Action");
	}
}


