import java.sql.Time;

public class Setup {
    private int id, périodeHoraire, tarif;
    private Jeux jeux;
    private Ecrans ecran;
    private Poste poste;
    private Time heureDébut;
    static int nombrePoste=9;

    public Setup(int id, int périodeHoraire, int tarif, Jeux jeux, Ecrans ecran, Poste poste, Time heureDébut) {
        this.id = id;
        this.périodeHoraire = périodeHoraire;
        this.tarif = tarif;
        this.jeux = jeux;
        this.ecran = ecran;
        this.poste = poste;
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

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public Time getHeureDébut() {
        return heureDébut;
    }

    public void setHeureDébut(Time heureDébut) {
        this.heureDébut = heureDébut;
    }

    public static int getNombrePoste() {
        return nombrePoste;
    }

    public static void setNombrePoste(int nombrePoste) {
        Setup.nombrePoste = nombrePoste;
    }
}
