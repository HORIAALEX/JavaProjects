import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class University{
    private String name;
    private String location;
    private final List<Author> authors;
    public University(String name, String location){
        this.name = name;
        this.location = location;
        this.authors = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }

    public void addAuthor(Author Author){
        this.authors.add(Author);
        Author.setUniversity(this);
    }
    public double computeScore()
    {
        return authors.stream().mapToDouble(Author::computeScore).sum();
    }
    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", authors=" + authors +
                '}';
    }
}

class Author{
    private String name;
    private University university;
    private final List<Publication> publications;

    public Author(String name)
    {
        this.name = name;
        this.publications = new ArrayList<>();
    }
    public void addPublication(Publication Publication){
        publications.add(Publication);
    }
    public double computeScore()
    {
        return publications.stream().mapToDouble(Publication::computeScore).sum();
    }
    public void setUniversity(University university){
        this.university = university;
    }
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", publications=" + publications +
                '}';
    }
}

abstract class Publication{
    private String name;
    private LocalDate apparition;
    private int numberOfAuthors;

    public Publication(String name, LocalDate apparition, int numberOfAuthors){
        this.name = name;
        this.apparition = apparition;
        this.numberOfAuthors = numberOfAuthors;
    }
    public int getNumberOfAuthors(){
        return numberOfAuthors;
    }
    protected abstract double computeScore();
    @Override
    public String toString() {
        return "Publication{" +
                "name='" + name + '\'' +
                ", apparitionDate=" + apparition +
                ", numberOfAuthors=" + numberOfAuthors +
                '}';
    }
}

public class Lab3_Advanced_Exercise {
    public static void main(String[] args) {
        // Create a journal
        Journal journal = new Journal("Journal of Computer Science", LocalDate.of(2023, 1, 1), "JCS", 5.0, 3);

        // Create a conference proceeding
        ConferenceProceeding conferenceProceeding = new ConferenceProceeding("International Conference on AI", LocalDate.of(2023, 12, 1), 5, "ICAI 2023", true);

        // Calculate and print scores
        System.out.println("Journal Score: " + journal.computeScore());
        System.out.println("Conference Proceeding Score: " + conferenceProceeding.computeScore());
    }
}
