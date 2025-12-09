import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("   ЗАПУСК СИСТЕМЫ: УНИВЕРСИТЕТ (UniversityIS) ");
        System.out.println("=============================================\n");

        System.out.println("[INFO] Создание структуры факультета...");

        Faculty csFaculty = new Faculty();
        csFaculty.setName("Факультет Компьютерных Наук (ФКН)");

        Institute softDept = new Institute();
        softDept.setName("Кафедра Программной Инженерии");
        softDept.setAddress("Корпус 1, этаж 3");

        System.out.println("   -> Создан: " + csFaculty.getName());
        System.out.println("   -> В составе: " + softDept.getName() + " (" + softDept.getAddress() + ")");

        System.out.println("\n[INFO] Назначение руководства...");

        ResearchAssociate dean = new ResearchAssociate();
        dean.setName("Смирнов Алексей Петрович");
        dean.setEmail("smirnov@university.com");
        dean.setSsNo(777);
        dean.setFieldOfStudy("Системный Анализ");

        csFaculty.setDean(dean);

        System.out.println("   -> Декан назначен: " + csFaculty.getDean().getName());

        System.out.println("\n[INFO] Регистрация сотрудников...");

        Lecturer lecturer = new Lecturer();
        lecturer.setName("Сидоров Иван Дмитриевич");
        lecturer.setEmail("sidorov@university.com");
        lecturer.setFieldOfStudy("Java Development");

        System.out.println("   -> Сотрудник: " + lecturer.getName());
        System.out.println("   -> Должность: Лектор");

        System.out.println("\n[INFO] Назначение учебной нагрузки...");

        Course javaCourse = new Course();
        javaCourse.setName("Проектирование ИС");
        javaCourse.setId(101);
        javaCourse.setHours(4.0f);

        System.out.println("   -> Курс: " + javaCourse.getName() + " (ID: " + javaCourse.getId() + ")");
        System.out.println("   -> Преподаватель курса: " + lecturer.getName());

        System.out.println("\n[INFO] Распределение проектов...");

        Project aiProject = new Project();
        aiProject.setName("Разработка ИИ для расписания");
        aiProject.setStart(new Date());

        Participation part = new Participation();
        part.setHours(40);
        part.setProject(aiProject);
        part.setResearchAssociate(lecturer);

        System.out.println("   -> Проект: " + part.getProject().getName());
        System.out.println("   -> Участник: " + part.getResearchAssociate().getName());
        System.out.println("   -> Нагрузка: " + part.getHours() + " часов");

        System.out.println("\n=============================================");
        System.out.println("   ВЫПОЛНЕНИЕ ЗАВЕРШЕНО УСПЕШНО");
        System.out.println("=============================================");
    }
}