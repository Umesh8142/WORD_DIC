package com.example.word_dic;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DictionaryPage {
    public AnchorPane root;
    DictionaryPage() throws IOException{
       root= FXMLLoader.load(getClass().getResource("Dictionary.fxml"));
    }
}
