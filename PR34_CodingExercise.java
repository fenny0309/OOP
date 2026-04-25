/* AIM:
Design a registration form UI with fields: Roll_NO (numeric), Name, Age (numeric), Email and a
Submit button. Requirements:
● Validate inputs on submit:
o RollNo and Age must be integers.
o Email must contain @ and . (basic check).
● On success show a confirmation Alert with entered data.
● On validation failure show an error alert describing the issue.
UI / Classes to use: GridPane, TextField, Button, Alert, FileChooser, FileWriter/BufferedWriter. 
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PR34_CodingExercise extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Registration Form");

      
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25));

      
        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();
        Button submitBtn = new Button("Submit");

       
        grid.add(new Label("Roll No:"), 0, 0);
        grid.add(rollField, 1, 0);
        grid.add(new Label("Name:"), 0, 1);
        grid.add(nameField, 1, 1);
        grid.add(new Label("Age:"), 0, 2);
        grid.add(ageField, 1, 2);
        grid.add(new Label("Email:"), 0, 3);
        grid.add(emailField, 1, 3);
        grid.add(submitBtn, 1, 4);

        
        submitBtn.setOnAction(e -> {
            String roll = rollField.getText();
            String name = nameField.getText();
            String age = ageField.getText();
            String email = emailField.getText();

            StringBuilder errorMsg = new StringBuilder();

            try {
                Integer.parseInt(roll);
            } catch (NumberFormatException ex) {
                errorMsg.append("- Roll No must be an integer.\n");
            }

            if (name.isEmpty()) {
                errorMsg.append("- Name is required.\n");
            }

            try {
                Integer.parseInt(age);
            } catch (NumberFormatException ex) {
                errorMsg.append("- Age must be an integer.\n");
            }

            if (!email.contains("@") || !email.contains(".")) {
                errorMsg.append("- Email must contain '@' and '.'.\n");
            }

            
            if (errorMsg.length() > 0) {
                
                showAlert(Alert.AlertType.ERROR, "Validation Error", errorMsg.toString());
            } else {
               
                String successData = "Roll: " + roll + "\nName: " + name + "\nAge: " + age + "\nEmail: " + email;
                showAlert(Alert.AlertType.INFORMATION, "Success", "Entered Data:\n" + successData);

                
                saveToFile(primaryStage, successData);
            }
        });

        Scene scene = new Scene(grid, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAlert(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void saveToFile(Stage stage, String content) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Student Record");
        File file = fileChooser.showSaveDialog(stage);

        if (file != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.write(content);
                writer.newLine();
                writer.write("--------------------");
                writer.newLine();
            } catch (IOException ex) {
                showAlert(Alert.AlertType.ERROR, "File Error", "Could not save record.");
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

