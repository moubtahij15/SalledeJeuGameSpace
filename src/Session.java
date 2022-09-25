import java.sql.Time;

public class Session {
    private int id;
    private Poste poste;
    private Jeux jeux;
    private Time heureDebut;

    private Time heureFin;
    private int tarif ,périodeHoraire;
    private Joueur joueur;

    static int totalTaifs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public Jeux getJeux() {
        return jeux;
    }

    public void setJeux(Jeux jeux) {
        this.jeux = jeux;
    }

    public Time getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Time heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public static int getTotalTaifs() {
        return totalTaifs;
    }

    public static void setTotalTaifs(int totalTaifs) {
        Session.totalTaifs = totalTaifs;
    }

    public Session() {
    }

    public Session(int id, Poste poste, Jeux jeux, Time heureDebut, int tarif) {
        this.id = id;
        this.poste = poste;
        this.jeux = jeux;
        this.heureDebut = heureDebut;
        this.tarif = tarif;
        totalTaifs += tarif;
    }

    public Session(int id, Poste poste, Jeux jeux, Time heureDebut, int tarif, Joueur joueur) {
        this.id = id;
        this.poste = poste;
        this.jeux = jeux;
        this.heureDebut = heureDebut;
        this.tarif = tarif;
        this.joueur = joueur;
    }
}
