package sourceCode;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;

import javax.swing.JFrame;

public class IntroVideo extends JFrame {

	final JFXPanel jfxPanel;
	/**
	 * Create a new Frame, set title, ...
	 */
	public IntroVideo() {

		this.setTitle("Intro video");
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setSize(800, 600);

		// create a JFXPanelHi
		jfxPanel = new JFXPanel();

		// add the jfxPanel to the contentPane of the JFrame
		this.getContentPane().add(jfxPanel);
		this.setVisible(true);

		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				jfxPanel.setScene(initScene());
			}
		});
		
		
	}

	// public static final void main (String[] args) {
	// new TestVideoPlayer();
	// }

	/**
	 * init the JFX Scene and
	 * 
	 * @return scene
	 */
	private Scene initScene() {

		final File f = new File("C:/Users/N/workspace/WhoAmI/src/media/01.Beginning.mp4");
		Group root = new Group();
		Media video = new Media(f.toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(video);
		mediaPlayer.setAutoPlay(true);
		mediaPlayer.play();

		MediaView view = new MediaView(mediaPlayer);

		final DoubleProperty width = view.fitWidthProperty();
		final DoubleProperty height = view.fitHeightProperty();

		width.bind(Bindings.selectDouble(view.sceneProperty(), "width"));
		height.bind(Bindings.selectDouble(view.sceneProperty(), "height"));

		root.getChildren().add(view);
		Scene scene = new Scene(root, width.get(), height.getValue());

		return scene;

	}
}
