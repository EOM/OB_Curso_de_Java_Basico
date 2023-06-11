public class SmartWatch extends SmartDevice {
    private String tipoCorrea;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String tipoCorrea) {
        super(marca, modelo);
        this.tipoCorrea = tipoCorrea;
    }

    public String getTipoCorrea() {
        return tipoCorrea;
    }

    public void setTipoCorrea(String tipoCorrea) {
        this.tipoCorrea = tipoCorrea;
    }
}
