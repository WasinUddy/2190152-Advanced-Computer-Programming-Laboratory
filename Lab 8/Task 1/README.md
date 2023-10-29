
---

**Objectives:**
- Understand the Singleton design pattern.
- Implement a Singleton class, `FileReaderSingleton`, for reading lines from a file.
- Manage file access, opening, and closing within the Singleton class.

**Instructions:**

1. Create a new Java class called `FileReaderSingleton`. This class will implement the Singleton pattern for file access.

2. Define the following private attributes and methods within the `FileReaderSingleton` class:

   - `private static FileReaderSingleton instance`: A static instance of the class.
   - `private BufferedReader reader`: A `BufferedReader` for reading lines from the file.
   - `private void openFile()`: A method that opens the file, "data.txt," and initializes the `reader`. Handle any `FileNotFoundException` that may occur.

3. In the `FileReaderSingleton` class, implement a private constructor to prevent direct instantiation. In this constructor, call the `openFile()` method to open the file.

4. Implement a public static method, `getInstance()`, that returns the Singleton instance. This method should follow the Singleton pattern, ensuring there is only one instance of the class.

5. Implement a public method, `readLineFromFile()`, which reads a line from the file and returns it as a string. This method should handle exceptions related to file access, such as `IOException`.

6. Implement a public method, `closeFile()`, which closes the file. Handle any `IOException` that may occur during the file closing.

**Testing the Implementation**

```
// Class A for reading from the file
class FileReaderClassA {
    FileReaderSingleton fileReader;
    public FileReaderClassA(FileReaderSingleton fileReader) {
        this.fileReader = fileReader;
    }
    public void readFileLine() {
        String line = fileReader.readLineFromFile();
        if (line != null) {
            System.out.println("FileReaderClassA: " + line);
        }
    }
}

// Class B for reading from the file
class FileReaderClassB {
    FileReaderSingleton fileReader;
    public FileReaderClassB(FileReaderSingleton fileReader) {
        this.fileReader = fileReader;
    }
    public void readFileLine() {
        String line = fileReader.readLineFromFile();
        if (line != null) {
            System.out.println("FileReaderClassB: " + line);
        }
    }
}

public class TestLab {
    public static void main(String[] args) {
        FileReaderSingleton fileReader = FileReaderSingleton.getInstance();
        FileReaderClassA readerA = new FileReaderClassA(fileReader);
        FileReaderClassB readerB = new FileReaderClassB(fileReader);

        // Call the readFileLine() method on both instances
        readerA.readFileLine();
        readerB.readFileLine();
        readerB.readFileLine();
        fileReader.closeFile();
        readerA.readFileLine();
        readerB.readFileLine();
        
    }
}
```

Expected Result

```
FileReaderClassA: testline1
FileReaderClassB: testline2
FileReaderClassB: testline3
Unable to read line from file : Stream closed
Unable to read line from file : Stream closed
```

