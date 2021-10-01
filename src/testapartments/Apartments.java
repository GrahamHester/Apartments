/*
Create a class named Apartment that holds an apartment number, number of bedrooms,
number of baths, and rent amount. Create a constructor that accepts values for each data field. 
Also create a get method for each field. Write an application that creates at least five Apartment 
objects. Then display data for all the Apartment objects. Save the files as Apartment.java and TestApartments.java.
package testapartments;
*/
package testapartments;


public class Apartments {
 
    int apartment_num;
    int bedrooms;
    int baths;
    double rent;
    
    public Apartments(int ApNum, int BedNum, int BathNum, double Rent){
        apartment_num = ApNum;
        bedrooms = BedNum;
        baths = BathNum;
        rent = Rent;
    }
    
    public int getApartmentNum(){
        return apartment_num;
    }
    
    public int getBedNum(){
        return bedrooms;
    }
    
    public int getBaths(){
        return baths;
    }
    
    public double getRent(){
        return rent;
    }
    
}
