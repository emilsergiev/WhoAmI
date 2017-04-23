package sourceCode;
	

import java.awt.Color;
import java.io.File;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class PlayVideo extends Application {

	
	 @Override
	  public void start(Stage primaryStage) {
	    String workingDir = System.getProperty("user.dir");
	    final File f = new File("C:/Users/N/Desktop/hackaton/00_04-challenge.mp4");
	    
	    final Media m = new Media(f.toURI().toString());
	    final MediaPlayer mp = new MediaPlayer(m);
	    final MediaView mv = new MediaView(mp);
	    
	    final DoubleProperty width = mv.fitWidthProperty();
	    final DoubleProperty height = mv.fitHeightProperty();
	    
	    width.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
	    height.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));
	    
	    mv.setPreserveRatio(true);
	    
	    StackPane root = new StackPane();
	    root.getChildren().add(mv);
	    
	    final Scene scene = new Scene(root, width.get(), height.getValue());
	    //scene.setFill(Color.BLACK);
	    
	    primaryStage.setScene(scene);
	    primaryStage.setTitle("Full Screen Video Playe1111r");
	    //primaryStage.setFullScreen(true);
	    primaryStage.show();
	    
	    mp.play();
	    mp.setOnEndOfMedia(new Runnable() {
	        public void run() {
	        	primaryStage.close();
	        }
	});
	  }
	
	public static void main(String[] args) {
		launch(args);
	}
}
