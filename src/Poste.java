import java.sql.Time;

public class Poste {
    private int id, périodeHoraire, tarif;
    private Jeux jeux;
    private Ecrans ecran;
    private Console console;
    private Time heureDébut;
    static int nombreConsole=9;

    public Poste(int id, int périodeHoraire, int tarif, Jeux jeux, Ecrans ecran, Console console, Time heureDébut) {
        this.id = id;
        this.périodeHoraire = périodeHoraire;
        this.tarif = tarif;
        this.jeux = jeux;
        this.ecran = ecran;
        this.console = console;
        this.heureDébut = heureDébut;
    }
}
