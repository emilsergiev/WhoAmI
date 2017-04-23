package sourceCode;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SceneBuilder;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;

import javax.swing.JFrame;

public class TestVideoPlayer extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    final JFXPanel jfxPanel;
    /**
     * Create a new Frame, set title, ...
     */
    public TestVideoPlayer() {

        this.setTitle("Swing and JavaFX");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(1024, 768);

        // create a JFXPanel
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

//    public static final void main (String[] args) {
//        new TestVideoPlayer();
//    }

    /**
     * init the JFX Scene and 
     * @return scene
     */
    private Scene initScene() {

    	final File f = new File("C:/Users/N/workspace/WhoAmI/src/media/openingEyesHackVratsa.wmv");
        Group root = new Group();
        SceneBuilder<?> sb = SceneBuilder.create().width(640).height(400).root(root);
        Media video = new Media(f.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(video);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.play();

        MediaView view = new MediaView(mediaPlayer);

        root.getChildren().add(view);
        Scene scene = sb.build();

        return scene;

    }
}
