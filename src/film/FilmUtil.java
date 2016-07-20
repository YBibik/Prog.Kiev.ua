package film;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by y.bibik on 20.07.2016.
 */
public class FilmUtil {
    // Поиск по жанру
    static List<Film> getFilmsByGenre(List<Film> films, Film.Genre genre) {

        List<Film> tmpfilms = films.stream().filter(film -> film.getGenre().equals(genre.getValue())).collect(Collectors.toList());
        return tmpfilms;
    }
    // Поиск по году
    static List<Film> getFilmsByYear(List<Film> films, int yearfrom, int yearto) {

        List<Film> tmpfilms = films.stream().filter(film -> film.getProdyear() >= yearfrom && film.getProdyear() <= yearto).collect(Collectors.toList());
        return tmpfilms;
    }
}
