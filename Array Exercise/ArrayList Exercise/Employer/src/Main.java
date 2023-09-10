import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employer> employerList = new ArrayList<>();

        System.out.print("How many Employers will be registred? ");
        int empLength = sc.nextInt();

        for (int i = 0; i < empLength; i++) {

            int inputId;
            String inputName;
            double inputSalary;

            sc.nextLine();
            System.out.println();

            System.out.println("Employe #" + (i+1));
            System.out.print("Id:");
            inputId = Employer.validId(employerList, sc.nextInt());
            sc.nextLine();

            System.out.print("Name: ");
            inputName = sc.nextLine();

            System.out.print("Salary: ");
            inputSalary = sc.nextDouble();

            employerList.add(new Employer(inputId, inputName, inputSalary));

        }

        System.out.println();

        System.out.print("Enter the employer id wich the salary will be increase: ");
        int empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        Employer.searchId(employerList, empId, percentage);

        System.out.println();

        System.out.println("List of Employers: ");
        System.out.println(employerList.toString());



    }
}