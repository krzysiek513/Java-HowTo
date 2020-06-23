package chapter13JavaFXPart2.coverViewerCustom;

// Fig. 13.14: CoverViewerController.java
// Controller for Cover Viewer application
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

public class CoverViewerController {
    // instance variables for interacting with GUI
    @FXML private ListView<Book> booksListView;
    @FXML private ImageView CoverImageView;

    // stores the list of Book Objects
    private final ObservableList<Book>books =
            FXCollections.observableArrayList();

    // initialize controller
    public void initialize() {
        // populate the ObservableList<Book>
        books.add(new Book("Android How to Program",
                "chapter13JavaFXPart2/coverViewer/images/small/androidhtp.png", "chapter13JavaFXPart2/coverViewer/images/large/androidhtp.png"));
        books.add(new Book("C How to Program",
                "chapter13JavaFXPart2/coverViewer/images/small/chtp.jpg", "chapter13JavaFXPart2/coverViewer/images/large/chtp.jpg"));
        books.add(new Book("C++ How to Program",
                "chapter13JavaFXPart2/coverViewer/images/small/cpphtp.jpg", "chapter13JavaFXPart2/coverViewer/images/large/cpphtp.jpg"));
        books.add(new Book("Internet and World Wide Web How to Program",
                "chapter13JavaFXPart2/coverViewer/images/small/iw3htp.jpg", "chapter13JavaFXPart2/coverViewer/images/large/iw3htp.jpg"));
        books.add(new Book("Java How to Program",
                "chapter13JavaFXPart2/coverViewer/images/small/jhtp.jpg", "chapter13JavaFXPart2/coverViewer/images/large/jhtp.jpg"));
        books.add(new Book("Visual Basic How to Program",
                "chapter13JavaFXPart2/coverViewer/images/small/vbhtp.jpg", "chapter13JavaFXPart2/coverViewer/images/large/vbhtp.jpg"));
        books.add(new Book("Visual C# How to Program",
                "chapter13JavaFXPart2/coverViewer/images/small/vchtp.jpg", "chapter13JavaFXPart2/coverViewer/images/large/vchtp.jpg"));
        booksListView.setItems(books); // bind booksListView to books

        // when ListView selection changes, show large cover in ImageView
        booksListView.getSelectionModel().selectedItemProperty().
                addListener(
                        new ChangeListener<Book>() {
                            @Override
                            public void changed(ObservableValue<? extends Book> ov,
                                                Book oldValue, Book newValue) {
                                CoverImageView.setImage(
                                        new Image(newValue.getLargeImage()));
                            }
                        }
                );

        booksListView.setCellFactory(
                new Callback<ListView<Book>, ListCell<Book>>() {
                    @Override
                    public ListCell<Book> call(ListView<Book> listView) {
                        return new ImageTextCell();
                    }
                }
        );
    }
}
