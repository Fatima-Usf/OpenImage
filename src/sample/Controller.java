package sample;

import com.sun.jndi.toolkit.url.Uri;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;

public class Controller {
    @FXML
    private ImageView vimg;
    public void chooseImage(ActionEvent event) throws IOException {

        FileChooser fc = new FileChooser();
        fc.setInitialDirectory(new File("C:\\Users\\Admin\\IdeaProjects\\OpenImage\\src\\img"));
        File file= fc.showOpenDialog(null);
        Image image = new Image(file.toURI().toString());
        vimg.setImage(image);

    }
}
