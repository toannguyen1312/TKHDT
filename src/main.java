import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class main {

    @FXML
    private TextField t;

    @FXML
    private AnchorPane tfTile;

    @FXML
    void btnokchck(ActionEvent event) {

        Stage mainWindown = (Stage) t.getScene().getWindow();
        String title = t.getText();
        mainWindown.setTitle(title);

    }

}
