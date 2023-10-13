package Task3;

import java.util.ArrayList;

public class Main {
    //Create main class and test the students, teacher and numbers give them arraylists
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        //Create students and teachers with courses
        ArrayList<String> studentPassedCourses = new ArrayList<>();
        ArrayList<String> studentCurrentCourses = new ArrayList<>();
        Student student1 = new Student("Fatima", studentPassedCourses, studentCurrentCourses);
        studentPassedCourses.add("Math");
        studentPassedCourses.add("History");
        Student student2 = new Student("Osama", studentPassedCourses, studentCurrentCourses);

        ArrayList<String> teacherCanTeach = new ArrayList<>();
        ArrayList<String> teacherCurrentCourses = new ArrayList<>();
        teacherCanTeach.add("Java 1.0");
        teacherCanTeach.add("Math");

        Teacher teacher1 = new Teacher("Alex", teacherCanTeach, teacherCurrentCourses);

        people.add(student1);
        people.add(student2);
        people.add(teacher1);

        // 3.7 loop
        for (Person person : people) {
            boolean result = person.addCourse("Java 1.0");

            if (!result) {
                System.out.println(person.getName() + " ");
                if (person instanceof Student) {
                    System.out.println("has already passed this course");
                } else if (person instanceof Teacher) {
                    System.out.println("Cannot Teach this subject");
                }
            }
        }
    }
}