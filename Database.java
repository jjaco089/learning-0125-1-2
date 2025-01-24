import java.util.ArrayList;
import java.util.List;

class Database {
    private List<Movie> movies;
    Database() {
        movies = new ArrayList<>();
        movies.add(new Movie("The Godfather", 1972));
        movies.add(new Movie("Pulp Fiction", 1994));
        movies.add(new Movie("Inception", 2010));
        movies.add(new Movie("The Matrix", 1999));
        movies.add(new Movie("Psycho", 1960));
    }
    public List<Movie> getMovies() {
        return movies;
    }
}
