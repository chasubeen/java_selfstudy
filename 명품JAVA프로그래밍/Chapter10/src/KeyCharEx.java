import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("KeyListener�� ���� Ű �Է� ����");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new ColorPanel();
		frame.setContentPane(panel);

		frame.setSize(250, 150);
		frame.setVisible(true);
		panel.requestFocus();
	}
}

class ColorPanel extends JPanel {
	JLabel la = new JLabel("<Enter> Ű�� ������ �ٲ�ϴ�.");

	ColorPanel() {
		setLayout(new FlowLayout());
		add(la);
		addKeyListener(new MyKeyListener());
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			// ������ ���� ����� ���� �����ϰ� r,g,b ���� ����
			int r = (int) (Math.random() * 256); // red ����
			int g = (int) (Math.random() * 256); // green ����
			int b = (int) (Math.random() * 256); // blue ����

			switch (e.getKeyChar()) { // �Էµ� Ű ����
			case '\n':
				la.setText("r= " + r + ",g= " + g + ", b = " + b);
				setBackground(new Color(r, g, b));
				break;
			case 'q':
				System.exit(0);
			}
		}
	}
}
