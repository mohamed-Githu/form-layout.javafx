package form;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Form extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setHgap(15);
        root.setVgap(15);
        
        Text title = new Text("Java FX");
        Text nameText = new Text("Name");
        Text lastNameText = new Text("Cognome");
        Text emailText = new Text("Email");

        Label hobiesLable = new Label("Hobbies");

        Text sexName = new Text("Sex");

        TextField nameInput = new TextField();
        TextField lastNameInput = new TextField();
        TextField emailInput = new TextField();

        ToggleGroup radioGroup = new ToggleGroup();
        RadioButton button1 = new RadioButton("m");
        RadioButton button2 = new RadioButton("f");
        button1.setToggleGroup(radioGroup);
        button2.setToggleGroup(radioGroup);

        CheckBox c1 = new CheckBox("TV");
        CheckBox c2 = new CheckBox("Sport");

        ComboBox<String> cities = new ComboBox<String>();

        cities.getItems().addAll("Cairo", "Alex", "Giza");

        Button submit = new Button("submit");

        root.add(title, 1, 0);

        root.add(nameText, 0, 1);
        root.add(lastNameText, 0, 2);
        root.add(emailText, 0, 3);

        root.add(nameInput, 1, 1);
        root.add(lastNameInput, 1, 2);
        root.add(emailInput, 1, 3);

        root.add(sexName, 0, 4);
        root.add(button1, 1, 4);
        root.add(button2, 2, 4);

        root.add(hobiesLable, 0, 5);
        root.add(c1, 1, 5);
        root.add(c2, 2, 5);

        root.add(cities, 1, 6);

        root.add(submit, 1, 7);

        Scene scene = new Scene(root, 400, 350);

        primaryStage.setTitle("JavaFX Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
