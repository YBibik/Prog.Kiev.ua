package AnimalPuppy;

/**
 * Created by y.bibik on 10.07.2016.
 */
public class Puppy extends Dog{

    private String name; // Имя
    private int    age; //Возраст
    private String color; // Цвет

    public Puppy(String kind, int pawscnt, String breed, String name, int age, String color) {
        super(kind, pawscnt, breed);
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
