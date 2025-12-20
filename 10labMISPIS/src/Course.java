/**
 * Класс Курс
 */
class Course {

    private String name;
    private int id;
    private float hours;
    private Lecturer lecturer;

    /**
     *
     * @param name
     * @param id
     * @param hours
     */
    public Course(String name, int id, float hours) {
        this.name = name;
        this.id = id;
        this.hours = hours;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public float getHours() {
        return hours;
    }

    public void displayInfo() {
        System.out.println("Курс: " + name + " (ID: " + id + ")");
        System.out.println("  Часов в неделю: " + hours);
        if (lecturer != null) {
            System.out.println("  Преподаватель: " + lecturer.getName());
        }
    }
}