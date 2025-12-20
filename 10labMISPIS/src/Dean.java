class Dean extends Employee {

    private Faculty faculty;

    /**
     *
     * @param ssNo
     * @param name
     * @param email
     */
    public Dean(int ssNo, String name, String email) {
        super(ssNo, name, email);
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    @Override
    public void displayInfo() {
        System.out.println("Декан: " + name + " (SSN: " + ssNo + ", Email: " + email + ")");
        if (faculty != null) {
            System.out.println("  Руководит факультетом: " + faculty.getName());
        }
    }
}