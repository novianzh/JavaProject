package association;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author novia
 */
public class Association {
    public static void main(String[] args) {
        Director director = new Director();
            director.setDirectorName("Joko Anwar");

            Film film1 = new Film();
            film1.setFilmName("Pengabdi Setan");
            Film film2 = new Film();
            film2.setFilmName("Gundala");

            List<Film> empList = new ArrayList<>();
            empList.add(film1);
            empList.add(film2);

            director.setDirector(empList);

            System.out.println(director.getFilms()+" adalah film yang disutradarai oleh " + director.getDirectorName());
 
    }
}
    

