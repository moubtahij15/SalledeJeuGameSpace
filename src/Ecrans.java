import java.util.ArrayList;
import java.util.Scanner;

public class Ecrans extends Device {

    public Ecrans() {
    }

    public Ecrans(String nomDevice, int quantite) {
        super(nomDevice, quantite);
    }

    public Ecrans(String nomEcran) {
        super(nomEcran);
    }
    public static ArrayList<Ecrans> updateEcran(ArrayList<Ecrans> allEcran,String nameEcran) {
        Scanner inString = new Scanner(System.in);
        Ecrans ecran1 = new Ecrans(nameEcran);

        for (Device curInstance : allEcran) {
            if (curInstance.getNomDevice().equals(ecran1.getNomDevice())) {
                Ecrans valueEcranUpdated = new Ecrans(curInstance.getNomDevice(), (curInstance.getQuantite() - 1));
                allEcran.set(allEcran.indexOf(curInstance), valueEcranUpdated);
            }
        }
        return allEcran;
    }

    public static Ecrans getFreeEcran(ArrayList<Ecrans> allEcran) {
        Ecrans ecranFree = new Ecrans();
        for (Ecrans curInstance : allEcran) {
            if (curInstance.getQuantite() > 0) {
                ecranFree = curInstance;
                return ecranFree;
            }
        }
        return ecranFree;
    }
    @Override
    public String toString() {
        return " Ecrans  {" +
                "nomDevice='" + super.getNomDevice() + '\'' +
                ", quantite=" + super.getQuantite() +
                '}'+'\'';
    }
}
