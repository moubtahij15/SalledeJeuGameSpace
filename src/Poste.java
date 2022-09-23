import java.sql.Time;
import java.util.ArrayList;

public class Poste {
    private int id, périodeHoraire, tarif;
    private Jeux jeux;
    private Ecrans ecran;
    private Console console;
    private Time heureDébut;
    private boolean statue=true;
    static int nombrePoste = 9;



    public Poste(int id, Ecrans ecran, Console console) {
        this.id = id;
        this.ecran = ecran;
        this.console = console;
    }

    public static ArrayList<Poste> monterPoste(ArrayList<Ecrans> allEcrans, ArrayList<Console> allConsoles) {
        ArrayList<Poste> allPosteMonted = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            allPosteMonted.add(new Poste(i, Ecrans.getFreeEcran(allEcrans), Console.getFreeConsole(allConsoles)));
            Ecrans.updateEcran(allEcrans, Ecrans.getFreeEcran(allEcrans).getNomDevice());
            Console.updateConsole(allConsoles, Console.getFreeConsole(allConsoles).getNomDevice());
        }
        return allPosteMonted;
    }

    public Poste(int id, int périodeHoraire, int tarif, Jeux jeux, Ecrans ecran, Console console, Time heureDébut) {
        this.id = id;
        this.périodeHoraire = périodeHoraire;
        this.tarif = tarif;
        this.jeux = jeux;
        this.ecran = ecran;
        this.console = console;
        this.heureDébut = heureDébut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPériodeHoraire() {
        return périodeHoraire;
    }

    public void setPériodeHoraire(int périodeHoraire) {
        this.périodeHoraire = périodeHoraire;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public Jeux getJeux() {
        return jeux;
    }

    public void setJeux(Jeux jeux) {
        this.jeux = jeux;
    }

    public Ecrans getEcran() {
        return ecran;
    }

    public void setEcran(Ecrans ecran) {
        this.ecran = ecran;
    }

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }

    public Time getHeureDébut() {
        return heureDébut;
    }

    public void setHeureDébut(Time heureDébut) {
        this.heureDébut = heureDébut;
    }


    public static boolean isFull() {
        return nombrePoste == 0;
    }
        public  Boolean isaAvailable(Poste post){
            return post.statue;
        }
    @Override
    public String toString() {
        return "\n Poste{" +
                "id=" + id + "\n" +
                ecran +
                console +
                '}';
    }
}
