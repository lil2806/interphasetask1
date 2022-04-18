package Person.com;
import java.util.Scanner;
public class Person {
    Scanner sr = new Scanner(System.in);
    String surnamekama57094 , firstNamekama57094, streetkama57094 , citykama57094;
    int zipCodekama57094;

    void Initialize(){
        System.out.println("Please enter your Name: ");
        firstNamekama57094= sr.nextLine();
        System.out.println("Please enter your Surname: ");
        surnamekama57094 = sr.nextLine();
        System.out.println("Please enter your Street name: ");
        streetkama57094 = sr.nextLine();
        System.out.println("Please enter your City: ");
        citykama57094 = sr.nextLine();
        System.out.println("Please enter your Zip Code: ");
        zipCodekama57094 = sr.nextInt();
    }

    void printData(){
        System.out.println("Name: "+ firstNamekama57094);
        System.out.println("Surname: "+ surnamekama57094);
        System.out.println("Street Name: "+ streetkama57094);
        System.out.println("City: "+ citykama57094);
        System.out.println("Zip Code: "+ zipCodekama57094);
    }

}


class Staff extends Person implements Salary{
    String education , Position;
    void Initialize1(){
        Initialize();
        System.out.println("Enter your Education: ");
        education = sr.nextLine();
        System.out.println("Enter your Position");
        Position = sr.nextLine();
    }

    void Print1(){
        printData();
        System.out.println("Education: " + education);
        System.out.println("Position: "+ Position);
    }


    @Override
    public void salaryToPaykama57094(int hourskama57094, int Ratekama57094) {

    }

    @Override
    public int salaryForOvertime(int extrahourskama57094, int ratekama57094) {
        return Salary.super.salaryForOvertime(extrahourskama57094, ratekama57094);
    }
}

interface Salary{
    void salaryToPaykama57094(int hourskama57094, int Ratekama57094);



    default int salaryForOvertime(int extrahourskama57094, int ratekama57094){
        int salaryOverTime=extrahourskama57094 * ratekama57094;
        return salaryOverTime;

    }

    static double bonusCheckkama57094( int yearsOfExpirience){
        double bonuskama57094=0;
        if (yearsOfExpirience>3) bonuskama57094=100;
        else bonuskama57094=0;
        return bonuskama57094;
    };


}


class Main {
    public static void main(String[] args) {
        Staff employee = new Staff();
        employee.Initialize1();
        employee.Print1();
        employee.salaryToPaykama57094(5,9);
        Salary.bonusCheckkama57094(7);
    }

}
