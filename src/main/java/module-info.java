module com.example.cardashboard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cardashboard to javafx.fxml;
    exports com.example.cardashboard;
    exports com.example.cardashboard.saveopenfile;
    opens com.example.cardashboard.saveopenfile to javafx.fxml;
}