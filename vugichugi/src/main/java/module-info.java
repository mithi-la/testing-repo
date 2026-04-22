module com.example.vugichugi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vugichugi to javafx.fxml;
    exports com.example.vugichugi;
}