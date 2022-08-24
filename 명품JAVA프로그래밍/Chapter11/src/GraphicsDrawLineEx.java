import java.awt.*;
import javax.swing.*;

public class GraphicsDrawLineEx extends JFrame{
	GraphicsDrawLineEx(){
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(200,150);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED); // 빨간색을 선택
			g.drawLine(20, 20, 100, 100);
			
			g.setColor(Color.BLUE);
			g.drawOval(20, 20, 80, 80);
			
			g.setColor(Color.BLACK);
			g.drawRect(20, 20, 80, 80);
			
			g.setColor(Color.WHITE);
			g.drawRoundRect(20, 20, 120, 80, 40, 60);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawLineEx();
	}
}
