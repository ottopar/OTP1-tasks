package Tasks;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        TemperatureConverter tc = new TemperatureConverter();

        TextField input = new TextField();
        ComboBox<String> combo = new ComboBox<>();
        combo.getItems().addAll(
                "Celsius to Fahrenheit",
                "Fahrenheit to Celsius",
                "Kelvin to Celsius",
                "Celsius to Kelvin"
        );
        combo.getSelectionModel().selectFirst();

        Button convert = new Button("Convert");
        Label result = new Label("Result: ");

        convert.setOnAction(e -> {
            try {
                double value = Double.parseDouble(input.getText());
                String type = combo.getValue();
                double res = switch (type) {
                    case "Celsius to Fahrenheit" -> tc.celsiusToFahrenheit(value);
                    case "Fahrenheit to Celsius" -> tc.fahrenheitToCelsius(value);
                    case "Kelvin to Celsius" -> tc.kelvinToCelsius(value);
                    case "Celsius to Kelvin" -> tc.celsiusToKelvin(value);
                    default -> 0;
                };
                result.setText("Result: " + res);
            } catch (Exception ex) {
                result.setText("Invalid input!");
            }
        });

        VBox root = new VBox(10, input, combo, convert, result);
        root.setPadding(new Insets(20));
        primaryStage.setScene(new Scene(root, 350, 180));
        primaryStage.setTitle("Temperature Converter");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
