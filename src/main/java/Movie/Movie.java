package Movie;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'H' -> new Horror(title);
            case 'C' ->  new Comedy(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{
    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "we are camping on the hill",
                "We found secret hole",
                "Happy ending");
    }
}
class Horror extends Movie{
    public Horror(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(4), "Anas trapped on haunted house",
                "Anas trying find escape way",
                "Anas catch by monster",
                "Bad ending");
    }
}

class Comedy extends Movie{
    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("you watching comedy movie");
    }
}
