import java.awt.*;
import javax.swing.*;

public class GraphicsDrawingEx1 extends JFrame {
	Container contentPane;
	public GraphicsDrawingEx1() {
		setTitle("���� ũ��� ���ϴ� ��Ĥ�� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon Icon = new ImageIcon("Images/image0.png");
		Image img = Icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,20,20,this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawingEx1();
	}
}
