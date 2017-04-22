package sourceCode;

import javax.swing.JPanel;
import javax.swing.JButton;

public class ScreenPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ScreenPanel() {
		setLayout(null);
		
		JButton button = new JButton("New button");
		button.setBounds(294, 5, 89, 23);
		add(button);

	}

}
