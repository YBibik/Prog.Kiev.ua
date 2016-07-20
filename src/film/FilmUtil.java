package film;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by y.bibik on 20.07.2016.
 */
public class FilmUtil {
    // Поиск по жанру
    static List<Film> getFilmsByGenre(List<Film> films, String genre) {

        List<Film> tmpfilms = new ArrayList<>();
        for (Film film : films) {
            if (film.getGenre().equals(genre)) {
                tmpfilms.add(film);
            }
        }
        return tmpfilms;
    }
    // Поиск по году
    static List<Film> getFilmsByYear(List<Film> films, int yearfrom, int yearto) {

        List<Film> tmpfilms = new ArrayList<>();
        for (Film film : films) {
            if (film.getProdyear() >= yearfrom && film.getProdyear() <= yearto) {
                tmpfilms.add(film);
            }
        }
        return tmpfilms;
    }
}
