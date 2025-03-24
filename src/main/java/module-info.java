module AppC {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires transitive javafx.graphics;
	requires jdk.httpserver;
    
    opens Gapp to javafx.fxml;
    exports Gapp;
}