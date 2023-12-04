public class Employee {
    String name;
    String surname;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus=0;
    double raiseSalary=0;
    double taxandbonus ;
    double salaryandraised;

    double totalsalary=0;

public Employee(String name,String surname,int salary,int workHours,int hireYear){

    this.name=name;
    this.hireYear=hireYear;
    this.salary=salary;
    this.workHours=workHours;
    this.surname=surname;

}
public int tax(){

    if (this.salary>=1000){

        tax= (this.salary*0.03);
        System.out.println("Vergi :"+this.tax);

    } return 0;}
    public int bonus() {

        if (this.workHours > 40) {
            for (int i = 40; i <= this.workHours; i++) {
                this.bonus=this.bonus+30;
            }
            System.out.println("Bonus :"+this.bonus);

        }return 1;

        }
        public int taxandbonus(){

        this.taxandbonus=(this.salary+this.bonus)-this.tax;
            System.out.println("Bonus ve vergilerle toplam maaş :"+this.taxandbonus);

    return 0;
        }
public int salaryandraised(){
    this.salaryandraised=this.salary+this.raiseSalary;
    System.out.println("Toplam maaş :"+salaryandraised);

    return 0;
}
    public int raiseSalary() {
        if ((2021 - this.hireYear) < 10) {
            this.raiseSalary = this.salary + (this.salary * 0.05);
            System.out.println("Maaş" + this.raiseSalary);
        }

        if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20)
        {
            this.raiseSalary = this.salary + (this.salary * 0.10);
            System.out.println("Maaş" + this.raiseSalary);

        }

        if (2021 - this.hireYear > 19)
        {
            this.raiseSalary = (this.salary * 0.15);
            System.out.println("Maaş Artışı:" + this.raiseSalary);
        }return 0;}
    public int tooString(){
        System.out.println("Adı :"+this.name+" "+this.surname);
        System.out.println("Maaşı :"+this.salary);
        System.out.println("Haftalık Çalışma Saati :"+this.workHours);
        System.out.println("İşe Başlama Yılı :"+this.hireYear);
        tax();
        bonus();
        raiseSalary();
        taxandbonus();
        salaryandraised();
return 0;
    }
    }

