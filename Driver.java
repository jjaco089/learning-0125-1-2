public class Driver {
    public static void main(String[] args) {
        Service s = new Service();
        Movie m = s.searchDatabase("inception");
        m.printMovie();
    }
}
