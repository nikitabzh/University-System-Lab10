/**
 * Класс Участие (связь между НаучныйСотрудник и Проект)
 */
class Participation {
    private int hours;

    /**
     *
     * @param hours
     */
    public Participation(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}