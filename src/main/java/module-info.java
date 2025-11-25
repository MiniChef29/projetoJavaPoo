module org.example.projetopoo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.projetopoo to javafx.fxml;
    exports org.example.projetopoo;
}