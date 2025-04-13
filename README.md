# PROG5121 PoE Part A – Chat App (Registration & Login)

## Overview
This project is a Java-based registration and login system developed for Part A of the PROG5121 PoE at Rosebank College. It demonstrates the use of object-oriented programming principles, user input validation, and login simulation.

## Features
- Username validation (must contain an underscore and be ≤ 5 characters)
- Password complexity checking (capital letter, number, special character, min 8 chars)
- Cellphone number format check (must contain international code like +27)
- Login verification and status messages
- Fully automated test data in `Main.java`

## Files Included
- `Registration.java` – Handles user registration and validation
- `Login.java` – Handles login authentication and messages
- `Main.java` – Runs test cases for registration and login

## Output Example
=== TEST 1: Valid Registration === Username successfully captured. Password successfully captured. Cell number successfully captured. Welcome Kyle Smith It is great to see you again.

=== TEST 2: Invalid Login (Wrong Password) === Username or password incorrect, please try again.


## AI Tool Usage Acknowledgment
Some logic (such as regex and method structuring) was generated with assistance from **ChatGPT** on 11 April 2025, in line with the PoE guidelines which allow responsible AI use. All code was understood, tested, and implemented by the student.

## Submission Instructions
- This project is pushed to a public GitHub repository
- Submitted via ARC under **Content > Formative 1**
