package film;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by y.bibik on 20.07.2016.
 */
public class Film {

    private String filmname;
    private int prodyear;
    private List<String> actors = new ArrayList<>();
    private String genre;

    // Add enum constants
     enum Genre {
        HORROR("Horror"),
        THRILLER("Thriller"),
        COMEDY("Comedy");

        private final String value;
        //Constructor
        Genre(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Film() {
    }

    public String getFilmname() {
        return filmname;
    }

    public Film setFilmname(String filmname) {
        this.filmname = filmname;
        return this;
    }

    public int getProdyear() {
        return prodyear;
    }

    public Film setProdyear(int prodyear) {
        this.prodyear = prodyear;
        return this;
    }

    public Film addActors(String actor) {
        this.actors.add(actor);
        return this;
    }

    public String getGenre() {
        return String.valueOf(genre);
    }

    public Film setGenre(Genre genre) {
        this.genre = genre.value;
        return this;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmname='" + filmname + '\'' +
                ", prodyear=" + prodyear +
                ", actors=" + actors +
                ", genre=" + genre +
                '}';
    }
}
