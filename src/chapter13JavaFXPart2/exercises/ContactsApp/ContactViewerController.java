package chapter13JavaFXPart2.exercises.ContactsApp;

// Fig. 13.14: CoverViewerController.java
// Controller for Cover Viewer application
import chapter13JavaFXPart2.coverViewerCustom.Book;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ContactViewerController {
    // instance variables for interacting with GUI
    @FXML    private ListView<Contact> contactsListView;
    @FXML    private TextField nameTextField;
    @FXML private TextField lastNameTextField;
    @FXML    private TextField emailTextField;
    @FXML private TextField phoneTextField;

    private int index;

    // stores the list of Book Objects
    private final ObservableList<Contact> contacts =
            FXCollections.observableArrayList();

    // initialize controller
    public void initialize() {
        // populate the ObservableList<Book>
        contacts.add(new Contact("Androd", "Lesiek",
                "chapter", "5346265"));
        contacts.add(new Contact("Barba", "SSielska",
                "@", "53443346265"));
        contacts.add(new Contact("afd", "Lessfadafiek",
                "@@", "5435"));
        contacts.add(new Contact("qweqr", "refg",
                "@@@@", "5346265"));
        contacts.add(new Contact("gsfb", "sdbgbsd",
                "@@@@", "5346265"));
        contacts.add(new Contact("dafv", "afdvf",
                "3###", "5346265"));
        contactsListView.setItems(contacts); // bind booksListView to books

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
                            }
                        }
                );

    }

    @FXML
    void addButton(ActionEvent event) {
        contacts.add(new Contact(nameTextField.getText(), lastNameTextField.getText(),
                emailTextField.getText(), phoneTextField.getText()));
        lastNameTextField.clear();
        nameTextField.clear();
        emailTextField.clear();
        phoneTextField.clear();
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
}
