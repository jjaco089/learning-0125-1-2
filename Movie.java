class Movie {
    private String title;
    private int year;
    Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }
    void printMovie() {
        System.out.println(title + " was released in " + year);
    }
}