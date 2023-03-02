package Package;

public class Main {
    static Employee[] qwe = new Employee[10];

    public static void main(String[] args) {

        int sum = 0;


            qwe[0] = new Employee("Иван Иванович Иванов",generateRandomArray(), generateRandomArraySalary());
            qwe[1] = new Employee("Иван Александрович Петров", generateRandomArray(), generateRandomArraySalary());
            qwe[2] = new Employee("Пётр Михайлович Вакуленко", generateRandomArray(),generateRandomArraySalary());
            qwe[3] = new Employee("Алена Петровна Свободная", generateRandomArray(),generateRandomArraySalary());
            qwe[4] = new Employee("Лариса Игоревна Сидорова", generateRandomArray(),generateRandomArraySalary());
            qwe[5] = new Employee("Роман Александрович Губенков", generateRandomArray(),generateRandomArraySalary());
            qwe[6] = new Employee("Максим Васильевич Лентяй", generateRandomArray(),generateRandomArraySalary());
            qwe[7] = new Employee("Алексей Денисович Прошуров", generateRandomArray(),generateRandomArraySalary());
            qwe[8] = new Employee("Денис Михайлович Юзенков", generateRandomArray(),generateRandomArraySalary());
            qwe[9] = new Employee("Василий Александрович Садоводов", generateRandomArray(),generateRandomArraySalary());


        System.out.println("Получить список всех сотрудников со всеми имеющимися по ним данными ");
        printAllList();
        System.out.println();
        System.out.println("Посчитать сумму затрат в месяц");
        System.out.println(sumSalary(qwe));
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


    public static int sumSalary(Employee[]qwe) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + qwe[i].getSalary();
        }
        return sum;
    }

    public static int generateRandomArray() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(1, 5);
    }
    public static int generateRandomArraySalary() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(15000, 150000);
    }
    public static void printAllList() {
        for (int i = 0; i < qwe.length; i++) {
            System.out.println(qwe[i]);

        }
    }
    public static void findMinimalSalary() {
        int min = 151000;
        int number=0;
        for (int i = 0; i < qwe.length; i++) {
            if (qwe[i].getSalary() < min) {
                min = qwe[i].getSalary();
                number = i;
            }
        }
        System.out.println(qwe[number]);
    }
    public static void findMaximumSalary() {
        int max = -1;
        int number=0;
        for (int i = 0; i < qwe.length; i++) {
            if (qwe[i].getSalary() > max) {
                max = qwe[i].getSalary();
                number = i;
            }
        }
        System.out.println(qwe[number]);
    }
    public static double countAverageSalary() {
        double average = 0;
        return sumSalary(qwe) / qwe.length ;
    }
    public static void getFioEmployees() {
        for (int i = 0; i < qwe.length; i++) {
            System.out.println(qwe[i].getFullName());
        }
    }


}