package sourceCode;

import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeScreen extends JFrame {

	public static JFrame frame;
	private ImageIcon background;
	private JButton button;
	static ScreenPanel scrPan = new ScreenPanel();

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

	public WelcomeScreen() {
		initialize();
	}

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
		button = new JButton("FIND OUT NOW WHO YOU ARE");
		button.setBorder(new LineBorder(Color.orange));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//test testNew = new test();
				new TestVideoPlayer();
				addPanel(scrPan);
			}

		});
		button.setForeground(Color.RED);
		button.setBackground(Color.ORANGE);
		button.setBounds((frame.getWidth() - 700) / 2, frame.getHeight() - 30 * 3, 700, 30);
		button.setOpaque(false);
		frame.getContentPane().add(button);
	}

	public static void addPanel(ScreenPanel scrPan) {
		frame.setContentPane(scrPan);
		scrPan.setLocation(0, 0);
		scrPan.setVisible(true);
		frame.repaint();
	}

	private void changeBackground() {
		try {
			background = new ImageIcon(
					ImageIO.read(new File("C:/Users/N/workspace/WhoAmI/src/media/who-am-i_800x600.jpg")));
		} catch (IOException e1) {
			System.out.println("not found");
			e1.printStackTrace();
		}

		frame.setContentPane(new JLabel(background));
		frame.pack();
		frame.setVisible(true);
	}

}
