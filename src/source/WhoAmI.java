package source;

import java.awt.BorderLayout;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class WhoAmI extends JFrame
{
	private JPanel contentPane;
	
	public WhoAmI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		URL vid = this.getClass().getResource("/media/beginningHackVratsa.3gp");
		MediaPanel test = new MediaPanel(vid);
	}
}