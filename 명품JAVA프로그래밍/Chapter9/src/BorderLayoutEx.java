import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame{
	BorderLayoutEx(){
		setTitle("BorderLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new BorderLayoutPanel());
		setSize(300,200); // ������ ũ�� 300 x 200 ����
		setVisible(true); // �������� ȭ�鿡 ���
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}

class BorderLayoutPanel extends JPanel{
	BorderLayoutPanel(){
		// ����Ʈ���ο� BorderLayout ��ġ������ ����
		setLayout(new BorderLayout(30,20));
		add(new JButton("Calculate"),BorderLayout.CENTER);
		add(new JButton("add"),BorderLayout.NORTH);
		add(new JButton("sub"),BorderLayout.SOUTH);
		add(new JButton("mul"),BorderLayout.EAST);
		add(new JButton("div"),BorderLayout.WEST);
	}
}
