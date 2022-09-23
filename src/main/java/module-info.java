module com.stat.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.stat.calculator to javafx.fxml;
    exports com.stat.calculator;
}