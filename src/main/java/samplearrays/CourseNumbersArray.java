package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int newCourse = 1030;
        int[] updatedCourses = new int[registeredCourses.length + 1];
        for (int i = 0; i < registeredCourses.length; i++) {
            updatedCourses[i] = registeredCourses[i];
        }
        boolean found = false;
        updatedCourses[updatedCourses.length - 1] = newCourse;
        for (int course : updatedCourses) {
            System.out.println(course);
            if (course == 1020) found = true;

        }
        if (found) {
            System.out.println("The updatedCourses contain course n°1020");
        } else {
            System.out.println("Course not found");
        }
    }
}
