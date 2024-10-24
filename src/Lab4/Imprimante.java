package Ex1;

public class Imprimante {
    private int pagini_ppm;
    private String rezolutie;
    private int p_car;
    private Tiparire tiparire;

    public Imprimante(int pagini_ppm, String rezolutie, int p_car, Tiparire tiparire) {
        this.pagini_ppm = pagini_ppm;
        this.rezolutie = rezolutie;
        this.p_car = p_car;
        this.tiparire = tiparire;
    }

    @Override
    public String toString() {
        return super.toString() + " " + pagini_ppm + " " + rezolutie + " " + p_car;
    }
}
