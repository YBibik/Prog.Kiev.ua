package film;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by y.bibik on 20.07.2016.
 */
public class FilmRunner {

    public static void main(String[] args) {


        List<Film> films = new ArrayList<>();
        List<Film> filmsbygenre;
        List<Film> filmsbygenreandyear;

        // Добавляем в список триллеры

        for (int i = 0; i < 10; i++) {
                    films.add(new Film()
                    .setFilmname("Film" + i)
                    .addActors("Actor" + i)
                    .setProdyear(2000 + i)
                    .setGenre(Film.Genre.THRILLER));
        }
        // Добавляем в список Ужасы

        for (int i = 0; i < 5; i++) {
            films.add(new Film()
                    .setFilmname("Film1" + i)
                    .addActors("Actor1" + i)
                    .setProdyear(1988 + i)
                    .setGenre(Film.Genre.HORROR));
        }
        // Добавляем в список комедии

        for (int i = 0; i < 5; i++) {
            films.add(new Film()
                    .setFilmname("Film2" + i)
                    .addActors("Actor2" + i)
                    .setProdyear(1987 + i)
                    .setGenre(Film.Genre.COMEDY));
        }

        // Найти все фильмы, у которых жанры HORROR, THRILLER.
        filmsbygenre = FilmUtil.getFilmsByGenre(films, Film.Genre.HORROR);
        filmsbygenre.addAll(FilmUtil.getFilmsByGenre(films, Film.Genre.THRILLER));

        // Найти все фильмы комедии, которые выпущеные в 1990-2000 rr.
        filmsbygenreandyear = FilmUtil.getFilmsByGenre(films, Film.Genre.COMEDY);
        filmsbygenreandyear = FilmUtil.getFilmsByYear(filmsbygenreandyear, 1990, 2000);

        // Output all Films
        System.out.println("All Films:");
        for (Film film1 : films) {
            System.out.println(film1);
        }
        System.out.println("===============");
        // Output by Genre
        System.out.println("Films whose genre HORROR and THRILLER:");
        for (Film film2 : filmsbygenre) {
            System.out.println(film2);
        }
        System.out.println("===============");
        // Output by Genre and Production year
        System.out.println("Films whose genre COMEDY and Production year between 1990 and 2000:");
        for (Film film3 : filmsbygenreandyear) {
            System.out.println(film3);
        }

    }
}
