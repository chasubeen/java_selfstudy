import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	MyFrame() {
		setTitle("첫번째 프레임"); // 생성자에서 타이틀 설정
		setSize(300, 300); // 생성자에서 프레임 크기 지정
		
		Container contentPane = getContentPane();
		contentPane.add(new JButton("MyButton"));
		setVisible(true); // 생성자에서 프레임이 화면에 출력되도록 지정
	}

	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}
