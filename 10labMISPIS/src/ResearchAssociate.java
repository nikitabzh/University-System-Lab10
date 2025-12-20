import java.util.*;

class ResearchAssociate extends Employee {
    private String fieldOfStudy;
    private List<Department> departments;
    private List<Participation> participations;

    /**
     *
     * @param ssNo
     * @param name
     * @param email
     * @param fieldOfStudy
     */
    public ResearchAssociate(int ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email);
        this.fieldOfStudy = fieldOfStudy;
        this.departments = new ArrayList<>();
        this.participations = new ArrayList<>();
    }

    /**
     *
     * @param department
     */
    public void addDepartment(Department department) {
        departments.add(department);
        department.addResearcher(this);
    }

    /**
     *
     * @param project
     * @param hours
     */
    public void addProjectParticipation(Project project, int hours) {
        Participation participation = new Participation(hours);
        participations.add(participation);
        project.addParticipation(this, participation);
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    @Override
    public void displayInfo() {
        System.out.println("Научный сотрудник: " + name + " (SSN: " + ssNo + ", Email: " + email + ")");
        System.out.println("  Специализация: " + fieldOfStudy);
        System.out.println("  Прикреплённых кафедр: " + departments.size());
        System.out.println("  Участий в проектах: " + participations.size());
    }
}