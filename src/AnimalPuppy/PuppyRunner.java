package AnimalPuppy;

/**
 * Created by y.bibik on 10.07.2016.
 */
public class PuppyRunner {

    public static void main(String[] args) {
        Puppy puppy = new Puppy("Dog", 4, "Dvor-Terrier", "Tuzik", 1, "Grey");

        DogAction.printIntro(puppy);
        DogAction.printVoice(puppy);
        DogAction.printJump(puppy);
        DogAction.printRun(puppy);
        DogAction.printBite(puppy);
    }
}
