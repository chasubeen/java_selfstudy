import java.awt.*;
import javax.swing.*;

public class FlowLayoutEx extends JFrame{
	FlowLayoutEx(){
		setTitle("FlowLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new FlowLayoutPanel()); // ���������� ����
		setSize(300,200); // ������ ũ�� 300 x 200 ����
		setVisible(true); // ȭ�鿡 ������ ���
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}

class FlowLayoutPanel extends JPanel{ // JPanel �����̳�
	FlowLayoutPanel(){
		// ���� ���ķ� ���� ������ 30, ���� ������ 40 �ȼ��� ��ġ�ϴ� FlowLayout ����
		setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		add(new JButton("add"));
		add(new JButton("sub"));
		add(new JButton("mul"));
		add(new JButton("div"));
		add(new JButton("Calculate"));
		
	}
}
