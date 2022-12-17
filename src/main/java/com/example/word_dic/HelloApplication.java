package com.example.word_dic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Group root;
    @Override
    public void start(Stage stage) throws IOException {

        
        root=new Group();
        stage.setTitle("Word Dictionary");

        //stage.getIcons().add(new Image("dictionary.jpg"));
        DictionaryPage page = new DictionaryPage();
        root.getChildren().add(page.root);
        Scene scene = new Scene(root, 500, 500);

        stage.setScene(scene);
        stage.show();
        HBox hbox = new HBox( );
        BackgroundFill background_fill = new BackgroundFill(Color.PINK,
                CornerRadii.EMPTY, Insets.EMPTY);

        // create Background
        Background background = new Background(background_fill);
        hbox.setBackground(background);
    }

    public static void main(String[] args) {
        launch();
    }
}