package sourceCode;

import javax.swing.JPanel;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;

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
		
		final File f = new File("C:/Users/N/Desktop/hackaton/00_04-challenge.mp4");
	    
	    final Media m = new Media(f.toURI().toString());
	    final MediaPlayer mp = new MediaPlayer(m);
	    final MediaView mv = new MediaView(mp);
	    
	    final DoubleProperty width = mv.fitWidthProperty();
	    final DoubleProperty height = mv.fitHeightProperty();
	    
	    width.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
	    height.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));
	    
	    mv.setPreserveRatio(true);
	    
	   // StackPane root = new StackPane();
	   // root.getChildren().add(mv);
	    
	    
	   // final Scene scene = new Scene(root, 860, 450);
	    //scene.setFill(Color.BLACK);
	    
	   // primaryStage.setScene(scene);
	   // primaryStage.setTitle("Full Screen Video Player");
	    //primaryStage.setFullScreen(true);
	   // primaryStage.show();
	    
	    mp.play();
	    mp.setOnEndOfMedia(new Runnable() {
	        public void run() {
	        	//primaryStage.close();
	        }
	});

	}
}
