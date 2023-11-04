import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * The TestFile class provides methods to read, manipulate, and write student
 * score data from and to CSV files.
 */
public class TestFile {

    // Main method to test the functionalities provided by the TestFile class.
    public static void main(String[] args) {
        TestFile testFile = new TestFile();

        // Task 1: Test the 'read_scores' method
        HashMap<String, int[]> allScores = testFile.read_scores("student_scores.csv");
        System.out.println("All Scores:");
        for (String studentID : allScores.keySet()) {
            System.out.println(studentID + " - " + Arrays.toString(allScores.get(studentID)));
        }

        // Task 2: Test the 'getTotalScore' method
        String studentIDToLookup = "6632462421";
        int totalScore = testFile.getTotalScore(allScores, studentIDToLookup);
        if (totalScore != -1) {
            System.out.println("Total Score for " + studentIDToLookup + ": " + totalScore);
        } else {
            System.out.println("Student not found.");
        }

        // Task 3: Test the 'getEditedStudentID' method
        HashSet<String> editedStudentIDs = testFile.getEditedStudentID("edited_scores.csv");
        System.out.println("Edited Student IDs: " + editedStudentIDs);

        // Task 4: Test the 'createNewEditedScore' method
        testFile.createNewEditedScore("student_scores.csv", "edited_scores.csv", "new_scores.csv");
        System.out.println("New scores have been written to 'new_scores.csv'.");
    }
    
    // Reads student scores from a CSV file and stores them in a HashMap.
    public HashMap<String, int[]> read_scores(String filePath) {
        HashMap<String, int[]> scores = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine(); // Skip the first line (headers)
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String studentId = parts[0];
                int[] scoreArray = Arrays.stream(parts, 1, parts.length)
                                         .mapToInt(Integer::parseInt)
                                         .toArray();
                scores.put(studentId, scoreArray);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return scores;
    }

    // Calculates the total score for a student given their ID.
    public int getTotalScore(HashMap<String, int[]> scores, String studentId) {
        if (!scores.containsKey(studentId)) {
            return -1; // Student ID not found
        }
        return Arrays.stream(scores.get(studentId)).sum();
    }

    // Reads a CSV file with edited scores and extracts the unique student IDs.
    public HashSet<String> getEditedStudentID(String filePath) {
        HashSet<String> editedStudentIDs = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine(); // Skip the first line (headers)
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                editedStudentIDs.add(parts[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return editedStudentIDs;
    }

    // Creates a new CSV file with updated scores after applying the edits.
    public void createNewEditedScore(String originalFilePath, String editedFilePath, String newFilePath) {
        // Read the original scores into a HashMap
        HashMap<String, int[]> originalScores = read_scores(originalFilePath);

        // Apply the edited scores from the edited CSV file
        try (BufferedReader reader = new BufferedReader(new FileReader(editedFilePath))) {
            String line;
            reader.readLine(); // Skip the first line (headers)
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String studentId = parts[0];
                int quizIndex = Integer.parseInt(parts[1].replace("Quiz", "")) - 1;
                int newScore = Integer.parseInt(parts[2]);

                int[] scores = originalScores.get(studentId);
                if (scores != null && quizIndex >= 0 && quizIndex < scores.length) {
                    scores[quizIndex] = newScore; // Update the score for the quiz
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write the updated scores to a new CSV file
        try (PrintWriter writer = new PrintWriter(new File(newFilePath))) {
            writer.println("ID,Quiz1,Quiz2,Quiz3,Quiz4,Quiz5");
            for (Map.Entry<String, int[]> entry : originalScores.entrySet()) {
                String studentId = entry.getKey();
                int[] scores = entry.getValue();
                String joinedScores = Arrays.stream(scores)
                                            .mapToObj(String::valueOf)
                                            .collect(Collectors.joining(","));
                writer.println(studentId + "," + joinedScores);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
