
import Student_Entity.Student;
import Subject_Entity.Subject;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Subject language = new Subject(1, "Language");
        Subject English = new Subject(2, "English");
        Subject Maths = new Subject(3, "Maths");
        Subject Biology = new Subject(4, "Biology");
        Subject ComputerScience = new Subject(5, "ComputerScience");
        ArrayList<Subject> subjects = new ArrayList<Subject>();
        subjects.add(language);
        subjects.add(English);
        subjects.add(Maths);
        subjects.add(Biology);
        subjects.add(ComputerScience);
        Student stud = new Student(0, null, subjects);

        while (true) {

            System.out.println(" Enter the number to access \n 1.Create Student \n 2.Calculate Total Marks \n 3. Calculate Average \n 4. Calculate Grade \n 5. Display Details \n 6. Exit");

            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();

            if (value == 1) {
                System.out.println("Creating Student Database");
                System.out.println("Enter the rollnumber: ");
                int RollNumber = scanner.nextInt();
                System.out.println("Enter the name: ");
                String StudentName = scanner.next();
                stud = new Student(RollNumber, StudentName, subjects);

            }

            if (value == 2) {
                System.out.println("Enter The Mark Of All The Subject");
                System.out.println("Enter the mark for language");
                int languageMark = scanner.nextInt();
                stud.subjects.get(0).mark = languageMark;
                if (languageMark > 100) {
                    System.out.println("you have entered the mark wrongly. So restart the process");
                    break;
                }

                System.out.println("Enter the mark for English");
                int englishMark = scanner.nextInt();
                stud.subjects.get(1).mark = englishMark;
                if (englishMark > 100) {
                    System.out.println("you have entered the mark wrongly. So restart the process");
                    break;
                }

                System.out.println("Enter the mark for Maths");
                int mathsMark = scanner.nextInt();
                stud.subjects.get(2).mark = mathsMark;
                if (mathsMark > 100) {
                    System.out.println("you have entered the mark wrongly. So restart the process");
                    break;
                }

                System.out.println("Enter the mark for Biology");
                int BiologyMark = scanner.nextInt();
                stud.subjects.get(3).mark = BiologyMark;
                if (BiologyMark > 100) {
                    System.out.println("you have entered the mark wrongly. So restart the process");
                    break;
                }

                System.out.println("Enter the mark for ComputerScience ");
                int ComputerScienceMark = scanner.nextInt();
                stud.subjects.get(4).mark = ComputerScienceMark;
                if (ComputerScienceMark > 100) {
                    System.out.println("you have entered the mark wrongly. So restart the process");
                    break;
                }

                System.out.println("Total mark you have Scored in all the subject ");
                int totalMarks = stud.CalculateTotalMarks(stud);
                System.out.println("Total Marks: " + totalMarks);

            }

            if (value == 3) {

                int Average = stud.CalculateAverage(stud);
                System.out.println("Average Mark:" + Average);

            }
            if (value == 4) {
                System.out.println("Calculating Grade");
                stud.CalculateGrade(stud);
            }
            if (value == 5) {
                System.out.println("Student Details");
                stud.DisplayStudentDetails(stud);
            }
            if (value == 6) {
                break;
            }

            if (value > 6) {
                System.out.println("Please enter the number from 1 to 6");
            }

        }

    }
}
