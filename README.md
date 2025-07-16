# codsoft 
***code:1 Guessing Randon Number***

A fun and interactive **console-based game** written in Java where the player tries to guess a randomly generated number between 1 and 100. The game includes **difficulty levels** and tracks the number of attempts.

---

## 📌 Features

- Random number between 1–100 each round
- 3 Difficulty levels:
  - Easy: 10 attempts
  - Medium: 5 attempts
  - Hard: 3 attempts
- Feedback after each guess ("Too high", "Too low")
- Tracks number of attempts
- Option to play again

---

## 🛠️ Technologies Used

- Java (Core)
- `Scanner` for input
- `Random` for number generation
- Looping and conditional logic

---

## To run

java GuessingGame

## sample gane play

Welcome to the Number Guessing Game!
Choose difficulty (easy/medium/hard): medium

Guess a number between 1 and 100. You have 5 attempts.
Enter your guess: 50
Too high!
Enter your guess: 30
Too low!
Enter your guess: 40
Correct! You guessed in 3 attempts.

Play again? (yes/no): no
Thanks for playing!

💡 Improvements You Can Add

. Timer for each round
. Score tracking system
. GUI version using Java Swing
. Difficulty setting with custom ranges




**# code 2: Student Grade Calculator**

This is a simple **Java console application** that allows users to input marks for any number of subjects, calculates the **total marks**, **average percentage**, and assigns a **grade** based on the percentage.

---

## 📌 Features

- Accepts user input for any number of subjects
- Accept total out of marks in each subject
- Calculates:
  - Total marks
  - Average percentage
  - Grade based on percentage
- Displays results in a clean format

---

##  Grading Criteria

| Percentage Range | Grade |
|------------------|-------|
| 90–100           | A     |
| 80–89            | B     |
| 70–79            | C     |
| 60–69            | D     |
| Below 60         | F     |

---

## To run the program

java StudentGradeCalculator

## sample output

Enter the number of subjects: 5
Enter marks for subject 1 (out of 100): 87
Enter marks for subject 2 (out of 100): 78
Enter marks for subject 3 (out of 100): 90
Enter marks for subject 4 (out of 100): 85
Enter marks for subject 5 (out of 100): 88

--- Result ---
Total Marks: 428 out of 500
Average Percentage: 85.60%
Grade: B

🛠️ Technologies Used

 *Java
 *Scanner class for input
 *Console-based logic

 **# code:3 Simple ATM System in Java**

A console-based ATM simulation written in Java. This project demonstrates core object-oriented principles with basic banking functionalities: **check balance**, **deposit**, and **withdraw**.

---

##  Features

- **Secure account simulation** via `BankAccount` class  
- **User interface** through console menu in the `ATM` class  
- **Robust operations**:  
  - Check current balance  
  - Deposit money (only positive amounts)  
  - Withdraw money (with balance validation)  
- **Input validation** for incorrect menu choices or invalid amounts  
- **Clear messaging** on success or failure of transactions

---

## To Run the program:

java ATM

## usage

1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Option 1: Displays your current account balance
Option 2: Prompts for a deposit amount; only positive numbers accepted
Option 3: Prompts for withdrawal; only valid if you have enough balance
Option 4: Exit the ATM simulation

The system loops until you choose to exit.  

🧩 Project Structure

.
├── ATM.java         # Main class handling UI and input
└── BankAccount.java # Encapsulates balance and validates operation


------------------------------------------------------------------------------------------------

These three console-based Java projects—Student Grade Calculator, Number Guessing Game, and ATM Interface—demonstrate foundational programming skills:

 ..The Grade Calculator shows data processing, arithmetic operations, and results reporting.

 ..The Number Guessing Game is a fun interaction example, using loops, random numbers, and input validation.

 ..The ATM Interface emphasizes object-oriented principles, account management, menu-driven UI, and robust error handling.

 







