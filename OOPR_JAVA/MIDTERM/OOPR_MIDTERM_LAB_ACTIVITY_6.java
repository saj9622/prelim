import java.util.InputMismatchException;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class OOPR_MIDTERM_LAB_ACTIVITY_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // MAIN
        while (running) {
            System.out.println(" ");
            System.out.println("CHOOSE A PROGRAM");
            System.out.println(" ");
            System.out.println("[1] PROGRAM 1");
            System.out.println("[2] PROGRAM 2");
            System.out.println("[3] PROGRAM 3");
            System.out.println("[4] EXIT");
            System.out.println(" ");

            int choice = readValidInt(scanner, "SELECT (1-4): ");
            System.out.println("\n-------------------------------");

            switch (choice) {
                case 1:
                    System.out.println("RUNNING PROGRAM 1:");
                    runProgramming1(scanner);
                    break;
                case 2:
                    System.out.println("RUNNING PROGRAM 2:");
                    runProgramming2(scanner);
                    break;
                case 3:
                    System.out.println("RUNNING PROGRAM 3:");
                    runProgramming3();
                    break;
                case 4:
                    System.out.println("BYE!");
                    running = false;
                    break;
                default:
                    System.out.println("INVALID SELECT (1-4)");
            }
        }
        scanner.close();
    }

    // INPUT VALIDATION UTILITIES
    private static int readValidInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid whole number.");
                scanner.nextLine();
            }
        }
    }

    private static double readValidDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid numeric value.");
                scanner.nextLine();
            }
        }
    }

    // PROGRAM 1 ==
    public static void runProgramming1(Scanner scanner) {
        System.out.println(" ");
        double initialBalance = readValidDouble(scanner, "Enter your balance: ");

        BankAccount account = new BankAccount(initialBalance);
        boolean inBankMenu = true;

        while (inBankMenu) {
            System.out.println("\n---------------------------------------------");
            System.out.println("Select an option:");
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. EXIT");
            System.out.println("---------------------------------------------");

            int bankChoice = readValidInt(scanner, "SELECT (1-3): ");

            switch (bankChoice) {
                case 1:
                    System.out.println("\nHow much amount you want to withdraw from your account?");
                    double withdrawAmt = readValidDouble(scanner, "Amount: ");
                    if (withdrawAmt > account.getBalance()) {
                        System.out.println("Transaction Failed: Insufficient funds.");
                    } else {
                        account.withdraw(withdrawAmt);
                        System.out.println("Your new balance is: " + (int) account.getBalance());
                    }
                    break;

                case 2:
                    System.out.println("\nHow much amount you want to deposit in your account?");
                    double depositAmt = readValidDouble(scanner, "Amount: ");
                    account.deposit(depositAmt);
                    System.out.println("Your new balance is: " + (int) account.getBalance());
                    break;

                case 3:
                    System.out.println("\nGET OUT!");
                    inBankMenu = false;
                    break;

                default:
                System.out.println("INVALID SELECT (1-4)");
            }
        }
    }

    // PROGRAM 2 ==
    static class Date {
        int day;
        int month;
        int year;
    }

    static class PatientBase {
        String name;
        Date admissionDate = new Date();
        String disease;
        Date dischargeDate = new Date();

        public void enterBaseInfo(Scanner sc) {
            sc.nextLine();
            System.out.print("Enter Name: ");
            name = sc.nextLine();

            admissionDate.day = readValidInt(sc, "Enter Admission Day (DD): ");
            admissionDate.month = readValidInt(sc, "Enter Admission Month (MM): ");
            admissionDate.year = readValidInt(sc, "Enter Admission Year (YYYY): ");

            sc.nextLine();
            System.out.print("Enter Disease: ");
            disease = sc.nextLine();

            dischargeDate.day = readValidInt(sc, "Enter Discharge Day (DD): ");
            dischargeDate.month = readValidInt(sc, "Enter Discharge Month (MM): ");
            dischargeDate.year = readValidInt(sc, "Enter Discharge Year (YYYY): ");
        }

        public void displayBaseInfo() {
            System.out.println("Name: " + name);
            System.out.println(
                    "Admission Date: " + admissionDate.day + "/" + admissionDate.month + "/" + admissionDate.year);
            System.out.println("Disease: " + disease);
            System.out.println(
                    "Discharge Date: " + dischargeDate.day + "/" + dischargeDate.month + "/" + dischargeDate.year);
        }
    }

    static class IndoorPatient extends PatientBase {
        int age;

        public void enterPatientInfo(Scanner sc) {
            enterBaseInfo(sc);
            age = readValidInt(sc, "Enter Age: ");
        }

        public void displayPatientInfo() {
            displayBaseInfo();
            System.out.println("Age: " + age);
            System.out.println("------------------------------------");
        }
    }

    public static void runProgramming2(Scanner scanner) {
        IndoorPatient[] database = new IndoorPatient[100];
        int totalPatients = 0;
        int choice;

        do {
            System.out.println("\nPatient Database Menu:");
            System.out.println("1. Insert New Patient");
            System.out.println("2. Display all Patients");
            System.out.println("3. Display pediatric patients");
            System.out.println("4. EXIT");

            choice = readValidInt(scanner, "Enter your choice: ");

            if (choice == 1) {
                if (totalPatients >= database.length) {
                    System.out.println("Database is full!");
                    continue;
                }
                database[totalPatients] = new IndoorPatient();
                System.out.println("\nInserting New Patient Data");
                System.out.println("------------------------------------");
                database[totalPatients].enterPatientInfo(scanner);
                totalPatients++;
                System.out.println("Patient record saved successfully!");
            } else if (choice == 2) {
                if (totalPatients == 0) {
                    System.out.println("\nThe database is empty.");
                } else {
                    System.out.println("\nListing All Patients");
                    System.out.println("------------------------------------");
                    for (int i = 0; i < totalPatients; i++) {
                        database[i].displayPatientInfo();
                    }
                }
            } else if (choice == 3) {
                if (totalPatients == 0) {
                    System.out.println("\nThe database is empty.");
                } else {
                    System.out.println("\nListing Pediatric Patients (< 12 years old)");
                    System.out.println("------------------------------------");
                    boolean found = false;
                    for (int i = 0; i < totalPatients; i++) {
                        if (database[i].age < 12) {
                            database[i].displayPatientInfo();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No pediatric patients found.");
                    }
                }
            }
        } while (choice != 4);

        System.out.println("\nEXITING PROGRAM 2");
    }

    // PROGRAM 3 ==
    static class Professor {
        String name;
        double salary;

        public Professor(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    static class Dean extends Professor {
        String department;

        public Dean(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }

        @Override
        public String toString() {
            return "+ Status:\n" + "+ Rank: Dean\n" + "+ Name: " + this.name + "\n" + "+ Department: " + this.department
                    + "\n" + "+ Salary: " + this.salary;
        }
    }

    static class Executive extends Dean {
        public Executive(String name, double salary, String department) {
            super(name, salary, department);
        }

        @Override
        public String toString() {
            return "+ Status:\n" + "+ Rank: Executive\n" + "+ Name: " + this.name + "\n" + "+ Department: "
                    + this.department + "\n" + "+ Salary: " + this.salary + "\n";
        }
    }

    public static void runProgramming3() {
        System.out.println(" ");
        Dean deanObj = new Dean("John Cena", 25000, "English");
        System.out.println(deanObj);
        System.out.println("-----------------------------------");
        Executive execObj = new Executive("Ronald McDonald", 42000, "Computer Science");
        System.out.println(execObj);
    }
}
