public class App {
    public static void main(String[] args) {

    //Student Class
    //(surname,firstname,middleini,dob,student number,student email,awesome)

    Student Railey = new Student("Dela Viña", "Railey Kiether", 'D', "10/24/2003" , "2022-103087", "delavinard@students.national-u.edu.ph", true);
    Railey.sayMyName();
    Railey.sayMyDOB();
    Railey.sayMyStudentNumber();
    Railey.sayMyEmailAddress();
    Railey.amIAwesome();
    }
}
