import java.awt.*;
import javax.swing.*;

public class GraphicsDrawingEx2 extends JFrame {
	Container contentPane;
	public GraphicsDrawingEx2() {
		setTitle("패널의 크기에 맞추어 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(200,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon Icon = new ImageIcon("Images/image0.png");
		Image img = Icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,0,0,getWidth(),getHeight(),this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawingEx2();
	}
}
