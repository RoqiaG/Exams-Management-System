package patternproject;
public interface Teacher {
    void addExam();
    void editExam();
    void deleteExam(int id);
    void assignAssignment(int classroomId, Assignment assignment);
    void viewAllExams();
    void report(int studentID);
    void checkGrades(int studentID); 
    void sendNotification(int studentID, String notificationType, String message);
}
