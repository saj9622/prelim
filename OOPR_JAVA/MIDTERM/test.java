// Main class to run Program 2
public class test {
    public static void main(String[] args) {
            ScholarStudent scholar1 = new ScholarStudent("John Lloyd Zapanta", 1200002823L, 46000.00, 0);
            ScholarStudent scholar2 = new ScholarStudent("Russel Mangahas", 1250006952L, 43000.00, 67);

            System.out.println("\n");
            System.out.println(scholar1);
            System.out.println(" ");
            System.out.println(scholar2);
    }
}

class Student {
    protected String name;
    protected long studentId;
    protected double tuitionFee;

    public Student(String name, long studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Student ID: " + studentId + "\nTuition fee: " + tuitionFee;
    }
}

class ScholarStudent extends Student {
    private int scholarshipPercentage;

    public ScholarStudent(String name, long studentId, double tuitionFee, int scholarshipPercentage) {
        super(name, studentId, tuitionFee);
        if (scholarshipPercentage < 0 || scholarshipPercentage > 100) {
            throw new IllegalArgumentException("Scholarship percentage must be between 0 and 100.");
        }
        this.scholarshipPercentage = scholarshipPercentage;
    }

    public double calculatePayableFee() {
        return this.tuitionFee - (this.tuitionFee * this.scholarshipPercentage / 100.0);
    }

    @Override
    public String toString() {
        double payableFee = calculatePayableFee();
        return "Name: " + name + " | Student ID: " + studentId + 
            "\nTuition fee: " + tuitionFee + 
            "\nScholarship: " + scholarshipPercentage + "%" + 
            "\nPayable fee: " + payableFee;
    }
}
