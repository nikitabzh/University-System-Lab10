import java.util.*;

class Faculty {

    private String name;
    private Dean dean;
    private List<Department> departments;

    /**
     *
     * @param name
     */
    public Faculty(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    /**
     *
     * @param department
     */
    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public Dean getDean() {
        return dean;
    }

    public void displayInfo() {
        System.out.println("\n  Факультет: " + name);
        if (dean != null) {
            System.out.println("    Декан: " + dean.getName() + " (Email: " + dean.getEmail() + ")");
        }
        System.out.println("    Кафедр: " + departments.size());
        for (Department department : departments) {
            department.displayInfo();
        }
    }
}