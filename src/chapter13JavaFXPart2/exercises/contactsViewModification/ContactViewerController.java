package chapter13JavaFXPart2.exercises.contactsViewModification;// Fig. 13.14: CoverViewerController.java
// Controller for Cover Viewer application

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContactViewerController extends Window {
    // instance variables for interacting with GUI
    @FXML    private ListView<Contact> contactsListView;
    @FXML    private TextField nameTextField;
    @FXML private TextField lastNameTextField;
    @FXML    private TextField emailTextField;
    @FXML private TextField phoneTextField;
    @FXML private ImageView ImageView;
    private int index;


    static Logger logger = Logger.getLogger(ContactViewerController.class.getName());
    // stores the list of Book Objects
    private final ObservableList<Contact> contacts =
            FXCollections.observableArrayList();

    // initialize controller
    public void initialize() {
        // populate the ObservableList<Book>
        contacts.add(new Contact("Androd", "Lesiek",
                "chapter", "5346265", "kapelusz.png"));
        contacts.add(new Contact("Barba", "SSielska",
                "@", "53443346265", "kapelusz.png"));
        contacts.add(new Contact("afd", "Lessfadafiek",
                "@@", "5435", "kapelusz.png"));
        contacts.add(new Contact("qweqr", "refg",
                "@@@@", "5346265", "kapelusz.png"));
        contacts.add(new Contact("gsfb", "sdbgbsd",
                "@@@@", "5346265", "kapelusz.png"));
        contacts.add(new Contact("dafv", "afdvf",
                "3###", "5346265", "kapelusz.png"));
        contactsListView.setItems(contacts); // bind booksListView to books

        String path =  new File("kapelusz.png").getPath();


        logger.log(Level.CONFIG, "image path" + path);
        // when ListView selection changes, show large cover in ImageVie
        contactsListView.getSelectionModel().selectedItemProperty().
                addListener(
                        new ChangeListener<Contact>() {
                            @Override
                            public void changed(ObservableValue<? extends Contact> ov,
                                                Contact oldValue, Contact newValue) {
                                lastNameTextField.setText(newValue.getLastName());
                                nameTextField.setText(newValue.getName());
                                emailTextField.setText(newValue.getEmail());
                                phoneTextField.setText(newValue.getPhoneNumber());
                                ImageView.setImage(new Image("file:\\" + newValue.getImagePath()));
                            }
                        }
                );

    }

    @FXML
    void addButton(ActionEvent event) {
        contacts.add(new Contact(nameTextField.getText(), lastNameTextField.getText(),
                emailTextField.getText(), phoneTextField.getText(), ImageView.getImage().getUrl()));
        lastNameTextField.clear();
        nameTextField.clear();
        emailTextField.clear();
        phoneTextField.clear();
        ImageView.setImage(null);
        contactsListView.setItems(contacts);
    }

    @FXML
    void deleteButton(ActionEvent event) {
        int count = contacts.size();
        index = contactsListView.getSelectionModel().getSelectedIndex();
        // if there are any shapes remove the last one added
        if (count > 0) {
            contacts.remove(index);
            contactsListView.setItems(contacts);
        }
    }

    @FXML
    void addImage(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Wybierz zdjęcie");
        File file = fileChooser.showOpenDialog(this);

        String path = file.getPath();
        logger.log(Level.CONFIG, " Here is some INFO " + path);

        ImageView.setImage(new Image("file:\\" + path));

    }

    }

