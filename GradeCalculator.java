import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int subjectCount = scanner.nextInt();

        System.out.println("Enter marks for " + subjectCount + " subjects:");
        float totalMarks = 0;

        for (int i = 0; i < subjectCount; i++) {
            totalMarks += scanner.nextInt();
        }

        scanner.close(); // Closing the scanner when it's no longer needed.

        System.out.println("Total Marks: " + totalMarks);

        // Assuming each subject is out of 100 marks.
        float maximumPossibleMarks = subjectCount * 100;
        float percentage = (totalMarks / maximumPossibleMarks) * 100;

        String grade = calculateGrade(percentage);
        System.out.println("Grade: " + grade);
    }

    private static String calculateGrade(float percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}
