package vizefinal;

import java.util.Scanner;

public class GradeManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter midterm exam");
        int midtermExam = scan.nextInt();
        System.out.println("Enter final exam");
        int finalExam = scan.nextInt();
        double average = midtermExam*0.4+finalExam*0.6;

        if (average >= 84 && average <= 100) {
            System.out.println(average + ": AA");
        } else if (average >= 70 && average < 84) {
            System.out.println(average + ": BA");
        } else if (average > 50 && average < 70) {
            System.out.println(average + ": BB");
        } else if (average == 50) {
            System.out.println(average + ": Pass an examination");
        } else {
            System.out.println(average + ": Fail an examination");
        }
    }
}

