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

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
