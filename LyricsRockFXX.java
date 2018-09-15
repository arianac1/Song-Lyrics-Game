import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage; 
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class LyricsRockFXX extends Application 
{
	public static void main(String[] args) 
	{
		launch(args);
	}
	
		int [] A = new int [4]; 
	
	public void start(Stage primaryStage)
	{
		GridPane pane1 = new GridPane();
		pane1.setPadding(new Insets(10,10,10,10)); ////adds padding to sides of window
		pane1.setVgap(8);//vertical spacing
		pane1.setHgap(8);//horizontal


		Button button1 = new Button(); ///button for stage 1
		button1.setText("Click to start");
		button1.defaultButtonProperty().bind(button1.focusedProperty());   //// user presses enter button to go to next stage

		Text t0 = new Text();
		t0.setText("Let's play don't forget the lyrics.");
		t0.setFill(Color.BLUE);
		t0.setFont(Font.font ("Verdana", 15));
		GridPane.setConstraints(t0,1,0);

		pane1.getChildren().addAll(button1,t0);  
		GridPane.setConstraints(button1,1,3);

		Scene scene = new Scene(pane1, 350, 100);
		primaryStage.setTitle("Don't Forget The Lyrics"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage

		primaryStage.show(); // Display the stage

		///////////////////////////////////////////////////////////////////////////////   next window
		GridPane grid2 = new GridPane();
		grid2.setPadding(new Insets(10,10,10,10)); ////adds padding to sides of window
		grid2.setVgap(8);//vertical spacing
		grid2.setHgap(8);//horizontal

		Stage stage = new Stage();
		Scene scene1 = new Scene(grid2, 400, 450);
		stage.setScene(scene1);  
		stage.setTitle("Level 1"); // Set the stage title ///second stage name

		Button button2 = new Button(); ///button for stage 2
		button2.setText("Next");
		button2.setTranslateX(150);
		button2.setTranslateY(240);	
		button2.defaultButtonProperty().bind(button2.focusedProperty());

		Label label = new Label("1.");  
		label.setTranslateX(5);
		label.setTranslateY(120);	

		TextField textField = new TextField ();
		textField.setTranslateX(50);
		textField.setTranslateY(120);	
		textField.setMaxWidth(200);


		Label label2 = new Label("2.");  
		label2.setTranslateX(5);
		label2.setTranslateY(150);

		TextField textField2 = new TextField ();
		textField2.setTranslateX(50);
		textField2.setTranslateY(150);	
		textField2.setMaxWidth(200);

		Label label3 = new Label("3.");  
		label3.setTranslateX(5);
		label3.setTranslateY(180);

		TextField textField3 = new TextField ();
		textField3.setTranslateX(50);
		textField3.setTranslateY(180);	
		textField3.setMaxWidth(200);

		Label label4 = new Label("4.");  
		label4.setTranslateX(5);
		label4.setTranslateY(210);

		TextField textField4 = new TextField ();
		textField4.setTranslateX(50);
		textField4.setTranslateY(210);	
		textField4.setMaxWidth(200);

		textField.textProperty().addListener((ov, oldValue, newValue) -> {
			textField.setText(newValue.toUpperCase());
		});
		textField2.textProperty().addListener((ov, oldValue, newValue) -> {
			textField2.setText(newValue.toUpperCase());
		});
		textField3.textProperty().addListener((ov, oldValue, newValue) -> {
			textField3.setText(newValue.toUpperCase());
		});
		textField4.textProperty().addListener((ov, oldValue, newValue) -> {
			textField4.setText(newValue.toUpperCase());
		});

		Text t = new Text();
		t.setText("\n1)  Kryptonite - 3 Doors Down");
		t.setTranslateX(-5);
		t.setTranslateY(-80);
		t.setFill(Color.BLUE);
		t.setFont(Font.font ("Verdana", 20));


		Text t00 = new Text();
		t00.setWrappingWidth(300);
		t00.setText("\nIf I go _____ then will you still call me Superman \nIf I’m ____ and well, will you be \nThere a-holding my ___ \nI’ll keep you by my side \nWith my ____ might \nKryptonite");
		t00.setTranslateX(30);
		t00.setTranslateY(10);
		t00.setFont(Font.font ("Verdana", 15));

		grid2.getChildren().addAll(label,textField,label2,textField2,label3,textField3,label4,textField4,button2,t,t00);

		////////////////////////////////////////////////////////////////////////////closes window1 opens window2
		button1.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{

				primaryStage.close();
				stage.show();
			}
		});
		////////////////////////////////////////////////////////////////////////////////////////
		Stage stageAnswer1 = new Stage();
		stageAnswer1.setTitle("Level 1 Results"); 
		StackPane pane3 = new StackPane(); // Create a new stage3
		pane3.setStyle("-fx-background-color: #000000;");
		Scene scene2 = new Scene(pane3, 400, 350); 
		stageAnswer1.setScene(scene2);

		Button button3 = new Button(); ///button for stage 3
		button3.setText("Next");
		button3.setTranslateX(0);
		button3.setTranslateY(160);
		button3.defaultButtonProperty().bind(button3.focusedProperty());  
		pane3.getChildren().add(button3);


		button2.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				stage.close();
				stageAnswer1.show();

				String text = textField.getText();
				String text2 = textField2.getText();
				String text3 = textField3.getText();
				String text4 = textField4.getText();

				if(text.equals("CRAZY") && text2.equals("ALIVE") && text3.equals("HAND")&& text4.equals("SUPERHUMAN") )
				{	  
					Text correct = new Text ();
					correct.setWrappingWidth(200);
					correct.setText("CORRECT!");
					correct.setFill(Color.WHITE);
					correct.setFont(Font.font ("Verdana", 30));
					correct.setTranslateX(15);
					correct.setTranslateY(-90);
					pane3.getChildren().add(correct);

					final   ImageView iv1 = new ImageView();    
					Image image2 = new Image("file:src/3dd.png");
					iv1.setImage(image2);
					iv1.setFitWidth(400);
					iv1.setTranslateX(0);
					iv1.setPreserveRatio(true);
					iv1.setSmooth(true);
					iv1.setCache(true);
					pane3.getChildren().add(iv1);
					Score.increaseScoreByOne();
					A[0]= Score.getScore();
				}
				else
				{	Text wrong = new Text();
				wrong.setWrappingWidth(100);
				wrong.setText("WRONG");
				wrong.setFill(Color.WHITE);
				wrong.setFont(Font.font ("Verdana", 25));
				wrong.setTranslateX(0);
				wrong.setTranslateY(-150);
				pane3.getChildren().add(wrong);;

				final   ImageView iv2 = new ImageView();    
				Image image22 = new Image("file:src/sadface.png");
				iv2.setImage(image22);
				iv2.setFitWidth(200);
				iv2.setTranslateX(0);
				iv2.setPreserveRatio(true);
				iv2.setSmooth(true);
				iv2.setCache(true);
				pane3.getChildren().add(iv2);
				A[0]= Score.getScore();

				}

			}	
		});  

		//////////////////////////////////////////////////////////////////////////////////////////////
		GridPane grid3 = new GridPane();
		grid3.setPadding(new Insets(10,10,10,10)); ////adds padding to sides of window
		grid3.setVgap(8);//vertical spacing
		grid3.setHgap(8);//horizontal

		Stage stage2 = new Stage();
		stage2.setScene(new Scene(grid3, 420, 450));  
		stage2.setTitle("Level 2"); 

		Button button4 = new Button(); ///button for stage 3
		button4.setText("Next");
		button4.setTranslateX(150);
		button4.setTranslateY(270);	
		button4.defaultButtonProperty().bind(button4.focusedProperty());  
		pane3.getChildren().add(button4);

		Label label01 = new Label("1.");  
		label01.setTranslateX(5);
		label01.setTranslateY(140);	


		TextField textField01 = new TextField ();
		textField01.setTranslateX(50);
		textField01.setTranslateY(140);	
		textField01.setMaxWidth(200);

		Label label02 = new Label("2.");  
		label02.setTranslateX(5);
		label02.setTranslateY(170);	

		TextField textField02 = new TextField ();
		textField02.setTranslateX(50);
		textField02.setTranslateY(170);	
		textField02.setMaxWidth(200);

		Label label03 = new Label("3.");  
		label03.setTranslateX(5);
		label03.setTranslateY(200);	

		TextField textField03 = new TextField ();
		textField03.setTranslateX(50);
		textField03.setTranslateY(200);	
		textField03.setMaxWidth(200);

		Label label04 = new Label("4.");  
		label04.setTranslateX(5);
		label04.setTranslateY(230);	

		TextField textField04 = new TextField ();
		textField04.setTranslateX(50);
		textField04.setTranslateY(230);	
		textField04.setMaxWidth(200);

		textField01.textProperty().addListener((ov, oldValue, newValue) -> 
		{
			textField01.setText(newValue.toUpperCase());
		});
		textField02.textProperty().addListener((ov, oldValue, newValue) -> 
		{
			textField02.setText(newValue.toUpperCase());
		});
		textField03.textProperty().addListener((ov, oldValue, newValue) -> 
		{
			textField03.setText(newValue.toUpperCase());
		});
		textField04.textProperty().addListener((ov, oldValue, newValue) -> 
		{
			textField04.setText(newValue.toUpperCase());
		});

		Text t2 = new Text();
		t2.setText("2) Chop Suey! - System of a Down");
		t2.setTranslateX(-5);
		t2.setTranslateY(-50);
		t2.setFill(Color.BLUE);
		t2.setFont(Font.font ("Verdana", 20));


		Text t02 = new Text();
		t02.setWrappingWidth(300);
		t02.setText("Wake up (wake up)\nGrab a ___ and put a little make-up \nHide the scars to ____ away the shake-up \nWhy'd you leave the _____ upon the table?\nHere you go create another _____");
		t02.setTranslateX(25);
		t02.setTranslateY(50);
		t02.setFont(Font.font ("Verdana", 15));

		grid3.getChildren().addAll(label01,textField01,label02,textField02,label03,textField03,label04,textField04,button4,t2,t02);


		//////////////////////////////////////////////////////////////////////

		button3.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				stageAnswer1.close();
				stage2.show();

			}	
		});
		////////////////////////////////////////////////////////////////////////////////////
		StackPane pane4 = new StackPane(); // Create a new stage3
		Stage stageAnswer2 = new Stage();
		pane4.setStyle("-fx-background-color: #000000;");
		stageAnswer2.setScene(new Scene(pane4, 400, 500));   
		stageAnswer2.setTitle("Level 2 Results"); 


		Button button5 = new Button(); ///button for stage 3
		button5.setText("Next");
		button5.setTranslateX(0);
		button5.setTranslateY(225);
		button5.defaultButtonProperty().bind(button5.focusedProperty());  
		pane4.getChildren().add(button5);


		button4.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				stage2.close();
				stageAnswer2.show();
				String text01 = textField01.getText();
				String text02 = textField02.getText();
				String text03 = textField03.getText();
				String text04 = textField04.getText();

				if(text01.equals("BRUSH")&& text02.equals("FADE")&& text03.equals("KEYS")&& text04.equals("FABLE"))
				{	Text correct = new Text ();
				correct.setWrappingWidth(200);
				correct.setText("CORRECT!");
				correct.setFill(Color.WHITE);
				correct.setFont(Font.font ("Verdana", 30));
				correct.setTranslateX(15);
				correct.setTranslateY(-90);
				pane4.getChildren().add(correct);

				final   ImageView iv1 = new ImageView();    
				Image image2 = new Image("file:src/SOAD.png");
				iv1.setImage(image2);
				iv1.setFitWidth(400);
				iv1.setTranslateX(0);
				iv1.setPreserveRatio(true);
				iv1.setSmooth(true);
				iv1.setCache(true);
				pane4.getChildren().add(iv1);
				Score.increaseScoreByOne();
				A[1]= Score.getScore();

				}
				else
				{	Text wrong = new Text();
				wrong.setWrappingWidth(100);
				wrong.setText("WRONG");
				wrong.setFill(Color.WHITE);
				wrong.setFont(Font.font ("Verdana", 25));
				wrong.setTranslateX(0);
				wrong.setTranslateY(-150);
				pane4.getChildren().add(wrong);;

				final   ImageView iv2 = new ImageView();    
				Image image22 = new Image("file:src/sadface.png");
				iv2.setImage(image22);
				iv2.setFitWidth(200);
				iv2.setTranslateX(0);
				iv2.setPreserveRatio(true);
				iv2.setSmooth(true);
				iv2.setCache(true);
				pane4.getChildren().add(iv2);
				A[1]= Score.getScore();

				}	}
		}); 


		////////////////////////////////////////////////////////////////////////////////////////////////////////////window 4
		GridPane grid4 = new GridPane();
		grid4.setPadding(new Insets(10,10,10,10)); ////adds padding to sides of window
		grid4.setVgap(8);//vertical spacing
		grid4.setHgap(8);//horizontal


		Stage stage3 = new Stage();
		stage3.setScene(new Scene(grid4, 400, 400));  
		stage3.setTitle("Level 3"); // Set the stage title ///second stage name

		Button button6 = new Button(); ///button for stage 4
		button6.setText("Next");
		button6.setTranslateX(150);
		button6.setTranslateY(240);
		button6.defaultButtonProperty().bind(button6.focusedProperty());
		
		Label label001 = new Label("1.");  
		label001.setTranslateX(5);
		label001.setTranslateY(120);

		TextField textField001 = new TextField ();
		textField001.setTranslateX(50);
		textField001.setTranslateY(120);	
		textField001.setMaxWidth(200);

		Label label002 = new Label("2.");  
		label002.setTranslateX(5);
		label002.setTranslateY(150);

		TextField textField002 = new TextField ();
		textField002.setTranslateX(50);
		textField002.setTranslateY(150);	
		textField002.setMaxWidth(200);

		Label label003 = new Label("3.");  
		label003.setTranslateX(5);
		label003.setTranslateY(180);

		TextField textField003 = new TextField ();
		textField003.setTranslateX(50);
		textField003.setTranslateY(180);	
		textField003.setMaxWidth(200);

		Label label004 = new Label("4.");  
		label004.setTranslateX(5);
		label004.setTranslateY(210);

		TextField textField004 = new TextField ();
		textField004.setTranslateX(50);
		textField004.setTranslateY(210);	
		textField004.setMaxWidth(200);


		textField001.textProperty().addListener((ov, oldValue, newValue) 		-> {
			textField001.setText(newValue.toUpperCase());
		});
		textField002.textProperty().addListener((ov, oldValue, newValue) 		-> {
			textField002.setText(newValue.toUpperCase());
		});
		textField003.textProperty().addListener((ov, oldValue, newValue) 		-> {
			textField003.setText(newValue.toUpperCase());
		});
		textField004.textProperty().addListener((ov, oldValue, newValue) 		-> {
			textField004.setText(newValue.toUpperCase());
		});

		Text t3 = new Text();
		t3.setText("3) All The Small Things - Blink-182");
		t3.setTranslateX(-5);
		t3.setTranslateY(-30);
		t3.setFill(Color.BLUE);
		t3.setFont(Font.font ("Verdana", 20));

		Text t03 = new Text();
		t03.setWrappingWidth(300);
		t03.setText("Say it ain't so, I will not _____\nTurn the ____ off, carry me home\nKeep your ____ still, I'll be your thrill\nThe _____ will go on, my little windmill");
		t03.setTranslateX(30);
		t03.setTranslateY(30);
		t03.setFont(Font.font ("Verdana", 15));

		grid4.getChildren().addAll(label001,textField001,label002,textField002,label003,textField003,label004,textField004,button6,t3,t03);

		button5.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{

				stageAnswer2.close();
				stage3.show();
			}
		});
		////////////////////////////////////////////////////////////////////////

		StackPane pane5 = new StackPane(); // Create a new stage
		Stage stageAnswer3 = new Stage();
		stageAnswer3.setScene(new Scene(pane5, 400, 350));   
		stageAnswer3.setTitle("Level 3 results"); 
		pane5.setStyle("-fx-background-color: #000000;");

		Button button7 = new Button(); ///button for stage 3
		button7.setText("Next");
		button7.setTranslateX(0);
		button7.setTranslateY(160);
		button7.defaultButtonProperty().bind(button7.focusedProperty());  
		pane5.getChildren().add(button7);

		button6.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				stage3.close();
				stageAnswer3.show();
				String text4 = textField001.getText();
				String text5 = textField002.getText();
				String text6= textField003.getText();
				String text7= textField004.getText();

				if(text4.equals("GO")&& text5.equals("LIGHTS")&& text6.equals("HEAD")&& text7.equals("NIGHT"))
				{	Text correct = new Text ();
				correct.setWrappingWidth(200);
				correct.setText("CORRECT!");
				correct.setFill(Color.WHITE);
				correct.setFont(Font.font ("Verdana", 30));
				correct.setTranslateX(15);
				correct.setTranslateY(-90);
				pane5.getChildren().add(correct);

				final   ImageView iv1 = new ImageView();    
				Image image2 = new Image("file:src/blink182.png");
				iv1.setImage(image2);
				iv1.setFitWidth(400);
				iv1.setTranslateX(0);
				iv1.setPreserveRatio(true);
				iv1.setSmooth(true);
				iv1.setCache(true);
				pane5.getChildren().add(iv1);
				Score.increaseScoreByOne();
				A[2]= Score.getScore();
				}
				else
				{	Text wrong = new Text();
				wrong.setWrappingWidth(100);
				wrong.setText("WRONG");
				wrong.setFill(Color.WHITE);
				wrong.setFont(Font.font ("Verdana", 25));
				wrong.setTranslateX(0);
				wrong.setTranslateY(-150);
				pane5.getChildren().add(wrong);;

				final   ImageView iv2 = new ImageView();    
				Image image22 = new Image("file:src/sadface.png");
				iv2.setImage(image22);
				iv2.setFitWidth(200);
				iv2.setTranslateX(0);
				iv2.setPreserveRatio(true);
				iv2.setSmooth(true);
				iv2.setCache(true);
				pane5.getChildren().add(iv2);;
				A[2]= Score.getScore();
				}
			}	
		});

		//////////////////////////////////////////////////////////////////////////////


		GridPane grid5 = new GridPane();
		grid5.setPadding(new Insets(10,10,10,10)); ////adds padding to sides of window
		grid5.setVgap(8);//vertical spacing
		grid5.setHgap(8);//horizontal

		Stage stage4 = new Stage();
		stage4.setScene(new Scene(grid5, 500, 400));  
		stage4.setTitle("Level 4"); // Set the stage title ///second stage name

		Button button8 = new Button(); ///button for stage 2
		button8.setText("Next");
		button8.setTranslateX(150);
		button8.setTranslateY(300);
		button8.defaultButtonProperty().bind(button8.focusedProperty());  
		
		Label label7 = new Label("1.");  
		label7.setTranslateX(5);
		label7.setTranslateY(115);

		TextField textField7 = new TextField ();
		textField7.setTranslateX(50);
		textField7.setTranslateY(115);	
		textField7.setMaxWidth(200);

		Label label8 = new Label("2.");  
		label8.setTranslateX(5);
		label8.setTranslateY(150);

		TextField textField8 = new TextField ();
		textField8.setTranslateX(50);
		textField8.setTranslateY(150);	
		textField8.setMaxWidth(200);


		Label label9 = new Label("3.");  
		label9.setTranslateX(5);
		label9.setTranslateY(180);

		TextField textField9 = new TextField ();
		textField9.setTranslateX(50);
		textField9.setTranslateY(180);
		textField9.setMaxWidth(200);


		Label label10 = new Label("4.");  
		label10.setTranslateX(5);
		label10.setTranslateY(210);

		TextField textField10 = new TextField ();
		textField10.setTranslateX(50);
		textField10.setTranslateY(210);
		textField10.setMaxWidth(200);

		Label label11 = new Label("5.");  
		label11.setTranslateX(5);
		label11.setTranslateY(240);

		TextField textField11 = new TextField ();
		textField11.setTranslateX(50);
		textField11.setTranslateY(240);
		textField11.setMaxWidth(200);


		Label label12 = new Label("6.");  
		label12.setTranslateX(5);
		label12.setTranslateY(270);

		TextField textField12 = new TextField ();
		textField12.setTranslateX(50);
		textField12.setTranslateY(270);
		textField12.setMaxWidth(200);


		textField7.textProperty().addListener((ov, oldValue, newValue) -> {
			textField7.setText(newValue.toUpperCase());
		});

		textField8.textProperty().addListener((ov, oldValue, newValue) -> {
			textField8.setText(newValue.toUpperCase());
		});

		textField9.textProperty().addListener((ov, oldValue, newValue) -> {
			textField9.setText(newValue.toUpperCase());
		});

		textField10.textProperty().addListener((ov, oldValue, newValue) -> {
			textField10.setText(newValue.toUpperCase());
		});
		textField11.textProperty().addListener((ov, oldValue, newValue) -> {
			textField11.setText(newValue.toUpperCase());
		});

		textField12.textProperty().addListener((ov, oldValue, newValue) -> {
			textField12.setText(newValue.toUpperCase());
		});

		Text t4 = new Text();
		t4.setText("4)American Idiot - Green Day");
		t4.setTranslateX(-5);
		t4.setTranslateY(-40);
		t4.setFill(Color.BLUE);
		t4.setFont(Font.font ("Verdana", 20));

		Text t04 = new Text();
		t04.setWrappingWidth(300);
		t04.setText("Welcome to a new kind of ______.\nAll across the _____.\nWhere everything isn't meant to be ______. Television ____ of tomorrow.\nWe're not the ones who're meant to ______. For that's enough to ____.");
		t04.setTranslateX(40);
		t04.setTranslateY(35);
		t04.setFont(Font.font ("Verdana", 15));

		grid5.getChildren().addAll(label7,textField7,label8,textField8,label9,textField9,label10,textField10,label11,textField11,label12,textField12,button8,t4,t04);

		button7.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{

				stageAnswer3.close();
				stage4.show();
			}
		});

		//////////////////////////////////////////////////////////////////////////	
		StackPane pane6 = new StackPane(); // Create a new stage
		Stage stageAnswer4 = new Stage();
		stageAnswer4.setScene(new Scene(pane6, 400, 450));   
		stageAnswer4.setTitle("Level 4 Results"); 

		pane6.setStyle("-fx-background-color: #000000;");

		Button button9 = new Button(); ///button for stage 3
		button9.setText("Next");
		button9.setTranslateX(0);
		button9.setTranslateY(210);
		button9.defaultButtonProperty().bind(button9.focusedProperty());  
		pane6.getChildren().add(button9);


		button8.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				stage4.close();
				stageAnswer4.show();

				String text7 = textField7.getText();
				String text8 = textField8.getText();
				String text9= textField9.getText();
				String text10= textField10.getText();
				String text11= textField11.getText();
				String text12= textField12.getText();


				if(text7.equals("TENSION")&& text8.equals("ALIENATION") && text9.equals("OKAY")&&text10.equals("DREAMS") && text11.equals("FOLLOW")&& text12.equals("ARGUE"))
				{	Text correct = new Text ();
				correct.setWrappingWidth(200);
				correct.setText("CORRECT!");
				correct.setFill(Color.WHITE);
				correct.setFont(Font.font ("Verdana", 30));
				correct.setTranslateX(15);
				correct.setTranslateY(-90);
				pane6.getChildren().add(correct);

				final   ImageView iv1 = new ImageView();    
				Image image2 = new Image("file:src/GD.png");
				iv1.setImage(image2);
				iv1.setFitWidth(400);
				iv1.setTranslateX(0);
				iv1.setTranslateY(-10);
				iv1.setPreserveRatio(true);
				iv1.setSmooth(true);
				iv1.setCache(true);
				pane6.getChildren().add(iv1);
				Score.increaseScoreByOne();
				A[3]= Score.getScore();
				}
				else
				{	Text wrong = new Text();
				wrong.setWrappingWidth(100);
				wrong.setText("WRONG");
				wrong.setFill(Color.WHITE);
				wrong.setFont(Font.font ("Verdana", 25));
				wrong.setTranslateX(0);
				wrong.setTranslateY(-150);
				pane6.getChildren().add(wrong);;

				final   ImageView iv2 = new ImageView();    
				Image image22 = new Image("file:src/sadface.png");
				iv2.setImage(image22);
				iv2.setFitWidth(200);
				iv2.setTranslateX(0);
				iv2.setPreserveRatio(true);
				iv2.setSmooth(true);
				iv2.setCache(true);
				pane6.getChildren().add(iv2);;
				A[3]= Score.getScore();

				}
			}	
		});

		/////////////////////////////////////////////////////////////////////END TOTAL		

		GridPane gridEnd = new GridPane();
		gridEnd.setPadding(new Insets(10,10,10,10)); ////adds padding to sides of window
		gridEnd.setVgap(8);//vertical spacing
		gridEnd.setHgap(8);//horizontal

		Stage stageEnd= new Stage();
		stageEnd.setScene(new Scene(gridEnd, 500, 400));  
		stageEnd.setTitle("End Total"); // Set the stage title ///second 	stage name

		Button buttonEnd = new Button(); ///button for stage 4
		buttonEnd.setText("Next");
		buttonEnd.setTranslateX(150);
		buttonEnd.setTranslateY(240);


		gridEnd.setStyle("-fx-background-color: #000000;");


		button9.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				Text tEnd = new Text();
				tEnd.setWrappingWidth(300);
				tEnd.setText("Total Score: " +  A[3] + "/4");
				tEnd.setTranslateX(50);
				tEnd.setTranslateY(200);
				tEnd.setFill(Color.WHITE);
				tEnd.setFont(Font.font ("Verdana", 40));
				ImageView iv1 = new ImageView();    
				Image image2 = new Image("file:src/ThankYouForPlaying.png");

				iv1.setImage(image2);
				iv1.setFitWidth(400);
				iv1.setTranslateX(50);
				iv1.setTranslateY(10);
				iv1.setPreserveRatio(true);
				iv1.setSmooth(true);
				iv1.setCache(true);

				gridEnd.getChildren().addAll(tEnd,iv1);

				stageAnswer4.close();
				stageEnd.show();

			}
		});
	}
}
