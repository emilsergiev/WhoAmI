package sourceCode;

import javax.swing.JPanel;
import javax.swing.JButton;

public class ScreenPanel2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public ScreenPanel2() {
		setLayout(null);
		setSize(800, 600);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 22, 412, 53);
		add(btnNewButton);

	}
}
