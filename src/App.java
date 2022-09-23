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
    static void afficheDashboard(ArrayList<Ecrans> allEcran, ArrayList<Console> allConsole) {

        ArrayList<Poste> allPoste = new ArrayList<>();
        allPoste = Poste.monterPoste(allEcran, allConsole);
        System.out.println("Bonjour");
        System.out.println("les Postes libre : " + Poste.nombrePoste);
        System.out.println("il faut dabord choisit  le poste vide voile les postes dispo  ");
        System.out.println(allPoste);



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


        ArrayList<Ecrans> allEcran = new ArrayList<>();
        allEcran.add(new Ecrans("Dell", 3));
        allEcran.add(new Ecrans("HP", 1));
        allEcran.add(new Ecrans("Asus", 3));
        allEcran.add(new Ecrans("Samsung", 2));

        ArrayList<Console> allConsole = new ArrayList<>();
        allConsole.add(new Console("Xbox", 4));
        allConsole.add(new Console("PlayStation5", 3));
        allConsole.add(new Console("Nintendo switch", 2));

        ArrayList<Categorie> allCategorie = new ArrayList<>();
        allCategorie.add(new Categorie("football"));
        allCategorie.add(new Categorie("Guerre"));

        ArrayList<Jeux> allJeux = new ArrayList<>();
        Categorie footballCategorie = new Categorie("Football");
        Categorie guerreCategorie = new Categorie("Guerre");

        // allCategorie.add(new Categorie("football"));
        //allCategorie.add(new Categorie("Guerre"));
        allJeux.add(new Jeux("FIFA", footballCategorie));
        allJeux.add(new Jeux("PES", footballCategorie));
        allJeux.add(new Jeux("Counter-Strike", guerreCategorie));
        allJeux.add(new Jeux("Assassin's Creed", guerreCategorie));

        HashMap<String, Integer> tarifHoraire = new HashMap<String, Integer>();
        tarifHoraire.put("30 min", 5);
        tarifHoraire.put("1 h", 10);
        tarifHoraire.put("2 h", 18);
        tarifHoraire.put("5 h", 40);
        tarifHoraire.put("all", 65);

        HashMap<String, Jeux[]> listJeuxForConsole = new HashMap<>();
        listJeuxForConsole.put("Xbox", new Jeux[]{allJeux.get(0),allJeux.get(1),allJeux.get(2)});
        listJeuxForConsole.put("PlayStation5", new Jeux[]{allJeux.get(1),allJeux.get(3),allJeux.get(2)});
        listJeuxForConsole.put("Nintendo switch", new Jeux[]{allJeux.get(1),allJeux.get(0),allJeux.get(2)});

        System.out.println(listJeuxForConsole.get("Xbox")[0].getNom());

//     LocalTime now = LocalTime.parse(LocalTime.now()+"12:10");
//
//        System.out.println(now);
        ArrayList<Poste> allPoste = new ArrayList<>();
        // allPoste.add(new Poste(1,))

        Scanner inInt = new Scanner(System.in);

        //System.out.println("Bonjour \n entrer s'il vous plaît le nombre de heures : ");

        //  isFree(inInt.nextInt());


        //  allConsole = Console.updateDevice(allConsole);

        //System.out.println(Console.getFreeDevice(allConsole));

       // afficheDashboard(allEcran, allConsole);
        // allConsole.indexOf()

    }
}
