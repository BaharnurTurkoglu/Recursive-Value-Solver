# 🔍 Recursive Value Solver (CENG 114)

[cite_start]A comprehensive Java project developed using Object-Oriented Programming (OOP) principles and recursion to find the exact or closest value for given input sets[cite: 92, 105].

## Project Specifications
* [cite_start]**Core Goal**: Reach a target value (numbers, characters, or objects) from a given input set using arithmetic operators (+, -, *)[cite: 92, 93, 94].
* [cite_start]**Dynamic Input Support**: The implementation is designed to handle any number of input variables[cite: 102].
* [cite_start]**Extensible Architecture**: Built using abstract classes and inheritance to support any data type[cite: 107].

## Technical Implementation
This project showcases high-level software engineering concepts:
* **Abstract Class `Operator`**: Defines the blueprint for behavior across different data types.
* **Multiple Implementations**:
    * `IntegerOperator`: Standard mathematical operations for integers.
    * `StringOperator`: Custom logic for strings (Addition = Concatenation, Subtraction = Removal, Multiplication = Interleaving).
    * `ColorOperator`: Processes RGB values to calculate color distances using mathematical models.
* **Recursive Logic**: Implements a solver that explores all possible operation combinations to minimize the distance to the target.

## Examples & Test Cases
* [cite_start]**Integers**: Inputs `11, 7, 12, 6` with Target `41` leads to `(((12 - 7) * 6) + 11) = 41`[cite: 96].
* [cite_start]**Strings**: Inputs `R, A, N, A` with Target `NAR` leads to `(((N + R) * A) - A) = NAR`[cite: 97].
* **Colors**: Calculates the closest color match based on Euclidean distance in RGB space.

---
## Development Team
This was a collaborative effort by:
* Baharnur Türkoğlu
* Fatma Betül Özdemir
* İlknur Nazlı Koşar
* Efe Şahin

*AYBU Computer Engineering Dept. - January 2023*
