import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

// Encapsulation: Create a class to encapsulate character information
class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Inheritance: Create subclasses for Heroes, Villains, and Trash
class Hero extends Character {
    public Hero(String name) {
        super(name);
    }
}

class Villain extends Character {
    public Villain(String name) {
        super(name);
    }
}

class Trash extends Character {
    public Trash(String name) {
        super(name);
    }
}

public class CharacterManagerApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Character Manager");

        // Abstraction: Create a layout for the GUI
        BorderPane layout = new BorderPane();

        // Create a ListView to display characters
        ListView<Character> characterListView = new ListView<>();
        characterListView.setPrefWidth(200);

        // Polymorphism: Display character information in the ListView
        characterListView.setCellFactory(param -> new ListCell<Character>() {
            @Override
            protected void updateItem(Character character, boolean empty) {
                super.updateItem(character, empty);
                if (empty || character == null) {
                    setText(null);
                } else {
                    setText(character.getName());
                }
            }
        });

        // Create sample characters
        Hero hero = new Hero("Naruto Uzumaki");
        Villain villain = new Villain("Sasuke Uchiha");
        Trash trash = new Trash("Sakura Haruno");

        // Add characters to the ListView
        characterListView.getItems().addAll(hero, villain, trash);

        // Add the ListView to the layout
        layout.setCenter(characterListView);

        // Create the scene
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);

        // Show the GUI
        primaryStage.show();
    }
}
x