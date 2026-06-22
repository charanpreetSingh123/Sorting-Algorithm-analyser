# Sorting Algorithm Performance Analyzer

## Overview

Sorting Algorithm Performance Analyzer is a Java Swing desktop application designed to compare the performance of different sorting algorithms on randomly generated datasets.

The application provides an interactive graphical user interface (GUI) where users can generate arrays of various sizes and analyze how different sorting techniques perform in terms of execution time and output accuracy.

This project serves as the initial prototype for a larger optimization system that will eventually be extended into a Seating Arrangement and Slot Allocation Management System. The future version will utilize sorting and allocation techniques to efficiently organize seating plans, allocate resources, manage records, and maintain ordered data structures.

---

## Features

Array Generation

* Generate random arrays of different sizes.
* Supported sizes:
    * 10 elements
    * 20 elements
    * 50 elements
    * 100 elements

Sorting Algorithms Implemented

## Bubble Sort

* Compares adjacent elements.
* Swaps elements when required.
* Includes optimization using a swap flag.

## Insertion Sort

* Builds a sorted portion of the array incrementally.
* Efficient for small datasets.

## Selection Sort

* Repeatedly finds the minimum element.
* Places it in its correct position.

## Java Arrays.sort()

* Uses Java’s built-in optimized sorting implementation.
* Serves as a benchmark for comparison.

## Performance Measurement

* Calculates execution time using:

System.nanoTime()

* Displays sorting duration in nanoseconds.

## Interactive GUI

* Dark-themed user interface.
* Responsive buttons.
* Hover effects.
* Rich text output with color formatting.
* Scrollable output panel.

---

## Technologies Used

* Java
* Java Swing
* AWT
* Arrays Utility Class
* Object-Oriented Programming Concepts

---

## Project Structure

SortingAlgorithmAnalyzer
│
├── GUI Components
│   ├── JFrame
│   ├── JPanel
│   ├── JButton
│   ├── JComboBox
│   ├── JTextPane
│   └── JScrollPane
│
├── Sorting Algorithms
│   ├── Bubble Sort
│   ├── Insertion Sort
│   ├── Selection Sort
│   └── Arrays.sort()
│
├── Utility Functions
│   ├── Random Array Generation
│   └── Execution Time Measurement
│
└── Main Application

---

## How It Works

Step 1

Select the desired array size from the dropdown menu.

Step 2

Click Generate Array to create a random dataset.

Step 3

Choose any sorting algorithm:

* Bubble Sort
* Insertion Sort
* Selection Sort
* Java Arrays.sort()

Step 4

## View:

* Sorted output
* Execution time
* Algorithm performance

---

## Sample Output

Generated Array (Size: 20)
[34, 12, 76, 8, 45, 23, 67, 10]
Bubble Sort Time: 19200 ns
Sorted Array:
[8, 10, 12, 23, 34, 45, 67, 76]

---

## Learning Objectives

This project demonstrates:

* Data Structures and Algorithms
* Sorting Techniques
* Time Complexity Analysis
* GUI Development using Java Swing
* Event-Driven Programming
* Performance Measurement
* Object-Oriented Design

---

## Future Enhancements

This project is being developed as the foundation for a larger management and allocation system.

Planned Features

Seating Arrangement System

* Automatic seat allocation
* Hall and classroom management
* Exam seating arrangement generation
* Conflict-free seat assignment

Slot Allocation System

* Parking slot allocation
* Event seat reservation
* Resource scheduling
* Dynamic allocation strategies

Record Management

* Student records
* Visitor records
* Booking records
* Allocation history tracking

Advanced Algorithms

* Merge Sort
* Quick Sort
* Heap Sort
* Counting Sort
* Searching Algorithms

Data Storage

* MySQL Database Integration
* Record Persistence
* CRUD Operations

Data Visualization

* Sorting comparison graphs
* Performance dashboards
* Allocation statistics

---

## Future Vision

The long-term goal of this project is to transform it from a sorting performance analyzer into a complete Seating Arrangement and Slot Allocation Management Platform capable of:

* Organizing large seating layouts
* Managing slot assignments efficiently
* Maintaining records in sorted order
* Optimizing resource utilization
* Supporting real-world institutional and organizational requirements

---

## Author
## Charanpreet Singh


Developed as part of a Java-based Data Structures and Algorithms learning project with future expansion toward intelligent allocation and management systems.
