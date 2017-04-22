package sourceCode;

import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeScreen extends JFrame {

	private JFrame frame;
	private ImageIcon background;
	private JButton button;

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
		changeBackground();
		addButton();
	}

	private void addButton() {
		button = new JButton("FIND OUT NOW WHO AM I");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//frame.setContentPane(new JLabel());
				FirstScreen firstScreen = new FirstScreen();
				frame.add(firstScreen);
				//firstScreen.setVisible(true);
				ScreenPanel scrPan = new ScreenPanel();
				frame.setContentPane(scrPan);
				scrPan.setLocation(250, 250);
				scrPan.setVisible(true);
				
			}
		});
		button.setForeground(Color.RED);
		button.setBackground(Color.ORANGE);
		button.setBounds((frame.getWidth()-700)/2, frame.getHeight()-30*3, 700, 30);
		button.setOpaque(false);
		frame.getContentPane().add(button);
		
	}

	private void changeBackground() {
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

}
