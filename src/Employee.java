public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary > 1000) {
            return salary * 3 / 100;
        } else {
            return 0;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int year = 2021;
        int workingYear = year - hireYear;
        if (workingYear < 10) {
            return salary * 5 / 100;
        } else if (workingYear < 20) {
            return salary * 10 / 100;
        } else {
            return salary * 15 / 100;
        }
    }
    public String toString(){
        return
                "Adı: " +name + '\n'+
                "Maaşı: "+salary+ '\n'+
                "Çalışma saati: "+workHours+'\n'+
                "Vergi: "+tax()+'\n'+
                "Maaşı artışı: "+bonus()+'\n'+
                "Vergi ve Bonuslar ile birlikte maaş: "+ (salary+bonus() - tax())+'\n'+
                "Toplam Maaş: "+ (salary+bonus() - tax()+raiseSalary());

    }


}
