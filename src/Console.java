import java.util.ArrayList;
import java.util.Scanner;

public class Console extends Device {

    public Console() {
    }

    public Console(String nomDevice, int quantite) {
        super(nomDevice, quantite);
    }

    public Console(String nomDevice) {
        super(nomDevice);
    }

    public static ArrayList<Console> updateConsole(ArrayList<Console> allConsole, String nameConsole) {

        Console console1 = new Console(nameConsole);

        for (Device curInstance : allConsole) {
            if (curInstance.getNomDevice().equals(console1.getNomDevice())) {
                Console valueConsoleUpdated = new Console(curInstance.getNomDevice(), (curInstance.getQuantite() - 1));
                allConsole.set(allConsole.indexOf(curInstance), valueConsoleUpdated);
            }
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
        return "\n Console  {" +
                "nomDevice='" + super.getNomDevice() + '\'' +
                ", quantite=" + super.getQuantite() +
                '}'+'\'';
    }
}
