# Sudoku Solver

The repository contains the source code for a **Sudoku Solver** written in Java. The program demonstrates how a simple recursive backtracking can be applied to constraint-based problems such as Sudoku.

Key highlights of the project include:

* **Recursive Backtracking Algorithm** – a simple solution that explores all possible candidate numbers for empty cells, moving forward when valid and backtracking when invalid.
* **Validation Functions** – ensure Sudoku rules are respected in rows, columns, and 3×3 subgrids.
* **Multiple Solutions Support** – the solver does not stop at the first solution; it prints all valid solutions if the puzzle admits more than one.
* **Console Output** – solved grids are displayed neatly for quick verification.

The focus of the repository is to **showcase how a classic search technique (backtracking) can be implemented in Java** and applied to a real-world puzzle-solving scenario.


📌 **Project Overview**
This project implements a Sudoku solver that accepts a 9×9 puzzle represented as a 2D array, where `0` denotes an empty cell. The algorithm recursively tests numbers from 1 to 9, checking whether each placement is valid according to Sudoku rules.

If a placement is valid, the solver proceeds to the next cell. If not, it backtracks and tries a different number. This process continues until the puzzle is completely solved.

Unlike many Sudoku solvers, this version is designed to **output all possible valid solutions**. This makes it especially useful for testing puzzles that may be under-constrained or intentionally created with multiple solutions.


⚙️ **Technologies Used**

* **Java (JDK 8+)** – primary programming language.
* **VS Code** – tested for development and compilation.

📊 **Features**

* Handles standard 9×9 Sudoku puzzles.
* Detects and prints all valid solutions (not just one).
* Works with solvable, unsolvable, and non-unique puzzles.
* Can be easily modified to accept different puzzles by editing the input array.


👥 **Algorithm in Action**
The backtracking algorithm is the core of this solver:

1. **Read the puzzle** from the predefined array.
2. **Find the next empty cell**.
3. **Try numbers 1–9**, validating each with row, column, and block constraints.
4. **Proceed recursively** if valid, or backtrack if no valid number exists.
5. **Print the solution** when the grid is complete.
6. **Continue searching** to find additional solutions, if any.

By not stopping at the first valid configuration, the solver can demonstrate when a Sudoku has multiple solutions—an important distinction in puzzle generation and testing.


🚀 **Key Impact**

* Provides a **clear example** of recursive backtracking in Java.
* Serves as a **teaching and learning tool** for algorithms and constraint satisfaction problems.
* Highlights the difference between uniquely solvable puzzles and those with multiple valid solutions.
