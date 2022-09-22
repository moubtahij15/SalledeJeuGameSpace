import java.util.ArrayList;
import java.util.Scanner;

public class Device {
    private String nomDevice;
    private int quantite;

    public Device(String nomDevice, int quantite) {
        this.nomDevice = nomDevice;
        this.quantite = quantite;
    }

    public Device(String nomDevice) {
        this.nomDevice = nomDevice;
    }

    public String getNomDevice() {
        return nomDevice;
    }

    public void setNomDevice(String nomDevice) {
        this.nomDevice = nomDevice;
    }

    public Device() {
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Device{" +
                "nomDevice='" + nomDevice + '\'' +
                ", quantite=" + quantite +
                '}';
    }


    public static ArrayList<Device> updateDevice(ArrayList<Device> allDevice) {
        Scanner inString = new Scanner(System.in);
        Device device1 = new Device(inString.nextLine());

        for (Device curInstance : allDevice) {
            if (curInstance.getNomDevice().equals(device1.getNomDevice())) {
                Console valueDeviceUpdated = new Console(curInstance.getNomDevice(), (curInstance.getQuantite() - 1));
                allDevice.set(allDevice.indexOf(curInstance), valueDeviceUpdated);
            }
        }
        return allDevice;
    }

    public static Device getFreeDevice(ArrayList<Device> allDevice) {
        Device deviceFree = new Device();
        for (Device curInstance : allDevice) {
            if (curInstance.getQuantite() > 0) {
                deviceFree = curInstance;
                return deviceFree;
            }
        }
        return deviceFree;
    }

}
