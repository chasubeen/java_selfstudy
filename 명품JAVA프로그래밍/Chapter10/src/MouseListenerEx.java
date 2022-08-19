import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Mouse �̺�Ʈ ����");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new LabelPanel());
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}

class LabelPanel extends JPanel{
	JLabel la = new JLabel("Hello");
	
	LabelPanel(){
		addMouseListener(new MyMouseListener());
		setLayout(null);
		la.setSize(50,20); // ���̺��� ũ�⸦ 50 x 20���� ����
		la.setLocation(30,30); // ���̺��� ��ġ (30,30)���� ����
		add(la);
	}
	
	class MyMouseListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // ���콺�� Ŭ�� ��ǥ x
			int y = e.getY(); // ���콺�� Ŭ�� ��ǥ y
			la.setLocation(x,y); // (x,y) ��ġ�� ���̺� �̵�
		}
	}
}
