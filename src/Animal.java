public class Animal {
    final String species;
    private Double weight = 5.0;
    Integer age;
    String name;
    Boolean isAlive;

    public Animal(String species) {
        this.isAlive = true;
        this.age = 1;
        this.species = species;

        switch (this.species) {
            case "felis":
                this.weight = 2.0;
                break;
            case "canis":
                this.weight = 10.0;
                break;
            default:
                this.weight = 5.0;
                break;
        }
    }

    public Double getWeight() {
        return this.weight;
    }

    void feed() {

        if (weight <= 0) {
            isAlive = false;
            System.out.println("To już nic nie da");
        } else {
            weight += 1.0;
            System.out.println("Thx for food");
        }
    }

    void takeForWalk() {

        if (weight <= 0) {
            isAlive = false;
            System.out.println("Zwierz Ci umarł");
        } else {
            weight -= 1.0;
            System.out.println("nice walk, thx");
        }
    }

}
