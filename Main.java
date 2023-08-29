import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Simple Converter");

    //Scene 1 - Weight
        //New Border Pane
        BorderPane border = new BorderPane();

        //Initializing grid
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(10);

        //Setting Top Menu
        VBox topMenu = new VBox();
        topMenu.setSpacing(10);
        Label header = new Label("Welcome to the weight converter");
        header.setStyle("-fx-font-size: 13pt");
        header.setStyle("-fx-font-weight: bold");
        ChoiceBox<String> modeSelect = new ChoiceBox<>();
        modeSelect.getItems().addAll("Weight", "Height");
        topMenu.getChildren().addAll(header,modeSelect);
        topMenu.setAlignment(Pos.CENTER);


        //Grid Components
        Button convertKg = new Button("Convert");

        Button convertLbs = new Button("Convert");
        Button convertGrams = new Button("Convert");

        Label kgText = new Label("kg");
        Label lbsText = new Label("lbs");
        Label gramsText = new Label("grams");

        TextField kg = new TextField();
        kg.setPromptText("Insert Value");
        TextField lbs = new TextField();
        lbs.setPromptText("Insert Value");
        TextField grams = new TextField();
        grams.setPromptText("Insert Value");

        //Assigning Grid Locations
        GridPane.setConstraints(kgText, 0,0);
        GridPane.setConstraints(kg, 1,0);
        GridPane.setConstraints(convertKg, 2,0);
        GridPane.setConstraints(lbsText, 0,1);
        GridPane.setConstraints(lbs, 1,1);
        GridPane.setConstraints(convertLbs, 2,1);
        GridPane.setConstraints(gramsText, 0,2);
        GridPane.setConstraints(grams, 1,2);
        GridPane.setConstraints(convertGrams, 2,2);

        //Buttons functionality
        convertKg.setOnAction(e -> {
            try{
                double val = Double.parseDouble(kg.getText());
                lbs.setText("" + (val*2.2046));
                grams.setText(""+ (val*1000));
            }catch(Exception NotANumber){
                kg.setText("Error: Not a real number");
                lbs.clear();
                grams.clear();
            }
        });
        convertLbs.setOnAction(e -> {
            try{
                double val = Double.parseDouble(lbs.getText());
                kg.setText("" + (val*0.45359237));
                grams.setText(""+ (val*0.45359237*1000));
            }catch(Exception NotANumber){
                lbs.setText("Error: Not a real number");
                kg.clear();
                grams.clear();
            }
        });
        convertGrams.setOnAction(e -> {
            try{
                double val = Double.parseDouble(grams.getText());
                lbs.setText("" + ((val/1000)*0.45359237));
                kg.setText(""+ (val/1000));
            }catch(Exception NotANumber){
                grams.setText("Error: Not a real number");
                lbs.clear();
                kg.clear();
            }
        });

        //Assigning Grid components
        grid.getChildren().addAll(convertKg, kg, kgText, lbs,lbsText,convertLbs, grams,gramsText,convertGrams);
        grid.setAlignment(Pos.TOP_CENTER);

        //BorderPane assignments
        border.setTop(topMenu);
        border.setCenter(grid);

        //Initializing scene for weight
        Scene weight = new Scene(border,400,200);
        weight.getStylesheets().add("Styling.css");


    //Scene 2
        BorderPane border2 = new BorderPane();

        //Initializing grid
        GridPane gridHeight = new GridPane();
        gridHeight.setPadding(new Insets(10,10,10,10));
        gridHeight.setVgap(10);
        gridHeight.setHgap(10);

        //Setting Top Menu
        VBox topMenu1 = new VBox();
        topMenu1.setSpacing(10);
        Label header2 = new Label("Welcome To The Height Converter");
        ChoiceBox<String> modeSelect1 = new ChoiceBox<>();
        modeSelect1.getItems().addAll("Weight", "Height");
        header2.setStyle("-fx-font-size: 13pt");
        header2.setStyle("-fx-font-weight: bold");
        topMenu1.getChildren().addAll(header2,modeSelect1);
        topMenu1.setAlignment(Pos.CENTER);


        //Grid Components
        Button convertMeter = new Button("Convert");
        Button convertCm = new Button("Convert");
        Button convertFt = new Button("Convert");

        Label meterText = new Label("meter");
        Label cmText = new Label("cm");
        Label ftText = new Label("ft");

        TextField meter = new TextField();
        meter.setPromptText("Insert Value");
        TextField centimeter = new TextField();
        centimeter.setPromptText("Insert Value");
        TextField feet = new TextField();
        feet.setPromptText("Insert Value");

        //Assigning Grid Locations
        GridPane.setConstraints(meterText, 0,0);
        GridPane.setConstraints(meter, 1,0);
        GridPane.setConstraints(convertMeter, 2,0);
        GridPane.setConstraints(cmText, 0,1);
        GridPane.setConstraints(centimeter, 1,1);
        GridPane.setConstraints(convertCm, 2,1);
        GridPane.setConstraints(ftText, 0,2);
        GridPane.setConstraints(feet, 1,2);
        GridPane.setConstraints(convertFt, 2,2);

        //Buttons functionality
        convertMeter.setOnAction(e -> {
            try{
                double val = Double.parseDouble(kg.getText());
                lbs.setText("" + (val*2.2046));
                grams.setText(""+ (val*1000));
            }catch(Exception NotANumber){
                kg.setText("Error: Not a real number");
                lbs.clear();
                grams.clear();
            }
        });
        convertCm.setOnAction(e -> {
            try{
                double val = Double.parseDouble(lbs.getText());
                kg.setText("" + (val*0.45359237));
                grams.setText(""+ (val*0.45359237*1000));
            }catch(Exception NotANumber){
                lbs.setText("Error: Not a real number");
                kg.clear();
                grams.clear();
            }
        });
        convertFt.setOnAction(e -> {
            try{
                double val = Double.parseDouble(grams.getText());
                lbs.setText("" + ((val/1000)*0.45359237));
                kg.setText(""+ (val/1000));
            }catch(Exception NotANumber){
                grams.setText("Error: Not a real number");
                lbs.clear();
                kg.clear();
            }
        });

        //Assigning Grid components
        gridHeight.getChildren().addAll(convertCm,convertFt,convertMeter, meter, centimeter,feet, cmText,meterText,ftText);
        gridHeight.setAlignment(Pos.TOP_CENTER);

        //BorderPane assignments
        border2.setTop(topMenu1);
        border2.setCenter(gridHeight);


        Scene height = new Scene(border2, 400,200);
        height.getStylesheets().add("Styling.css");

        modeSelect.getSelectionModel().selectedItemProperty().addListener((v, oldVal, newVal) -> {
            if(newVal.equals("Height")){
                stage.setScene(height);
            } else{
                stage.setScene(weight);
            }
        });
        modeSelect1.getSelectionModel().selectedItemProperty().addListener((v, oldVal, newVal) -> {
            if(newVal.equals("Height")){
                stage.setScene(height);
            } else{
                stage.setScene(weight);
            }
        });
        stage.setScene(weight);
        stage.show();

    }
}