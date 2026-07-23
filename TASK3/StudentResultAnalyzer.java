public class StudentResultAnalyzer {

    static int Studentmark = 0;
    static int StudentResult = 0;
    static int Totalmark = 0;
    static int Averagemark = 0;
    static int NumberofSubject = 0;
    static String PerfomanceStatus;
    static String StudentReport;
    static String StudentName;
    static int SubjectMarks;
    static int FinalGrade;


    public static void main(String[] args) {

        validateMarks();
        calculateTotal();
        calculateAverage();
        calculateGrade();
        checkPerformance();
        displayReport();
    }

    static int validateMarks() {
        int Studentmark = 0;

        if (0 < Studentmark && Studentmark < 100) {
            System.out.println("mark is valid ");
        } else {
            System.out.println("mark is false");
        }
        return Studentmark;
    }


    static void calculateTotal() {
        int Totalmark = 0;
        System.out.println("Totalmark = " + Totalmark);
    }

    static void calculateAverage() {
        int Averagemark = 0;

        System.out.println("Averagemark = " + Averagemark);
    }

    static void calculateGrade() {
        System.out.println("Averagemark = " + Averagemark);

        if (Averagemark > 90) {
            System.out.println("A");
        } else if (Averagemark > 80 && Averagemark < 89) {
            System.out.println("B");
        } else if (Averagemark > 70 && Averagemark < 79) {
            System.out.println("C");
        } else if (Averagemark > 60 && Averagemark < 69) {
            System.out.println("D");
        } else if (Averagemark < 60) {

            System.out.println("F");
        }

    }


    static void checkPerformance() {
        System.out.println("PerfomanceStatus = " + PerfomanceStatus);
    }

    static void displayReport() {
        System.out.println("StudentReport = " + StudentReport);
        if (Studentmark == 0) {
            System.out.println("Invalid marks. Please check the student grades");
        }
    }
}


