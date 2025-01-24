class Service {
    private Database db;
    Service() {
        Database db = new Database();
        this.db = db;
    }
    Movie searchDatabase(String title) {
        for (Movie movie : db.getMovies()) {
            if (movie.getTitle().equalsIgnoreCase(title)) { 
                return movie;
            }
        }
        return null;
    }
}
