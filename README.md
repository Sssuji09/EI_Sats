Exercise 1: Design Pattern Implementations
Creational Patterns
1. Singleton Pattern - TV Remote
Use Case
A TV remote control system where only one remote instance should exist to control a single TV, preventing multiple conflicting remote objects.
What It Solves

Prevents creation of multiple remote control instances
Ensures global access to single remote object
Avoids conflicting commands from multiple remote instances
Thread-safe remote control management

Classes

TVRemote (Singleton) - Thread-safe singleton class managing TV operations

getInstance() - Returns the single remote instance
turnOnTV() - Powers on the television
turnOffTV() - Powers off the television


Main - Demonstrates singleton behaviour by creating two references to the same remote instance

How to Run
bashjavac Main.java
java Main

2. Factory Method Pattern - Car Manufacturing
Use Case
A car manufacturing system that produces different types of vehicles (Sedan, SUV) through their respective factories, following a standardized production process.
What It Solves

Decouples car creation logic from client code
Allows adding new car types without modifying existing code
Standardizes manufacturing process across all car types
Makes the system extensible for future car models

Classes

Car (Interface) - Defines the manufacturing contract

design() - Design phase
manufacture() - Manufacturing phase
qualityCheck() - Quality control phase
deliver() - Delivery phase


Sedan - Implements Car interface for sedan-type vehicles with rooftop and power engine
SUV - Implements Car interface for SUV-type vehicles with AI assistant and electric engine
CarFactory (Interface) - Defines factory contract

createCar() - Factory method


SedanFactory - Creates and returns Sedan objects
SUVFactory - Creates and returns SUV objects
Main - Demonstrates the factory pattern by creating different car types through their respective factories

How to Run
bashjavac Main.java
java Main

Behavioral Patterns
1. Observer Pattern - Social Media Influencer
Use Case
A social media notification system where followers automatically receive updates when an influencer posts new content, similar to Instagram/YouTube notifications.
What It Solves

Automatically notifies all followers when new content is posted
Maintains loose coupling between influencer and followers
Enables one-to-many dependency between objects

Classes

Observer (Interface) - Defines the update contract

update(String content) - Receives notification with post content


Follower - Implements Observer interface to receive influencer notifications

Stores follower name
Displays notification when influencer posts


Subject (Interface) - Defines subject contract for managing observers

registerObserver(Observer) - Adds new follower
removeObserver(Observer) - Removes follower
notifyObservers(String) - Notifies all followers


Influencer - Implements Subject interface to manage followers and post content

Maintains list of followers
postContent(String) - Posts new content and notifies all followers


Main - Demonstrates observer pattern by registering followers, posting content, and showing dynamic unsubscription

How to Run
bashjavac Main.java
java Main

2. Strategy Pattern - Sorting Algorithms
Use Case
A sorting system that can switch between different sorting algorithms (Bubble Sort, Selection Sort) at runtime without changing the client code.
What It Solves

Allows algorithm selection at runtime
Encapsulates sorting algorithms in separate classes
Makes it easy to add new sorting algorithms
Eliminates conditional statements for algorithm selection

Classes

SortingStrategy (Interface) - Defines the strategy contract

sort(int[] array) - Sorts the given array


BubbleSort - Implements bubble sort algorithm

Compares adjacent elements and swaps if needed


SelectionSort - Implements selection sort algorithm

Finds minimum element and places it at the beginning


Sorter (Context) - Maintains reference to a SortingStrategy object

setStrategy(SortingStrategy) - Changes sorting algorithm at runtime
performSort(int[]) - Executes the current sorting strategy


Main - Demonstrates strategy pattern by sorting arrays using different algorithms without changing the Sorter code

How to Run
bashjavac Main.java
java Main

Structural Patterns
1. Composite Pattern - Leave Approval System
Use Case
A hierarchical leave approval system where individual approvers (Manager, HR) and groups of approvers can be treated uniformly, allowing for flexible approval workflows.
What It Solves

Treats individual approvers and groups of approvers uniformly
Builds tree structures of approval hierarchies
Allows adding/removing approvers dynamically
Simplifies client code when dealing with approval chains

Classes

Approver (Interface) - Defines the component contract

approveLeave(String employeeName) - Approves leave for an employee


Manager - Leaf component representing a manager approver

Stores manager name
Approves leave requests


HR - Leaf component representing an HR approver

Stores HR name
Approves leave requests


ApprovalGroup - Composite component that contains multiple approvers

addApprover(Approver) - Adds approver to the group
removeApprover(Approver) - Removes approver from the group
approveLeave(String) - Delegates approval to all approvers in the group


Main - Demonstrates composite pattern by creating individual approvers and grouping them for unified approval process

How to Run
bashjavac Main.java
java Main

2. Facade Pattern - Online Store System
Use Case
An e-commerce order placement system that simplifies the complex interactions between inventory, payment, and shipping subsystems into a single unified interface.
What It Solves

Hides complexity of multiple subsystems
Provides simple interface for complex operations
Reduces client dependencies on subsystem classes
Makes the system easier to use and understand

Classes

Inventory - Subsystem for stock management

checkStock(String product) - Verifies product availability


Payment - Subsystem for payment processing

makePayment(String product) - Processes payment transaction


Shipping - Subsystem for product delivery

shipProduct(String product) - Handles product shipment


OnlineStoreFacade - Facade that coordinates all subsystems

Initializes all subsystem instances
placeOrder(String product) - Orchestrates complete order workflow (check stock → process payment → ship product)


Main - Demonstrates facade pattern by placing an order through simplified interface without directly interacting with subsystems

How to Run
bashjavac Main.java
java Main

Exercise 2: Satellite Command Control System
A Java-based satellite control system demonstrating the implementation of design patterns for managing satellite operations including rotation, panel management, and data collection with undo functionality and activity logging.
Use Case Overview
The Satellite Command Control System simulates a ground control interface for managing orbital satellite operations.
Core Functionalities

Satellite Rotation - Direct the satellite to face different orientations (North, South, East, West)
Solar Panel Management - Activate or deactivate solar panels for power generation
Data Collection - Collect scientific data (only possible when solar panels are active)
Command History - Undo previous operations to revert satellite state
Status Monitoring - View current satellite orientation, panel status, and collected data
Activity Logging - Automatic timestamped logging of all operations to file

Use Case Scenarios

Mission Preparation - Activate solar panels and orient satellite toward target area
Data Gathering - Collect data while panels are active
Error Recovery - Use undo functionality to revert incorrect commands
Mission Monitoring - Track all operations through real-time status and log files

Design Patterns Used
1. Singleton Pattern

Implementation: Satellite class
Purpose: Ensures only one satellite instance exists throughout the application
Benefits:

Prevents multiple satellite objects from being created
Provides global access point to the satellite instance
Thread-safe implementation using synchronized method



2. Command Pattern

Implementation: Command interface and concrete command classes
Purpose: Encapsulates satellite operations as objects
Benefits:

Decouples command sender from receiver
Enables undo functionality
Allows command queuing and logging


Concrete Commands:

RotateCommand - Changes satellite orientation
ActivatePanelsCommand - Activates solar panels
DeactivatePanelsCommand - Deactivates solar panels
CollectDataCommand - Initiates data collection



3. Observer Pattern

Implementation: SatelliteObserver interface and FileLogger observer
Purpose: Notifies observers of satellite state changes
Benefits:

Loose coupling between satellite and logging mechanism
Easy to add multiple observers (console logger, database logger, etc.)
Automatic notification on every state change



Classes Overview
Command (Interface)
Defines execute() and unexecute() methods for all command objects.
RotateCommand
Rotates satellite to specified direction. Stores previous orientation for undo.
ActivatePanelsCommand
Activates solar panels. Undo deactivates them.
DeactivatePanelsCommand
Deactivates solar panels. Undo reactivates them.
CollectDataCommand
Collects 10 units of data when panels are active. Tracks success state for proper undo.
SatelliteController
Executes commands, maintains command history stack, and handles undo operations.
SatelliteObserver (Interface)
Defines update(String message) method for observer notifications.
FileLogger
Observes satellite state changes and logs timestamped entries to satellite_logs.txt.
Satellite
Singleton class managing satellite state (orientation, data, panel status). Notifies observers on state changes. Provides methods for all satellite operations.
Main
Entry point. Displays menu and manages command input loop.
SatelliteCommand
Parses user input, creates appropriate command objects, and delegates execution to controller.
How to Run
bashjavac Main.java
java Main
