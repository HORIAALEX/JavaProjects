import java.time.LocalDate;
import java.util.Calendar;

public class Journal extends Publication{
    private String journalName;
    private double impactFactor;
    public Journal(String name, LocalDate apparition, String journalName, double impactFactor, int numberOfAuthors) {
        super(name, apparition, numberOfAuthors);
        this.journalName = journalName;
        this.impactFactor = impactFactor;
    }
    @Override
    public double computeScore()
    {
        return (impactFactor*0.5) / getNumberOfAuthors();
    }

    @Override
    public String toString() {
        return "Journal{" +
                "journalName='" + journalName + '\'' +
                ", impactFactor=" + impactFactor +
                "} " + super.toString();
    }
}
