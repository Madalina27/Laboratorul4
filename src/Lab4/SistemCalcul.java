package Lab4;

public class SistemCalcul extends Echipament {
    private String tipMon;
    private double vitezaProc;
    private int capacitateHDD;
    private SistemOperare sistemOperare;

    public SistemCalcul(String nume, int nr_inv, int pret, String zona, String tip_mon, double vit_proc, int c_hdd, SistemOperare sistemOperare) {
       super(nume, nr_inv,pret,zona,StareEchipament.ACHIZITIONAT);
        this.tipMon = tipMon;
        this.vitezaProc = vitezaProc;
        this.capacitateHDD = capacitateHDD;
        this.sistemOperare = sistemOperare;
    }

    @Override
    public String toString() {
        return super.toString() + " " + tipMon + " "+ vitezaProc + " "+ capacitateHDD + " "+ sistemOperare;
    }
}
