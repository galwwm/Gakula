package kz.kaznu.galim.HW4;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Лев", "Саванна", 8));
        animals.add(new Animal("Слон", "Тропики", 15));
        animals.add(new Animal("Тигр", "Джунгли", 12));
        animals.add(new Animal("Кенгуру", "Австралия", 6));
        animals.add(new Animal("Медведь", "Тайга", 10));
        animals.add(new Animal("Обезьяна", "Тропики", 5));
        animals.add(new Animal("Жираф", "Саванна", 7));
        animals.add(new Animal("Зебра", "Саванна", 9));
        animals.add(new Animal("Волк", "Лес", 11));
        animals.add(new Animal("Лиса", "Лес", 4));

        System.out.println("Животные старше 7 лет:");
        for (Animal animal : animals) {
            if (animal.getAge() > 7) {
                animal.displayInfo();
            }
        }

        System.out.println("Тестирование вольера:");
        Enclosure enclosure = new Enclosure(10, 15, "Зелёный");
        enclosure.open();
        enclosure.addAnimal("Тигр");
        enclosure.close();
        enclosure.open();
        enclosure.removeAnimal();
        enclosure.close();
    }
}