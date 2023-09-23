package Movie;

public class Main {

    public static void main(String[] args) {
//        Movie movie = new Movie("Blue Beetle");
//        movie.watchMovie();
//
//        Adventure adventure1 = new Adventure("Jackie chan movie");
//        adventure1.watchMovie();
//
//        Movie adventure = new Adventure("Indiana Jones");
//        adventure.watchMovie();
//
//        Movie horror = new Horror("Silent Hill");
//        horror.watchMovie();

         Movie movie = Movie.getMovie("Horror", "Silent Hill");
         movie.watchMovie();

         Object film = Movie.getMovie("A", "Jackie Chan");
         Adventure adventureMovie = (Adventure) film;
         adventureMovie.watchMovie();

         var movie2 = Movie.getMovie("H", "Silent Hill");
         movie2.watchMovie();

         var plane = new Horror("Resident Evil");
         plane.watchMovie();

         Object unknownObject = Movie.getMovie("H", "Saw");

         if (unknownObject.getClass().getSimpleName() == "Comedy"){
             Comedy unknownObject1 = (Comedy) unknownObject;
             unknownObject1.watchMovie();
         } else if (unknownObject instanceof Adventure adventure){
             adventure.watchMovie();
         } else if (unknownObject instanceof Horror){
             ((Horror) unknownObject).watchMovie();
         }
    }
}
