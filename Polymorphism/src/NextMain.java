public class NextMain {

    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = Movie.getMovie("A", "Jaws");
    }
}
