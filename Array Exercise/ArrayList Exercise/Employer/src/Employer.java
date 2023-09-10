import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employer {
    private int id;
    private String name;
    private double salary;

    public Employer(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    private void increaseSalary(double percent){

        this.setSalary((this.getSalary()*(percent/100) + this.getSalary()));
    }

    public static void searchId(List<Employer> employers, int id, double percent){


        for (int i = 0; i < employers.size(); i++) {
            if(employers.get(i).getId() == id){
                employers.get(i).increaseSalary(percent);
                System.out.println("Salary increase ");
                break;
            }else if (employers.indexOf(employers.get(i)) == employers.size() -1){
                System.out.println("ID not found");
            }
        }
    }

    public static int validId(List<Employer> employers, int id){
        int validateId = id;

        Scanner sc = new Scanner(System.in);

        for (Employer emp: employers) {
            if(emp.getId() == id){
               while (emp.getId() == validateId){
                   System.out.println("Id repetido, digite outro");
                   validateId = sc.nextInt();
               }
            }
        }
        return validateId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + ", " + name +  ", " + String.format("%.2f", salary) + ".";
    }
}


