package Employe;

public class Employe {

    String name;
    int salary,workHours,hireYear;
    double tax,salary2,salaryPlus,bonus;


    Employe(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
        tax();
        bonus();
        raiseSalary();
    }

    void tax(){
        if (salary > 1000){
            tax = ((salary*0.03));
            System.out.println("Vergi: "+this.tax);
            this.salary2 = ((salary*0.03)+salary);
        }
    }

    void bonus(){
        if (workHours > 40){
            bonus = ((workHours-40)*30);
            this.salary2 = ((workHours-40)*30)+ salary2;
            System.out.println("Bonus: "+bonus);
        }
    }

    void raiseSalary(){
        if (hireYear < 2021){
            if (2021-hireYear > 19){
                salaryPlus = (salary*0.15);
                this.salary2 += salaryPlus;
                System.out.println("Maaş artışı: "+salaryPlus);
            } else if (2021-hireYear < 20 && 2021-hireYear>9) {
                salaryPlus = (salary*0.10);
                this.salary2 += salaryPlus;
                System.out.println("Maaş artışı: "+salaryPlus);
            }else {
                salaryPlus = (salary*0.05);
                this.salary2 += salaryPlus;
                System.out.println("Maaş artışı: "+salaryPlus);
            }
        }
    }





}
