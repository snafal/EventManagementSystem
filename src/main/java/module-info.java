module com.event.eventmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.event.eventmanagementsystem to javafx.fxml;
    //opens com.event.eventmanagementsystem.Controllers to javafx.fxml;

    exports com.event.eventmanagementsystem;
    //exports com.event.eventmanagementsystem.Controllers;
}