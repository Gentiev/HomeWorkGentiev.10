public class Main {
    public static void main(String[] args) {
//Задача.1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
//Задача.2
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullNameUpperCase);
//Задача.3
        String fullName2 = "Иванов Семён Семёнович";
        String fullName2Replace = fullName2.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName2Replace);
    }
}