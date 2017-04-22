package sourceCode;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Label;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeScreen {

	private JFrame frame;
	private JLabel lblBackgroundImage = new JLabel();
	private ImageIcon background;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeScreen window = new WelcomeScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		createframe();
	}

	private void createframe() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			background = new ImageIcon(ImageIO.read(new File("C:/Users/N/workspace/WhoAmI/src/media/who-am-i_800x600.jpg")));
		} catch (IOException e1) {
			System.out.println("not found");
			e1.printStackTrace();
		}

		frame.setContentPane(new JLabel(background));
		frame.pack();
		frame.setVisible(true);

	}

	private void changeBackground() {
		lblBackgroundImage.setIcon(new ImageIcon("/media/who-am-i_800x600.jpg"));
	    lblBackgroundImage.setLayout(new BorderLayout());
	    frame.add(lblBackgroundImage);
	    lblBackgroundImage.setVisible(true);
	}

}
