import java.awt.*;
import javax.swing.*;

public class PaintJpanelEx extends JFrame{
	PaintJpanelEx(){
		setTitle("JPanel의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(250,200);
		setVisible(true);
	}
	
	// JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE); // 파란색 선택
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			
			g.setColor(Color.MAGENTA); // 마젠타 색 선택
			g.drawRect(90, 90,50,50);
		}
	}
	
	public static void main(String[] args) {
		new PaintJpanelEx();
	}
}
