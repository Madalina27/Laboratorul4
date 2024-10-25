package Lab4;

public class Echipament {
    private String nume;
    private int nr_inv;
    private int pret;
    private String zona;
    private StareEchipament stare;


    public Echipament(String nume, int nr_inv, int pret, String zona_mag,StareEchipament stare) {
        this.nume = nume;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona = zona;
        this.stare=stare;
    }

    @Override
    public String toString() {
        return nume + " " + nr_inv + " " + pret + " " + zona+ " " + stare;
    }
    public void schimbaStare(StareEchipament nouaStare){
        this.stare=nouaStare;
    }
}
