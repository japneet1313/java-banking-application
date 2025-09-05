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

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1001, "Japneet", 5000, "japneet@email.com", "9876543210");
        acc.displayAccountDetails();

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.print("Enter withdrawal amount: ");
        double wdr = sc.nextDouble();
        acc.withdraw(wdr);

        acc.displayAccountDetails();
        sc.close();
    }
}
