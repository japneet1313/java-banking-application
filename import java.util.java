import java.util.Scanner;

class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String email;
    private String phoneNumber;

    // Constructor
    public Account(int accNo, String name, double initialDeposit, String email, String phone) {
        this.accountNumber = accNo;
        this.accountHolderName = name;
        this.balance = initialDeposit;
        this.email = email;
        this.phoneNumber = phone;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully!");
        } else {
            System.out.println("Invalid amount. Deposit must be positive.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully!");
        }
    }

    // Display details
    public void displayAccountDetails() {
        System.out.println("------ Account Details ------");
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
    }

    // Update email and phone
    public void updateContactDetails(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Contact details updated successfully!");
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

public class UserInterface {
    private static Account[] accounts = new Account[50]; // max 50 accounts
    private static int accountCount = 0;
    private static int nextAccountNumber = 1001; // starting acc no.
    private static Scanner sc = new Scanner(System.in);

    // Create account
    public static void createAccount() {
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial deposit amount: ");
        double deposit = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        Account acc = new Account(nextAccountNumber, name, deposit, email, phone);
        accounts[accountCount++] = acc;

        System.out.println("Account created successfully! Your Account No: " + nextAccountNumber);
        nextAccountNumber++;
    }

    // Find account by number
    private static Account findAccount(int accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accNo) {
                return accounts[i];
            }
        }
        return null;
    }

    // Deposit
    public static void performDeposit() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();

        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.deposit(amt);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Withdraw
    public static void performWithdrawal() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();

        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.withdraw(amt);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Show account details
    public static void showAccountDetails() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.displayAccountDetails();
        } else {
            System.out.println("No account exists with this number.");
        }
    }

    // Update contact
    public static void updateContact() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter new email: ");
        String email = sc.nextLine();
        System.out.print("Enter new phone: ");
        String phone = sc.nextLine();

        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.updateContactDetails(email, phone);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Main menu
    public static void mainMenu() {
        int choice;
        do {
            System.out.println("\n===== Welcome to Simple Banking App =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Account Details");
            System.out.println("5. Update Contact Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1: createAccount(); break;
                case 2: performDeposit(); break;
                case 3: performWithdrawal(); break;
                case 4: showAccountDetails(); break;
                case 5: updateContact(); break;
                case 6: System.out.println("Thank you for using our banking app!"); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
