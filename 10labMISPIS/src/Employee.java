abstract class Employee {
    protected int ssNo;
    protected String name;
    protected String email;
    protected static int counter = 0;

    /**
     *
     * @param ssNo
     * @param name
     * @param email
     */
    public Employee(int ssNo, String name, String email) {
        this.ssNo = ssNo;
        this.name = name;
        this.email = email;
        counter++;
    }

    public int getSsNo() {
        return ssNo;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public static int getCounter() {
        return counter;
    }

    public abstract void displayInfo();
}