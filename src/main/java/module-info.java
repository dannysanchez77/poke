module com.example.poke {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;
    requires java.desktop;

    opens com.example.poke to javafx.fxml;
    exports com.example.poke;
}