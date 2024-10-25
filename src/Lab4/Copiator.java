package Lab4;

public class Copiator extends Echipament {
    private int paginiPeToner;
    private FormatCopiere formatCopiere;

    public Copiator(String nume, int nr_inv, int pret, String zona, int p_ton, FormatCopiere formatCopiere) {
        super(nume, nr_inv,pret, zona,StareEchipament.ACHIZITIONAT);
        this.paginiPeToner = paginiPeToner;
        this.formatCopiere = formatCopiere;
    }

    @Override
    public String toString() {
        return super.toString() + " " + paginiPeToner + " " + formatCopiere;
    }
}
