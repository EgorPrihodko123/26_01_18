package Student;

/**
 * Created by java on 26.01.2018.
 */
public class StudMain {
    public static void main(String[] args) {
        Student st1=new Student();
        st1.setName("Kolya");
       // st1.setAge(2);
        Student st2=new Student();
        st2.setName("Kolya");
        System.out.println(st1.equals(st2));
    }
}
