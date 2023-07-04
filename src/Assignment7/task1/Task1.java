package Assignment7.task1;

/*
Create a class Employee that has the following attributes: name, lastname and year of employment.
Create a method that checks whether the employee in the company works for logner than 10 years (parameter of the method)
In the main method create 3 employees and print out whether he works in the company for more than 10 years.
 */
public class Task1 {
    public static void main(String[] args) {

        Employee employee = new Employee("Mile", "Milic", 2003);
        Employee employee1 = new Employee("Marko", "Markovic", 2020);
        Employee employee2 = new Employee("Dragan", "Nikolic", 2012);


        System.out.println("First employee works in the company for more than 10 years. " + employee.moreThanTen());
        System.out.println("Second employee works in the company for more than 10 years. " + employee1.moreThanTen());
        System.out.println("Third employee works in the company for more than 10 years. " + employee2.moreThanTen());


    }
}
