# Java Sorting Algorithm Performance Comparison

This project provides a simple framework to compare the performance of several common sorting algorithms in Java.

## Description

The main program (`sortingcomp.java`) benchmarks the following sorting algorithms:
*   Bubble Sort
*   Selection Sort
*   Insertion Sort
*   Merge Sort
*   Quick Sort
*   Heap Sort

It runs each algorithm on arrays of integers of various sizes, filled with random data. The execution time for each run is measured in milliseconds and displayed in a table.

## How to Compile and Run

To compile and run this project, you first need to place the `.java` files into a directory structure that matches the package declaration (`Proj6`).

1.  **Create the directory and move the files:**
    ```bash
    mkdir Proj6
    mv *.java Proj6/
    ```

2.  **Compile the Java files:**
    From the directory containing `Proj6`, run the following command:
    ```bash
    javac Proj6/*.java
    ```

3.  **Run the benchmark:**
    Execute the main class:
    ```bash
    java Proj6.sortingcomp
    ```

## Example Output

The output will be a table showing the execution time (in milliseconds) for each algorithm on different input sizes. The exact times may vary depending on your system.

```
Algorithm               100         500        1000        5000       10000       50000      100000      500000     1000000
-----------------------------------------------------------------------------------------------------------------------
heapsort                  0           0           0           1           1           7          15          91         211
quicksort                 0           0           0           0           1           4          10          55         124
mergesort                 0           0           0           1           1           7          15          79         178
insertionsort             0           0           0           4          15         384        1552           *           *
selectionsort             0           0           1           6          23         540        2168           *           *
bubblesort                0           0           1          12          49        1234        4945           *           *
```
*Note: The `*` indicates that the test for that size was not run for that algorithm in this particular example. The actual output may vary.*
