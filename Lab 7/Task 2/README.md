## Lab Sheet: Implementing the Observer Pattern for Door Control

### Objective

The objective of this lab is to design and implement a system that allows multiple doors to be controlled individually or collectively through a central control center. The system will use the Observer pattern to notify doors when they should be opened or closed.

### Requirements

1. Create a `Door` class that represents an individual door. The `Door` class should include the following methods:
    - `open()`: Opens the door and prints "Door [DoorName] opened," where `[DoorName]` is the name of the door.
    - `close()`: Closes the door and prints "Door [DoorName] closed."

2. Create a `ControlCenter` class that acts as an `Observable`. The `ControlCenter` should include the following methods:
    - `openAllDoors()`: Notifies all doors to open.
    - `closeAllDoors()`: Notifies all doors to close.

3. Implement the Observer pattern by creating an `Observer` interface with methods to update the doors (e.g., `updateDoorOpen(Door door)` and `updateDoorClose(Door door)`).

4. [already done for your] Create a `Main` class to demonstrate the system. In the `Main` class, do the following:
    - Create three `Door` objects (e.g., D1, D2, D3) with unique names.
    - Create a `ControlCenter` object to manage the doors.
    - Register each door with the control center as an observer.
    - Manually open and close the doors, and observe the system's output.
    - Use the control center to open and close all doors, and observe the system's output.
    - Add a new door (D4) and register it with the control center.