import java.util.*;

/**
 * Класс Проект
 */
class Project {
    private String name;
    private Date start;
    private Date end;
    private Map<ResearchAssociate, Participation> participants;

    /**
     *
     * @param name
     * @param start
     * @param end
     */
    public Project(String name, Date start, Date end) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.participants = new HashMap<>();
    }

    /**
     *
     * @param researcher
     * @param participation
     */
    public void addParticipation(ResearchAssociate researcher, Participation participation) {
        participants.put(researcher, participation);
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Проект: " + name);
        System.out.println("  Начало: " + start + ", Окончание: " + end);
        System.out.println("  Участников: " + participants.size());
    }
}