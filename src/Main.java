import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("C", 30, "Hai Phong");
        Student student1 = new Student("D", 26, "Ha Giang");
        Student student2 = new Student("B", 22, "Hai Duong" );
        Student student3 = new Student("A", 40, "Ca Mau" );
        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        System.out.println("Sap xep theo ten:");
        for(Student st : lists){
            System.out.println(st);
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("Sap xep theo tuoi:");
        for(Student st : lists){
            System.out.println(st);
        }
    }
}
