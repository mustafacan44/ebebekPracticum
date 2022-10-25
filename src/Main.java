import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen çalışanın adını giriniz");
        String name = scanner.next();

        System.out.println("Lütfen maaş bilgisini giriniz");
        double salary = scanner.nextDouble();

        System.out.println("Lütfen haftalık çalışma saatini giriniz");
        int workHours = scanner.nextInt();

        System.out.println("Lütfen işe başlangıç yılını giriniz");
        int hireYear = scanner.nextInt();

        Employee employee = new Employee(name,salary,workHours,hireYear);

        System.out.println(employee);

    }
}
