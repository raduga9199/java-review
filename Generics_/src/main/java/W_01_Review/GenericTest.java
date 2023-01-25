package W_01_Review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike",101));
        studentList.add(new Student("Joe",102));
        studentList.add(new Student("Adam",103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus",201));
        teacherList.add(new Teacher("Severus",202));
        teacherList.add(new Teacher("Muhtar",203));

        printStudent(studentList);
        printTeacher(teacherList);

        System.out.println("==============================");

        printInfo(studentList);
        printInfo(teacherList);

        System.out.println("==============================");

        System.out.println(getLastItem(studentList));
        System.out.println(getLastItem(teacherList));

        System.out.println("==============================");

        MyUtils<Student> studentObject = new MyUtils<>();
        System.out.println(studentObject.getLastItem(studentList));

        MyUtils<Teacher> teacherObject = new MyUtils<>();
        System.out.println(teacherObject.getLastItem(teacherList));


    }

    public static void printStudent(List<Student> studentList){
        for (Student each : studentList){
            System.out.println(each.toString());
        }
        System.out.println("Number of students: " + studentList.size());
    }

    public static void printTeacher(List<Teacher> teacherList){
        for (Teacher each : teacherList){
            System.out.println(each.toString());
        }
        System.out.println("Number of Teachers: " + teacherList.size());
    }

    public static <T> void printInfo(List<T> list){
        for (T each : list){
            System.out.println(each);
        }
        System.out.println("list.size() = " + list.size());
    }

    public static <T> T getLastItem(List<T> list){
        return list.get(list.size() - 1);
    }

}
