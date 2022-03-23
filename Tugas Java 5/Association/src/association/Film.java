package association;

/**
 *
 * @author novia
 */
public class Film {
    /*State*/
    private String filmName;

    public String getFilmName() {
        return this.filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    @Override
    public String toString(){
        return filmName;
    }
}
