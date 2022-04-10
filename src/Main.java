
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.isAlive = true;
        dog.name = "Szarik";
        System.out.println(dog.name);

        Phone iphone = new Phone();
        iphone.model = "Iphone 7+";
        iphone.os = "IOS";
        iphone.producer = "Apple";
        iphone.screenSize = 5.2;

        Phone xiaomi = new Phone();
        xiaomi.model = "Redmi 8";
        xiaomi.os = "Android";
        xiaomi.producer = "Xiaomi";
        xiaomi.screenSize = 7.3;

        System.out.println(xiaomi.model + " " + iphone.producer);


        System.out.println(dog.getWeight());





        Human kuba = new Human();
        kuba.firstName = "Kuba";
        kuba.lastName = "Michalowski";
        kuba.pet = dog;
        kuba.mobile = new Phone();


        kuba.mobile.model = "6s";
        kuba.mobile.os = "ios";
        kuba.mobile.screenSize = 4.2;

        Car opel = new Car("opel", "astra");



        kuba.setSalary(1000.0);

        kuba.setSalary(-200.0);
        kuba.setSalary(1200.0);
        System.out.println(kuba.getSalary());

        kuba.setCar(new Car("toledo", "seat"));
        System.out.println(kuba.getCar());
    }
}
