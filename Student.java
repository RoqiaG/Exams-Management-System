package patternproject;
import java.util.Map;
import java.util.Scanner;

//import static sun.util.locale.LocaleUtils.isEmpty;

public class Student {
    private int StudentID;
    private String UserName;

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setGrade(int Grade) {
        this.Grade = Grade;
    }

    public void setP(principal p) {
        this.p = p;
    }
    private String Password;
    private int Grade;
    principal p = principal.getInstant();
   /* public Student(int StudentID, String UserName, String Password, int yearGrade) {
        this.StudentID = StudentID;
        this.UserName = UserName;
        this.Password = Password;
        this.Grade = yearGrade;
    }*/

    public int getStudentID() {
        return StudentID;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public int getGrade() {
        return Grade;
    }

    public void Login() {

        p.sendStudentCredentials();
        StudentCredentials s = new StudentCredentials();
        Map<String,String> c = s.getCredentials();
//try to log in
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if ((c.containsKey(username)) || (c.containsValue(password))) {
            UserName = username;
            Password=password;
            System.out.println("Successfully Login");
        }else {
            System.out.println("!!!! Invalid Password OR UserName !!!!");
        }
    }

    public void takeExam(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" To get the Exam information enter exam ID : ");
        int id = scanner.nextInt();
        System.out.print("enter  the subject : ");
        String sub = scanner.next();

        ExamService proxy = new ExamProxy(new Exam(id,sub ));
        proxy.ViewExam();
        System.out.println("submit your answer");
        String answer = scanner.next();
        System.out.println("best wishes");
        System.out.println("the teacher will notify you when the grade is published");
    }
    public void viewGrades() {

    }
    public void writeNoteToPrincipal() {
        Scanner scanner = new Scanner(System.in);

        //write note to principal
        System.out.println("***** Please Enter your Note *****");
        String note = scanner.nextLine();

        p.receiveNote(note);
    }

}
