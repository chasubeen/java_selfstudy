import java.io.FileNotFoundException;
import java.util.Formatter;

public class FormatterTest {
	public static void main(String[] args) {
		try {
			Formatter output = new Formatter("numbers.txt");
			for (int i = 0; i < 10; i++)
				output.format("%d\r\n", i);
			output.close();
		} catch (FileNotFoundException e) {
			System.out.println("cannot open");
			System.exit(1);
		}
	}

}
