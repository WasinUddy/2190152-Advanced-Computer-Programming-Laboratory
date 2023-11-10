**Lab Sheet: Working with Student Scores**

**Objective:** In this lab, you will create a Java program to manipulate student scores. You will implement a class called `TestFile` with methods to read student scores from a file, calculate the total score for a student, retrieve edited student IDs, and create a new file with edited scores.

You can download the two source files from https://drive.google.com/file/d/1Bn2kW43AJfgYwXn7EEZLY0qfDE64qre3/view?usp=sharing


**Task 1: Implement `read_scores` Method**

1. Create a Java class called `TestFile`.
2. Implement the `read_scores` method that reads student scores from a file and stores them in a `HashMap`. The file should contain lines with student IDs and quiz scores, separated by commas.

**Task 2: Implement `getTotalScore` Method**

1. Implement the `getTotalScore` method that takes a student ID as input and returns the total score for that student. It should use the `HashMap` from Task 1.

**Task 3: Implement `getEditedStudentID` Method**

1. Implement the `getEditedStudentID` method that reads a file containing edited student scores. It should return a `HashSet` of unique student IDs found in the edited file.

**Task 4: Implement `createNewEditedScore` Method**

1. Implement the `createNewEditedScore` method that reads both the original student scores and the edited scores files. It updates the original scores with the edited scores and writes the updated scores to a new file.

**Task 5: Test Your Methods**

Using the code below to test your methods.

```
   public static void main(String[] args) {
        // Test the methods

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
```