## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## D# Banking Application (Java)

## 📌 Project Overview
This project is a simple **Banking Application** written in Java. It was created as part of my Java Programming Assignment in Semester 3. 

The program lets a user:
- Create a new bank account
- Deposit money
- Withdraw money
- View account details
- Update contact details

## 🛠️ Features
- `Account` class for storing and managing account information.
- `UserInterface` class with a menu-driven program.
- Supports multiple accounts using arrays.
- Input checking for deposits, withdrawals, and account numbers.
- Uses string handling for account holder details.

ATTRIBUTES AND METHODS FOR MY ACCOUNT CLASS
Attributes

accountNumber → Unique account number for each account.

accountHolderName → Name of the account holder.

balance → Stores current account balance.

email → Registered email address.

phoneNumber → Registered phone number.

METHODS
Methods

Constructor → Initializes account with number, name, initial deposit, email, and phone.

deposit(double amount) → Deposits money into the account.

withdraw(double amount) → Withdraws money if balance is sufficient.

displayAccountDetails() → Displays account details.

updateContactDetails(String email, String phone) → Updates email and phone number.

getAccountNumber() → Returns account number.

main(String[] args) → Demonstrates account creation, deposit, withdrawal, and display operations.

USERINTERFACE CLASS ATTRIBUTES AND METHODS

ATTRIBUTES
Attributes

accounts → Array to store up to 50 Account objects.

accountCount → Tracks the number of accounts created.

nextAccountNumber → Stores the next account number (starts from 1001).

sc → Scanner object for user input.

METHODS
Methods

createAccount() → Creates a new account with name, deposit, email, and phone.

findAccount(int accNo) → Searches and returns an account by account number.

performDeposit() → Deposits money into a given account.

performWithdrawal() → Withdraws money from a given account.

showAccountDetails() → Displays details of a specific account.

updateContact() → Updates email and phone number of an account.

mainMenu() → Provides the main menu for user interactions.

main(String[] args) → Entry point of the program, launches the main menu.
