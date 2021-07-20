import java.util.Scanner;

public class TranslatingGrades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Please give the grade number you wish to translate (1 to 5):%n");

        int grade = scanner.nextInt(); //Scans the system input of the user and saves it into grade

        while (grade <= 0 || grade >= 6) {
            System.out.printf("%d is not a valid input. Please give the grade number you wish to translate (1 to 5):%n", grade);
            grade = scanner.nextInt();
        } //while loop runs when the user puts a number between < 1 or > 6 until the user puts in a value between 1 to 5

        String gradeTranslation = switch (grade) {
            case 1:
                yield "Very Good";
            case 2:
                yield "Good";
            case 3:
                yield "Satisfactory";
            case 4:
                yield "Sufficient";
            case 5:
                yield "Not sufficient";
            default:
                yield "invalid";
        };

        System.out.printf("%d translates to: %s.", grade, gradeTranslation);
    }

}
