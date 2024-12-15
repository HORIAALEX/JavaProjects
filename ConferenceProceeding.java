import java.time.LocalDate;

public class ConferenceProceeding extends Publication
{   
    private String volumeName;
    private boolean indexed;
    public ConferenceProceeding(String name, LocalDate apparition, int numberOfAuthors, String volumeName, boolean indexed)
    {
        super(name, apparition, numberOfAuthors);
        this.volumeName = volumeName;
        this.indexed = indexed;
    }
    @Override
    public double computeScore()
    {
        return indexed ? (0.25/getNumberOfAuthors()) : (0.2/getNumberOfAuthors());
    }
    @Override
    public String toString() {
        return "ConferenceProceeding{" +
                "volumeName='" + volumeName + '\'' +
                ", indexed=" + indexed +
                "} " + super.toString();
    }
}
