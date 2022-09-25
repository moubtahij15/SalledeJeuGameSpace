import java.util.ArrayList;
import java.util.Scanner;

public class Console extends Device {
    private Jeux[] jeux;

    public Jeux[] getJeux() {
        return jeux;
    }

    public void setJeux(Jeux[] jeux) {
        this.jeux = jeux;
    }

    public Console(String nomDevice, int quantite, Jeux[] jeux) {
        super(nomDevice, quantite);
        this.jeux = jeux;
    }

    public Console() {
    }

    public Console(String nomDevice, int quantite) {
        super(nomDevice, quantite);
    }

    public Console(String nomDevice) {
        super(nomDevice);
    }

    public static ArrayList<Console> updateConsole(ArrayList<Console> allConsole, String nameConsole) {



        //Console console1 = new Console(nameConsole);

        for (Console curInstance : allConsole) {
            if (curInstance.getNomDevice() == nameConsole) {
                curInstance.setQuantite(curInstance.getQuantite() - 1);
            }

         /*   if (curInstance.getNomDevice().equals(console1.getNomDevice())) {
                Console valueConsoleUpdated = new Console(curInstance.getNomDevice(), (curInstance.getQuantite() - 1), curInstance.getJeux());
                allConsole.set(allConsole.indexOf(curInstance), valueConsoleUpdated);
            }*/
        }
        return allConsole;
    }

    public static Console getFreeConsole(ArrayList<Console> allConsole) {
        Console consoleFree = new Console();
        for (Console curInstance : allConsole) {
            if (curInstance.getQuantite() > 0) {
                consoleFree = curInstance;
                return consoleFree;
            }
        }
        return consoleFree;
    }

    @Override
    public String toString() {
        String listJeux = "";

        int index = 0;
        if (jeux != null) {
            for (Jeux currentJeux : jeux) {
                listJeux += " \n " + (index + 1) +"-"+ " nom de jeux : " + currentJeux.getNom() + " categorie : " + currentJeux.getCategorie();
                index++;
            }
        }
        return "\n Console  : " +
                "nomDevice='" + super.getNomDevice() + '\'' +
                "\n les Jeux dispo ='" + listJeux + '\'';
    }

    static String listerJeuxPost(Console console){

        return console.toString();

    }
}
