import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderSingleton {
    private static FileReaderSingleton instance;
    private BufferedReader reader;

    private FileReaderSingleton() {
        openFile();
    }

    private void openFile() {
        try {
            reader = new BufferedReader(new FileReader("data.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Unable to open file : " + e.getMessage());
        }
    }

    public void closeFile() {
        try {
            if (this.reader != null) {
                this.reader.close();
            }
        } catch (IOException e) {
            System.err.println("Unable to close file : " + e.getMessage());
        }
    }

    public static FileReaderSingleton getInstance() {
        if (instance == null) {
            instance = new FileReaderSingleton();
        }
        return instance;
    }

    public String readLineFromFile() {
        try {
            return this.reader.readLine();
        } catch (IOException e) {
            System.err.println("Unable to read line from file : " + e.getMessage());
            return null;
        }
    }

}
