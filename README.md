# 📊 Sorting Algorithm Performance Analyzer

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/GUI-Java%20Swing-blue?style=for-the-badge" alt="Swing">
  <img src="https://img.shields.io/badge/Algorithms-Sorting-green?style=for-the-badge" alt="Algorithms">
  <img src="https://img.shields.io/badge/Project-DSA-purple?style=for-the-badge" alt="DSA">
</p>

<p align="center">
  <b>Interactive Java Swing Application for Analyzing Sorting Algorithm Performance</b>
</p>

<p align="center">
  <a href="#-overview">Overview</a> •
  <a href="#-features">Features</a> •
  <a href="#-sorting-algorithms">Algorithms</a> •
  <a href="#-technologies-used">Tech Stack</a> •
  <a href="#-project-structure">Structure</a> •
  <a href="#-future-enhancements">Future Plans</a> •
  <a href="#-author">Author</a>
</p>

---

## 📌 Overview

Sorting Algorithm Performance Analyzer is a Java Swing desktop application designed to compare the performance of different sorting algorithms on randomly generated datasets.

The application provides an interactive graphical user interface (GUI) where users can generate arrays of various sizes and analyze how different sorting techniques perform in terms of execution time and output accuracy.

This project serves as the initial prototype for a larger optimization system that will eventually be extended into a Seating Arrangement and Slot Allocation Management System.

---

## ✨ Features

### 🎲 Array Generation

Generate random arrays of different sizes:

- 10 Elements
- 20 Elements
- 50 Elements
- 100 Elements

### 🖥 Interactive GUI

- Dark-themed user interface
- Responsive buttons
- Hover effects
- Rich text output formatting
- Scrollable output panel

### ⏱ Performance Measurement

- Execution time measurement using `System.nanoTime()`
- Nanosecond-level precision
- Sorting performance comparison
- Instant result visualization

---

## 🔄 Sorting Algorithms

### 🔵 Bubble Sort

- Compares adjacent elements
- Swaps elements when necessary
- Optimized using a swap flag

### 🟢 Insertion Sort

- Builds a sorted portion incrementally
- Efficient for smaller datasets

### 🟡 Selection Sort

- Repeatedly finds the minimum element
- Places elements in their correct position

### ⚡ Java Arrays.sort()

- Java's built-in optimized sorting algorithm
- Used as a benchmark for comparison

---

## ⚙️ How It Works

### Step 1

Select the desired array size from the dropdown menu.

### Step 2

Click **Generate Array** to create a random dataset.

### Step 3

Choose a sorting algorithm:

- Bubble Sort
- Insertion Sort
- Selection Sort
- Arrays.sort()

### Step 4

Analyze:

- Sorted Output
- Execution Time
- Algorithm Performance

---

## 📸 Sample Output

```text
Generated Array (Size: 20)

[34, 12, 76, 8, 45, 23, 67, 10]

Bubble Sort Time: 19200 ns

Sorted Array:

[8, 10, 12, 23, 34, 45, 67, 76]
```

---

## 🛠 Technologies Used

| Category | Technology |
|----------|------------|
| Programming Language | Java |
| GUI Framework | Java Swing |
| User Interface | AWT & Swing Components |
| Utility Classes | Arrays Utility Class |
| Concepts | OOP & DSA |
| IDE | IntelliJ IDEA / Eclipse / NetBeans |

---

## 📂 Project Structure

```text
SortingAlgorithmAnalyzer/
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
```

---

## 🎯 Learning Objectives

This project demonstrates:

- Data Structures and Algorithms
- Sorting Techniques
- Time Complexity Analysis
- GUI Development using Java Swing
- Event-Driven Programming
- Performance Measurement
- Object-Oriented Design

---

## 🚀 Future Enhancements

### 🪑 Seating Arrangement System

- Automatic seat allocation
- Hall and classroom management
- Exam seating arrangement generation
- Conflict-free seat assignment

### 🎟 Slot Allocation System

- Parking slot allocation
- Event seat reservation
- Resource scheduling
- Dynamic allocation strategies

### 📋 Record Management

- Student records
- Visitor records
- Booking records
- Allocation history tracking

### ⚡ Advanced Algorithms

- Merge Sort
- Quick Sort
- Heap Sort
- Counting Sort
- Searching Algorithms

### 🗄 Database Integration

- MySQL Database Integration
- Record Persistence
- CRUD Operations

### 📊 Data Visualization

- Sorting comparison graphs
- Performance dashboards
- Allocation statistics

---

## 🌟 Future Vision

The long-term goal of this project is to transform it from a sorting performance analyzer into a complete Seating Arrangement and Slot Allocation Management Platform capable of:

- Organizing large seating layouts
- Managing slot assignments efficiently
- Maintaining records in sorted order
- Optimizing resource utilization
- Supporting real-world institutional and organizational requirements

---

## 👨‍💻 Author

### Charanpreet Singh

Developed as part of a Java-based Data Structures and Algorithms learning project with future expansion toward intelligent allocation and management systems.

---

<p align="center">
  ⭐ If you found this project useful, consider giving it a star :)
</p>
