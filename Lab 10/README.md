**Lab Sheet: Interactive Task List**

---

**Objective:**
The goal of this lab is to create an Interactive Task List where users can add, edit, and delete tasks dynamically. The focus is on handling user input and updating the task list accordingly.


**Tasks:**

1. **HTML and CSS Setup:**
   - Use the provided HTML and CSS code to set up the structure and styling of the Interactive Task List.

2. **Add Task Functionality:**
   - Complete the `addTask` function:
      - Check that the task text is not empty.
      - Create a new list item (`<li>`) dynamically.
      - Add the task text as a text node to the new list item.
      - Attach a click event listener to the list item that works as described in Task 3.

3. **Edit Task Functionality:**
   - Implement the missing part of the `editTask` function:
      - Use the `prompt` function to get user input for editing the task.
      - If the user enters new text, update the task text content.
      - If the user deletes all text and clicks OK, remove the list item from the task list.


**Provided Code:**
```html
<!DOCTYPE html>
<html>
<head>
    <title>Interactive To-Do List</title>
    <style>
        /* Provided CSS styling */
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        ul {
            list-style-type: none;
            padding: 0;
        }

        li {
            margin-bottom: 8px;
            cursor: pointer;
            display: flex;
            justify-content: space-between;
        }
    </style>
</head>
<body>
    <!-- Provided HTML structure -->
    <h1>Interactive To-Do List</h1>

    <form>
        <label for="taskInput">New Task:</label>
        <input type="text" id="taskInput" placeholder="Enter task" required>
        <button type="button" onclick="addTask()">Add Task</button>
    </form>

    <ul id="taskList">
        <!-- Tasks will be added dynamically here -->
    </ul>

    <script>
      // Enter your script here





    </script>
</body>
</html>
```