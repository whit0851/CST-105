import javafx.application.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class Chapter14_Question14 extends Application{

	@Override
	public void start(Stage stage) throws Exception {
	Pane pane = new Pane();
	
	Rectangle r1 = new Rectangle(50, 25, 60, 30);
	//r1.xProperty().bind(pane.widthProperty().divide(3));
	//r1.yProperty().bind(pane.widthProperty().divide(3));
	r1.setStroke(Color.BLACK);
	r1.setFill(Color.WHITE);
	//pane.getChildren().add(new Text(10, 27, "r1"));
	pane.getChildren().add(r1);
	
	Rectangle r2 = new Rectangle(25, 50, 60, 30);
	r2.setStroke(Color.BLACK);
	r2.setFill(new Color(.5, .5, .5,.0));
	//pane.getChildren().add(new Text(10, 67, "r2"));
	pane.getChildren().add(r2);

	Line line1 = new Line(50, 25, 25, 50);
	pane.getChildren().add(line1);
	
	Line line2 = new Line(50, 55, 25, 80);
	pane.getChildren().add(line2);
	
	Line line3 = new Line(110, 25, 85, 50);
	pane.getChildren().add(line3);
	
	Line line4 = new Line(110, 55, 85, 80);
	pane.getChildren().add(line4);
	
	//Rectangle r3 = new Rectangle(25, 90, 60, 30);
	//r3.setArcWidth(15);
	//r3.setArcHeight(25);
	//pane.getChildren().add(new Text(10, 107, "r3"));
	//pane.getChildren().add(r3);
	
	//for (int i = 0; i < 4; i++) {
	//Rectangle r = new Rectangle(100, 50, 100, 30);
	//r.setRotate(i * 360 / 8);
	//r.setStroke(Color.color(Math.random(), Math.random(),
	//Math.random()));
	//r.setFill(Color.WHITE);
	//pane.getChildren().add(r);
//	}

// Create a scene and place it in the stage
	Scene scene = new Scene(pane, 250, 150);
	stage.setTitle("ShowRectangle"); // Set the stage title
	stage.setScene(scene); // Place the scene in the stage
	stage.show(); // Display the stage
	
}
	public static void main(String[] args) {
        launch(args);
	}
}
