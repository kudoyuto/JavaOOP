import model.Student;

public class Main {
    public static void main(String args[]){
        Student student = new Student("Yuto Kudo", 24, 'M', "D2017000991");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getId_No());
    }
}
