import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SettingsController implements java.io.Serializable{

    private int size;
    private PlayerColor startingPlayer;
    private PlayerColor secondPlayer;


    public SettingsController() throws IOException{

        File file = new File("settings.txt");

        ObjectInputStream is = null;
        try {
            //opening and reaind the source file
            is = new ObjectInputStream(new FileInputStream(file));
            SettingsController temp = (SettingsController) is.readObject();
            //import the loaded file data to the current settings
            this.size = temp.getSize();
            this.startingPlayer = temp.getStartingPlayer();
            this.secondPlayer = temp.getSecondPlayer();
        } catch (IOException e) {
            System.out.println("Error while loading");
        } catch (ClassNotFoundException e) {
            System.out.println("Problem with class");
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }


    public int getSize() {
        return this.size;
    }


    public PlayerColor getStartingPlayer() {
        return this.startingPlayer;
    }

    public PlayerColor getSecondPlayer() {
        return this.secondPlayer;
    }


    public void setBlackStartingPlayer() {
        this.startingPlayer = PlayerColor.BLACK;
        this.secondPlayer = PlayerColor.WHITE;
        System.out.println("Black is starting");
    }

    public void setWhiteStartingPlayer() {
        this.startingPlayer = PlayerColor.WHITE;
        this.secondPlayer = PlayerColor.BLACK;
        System.out.println("White is starting");
    }

    public void setSize(int x) {
        return;
    }

    public void setSize() {
        this.size = 8;
    }
}
