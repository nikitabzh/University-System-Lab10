import java.util.*;

class University {

    private String name;
    private List<Faculty> faculties;

    /**
     *
     * @param name
     */
    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    /**
     *
     * @param faculty
     */
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("=== Университет: " + name + " ===");
        System.out.println("Всего факультетов: " + faculties.size());
        for (Faculty faculty : faculties) {
            faculty.displayInfo();
        }
    }
}