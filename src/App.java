import java.awt.*;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    static public ArrayList<Categorie> chargeCategorie() {
        ArrayList<Categorie> allCategorie = new ArrayList<>();
        allCategorie.add(new Categorie("football"));
        allCategorie.add(new Categorie("Guerre"));
        return allCategorie;
    }

    static public ArrayList<Jeux> chargeJeux() {
        Categorie footballCategorie = new Categorie("Football");
        Categorie guerreCategorie = new Categorie("Guerre");
        ArrayList<Jeux> allJeux = new ArrayList<>();

        allJeux.add(new Jeux("FIFA", footballCategorie));
        allJeux.add(new Jeux("PES", footballCategorie));
        allJeux.add(new Jeux("Counter-Strike", guerreCategorie));
        allJeux.add(new Jeux("Assassin's Creed", guerreCategorie));
        return allJeux;
    }

    static public ArrayList<Ecrans> chargeEcrans() {
        ArrayList<Ecrans> allEcran = new ArrayList<>();
        allEcran.add(new Ecrans("Dell", 3));
        allEcran.add(new Ecrans("HP", 1));
        allEcran.add(new Ecrans("Asus", 3));
        allEcran.add(new Ecrans("Samsung", 2));
        return allEcran;
    }

    static public ArrayList<Console> chargeConsole(HashMap<String, Jeux[]> listJeuxForConsole) {
        ArrayList<Console> allConsole = new ArrayList<>();
        allConsole.add(new Console("Xbox", 4, listJeuxForConsole.get("Xbox")));
        allConsole.add(new Console("PlayStation5", 3, listJeuxForConsole.get("PlayStation5")));
        allConsole.add(new Console("Nintendo switch", 2, listJeuxForConsole.get("Nintendo switch")));
        return allConsole;
    }

    static public HashMap<String, Jeux[]> listJeuxForConsole(ArrayList<Jeux> allJeux) {

        HashMap<String, Jeux[]> listJeuxForConsole = new HashMap<>();
        listJeuxForConsole.put("Xbox", new Jeux[]{allJeux.get(0), allJeux.get(1), allJeux.get(2)});
        listJeuxForConsole.put("PlayStation5", new Jeux[]{allJeux.get(1), allJeux.get(3), allJeux.get(2)});
        listJeuxForConsole.put("Nintendo switch", new Jeux[]{allJeux.get(1), allJeux.get(0), allJeux.get(2)});
        return listJeuxForConsole;
    }

    static public HashMap<String, Integer> chargeTarifHoraire() {

        HashMap<String, Integer> tarifHoraire = new HashMap<String, Integer>();
        tarifHoraire.put("30 min", 5);
        tarifHoraire.put("1 h", 10);
        tarifHoraire.put("2 h", 18);
        tarifHoraire.put("5 h", 40);
        tarifHoraire.put("all", 65);
        return tarifHoraire;

    }

    static public String afficheTarifHoaire(HashMap<String, Integer> tarifHoraire) {
        String tarifHoraireString = " ";

        int index = 0;
        for (String i : tarifHoraire.keySet()) {

            tarifHoraireString += " \n " + (index + 1) + "-" + " time : " + i + "// tarif : " + tarifHoraire.get(i) + "DH";
            index++;
        }

        return tarifHoraireString;

    }

    static void afficheDashboard() {

        ArrayList<Jeux> allJeux = new ArrayList<>();
        allJeux = chargeJeux();

        HashMap<String, Jeux[]> listJeuxForConsole = new HashMap<>();
        listJeuxForConsole = listJeuxForConsole(allJeux);

        ArrayList<Ecrans> allEcran = new ArrayList<>();
        allEcran = chargeEcrans();

        ArrayList<Console> allConsole = new ArrayList<>();
        allConsole = chargeConsole(listJeuxForConsole);


        HashMap<String, Integer> tarifHoraire = new HashMap<String, Integer>();
        tarifHoraire = chargeTarifHoraire();
        int index = 0;
        ArrayList<Session> sessionsDay = new ArrayList<>();
        ArrayList<Poste> allPoste = new ArrayList<>();
        allPoste = Poste.monterPoste(allEcran, allConsole);
        System.out.println("Bonjour");
        System.out.println("les Postes libre : " + Poste.nombrePoste);
        System.out.println("il faut dabord choisit  le poste vide voile les postes dispo  ");
        System.out.println(allPoste);
        Session session1 = new Session();

        Scanner in = new Scanner(System.in);
        int indexPosteChoisi = in.nextInt();
        session1.setPoste(allPoste.get(indexPosteChoisi));
        allPoste.get(indexPosteChoisi).setStatue(false);

        System.out.println(Console.listerJeuxPost(allPoste.get(indexPosteChoisi).getConsole()));

        session1.setJeux(allJeux.get(in.nextInt() - 1));


        System.out.println(afficheTarifHoaire(tarifHoraire));
        String timeSelected = (String) tarifHoraire.keySet().toArray()[in.nextInt() - 1];

        session1.setTarif(tarifHoraire.get(timeSelected));

        System.out.println(session1.getTarif());
        String a[] = (timeSelected.split(" "));
        System.out.println(a[0]);



        int choice = 0;


    }

    static void freeHours() {

        LocalTime updatedTime;
        int now = LocalTime.now().toSecondOfDay();
        now = 14 * 3600;
        int timeOpen[] = {(9 * 3600), 12 * 3600, 14 * 3600, 20 * 3600};
        for (int time : timeOpen) {
            if ((time >= 9 * 3600 && time <= 12 * 3600) || (time >= 14 * 3600 && time <= 20 * 3600)) if (now > time) {
                System.out.println((now - time) / 3600);

            }

        }


        LocalTime timeMorning = LocalTime.parse("12:00");
        // System.out.println(now);
    }

    static void isFree(int périodeHoraire) throws ParseException {
        LocalTime updatedTime;
        LocalTime now = LocalTime.now();
        LocalTime time = LocalTime.parse("12:00");

        updatedTime = now.plusHours(périodeHoraire);

        //   if ((updatedTime.compareTo(time))) {

        // }
        System.out.println(updatedTime.compareTo(time));
//        return 1;
    }

    public static void main(String[] args) throws ParseException {


        afficheDashboard();


    }
}
