import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	MyFrame() {
		setTitle("ù��° ������"); // �����ڿ��� Ÿ��Ʋ ����
		setSize(300, 300); // �����ڿ��� ������ ũ�� ����
		
		Container contentPane = getContentPane();
		contentPane.add(new JButton("MyButton"));
		setVisible(true); // �����ڿ��� �������� ȭ�鿡 ��µǵ��� ����
	}

	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}
