import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		super("GridLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new GridLayoutPanel());
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}


class GridLayoutPanel extends JPanel{
	GridLayoutPanel(){
		// 1 x 10�� GridLayout ��ġ������
		setLayout(new GridLayout(1,10)); 
		for(int i = 0;i<10;i++) { // 10���� ��ư ����
			String text = Integer.toString(i); // i�� ���ڿ��� ��ȯ
			JButton button = new JButton(text);
			add(button); // ���������ο� ��ư ����
		}
	}
}
