import java.util.Scanner;

public class GradeCalculator {

  
    public static void main(String[] args) {
        int subs;
        int iavg;
        float g;
        float[] marks = new float[25];
        float sum = 0;
        float avg;
        boolean fail = false;
        char grade;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        subs = obj.nextInt();
        System.out.println("Enter the marks in each subject:");
        for (int i = 1; i <= subs; i++) {
            System.out.println("Enter marks in Subject "+i);
            marks[i] = obj.nextFloat();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Enter Proper marks");
                i--;
                continue;
            }
            if (marks[i]<40) {
                fail = true;
            }
            sum = sum + marks[i];
        }

        System.out.println("Marks entered in subjects:");
        for (int i = 1; i <= subs; i++) {
            System.out.println(marks[i]);
        }
        avg = (sum) / (subs);
        System.out.println("Percentage = " + avg);
        g = avg / 10;
        iavg = Math.round(g);

        //System.out.println(iavg);

        if (fail) {
            System.out.println("Result = Fail!");
        }
            else{

        switch (iavg) {
            case 10:
                System.out.println("Obtained grade is A+");
                break;

            case 9:
                System.out.println("Obtained grade is A");
                break;

            case 8:
                System.out.println("Obtained grade is B+");
                break;

            case 7:
                System.out.println("Obtained grade is B");
                break;

            case 6:
                System.out.println("Obtained grade is C+");
                break;

            case 5:
                System.out.println("Obtained grade is C");
                break;

            case 4:
                System.out.println("Obtained grade is P");
                break;

            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Obtained grade is F");
                break;

            default:
                System.out.println("Enter proper marks");
                break;
        }
    }


    }

}
