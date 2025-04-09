module com.example.contato {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.contato to javafx.fxml;
    opens com.example.contato.controller to javafx.fxml;
    opens com.example.contato.view to javafx.fxml;
    opens com.example.contato.model to javafx.base;

    exports com.example.contato;
    exports com.example.contato.controller;
    exports com.example.contato.view;
    exports com.example.contato.model;
}
