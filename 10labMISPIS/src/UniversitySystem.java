import java.util.Date;

public class UniversitySystem {
    public static void main(String[] args) {
        System.out.println("=== Информационная система университета ===\n");


        University university = new University("ВГУ");


        Faculty faculty = new Faculty("ФКН");


        Dean dean = new Dean(1001, "Крыловецкий А.А", "a.kryl@university.edu");
        dean.setFaculty(faculty);
        faculty.setDean(dean);


        Department dep1 = new Department("ТОиЗИ", "Воронеж, Университетская площадь , 1");
        Department dep2 = new Department("ПИИТ", "Воронеж, Университетская площадь , 1");
        faculty.addDepartment(dep1);
        faculty.addDepartment(dep2);


        ResearchAssociate researcher1 = new ResearchAssociate(2001, "Д-р Анна Смирнова",
                "a.smirnova@university.edu", "Компьютерные сети");
        researcher1.addDepartment(dep1);

        Lecturer lecturer1 = new Lecturer(2002, "Д-р Сергей Волков",
                "s.volkov@university.edu", "Проектирование информационных систем");
        lecturer1.addDepartment(dep2);

        Course course1 = new Course("Проектирование на UML", 101, 4.0f);
        Course course2 = new Course("Программная инженерия", 102, 6.0f);
        lecturer1.addCourse(course1);
        lecturer1.addCourse(course2);

        Project project1 = new Project("Исследование в области ИИ",
                new Date(2024, 1, 1), new Date(2025, 12, 31));
        researcher1.addProjectParticipation(project1, 20);
        lecturer1.addProjectParticipation(project1, 15);

        AdministrativeEmployee admin = new AdministrativeEmployee(3001,
                "Мария Иванова", "m.ivanova@university.edu");


        university.addFaculty(faculty);

     
        System.out.println("\n=== СТРУКТУРА УНИВЕРСИТЕТА ===");
        university.displayInfo();

        System.out.println("\n\n=== СОТРУДНИКИ ===");
        dean.displayInfo();
        System.out.println();
        lecturer1.displayInfo();
        System.out.println();
        researcher1.displayInfo();
        System.out.println();
        admin.displayInfo();

        System.out.println("\n\n=== КУРСЫ ===");
        course1.displayInfo();
        System.out.println();
        course2.displayInfo();

        System.out.println("\n\n=== ПРОЕКТЫ ===");
        project1.displayInfo();

        System.out.println("\n\n=== СТАТИСТИКА ===");
        System.out.println("Всего сотрудников: " + Employee.getCounter());
    }
}