# Jatin Sharma - Full Stack Developer Screening Test

## Project Overview
This repository contains solutions for the TANDEMLOOP Full Stack Developer screening test. All problems are implemented in **Java**.

## Programming Language
- **Language**: Java
- **IDE**: Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)
- **Java Version**: Java 8 or higher

## Problem Solutions

### Problem-1: Calculator Class
**File**: `Problem1.java`
- Creates a calculator class that performs Addition, Subtraction, Multiplication, and Division
- Inputs: `a` (double), `b` (double), `type of operation` (string)
- Uses object-oriented programming principles

### Problem-2: Series Generator (Type 1)
**File**: `Problem2.java`
- Generates a series of odd numbers based on input
- Input: single integer `a`
- Output: series from 1 to (2a-1) with step 2

### Problem-3: Series Generator (Type 2)
**File**: `Problem3.java`
- Generates a series of odd numbers with different pattern
- Input: single integer `a`
- Output: series based on specific pattern rules

### Problem-4: Multiples Counter
**File**: `Problem4.java`
- Counts multiples of numbers 1-9 in a given list
- Input: list of integers
- Output: dictionary with count of multiples for each number 1-9

## How to Run

1. **Compile all Java files**:
   ```bash
   javac *.java
   ```

2. **Run individual problems**:
   ```bash
   java Problem1
   java Problem2
   java Problem3
   java Problem4
   ```

## Test Cases

Each problem includes multiple test cases to demonstrate functionality:

### Problem 1 - Calculator
- Addition: 5.5 + 3.2 = 8.7
- Subtraction: 10.0 - 4.5 = 5.5
- Multiplication: 6.0 * 7.0 = 42.0
- Division: 15.0 / 3.0 = 5.0

### Problem 2 - Series Generator
- Input: 1 → Output: 1
- Input: 2 → Output: 1, 3
- Input: 3 → Output: 1, 3, 5
- Input: 4 → Output: 1, 3, 5, 7

### Problem 3 - Series Generator (Pattern)
- Input: 1 → Output: 1
- Input: 2 → Output: 1
- Input: 3 → Output: 1, 3, 5
- Input: 4 → Output: 1, 3, 5
- Input: 5 → Output: 1, 3, 5, 7, 9

### Problem 4 - Multiples Counter
- Input: [1,2,8,9,12,46,76,82,15,20,30]
- Output: {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}

## Repository Structure
```
├── README.md
├── Problem1.java
├── Problem2.java
├── Problem3.java
└── Problem4.java
```

## Author
**Jatin Sharma**
- Full Stack Developer Candidate
- TANDEMLOOP Screening Test

## Notes
- All solutions are original and implemented without external assistance
- Each problem is self-contained and can be run independently
- Solutions follow Java best practices and coding standards 
