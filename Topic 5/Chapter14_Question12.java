import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.*;
import javafx.stage.Stage;
import java.text.*;
import java.util.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.stage.*;
import javafx.geometry.*;

public class Chapter14_Question12 extends Application {
	final static String Project = "Project--20%";
	final static String Quiz = "Quiz--10%";
	final static String Midterm = "Midterm--30%";
	final static String Final = "Final--40%";
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Chapter 14, Problem 12");
		final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);
		
       
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("grades");       
        series1.getData().add(new XYChart.Data(Project, 20));
        series1.getData().add(new XYChart.Data(Quiz, 10));
        series1.getData().add(new XYChart.Data(Midterm, 30));
        series1.getData().add(new XYChart.Data(Final, 40));
   
        
        
        
        
        
        Scene scene  = new Scene(bc,800,600);
		
        bc.getData().addAll(series1);
        stage.setScene(scene);
        stage.show();
        scene.getStylesheets().add("NewFile.css");
	}
	
	public static void main(String[] args) {
	        launch(args);
	
	}
}
