package AnimalPuppy;

/**
 * Created by y.bibik on 10.07.2016.
 */
public class DogAction {

    public static void printIntro(Puppy puppy) {

        System.out.println("Привет! Меня зовут " + puppy.getName());
    }

    public static void printVoice(Puppy puppy) {

        System.out.println(puppy.getName() + " говорит гав-гав!");
    }

    public static void printJump(Puppy puppy) {
        System.out.println(puppy.getName() + " прыгает");
    }

    public static void printRun(Puppy puppy) {
        System.out.println(puppy.getName() + " бегает");
    }


    public static void printBite(Puppy puppy) {
        System.out.println(puppy.getName() + " будет кусать");
    }
}
