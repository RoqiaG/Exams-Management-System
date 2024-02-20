/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternproject;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Roqia-PC
 */


public class PatternProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*Exam exam = new Exam(1, "Description of the exam");
      exam.setDate(new Date());
      exam.setGrade(10);
      exam.setExamType("final");
      Student  student = new Student(1, "john_doe", "password123", 10);
      Teacher normalteacher=new NormalTeacher();      
      Teacher supervisingTeacher = new SupervisingTeacher(normalteacher);
      NormalTeacher no=new NormalTeacher();
      no.setNotificationType("SMS");
      //test supervised teacher functionality
      supervisingTeacher.performOperations(student, exam);
      
      supervisingTeacher.assignAssignment(12);*/
              /*Student s =new Student();
        s.Login();*/
        Exam exam = new Exam(1, "Description of the exam");
        exam.setDate(new Date());
        exam.setGrade(10);
        exam.setExamType("final");
        Student  student = new Student();
        Teacher normalteacher=new NormalTeacher();
        Teacher supervisingTeacher = new SupervisingTeacher(normalteacher);
        NormalTeacher no=new NormalTeacher();
        no.setNotificationType("SMS");
        
       // SupervisingTeacher supervisor =new SupervisingTeacher(normalteacher);
       // supervisor.getStudents();
        Assignment assignment=new Assignment();
        assignment.setDescription("solve in 3 days");assignment.setAssignmentId(10);
        assignment.setDeadline(new Date());assignment.setSubject("physics");
        supervisingTeacher.assignAssignment(12 ,assignment);
        
         Map<Integer, Exam> exams = new HashMap<>();
        Exam exam1 = new Exam(23, "math");
        exam1.setExamType("weekly"); exam1.setDate(new Date()); exam1.setGrade(10);
        exam1.setStudentID(20201700);
        
        Exam exam2 = new Exam(24, "science");
        exam2.setExamType("weekly"); exam2.setDate(new Date()); exam2.setGrade(20);
        exam2.setStudentID(20201700);
        exams.put(exam2.getExamID(),exam2);
        
        //test supervised teacher functionality
        normalteacher.assignAssignment(12, assignment);
        supervisingTeacher.report(20201700);
        supervisingTeacher.checkGrades(20201700);
        supervisingTeacher.sendNotification(20201700, "email", "Your grades have been published!");
        
         //p.PrepareTimetable(); done
            // p.getExamInformation();  done

           //  p.addTeacher();//  done
       /* NormalTeacher t = new NormalTeacher();
        t.setFullName("maher");
        t.setTeacherId(233);
        p.getTeachers().put(t.getTeacherId(),t);
            //p.editTeacherDetails(); done
            p.viewAllTeachersDetails();  //done
            p.DeleteTeacher(233);*/

            //done
        /*Student s =new Student(23,"maher","234sdfsdf",3);
       s.writeNoteToPrincipal();
       p.viewAllNotes();*/
 
    }
    
}
