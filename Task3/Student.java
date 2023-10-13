package Task3;

import java.util.ArrayList;

// 3.2 make two Classes  Student and Teacher which are inherit from Person , use Super
public class Student extends Person {

    // 3.3 Create two Array Lists
    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;
    public Student(String name, ArrayList<String> passedCourses, ArrayList<String> currentCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = currentCourses;
    }
    //3.4 Override the add course method if the student passed or not
    public boolean addCourse(String course) {
        if(!passedCourses.contains(course)) {
            currentCourses.add(course);
            return true;
        }
        return false;
    }
}
