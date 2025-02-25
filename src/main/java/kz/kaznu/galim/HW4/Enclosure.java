package kz.kaznu.galim.HW4;

public class Enclosure {private final double length;
    private final double width;
    private final String color;
    private boolean isOpen;
    private String containedAnimal;

    public Enclosure(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.isOpen = false;
        this.containedAnimal = null;
    }

    public void open() {
        isOpen = true;
        System.out.println("Вольер открыт.");
    }

    public void close() {
        isOpen = false;
        System.out.println("Вольер закрыт.");
    }

    public void addAnimal(String animal) {
        if (isOpen) {
            if (containedAnimal == null) {
                containedAnimal = animal;
                System.out.println("В вольер помещено животное: " + animal);
            } else {
                System.out.println("В вольере уже есть животное: " + containedAnimal);
            }
        } else {
            System.out.println("Сначала откройте вольер.");
        }
    }

    public void removeAnimal() {
        if (isOpen) {
            if (containedAnimal != null) {
                System.out.println("Животное " + containedAnimal + " выпущено из вольера.");
                containedAnimal = null;
            } else {
                System.out.println("Вольер уже пуст.");
            }
        } else {
            System.out.println("Сначала откройте вольер.");
        }
    }
}
