import java.util.*;

class Lecturer extends ResearchAssociate {
    private List<Course> courses;

    /**
     *
     * @param ssNo
     * @param name
     * @param email
     * @param fieldOfStudy
     */
    public Lecturer(int ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email, fieldOfStudy);
        this.courses = new ArrayList<>();
    }

    /**
     *
     * @param course
     */
    public void addCourse(Course course) {
        courses.add(course);
        course.setLecturer(this);
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Преподаватель: " + name + " (SSN: " + ssNo + ", Email: " + email + ")");
        System.out.println("  Специализация: " + getFieldOfStudy());
        System.out.println("  Ведёт курсов: " + courses.size());
        for (Course course : courses) {
            System.out.println("    - " + course.getName() + " (ID: " + course.getId() + ")");
        }
    }
}