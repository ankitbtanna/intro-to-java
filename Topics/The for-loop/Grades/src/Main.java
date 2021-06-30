import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = scanner.nextInt();

        int gradeAStudents = 0;
        int gradeBStudents = 0;
        int gradeCStudents = 0;
        int gradeDStudents = 0;

        int gradeOfStudent = 0;
        for (int i = 0; i < numberOfStudents; i ++) {
            gradeOfStudent = scanner.nextInt();

            if (gradeOfStudent == 5) {
                gradeAStudents++;
            }

            if (gradeOfStudent == 4) {
                gradeBStudents++;
            }

            if (gradeOfStudent == 3) {
                gradeCStudents++;
            }

            if (gradeOfStudent == 2) {
                gradeDStudents++;
            }
        }

        System.out.print(gradeDStudents + " ");
        System.out.print(gradeCStudents + " ");
        System.out.print(gradeBStudents + " ");
        System.out.print(gradeAStudents);
    }
}