public static void main(String[] args) {
    Employee tester = new Employee(7, "Developer");
    System.out.println(tester.getId());
    System.out.println(tester.getVacancy());
}

class Employee {
    private long id;
    private Vacancy vacancy;

    // В классе отсутствовал конструктор
    public Employee(long id, Vacancy vacancy) {
        this.id = id;
        this.vacancy = vacancy
    }

    String getVacancy() {
        return vacancy.getVacancy();
    }

    long getId() {
        return id;
    }
}

// И в классе вакансии также отстутствовал конструктор, как и какая-либо логика
class Vacancy {
    private String name;

    public Vacancy(String name) {
        this.name = name;
    }

    String getVacancy() {
        return name;
    }
}