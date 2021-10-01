/*
Create a class named Apartment that holds an apartment number, number of bedrooms,
number of baths, and rent amount. Create a constructor that accepts values for each data field. 
Also create a get method for each field. Write an application that creates at least five Apartment 
objects. Then display data for all the Apartment objects. Save the files as Apartment.java and TestApartments.java.
package testapartments;
*/
package TestApartments;

public class TestApartments {

    public static void main(String[] args) {
        
        //public Apartments(int ApNum, int BedNum, int BathNum, double Rent) <--- Format
        Apartments apartment1 = new Apartments(1, 1, 1, 1,000);
        Apartments apartment2 = new Apartments(2, 2, 1, 1,500);
        Apartments apartment3 = new Apartments(3, 3, 2, 2,000);
        Apartments apartment4 = new Apartments(4, 4, 3, 2,500);
        Apartments apartment5 = new Apartments(5, 5, 5, 3,500);
        
        System.out.println("Apartment 1\nApartment Number: " + apartment1.getApartmentNum() + "\nBeds: " + apartment1.getBedNum() + "\nBaths: " + apartment1.getBathNum() 
        + "\nRent: $" + apartment1.getRent());
        System.out.println("Apartment 2\nApartment Number: " + apartment2.getApartmentNum() + "\nBeds: " + apartment2.getBedNum() + "\nBaths: " + apartment2.getBathNum() 
        + "\nRent: $" + apartment2.getRent());
        System.out.println("Apartment 3\nApartment Number: " + apartment3.getApartmentNum() + "\nBeds: " + apartment3.getBedNum() + "\nBaths: " + apartment3.getBathNum() 
        + "\nRent: $" + apartment3.getRent());
        System.out.println("Apartment 4\nApartment Number: " + apartment4.getApartmentNum() + "\nBeds: " + apartment4.getBedNum() + "\nBaths: " + apartment4.getBathNum() 
        + "\nRent: $" + apartment4.getRent());
        System.out.println("Apartment 5\nApartment Number: " + apartment5.getApartmentNum() + "\nBeds: " + apartment5.getBedNum() + "\nBaths: " + apartment5.getBathNum() 
        + "\nRent: $" + apartment5.getRent());
    }
    
}
