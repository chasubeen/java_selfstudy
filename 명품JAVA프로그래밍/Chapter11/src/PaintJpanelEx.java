import java.awt.*;
import javax.swing.*;

public class PaintJpanelEx extends JFrame{
	PaintJpanelEx(){
		setTitle("JPanel�� paintComponent() ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(250,200);
		setVisible(true);
	}
	
	// JPanel�� ��ӹ޴� �� �г� ����
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE); // �Ķ��� ����
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			
			g.setColor(Color.MAGENTA); // ����Ÿ �� ����
			g.drawRect(90, 90,50,50);
		}
	}
	
	public static void main(String[] args) {
		new PaintJpanelEx();
	}
}
