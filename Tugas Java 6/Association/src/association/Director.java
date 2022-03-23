package association;

import java.util.List;


/**
 *
 * @author novia
 */
public class Director {
    private String directorName;
    List<Film> films;
    
    public String getDirectorName(){
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public List<Film> getFilms() {
        return films;
    }
    public void setDirector(List<Film> films) {
        this.films = films;
    }  
}



