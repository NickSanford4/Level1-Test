import java.awt.Color;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exam {
	public static void main(String[] args) {
		new Exam();
	}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton buttonY = new JButton();
JButton buttonR = new JButton();
JButton buttonB = new JButton();
JButton buttonG = new JButton();
public Exam() {
	frame.add(panel);
	panel.add(buttonY);
	panel.add(buttonR);
	panel.add(buttonB);
	panel.add(buttonG);
	frame.setVisible(true);
	frame.setSize(350, 65);
	buttonY.setBackground (Color.YELLOW  );
	buttonY.setOpaque(true);
	buttonR.setBackground (Color.RED  );
	buttonR.setOpaque(true);
	buttonB.setBackground (Color.BLUE  );
	buttonB.setOpaque(true);
	buttonG.setBackground (Color.GREEN  );
	buttonG.setOpaque(true);
	frame.setTitle("Color Teacher");
}
}
