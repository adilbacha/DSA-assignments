# Arrays and Array Operations Assignment

**Student:** Adil Bacha  
**Class:** BSCS Computer Science  
**Course:** Data Structures  
**Programming language:** Java  
**Assignment type:** Individual  
**Submission date:** 23 October 2026

## About the assignment

This assignment practices basic array operations in Java. Each task is a separate program and uses loops and arrays to read, process, and display integer values. The programs avoid built-in array methods for searching, sorting, copying, reversing, and merging.

## Tasks and time complexity

| Task | Description | Time complexity |
| --- | --- | --- |
| Task 1 | Reads 10 integers, displays them in input order, then displays them in reverse order. | **O(n)** — reading and displaying the values each take one pass through the array. |
| Task 2 | Finds the smallest and second-smallest values and displays their indices. The proposal also asks for the largest value, which is not currently calculated by `Task02.java`. | **O(n)** — one pass checks each value after the first. |
| Task 3 | Calculates the sum and average, then counts values greater than the average. | **O(n)** — the program makes a fixed number of passes through the array. |
| Task 4 | Uses linear search to find a value and displays every matching index. | **O(n)** — in the worst case, every array value must be checked. |
| Task 5 | Inserts a value at a chosen index by copying values into a larger array. | **O(n)** — values may need to be copied across the array. |
| Task 6 | Deletes the value at a chosen index by copying the remaining values into a smaller array. | **O(n)** — values may need to be copied across the array. |
| Task 8 | Sorts values with Bubble Sort and displays them in ascending and descending order. | **O(n²)** — Bubble Sort compares adjacent values over multiple passes. |
| Task 9 | Finds each duplicate value once and counts its occurrences. | **O(n²)** — each value may be compared with every value after it. |
| Task 10 | Merges two ascending arrays and finds the largest value in the merged array. | **O(n + m)** — merging and finding the largest each scan the input/result values. |
| Task 11 | Merges two sorted arrays into a third array that remains sorted, without sorting again. | **O(n + m)** — each input value is copied into the result once. |

Here, **n** and **m** are the numbers of values in the two input arrays. The input arrays in these programs each contain 10 integers.

## Files

- `Task01.java` — array input, display, and reverse display
- `Task02.java` — largest and smallest values
- `Task03.java` — sum, average, and count above average
- `Task04.java` — linear search
- `Task05.java` — insertion at an index
- `Task06.java` — deletion at an index
- `Task08.java` — Bubble Sort and reverse display
- `Task09.java` — duplicate values and frequencies
- `Task10.java` — merge ascending arrays and find the largest value
- `Task11.java` — merge sorted arrays while preserving sorted order

The assignment proposal does not include a Task 7. Each program can be compiled from this folder with `javac Task01.java` (replace `Task01` with the desired task number), then run with `java Task01`.
