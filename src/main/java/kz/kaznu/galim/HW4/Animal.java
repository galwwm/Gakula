package kz.kaznu.galim.HW4;

public class Animal { private String species;
    private String habitat;
    private int age;

    public Animal(String species, String habitat, int age) {
        this.species = species;
        this.habitat = habitat;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Вид: " + species);
        System.out.println("Среда обитания: " + habitat);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("------------------------");
    }
}
