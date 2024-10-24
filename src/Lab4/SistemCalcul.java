package Ex1;

public class SistemCalcul {
    private String tipMon;
    private int vit_proc;
    private int c_hdd;
    private SistemOperare sistemOperare;

    public SistemCalcul(String tip_mon, int vit_proc, int c_hdd, SistemOperare sistemOperare) {
        this.tipMon = tipMon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.sistemOperare = sistemOperare;
    }

    @Override
    public String toString() {
        return super.toString() + " " + tipMon + " "+ vit_proc + " "+ c_hdd + " "+ sistemOperare;
    }
}
