package enumertation.interfaces.person;

public class Main {

    public  static void main(String [] args){

        Student student = new Student();

        Teacher teacher = new Teacher();

        Action actionStudent = new Action(student);
        Action actionTeacher = new Action(teacher);

        actionStudent.daily();

        actionTeacher.daily();


    }
}














