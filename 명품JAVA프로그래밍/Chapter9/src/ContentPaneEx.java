import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame {
	ContentPaneEx() {
		setTitle("ContentPane�� JFrame ����"); // �������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane(); // ����Ʈ���� �˾Ƴ���
		contentPane.setBackground(Color.ORANGE); // �������� ��� ����
		contentPane.setLayout(new FlowLayout()); // ����Ʈ ���ο� FlowLayout

		/* ��ư �ޱ� */
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));

		setSize(300, 150); // ������ ũ�� 300 X 150 ����
		setVisible(true); // ȭ�鿡 ������ ���

	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
