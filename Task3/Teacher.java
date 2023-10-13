package Task3;


import java.util.ArrayList;

// 3.2 super person
public class Teacher extends Person {

    // 3.3 Create two array list
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;
    public Teacher(String name, ArrayList<String> canTeach, ArrayList<String> currentCourses) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = currentCourses;
    }

    // 3.5 overide the addCourse here as well

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            currentCourses.add(course);
            return true;
        }
        return false;
    }
}
