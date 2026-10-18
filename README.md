# FibonacciJava

A simple Java console application that generates the Fibonacci sequence using recursion.

## Overview

FibonacciJava demonstrates how recursion can be used to generate a mathematical sequence. The program asks the user how many Fibonacci values to display, calculates each value using a recursive method, and prints the results one per line.

This project is intended for beginners learning Java methods, recursion, loops, and console input.

## Features

- Accepts the desired number of Fibonacci values from the user.
- Calculates Fibonacci values using a recursive method.
- Prints the sequence starting from zero.
- Demonstrates recursive calls and base cases.
- Uses Java's standard library without third-party dependencies.

## Technologies Used

- **Programming Language:** Java
- **Input Handling:** `java.util.Scanner`
- **Core Concept:** Recursion
- **Sequence:** Fibonacci

## Project Structure

```text
FibonacciJava/
├── main.java
└── README.md
```

The source file is named `main.java`, but the public class is `Main`. For conventional Java naming and compatibility with case-sensitive environments, it is recommended to rename the file to `Main.java`.

## What Is the Fibonacci Sequence?

The Fibonacci sequence is a series of numbers in which each value after the first two is the sum of the two preceding values.

The sequence begins:

```text
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
```

Mathematically:

\[
F(n) =
\begin{cases}
n, & n \leq 1 \\
F(n-1) + F(n-2), & n > 1
\end{cases}
\]

## How It Works

1. The program prompts the user to enter a number greater than zero.
2. It reads the input using `Scanner`.
3. A loop starts at index `0` and continues until the index is less than the entered number.
4. For each index, the program calls `fibo(i)`.
5. The recursive method returns the index itself when it is zero or one.
6. For larger indices, the method adds the results of `fibo(number - 1)` and `fibo(number - 2)`.
7. Each calculated Fibonacci value is printed on a separate line.

For example, entering `7` prints the first seven values of the sequence.

## Requirements

- Java Development Kit (JDK)
- A terminal or command prompt, or a Java-compatible IDE

No external libraries are required.

## How to Run

1. Clone or download the repository.
2. Open a terminal in the project directory.
3. Rename `main.java` to `Main.java` if necessary for your environment.
4. Compile the source file:

   ```bash
   javac Main.java
   ```

5. Run the application:

   ```bash
   java Main
   ```

6. Enter the number of Fibonacci values to display.

## Example Output

```text
Enter a number higher than 0: 7
0
1
1
2
3
5
8
```

The program prints seven values because the loop begins at zero and stops before the entered number.

## Current Limitations

- The program does not validate that the entered sequence length is positive.
- Entering zero or a negative number produces no Fibonacci values.
- Non-integer input causes an input exception.
- The recursive implementation repeatedly calculates the same values, making it inefficient for large sequence lengths.
- The `int` data type overflows when Fibonacci values exceed its supported range.
- The scanner is not explicitly closed.
- The source filename does not match the public class name in conventional Java form.

## Possible Improvements

- Validate user input and reject negative sequence lengths.
- Handle non-integer input with a clear error message.
- Use an iterative algorithm or memoization to improve performance.
- Use `long` or `BigInteger` when supporting larger Fibonacci values, with appropriate range and performance considerations.
- Add tests for zero, one, typical sequence lengths, and integer overflow boundaries.
- Add an option to calculate another sequence without restarting the program.

## Project Purpose

FibonacciJava is an introductory Java project demonstrating how recursive methods can generate a mathematical sequence.

## Author

**Ichiro Yamazaki**

GitHub: [@ichiroyamazaki](https://github.com/ichiroyamazaki)

## License

No license is specified in the repository. Check with the repository owner before redistributing or reusing the source code.
