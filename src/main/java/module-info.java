module com.example.hwl2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hwl2 to javafx.fxml;
    exports com.example.hwl2;
}