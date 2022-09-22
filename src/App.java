import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public void isFree(Time time) {
        LocalTime updatedTime;

        LocalTime now = LocalTime.parse(LocalTime.now()+"12:10");
        updatedTime = now.plusHours(2).plusMinutes(10);
        //        LocalTime now = LocalTime.parse(LocalTime.now()+"12:10");

//        updatedTime = now.plusMinutes(20);
        System.out.println(updatedTime);
//        return 1;
    }

    public static void main(String[] args) {


        ArrayList<Ecrans> allEcran = new ArrayList<>();
        allEcran.add(new Ecrans("Dell", 3));
        allEcran.add(new Ecrans("HP", 1));
        allEcran.add(new Ecrans("Asus", 3));
        allEcran.add(new Ecrans("Samsung", 2));

        ArrayList<Poste> allPoste = new ArrayList<>();
        allPoste.add(new Poste("Xbox", 4));
        allPoste.add(new Poste("", 3));
        allPoste.add(new Poste("NinPlayStation5tendo switch", 2));

        ArrayList<Categorie> allCategorie = new ArrayList<>();
        allCategorie.add(new Categorie("football"));
        allCategorie.add(new Categorie("Guerre"));

        ArrayList<Jeux> allJeux=new ArrayList<>();

////        LocalTime now = LocalTime.parse(LocalTime.now()+"12:10");
//
//        System.out.println(now);





    }
}
