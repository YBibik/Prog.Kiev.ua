package AnimalPuppy;

/**
 * Created by y.bibik on 10.07.2016.
 */
public class Dog extends Animal{

    private String breed; // порода

    public Dog(String kind, int pawscnt, String breed) {
        super(kind, pawscnt);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
