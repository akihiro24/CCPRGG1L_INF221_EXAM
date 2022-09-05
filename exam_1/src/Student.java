public class Student {
    //Attributes
    String surname;
    String firstName;
    char middleInitial;
    String dateOfBirth;
    String studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    //Method
    public void sayMyName(){
        System.out.println("Hello I am " + firstName + " " + surname);
    }
    public void sayMyDOB(){
        System.out.println("I was born on " + dateOfBirth);
    }
    public void sayMyStudentNumber(){
        System.out.println("My Student Number is " + studentNumber);
    }
    public void sayMyEmailAddress(){
        System.out.println("My Student Email Address is " + studentEmailAddress);
    }
    public void amIAwesome(){
        System.out.println("Am I awesome? " + iAmAwesome);
    }

    //Constructor
    public Student (String sname, String fName, char MI, String birthdate, String sNumber, String sEmail, boolean Awesome){
        surname = sname;
        firstName = fName;
        middleInitial = MI;
        dateOfBirth = birthdate;
        studentNumber = sNumber;
        studentEmailAddress = sEmail;
        iAmAwesome = Awesome;
    } 
        
 }
 



