package com.example.word_dic;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Controller {
  private    DictionarySaver db;
  @FXML
  TextField Search1;
  @FXML
    public void  searchButton(MouseEvent event)  {
      try {
          db = new DictionarySaver();
          db.deserializeHashMap();

          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setHeaderText("Dictionary");
          if(Search1.getText().equals("")){
              alert.setContentText(" Please enter text to Search");
              alert.showAndWait();
          }
          else if (db.getDictionaryList().containsKey(Search1.getText().toLowerCase())) {
              alert.setContentText(" Word is found in the dictionary");
              alert.showAndWait();
          }
          else {

              alert.setContentText(" Word is not found in the dictionary");
              alert.showAndWait();
          }
      }
      catch(IOException | ClassNotFoundException ex){
          db.serializeHashMap();
          System.out.println("Exception Resolved");
      }
  }
  @FXML
  TextField newWord;
  @FXML
  TextField meaning;

  @FXML
  public void  Add(MouseEvent event) throws Exception{
   db= new DictionarySaver();
   db.deserializeHashMap();
      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setHeaderText("Dictionary");

      if(newWord.getText().equals("") || meaning.getText().equals("") ){
          alert.setContentText(" Please enter new word and its meaning to add in the dictionary");
          alert.showAndWait();
      }
      else if(db.getDictionaryList().containsKey(newWord.getText().toLowerCase())){
          alert.setContentText(" the word is already present    ");
          alert.showAndWait();
      }

   else{
          db.getDictionaryList().put(newWord.getText().toLowerCase(),meaning.getText());
          db.serializeHashMap();
          alert.setContentText("New Word is added to the dictionary");
          alert.showAndWait();
      }
  }
  @FXML
  TextField find;
  @FXML
  public void  Meaning(MouseEvent event) throws Exception{
   db= new DictionarySaver();
   db.deserializeHashMap();

      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setHeaderText("Meaning");

      if(find.getText().equals("")){
          alert.setContentText(" Please enter text to find meaning");
          alert.showAndWait();
      }


   else if(db.getDictionaryList().containsKey(find.getText().toLowerCase())){
       alert.setContentText(db.getDictionaryList().get(find.getText().toLowerCase()));
       alert.showAndWait();
   }
   else {
       alert.setContentText("The Word is not available in the dictionary");
       alert.showAndWait();
   }
  }






}
