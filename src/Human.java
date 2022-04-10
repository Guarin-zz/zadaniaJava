public class Human {
    String firstName;
    String lastName;
    Integer Age;
    Boolean isAlive;
    Phone mobile;
    Animal pet;
    private Car car;
    private Double salary;


    public Car getCar(){
        return this.car;
    }
    public void setCar(Car car){
        if (this.salary > car.value ){
            System.out.println("Autko kupione za gotowiznę");
            this.car=car;
        } else if (this.salary>car.value/12 ){
            System.out.println("Będziesz go spłacał latami, ale jest twój! Tzn będzie, na razie jest banku");
            this.car=car;
        } else {
            System.out.println("Idź do pracy!");
        }
    }
    public Double getSalary() {
        System.out.println("Dane o wypłacie były pobrane: " + java.time.LocalDate.now());
        return this.salary;
    }


    public void setSalary(Double salary) {
        if (salary <= 0) {
            System.out.println("Wartość wypłaty nie może być ujemna");
        } else {
            this.salary = salary;
            System.out.println("Podwyżka przyznazna");

        }


    }

}
