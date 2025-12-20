class AdministrativeEmployee extends Employee {

    /**
     *
     * @param ssNo
     * @param name
     * @param email
     */
    public AdministrativeEmployee(int ssNo, String name, String email) {
        super(ssNo, name, email);
    }

    @Override
    public void displayInfo() {
        System.out.println("Административный сотрудник: " + name + " (SSN: " + ssNo + ", Email: " + email + ")");
    }
}