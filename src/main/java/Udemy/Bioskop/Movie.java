package Udemy.Bioskop;

public class Movie {
    private String title;
    
    public Movie(String title){
        this.title = title;
    }
    
    public void getInfoMovie(){
        System.out.println(this.title + " is a " + getClass().getSimpleName() + " film");
    }

    public Movie movieInput(char type, String title){
        return switch (type){
            case 'A' -> new Adventure(title);
            case 'S' -> new ScienceFiction(title);
            case 'H' -> new Horror(title);
            case 'C' -> new Comedy(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{
    Adventure(String title){
        super(title);
    }

    @Override
    public void getInfoMovie() {
        super.getInfoMovie();
    }
}

class Comedy extends Movie{
    Comedy(String title){
        super(title);
    }

    @Override
    public void getInfoMovie() {
        super.getInfoMovie();
    }
}

class Horror extends Movie{
    Horror(String title){
        super(title);
    }

    @Override
    public void getInfoMovie() {
        super.getInfoMovie();
    }
}

class ScienceFiction extends Movie{
    ScienceFiction(String title){
        super(title);
    }

    @Override
    public void getInfoMovie() {
        super.getInfoMovie();
    }
}
