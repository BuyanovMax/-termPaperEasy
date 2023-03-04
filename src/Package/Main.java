package Package;

public class Main {
    static Employee[] emloyees = new Employee[10];

    public static void main(String[] args) {

        emloyees[0] = new Employee("Иван Иванович Иванов", generateRandomInt(1,5), generateRandomInt(15000,150000));
        emloyees[1] = new Employee("Иван Александрович Петров", generateRandomInt(1,5), generateRandomInt(15000,150000));
        emloyees[2] = new Employee("Пётр Михайлович Вакуленко", generateRandomInt(1,5), generateRandomInt(15000,150000));
        emloyees[3] = new Employee("Алена Петровна Свободная", generateRandomInt(1,5), generateRandomInt(15000,150000));
        emloyees[4] = new Employee("Лариса Игоревна Сидорова", generateRandomInt(1,5), generateRandomInt(15000,150000));
        emloyees[5] = new Employee("Роман Александрович Губенков", generateRandomInt(1,5), generateRandomInt(15000,150000));
        emloyees[6] = new Employee("Максим Васильевич Лентяй", generateRandomInt(1,5), generateRandomInt(15000,150000));
        emloyees[7] = new Employee("Алексей Денисович Прошуров", generateRandomInt(1,5), generateRandomInt(15000,150000));
        emloyees[8] = new Employee("Денис Михайлович Юзенков", generateRandomInt(1,5), generateRandomInt(15000,150000));
        emloyees[9] = new Employee("Василий Александрович Садоводов", generateRandomInt(1,5), generateRandomInt(15000,150000));


        System.out.println("Получить список всех сотрудников со всеми имеющимися по ним данными ");
        printAllList();
        System.out.println();
        System.out.println("Посчитать сумму затрат в месяц");
        System.out.println(sumSalary(emloyees));
        System.out.println();
        System.out.println("Найти сотрудника с минимальной заплатой");
        findMinimalSalary();
        System.out.println();
        System.out.println("Найти сотрудника с максимальной зарплатой");
        findMaximumSalary();
        System.out.println();
        System.out.println("Подсчитать среднее значение зарплат");
        System.out.println(countAverageSalary());
        System.out.println();
        System.out.println("Получить Ф. И. О. всех сотрудников");
        getFioEmployees();

    }
    java.util.Random random = new java.util.Random();

    public static int sumSalary(Employee[] qwe) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + qwe[i].getSalary();
        }
        return sum;
    }

    public static int generateRandomInt(int from, int to) {
        java.util.Random random = new java.util.Random();
        return random.nextInt(from, to);

    }


    public static void printAllList() {
        for (int i = 0; i < emloyees.length; i++) {
            System.out.println(emloyees[i]);

        }
    }

    public static void findMinimalSalary() {
        int min = 151000;
        int number = 0;
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i].getSalary() < min) {
                min = emloyees[i].getSalary();
                number = i;
            }
        }
        System.out.println(emloyees[number]);
    }

    public static void findMaximumSalary() {
        int max = -1;
        int number = 0;
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i].getSalary() > max) {
                max = emloyees[i].getSalary();
                number = i;
            }
        }
        System.out.println(emloyees[number]);
    }

    public static double countAverageSalary() {
        double average = 0;
        return sumSalary(emloyees) / emloyees.length;
    }

    public static void getFioEmployees() {
        for (int i = 0; i < emloyees.length; i++) {
            System.out.println(emloyees[i].getFullName());
        }
    }


}