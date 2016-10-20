/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoo;

/**
 *
 * @author Yogesh
 */
public class DaoPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        //print all students
        for(Student student : studentDao.getAllStudents()){
            System.out.println("Student: [RollNo:" + student.getRollNo() + ", Name: " + student.getName() + "]");
            //update student
            Student student1 = studentDao.getAllStudents().get(0);
            student1.setName("Michael");
            studentDao.updateStudent(student);
            //get the student
            studentDao.getStudent(0);
            System.out.println("Student: [RollNo: " + student.getRollNo() + ", Name:" + student.getName() + "]");
            
        }
    }
    
}
