import java.util.*;

class Department {

    private String name;
    private String address;
    private List<ResearchAssociate> researchers;

    /**
     *
     * @param name
     * @param address
     */
    public Department(String name, String address) {
        this.name = name;
        this.address = address;
        this.researchers = new ArrayList<>();
    }

    /**
     *
     * @param researcher
     */
    public void addResearcher(ResearchAssociate researcher) {
        researchers.add(researcher);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void displayInfo() {
        System.out.println("      Кафедра: " + name);
        System.out.println("        Адрес: " + address);
        System.out.println("        Научных сотрудников: " + researchers.size());
    }
}