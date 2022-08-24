import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsDrawOvalMouseEx extends JFrame{
	public GraphicsDrawOvalMouseEx() {
		setTitle("���콺 �巡������ Ÿ�� �׸��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GraphicsDrawOvalMouseEx();
	}
	
	// Ÿ���� �׸� �г� �ۼ�, �ش� �гο� ���콺 ������ �����ϱ�
	class MyPanel extends JPanel{
		Point start = null,end = null; // ���콺�� �������� ����
		public MyPanel() {
			MyMouseListener listener = new MyMouseListener();
			
			// listener�� �Ʒ� �� �����ʷ� �������� ����ؾ� �Ѵ�.
			addMouseListener(listener);
			addMouseMotionListener(listener);
		}
		class MyMouseListener extends MouseAdapter{
			public void mousePressed(MouseEvent e) {
				start = e.getPoint();
			}
			public void mouseDragged(MouseEvent e) {
				end = e.getPoint();
				repaint(); // �г��� �׸��� ��û �ָ�
			}
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(start == null) // Ÿ���� �������� ����
				return;
			g.setColor(Color.BLUE); // �Ķ��� ����
			int x = Math.min(start.x, end.x);
			int y = Math.min(start.y, end.y);
			int width = Math.abs(start.x - end.x);
			int height = Math.abs(start.y - end.y);
			g.drawOval(x, y, width, height); // Ÿ�� �׸���
		}
	}
}
