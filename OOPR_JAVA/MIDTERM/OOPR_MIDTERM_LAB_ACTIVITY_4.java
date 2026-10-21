
import java.util.Scanner;

public class OOPR_MIDTERM_LAB_ACTIVITY_4 {

    public static void main(String[] args) {
        Scanner menuScanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("CHOOSE A PROGRAM");
        System.out.println("[18] Smart Payslip Generator (Single Employee)");
        System.out.println("[19] Student Information & Tuition Fee Billing");
        System.out.println("[20] Customer Purchase Order with Receipt");
        System.out.println("[21] Simple Ticketing System (Plain Ticket)");
        System.out.println("[22] Simple Reservation and Billing System");
        System.out.println("[23] Simple CRS – Car Rental System");
        System.out.println("[24] Simple ROS – Restaurant Ordering System");
        System.out.println("[25] Simple Flower Reservation & Billing System");
        System.out.println(" ");
        System.out.print("SELECT (18-25): ");

        int choice = menuScanner.nextInt();
        System.out.println("\nPROGRAM " + choice + ":\n");

        switch (choice) {
            case 18:
                runProgramming18();
                break;
            case 19:
                runProgramming19();
                break;
            case 20:
                runProgramming20();
                break;
            case 21:
                runProgramming21();
                break;
            case 22:
                runProgramming22();
                break;
            case 23:
                runProgramming23();
                break;
            case 24:
                runProgramming24();
                break;
            case 25:
                runProgramming25();
                break;
            default:
                System.out.println("INVALID CHOOSE 18-25.");
        }

        menuScanner.close();
    }


    // PROGRAMMING 18: SMART PAYSLIP GENERATOR
    public static void runProgramming18() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Employee ID: ");
        String empId = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Basic Monthly Salary: ");
        double basicSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Start Date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        System.out.print("End Date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();
        System.out.print("Payout Date (YYYY-MM-DD): ");
        String payoutDate = scanner.nextLine();
        System.out.print("Regular Hours: ");
        double regularHours = scanner.nextDouble();
        System.out.print("Overtime Hours: ");
        double otHours = scanner.nextDouble();
        System.out.print("Absent Days: ");
        int absentDays = scanner.nextInt();
        System.out.print("Rice Allowance: ");
        double rice = scanner.nextDouble();
        System.out.print("Transportation Allowance: ");
        double trans = scanner.nextDouble();
        System.out.print("Communication Allowance: ");
        double comm = scanner.nextDouble();
        System.out.print("SSS Contribution: ");
        double sss = scanner.nextDouble();
        System.out.print("PhilHealth: ");
        double philhealth = scanner.nextDouble();
        System.out.print("PAG-IBIG: ");
        double pagibig = scanner.nextDouble();
        System.out.print("Withholding Tax: ");
        double tax = scanner.nextDouble();
        System.out.print("Other Deductions: ");
        double otherDeductions = scanner.nextDouble();

        double hourlyRate = basicSalary / 160.0;
        double dailyRate = basicSalary / 20.0;
        double regularPay = regularHours * hourlyRate;
        double otPay = otHours * (hourlyRate * 1.25);
        double absenceDeduction = absentDays * dailyRate;
        double totalAllowances = rice + trans + comm;
        double grossPay = regularPay + otPay + totalAllowances;
        double totalDeductions = sss + philhealth + pagibig + tax + otherDeductions + absenceDeduction;
        double netPay = grossPay - totalDeductions;

        System.out.println("\n*** Smart Employee Payslip ***");
        System.out.printf("  Name: %s | ID: %s | Dept: %s\n", name, empId, department);
        System.out.printf("  Pay Period: %s to %s | Payout: %s\n", startDate, endDate, payoutDate);
        System.out.println("----------------------------------------------");
        System.out.printf("  Regular Pay: PHP %,.2f | OT Pay: PHP %,.2f\n", regularPay, otPay);
        System.out.printf("  Total Allowances Breakdown: Rice: %,.2f, Trans: %,.2f, Comm: %,.2f\n", rice, trans, comm);
        System.out.printf("  Gross Pay:   PHP %,.2f\n", grossPay);
        System.out.printf("  Deductions:  SSS: %,.2f, Phil: %,.2f, PAG-IBIG: %,.2f, Tax: %,.2f, Abs: %,.2f, Other: %,.2f\n", sss, philhealth, pagibig, tax, absenceDeduction, otherDeductions);
        System.out.printf("  Total Deductions: PHP %,.2f\n", totalDeductions);
        System.out.println("----------------------------------------------");
        System.out.printf("  Net Pay:     PHP %,.2f\n", netPay);
        scanner.close();
    }
    

    // PROGRAMMING 19: STUDENT TUITION BILLING
    public static void runProgramming19() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Course: ");
        String course = scanner.nextLine();
        System.out.print("Year Level: ");
        int yearLevel = scanner.nextInt();
        System.out.print("Units Enrolled: ");
        int units = scanner.nextInt();
        System.out.print("Tuition per Unit: ");
        double feePerUnit = scanner.nextDouble();
        System.out.print("Miscellaneous Fee: ");
        double miscFee = scanner.nextDouble();
        System.out.print("Laboratory Fee: ");
        double labFee = scanner.nextDouble();
        System.out.print("Library Fee: ");
        double libraryFee = scanner.nextDouble();
        System.out.print("Other Fees: ");
        double otherFees = scanner.nextDouble();
        System.out.print("Down Payment: ");
        double downPayment = scanner.nextDouble();
        System.out.print("Scholarship Discount: ");
        double discount = scanner.nextDouble();

        double tuitionFeeTotal = units * feePerUnit;
        double totalAdditionalFees = labFee + libraryFee + otherFees;
        double grossTotalFee = tuitionFeeTotal + miscFee + totalAdditionalFees;
        double netTotalFee = grossTotalFee - discount;
        double balance = netTotalFee - downPayment;

        System.out.println("\n*** STUDENT TUITION BILLING SYSTEM ***");
        System.out.printf("  Student: %s (%s) - %s Year %d\n", name, studentId, course, yearLevel);
        System.out.printf("  Tuition Fee Total (%d units): PHP %,.2f\n", units, tuitionFeeTotal);
        System.out.printf("  Fees Breakdown: Misc: %,.2f, Lab: %,.2f, Lib: %,.2f, Other: %,.2f\n", miscFee, labFee, libraryFee, otherFees);
        System.out.printf("  Gross Total Fee:  PHP %,.2f\n", grossTotalFee);
        System.out.printf("  Discount Applied: PHP %,.2f\n", discount);
        System.out.printf("  Net Total Fee:    PHP %,.2f\n", netTotalFee);
        System.out.printf("  Down Payment:     PHP %,.2f\n", downPayment);
        System.out.println("----------------------------------------------");
        System.out.printf("  Remaining Balance: PHP %,.2f\n", balance);
        scanner.close();
    }


    // PROGRAMMING 20: CUSTOMER PURCHASE ORDER
    public static void runProgramming20() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Customer ID: ");
        String custId = scanner.nextLine();

        String[] items = new String[3];
        int[] qties = new int[3];
        double[] prices = new double[3];
        double subtotal = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Item " + (i + 1) + ":");
            System.out.print("  Name: ");
            items[i] = scanner.nextLine();
            System.out.print("  Qty: ");
            qties[i] = scanner.nextInt();
            System.out.print("  Price: ");
            prices[i] = scanner.nextDouble();
            scanner.nextLine();
            subtotal += (qties[i] * prices[i]);
        }

        System.out.print("Discount (%%): ");
        double discPercent = scanner.nextDouble();
        System.out.print("Amount Tendered: ");
        double tendered = scanner.nextDouble();

        double discAmt = subtotal * (discPercent / 100.0);
        double totalDue = subtotal - discAmt;
        double change = tendered - totalDue;

        System.out.println("\n******** CUSTOMER RECEIPT ********");
        System.out.printf("Customer: %s (%s)\n", name, custId);
        System.out.printf("%-15s %-5s %-10s %-10s\n", "Item", "Qty", "Price", "Total");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s %-5d %-10.2f %-10.2f\n", items[i], qties[i], prices[i], (qties[i] * prices[i]));
        }

        System.out.printf("  Subtotal:        PHP %,.2f\n", subtotal);
        System.out.printf("  Discount (%.0f%%): PHP %,.2f\n", discPercent, discAmt);
        System.out.printf("  Total Due:       PHP %,.2f\n", totalDue);
        System.out.printf("  Cash Paid:       PHP %,.2f\n", tendered);
        System.out.printf("  Change:          PHP %,.2f\n", change);
        scanner.close();
    }


    // PROGRAMMING 21: SIMPLE TICKETING SYSTEM
    public static void runProgramming21() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Customer ID: ");
        String custId = scanner.nextLine();
        System.out.print("Event Name: ");
        String event = scanner.nextLine();
        System.out.print("Ticket Type: ");
        String type = scanner.nextLine();
        System.out.print("Ticket Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int qty = scanner.nextInt();
        System.out.print("Discount (%%): ");
        double discPercent = scanner.nextDouble();
        System.out.print("Amount Tendered: ");
        double tendered = scanner.nextDouble();

        double totalCost = price * qty;
        double discAmt = totalCost * (discPercent / 100.0);
        double finalDue = totalCost - discAmt;
        double change = tendered - finalDue;

        System.out.println("\n******** EVENT TICKET ********");
        System.out.printf("  Customer: %s (%s)\n", name, custId);
        System.out.printf("  Event: %s | Type: %s\n", event, type);
        System.out.printf("  Qty: %d x PHP %,.2f = PHP %,.2f\n", qty, price, totalCost);
        System.out.printf("  Discount Amount (%.0f%%): PHP %,.2f\n", discPercent, discAmt);
        System.out.printf("  Final Amount Due:        PHP %,.2f\n", finalDue);
        System.out.printf("  Amount Paid:             PHP %,.2f\n", tendered);
        System.out.printf("  Change:                  PHP %,.2f\n", change);
        scanner.close();
    }


    // PROGRAMMING 22: RESERVATION & BILLING
    public static void runProgramming22() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Customer ID: ");
        String custId = scanner.nextLine();
        System.out.print("Reservation Type: ");
        String resType = scanner.nextLine();
        System.out.print("Duration (Days/Hours): ");
        int duration = scanner.nextInt();
        System.out.print("Rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Food Charges: ");
        double food = scanner.nextDouble();
        System.out.print("Service Charges: ");
        double service = scanner.nextDouble();
        System.out.print("Other Charges: ");
        double other = scanner.nextDouble();
        System.out.print("Discount (%%): ");
        double discPercent = scanner.nextDouble();
        System.out.print("Down Payment: ");
        double downPayment = scanner.nextDouble();

        double resCost = duration * rate;
        double subtotal = resCost + food + service + other;
        double discAmt = subtotal * (discPercent / 100.0);
        double totalBill = subtotal - discAmt;
        double balance = totalBill - downPayment;

        System.out.println("\n******** RESERVATION BILLING ********");
        System.out.printf("  Customer: %s (%s)\n", name, custId);
        System.out.printf("  Reservation (%s): %d units x %,.2f = PHP %,.2f\n", resType, duration, rate, resCost);
        System.out.printf("  Extra Service Fees: Food: %,.2f, Service: %,.2f, Other: %,.2f\n", food, service, other);
        System.out.printf("  Subtotal:         PHP %,.2f\n", subtotal);
        System.out.printf("  Discount (%.0f%%): PHP %,.2f\n", discPercent, discAmt);
        System.out.printf("  Total Bill:       PHP %,.2f\n", totalBill);
        System.out.printf("  Down Payment:     PHP %,.2f\n", downPayment);
        System.out.printf("  Remaining Balance:PHP %,.2f\n", balance);
        scanner.close();
    }


    // PROGRAMMING 23: CAR RENTAL SYSTEM (CRS)
    public static void runProgramming23() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Customer ID: ");
        String custId = scanner.nextLine();
        System.out.print("Driver License: ");
        String license = scanner.nextLine();
        System.out.print("Vehicle Type: ");
        String type = scanner.nextLine();
        System.out.print("Vehicle Model: ");
        String model = scanner.nextLine();
        System.out.print("Rate per Day: ");
        double rate = scanner.nextDouble();
        System.out.print("Rental Days: ");
        int days = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Pickup Date: ");
        String pickup = scanner.nextLine();
        System.out.print("Return Date: ");
        String returnDate = scanner.nextLine();
        System.out.print("Insurance Fee: ");
        double insurance = scanner.nextDouble();
        System.out.print("Fuel Charge: ");
        double fuel = scanner.nextDouble();
        System.out.print("Other Charges: ");
        double other = scanner.nextDouble();
        System.out.print("Discount (%%): ");
        double discPercent = scanner.nextDouble();
        System.out.print("Amount Paid: ");
        double paid = scanner.nextDouble();
        double rentalCost = rate * days;
        double subtotal = rentalCost + insurance + fuel + other;
        double discAmt = subtotal * (discPercent / 100.0);
        double totalDue = subtotal - discAmt;
        System.out.println("\n******** CAR RENTAL RECEIPT ********");
        System.out.printf("  Customer: %s | License: %s\n", name, license);
        System.out.printf("  Vehicle: %s %s | Days: %d (%s to %s)\n", type, model, days, pickup, returnDate);
        System.out.printf("  Rental Cost: PHP %,.2f | Add-on Charges: %,.2f\n", rentalCost, (insurance + fuel + other));
        System.out.printf("  Subtotal:    PHP %,.2f\n", subtotal);
        System.out.printf("  Total Due:   PHP %,.2f\n", totalDue);
        System.out.printf("  Amount Paid: PHP %,.2f\n", paid);
        if (paid >= totalDue) {
            System.out.printf("  Change:      PHP %,.2f\n", (paid - totalDue));
        } else {
            System.out.printf("  Balance:     PHP %,.2f\n", (totalDue - paid));
        }
        scanner.close();
    }

    
    // PROGRAMMING 24: RESTAURANT ORDERING SYSTEM
    public static void runProgramming24() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Order Type (Dine-In/Takeout): ");
        String orderType = scanner.nextLine();
        String[] items = new String[3];
        int[] qties = new int[3];
        double[] prices = new double[3];
        double subtotal = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Item " + (i + 1) + ":");
            System.out.print("  Name: ");
            items[i] = scanner.nextLine();
            System.out.print("  Qty: ");
            qties[i] = scanner.nextInt();
            System.out.print("  Price: ");
            prices[i] = scanner.nextDouble();
            scanner.nextLine();
            subtotal += (qties[i] * prices[i]);
        }
        System.out.print("Service Charge (Dine-In): ");
        double sc = scanner.nextDouble();
        System.out.print("Packaging Fee (Takeout): ");
        double pf = scanner.nextDouble();
        System.out.print("Discount (%%): ");
        double discPercent = scanner.nextDouble();
        System.out.print("Amount Tendered: ");
        double tendered = scanner.nextDouble();
        double charge = orderType.equalsIgnoreCase("Dine-In") ? sc : pf;
        double beforeDiscount = subtotal + charge;
        double discAmt = beforeDiscount * (discPercent / 100.0);
        double totalDue = beforeDiscount - discAmt;
        double change = tendered - totalDue;
        System.out.println("\n******** RESTAURANT RECEIPT ********");
        System.out.printf("  Customer: %s (%s)\n", name, orderType);
        System.out.printf("%-15s %-5s %-10s %-10s\n", "Menu Item", "Qty", "Price", "Total");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s %-5d %-10.2f %-10.2f\n", items[i], qties[i], prices[i], (qties[i] * prices[i]));
        }
        System.out.printf("  Subtotal:        PHP %,.2f\n", subtotal);
        System.out.printf("  Extra Charge:    PHP %,.2f\n", charge);
        System.out.printf("  Total Due:       PHP %,.2f\n", totalDue);
        System.out.printf("  Change Issued:   PHP %,.2f\n", change);
        scanner.close();
    }


    // PROGRAMMING 25: FLOWER RESERVATION SYSTEM
    public static void runProgramming25() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Customer ID: ");
        String custId = scanner.nextLine();
        System.out.print("Contact Number: ");
        String contact = scanner.nextLine();
        System.out.print("Flower Type: ");
        String flower = scanner.nextLine();
        System.out.print("Arrangement Type: ");
        String arrange = scanner.nextLine();
        System.out.print("Price per Arrangement: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int qty = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Reservation Date: ");
        String resDate = scanner.nextLine();
        System.out.print("Delivery Date: ");
        String delDate = scanner.nextLine();
        System.out.print("Delivery Fee: ");
        double delivery = scanner.nextDouble();
        System.out.print("Customization Fee: ");
        double custom = scanner.nextDouble();
        System.out.print("Other Charges: ");
        double other = scanner.nextDouble();
        System.out.print("Discount (%%): ");
        double discPercent = scanner.nextDouble();
        System.out.print("Down Payment: ");
        double down = scanner.nextDouble();
        double resCost = price * qty;
        double subtotal = resCost + delivery + custom + other;
        double discAmt = subtotal * (discPercent / 100.0);
        double totalBill = subtotal - discAmt;
        double balance = totalBill - down;
        System.out.println("\n******** FLOWER RESERVATION RECEIPT ********");
        System.out.printf("  Customer: %s (%s) | Contact: %s\n", name, custId, contact);
        System.out.printf("  Order: %d x %s (%s arrangements) = PHP %,.2f\n", qty, flower, arrange, resCost);
        System.out.printf("  Subtotal: PHP %,.2f | Total Bill: PHP %,.2f\n", subtotal, totalBill);
        System.out.printf("  Remaining Balance: PHP %,.2f\n", balance);
        scanner.close();
    }
}
