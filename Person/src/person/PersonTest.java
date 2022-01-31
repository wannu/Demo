
package person;

/**
 *
 * @author wannu
 */

class Person {
    
  protected String name;
  protected String address;
  protected int phone;
  protected String emailAdress;
  
  Person(String name,String address, String emailAddress)
  {
      this.name=name;
      this.phone=phone;
      this.address=address;
      this.emailAdress=emailAddress;
  }
  
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

  
    public int getPhone() {
        return phone;
    }

   
    public void setPhone(int phone) {
        this.phone = phone;
    }

    
    public String getEmailAdress() {
        return emailAdress;
    }

   
    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
    
    
}

class Student extends Person{
    private static int FRESHMAN=1;
    private static int SOPHMORE=2;
    private static int JUNIOR=3;
    private static int SENIOR=4;

    /**
     * @return the FRESHMAN
     */
    public static int getFRESHMAN() {
        return FRESHMAN;
    }

    /**
     * @param aFRESHMAN the FRESHMAN to set
     */
    public static void setFRESHMAN(int aFRESHMAN) {
        FRESHMAN = aFRESHMAN;
    }

    /**
     * @return the SOPHMORE
     */
    public static int getSOPHMORE() {
        return SOPHMORE;
    }

    /**
     * @param aSOPHMORE the SOPHMORE to set
     */
    public static void setSOPHMORE(int aSOPHMORE) {
        SOPHMORE = aSOPHMORE;
    }

    /**
     * @return the JUNIOR
     */
    public static int getJUNIOR() {
        return JUNIOR;
    }

    /**
     * @param aJUNIOR the JUNIOR to set
     */
    public static void setJUNIOR(int aJUNIOR) {
        JUNIOR = aJUNIOR;
    }

    /**
     * @return the SENIOR
     */
    public static int getSENIOR() {
        return SENIOR;
    }

    /**
     * @param aSENIOR the SENIOR to set
     */
    public static void setSENIOR(int aSENIOR) {
        SENIOR = aSENIOR;
    }

    
   
}

class Employee extends Person{
    
}
class Faculty extends Employee{
    
}
class Staff extends Employee{
    
}

public class PersonTest {
      public static void main(String[] args) {
        
    }
}
