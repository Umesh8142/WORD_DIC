module com.example.word_dic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.word_dic to javafx.fxml;
    exports com.example.word_dic;
}