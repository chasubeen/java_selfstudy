import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame {
	ContentPaneEx() {
		setTitle("ContentPane과 JFrame 예시"); // 프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane(); // 콘텐트페인 알아내기
		contentPane.setBackground(Color.ORANGE); // 오렌지색 배경 설정
		contentPane.setLayout(new FlowLayout()); // 콘텐트 페인에 FlowLayout

		/* 버튼 달기 */
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));

		setSize(300, 150); // 프레임 크기 300 X 150 설정
		setVisible(true); // 화면에 프레임 출력

	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
