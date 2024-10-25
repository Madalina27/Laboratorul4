package Lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException
    {
        List<Echipament> listaEchipamente = new ArrayList<>();
        Scanner cinf = new Scanner(new File("echipamente.txt"));

        while (cinf.hasNext())
        {
            String[] line = cinf.nextLine().split(";");
            String nume = line[0];
            int inv = Integer.parseInt(line[1]);
            int pret = Integer.parseInt(line[2]);
            String zona = line[3];
            StareEchipament stare = StareEchipament.valueOf(line[4].toUpperCase());
            String tip = line[5].toLowerCase();

            switch (tip)
            {
                case "imprimanta":
                    int pagini_ppm = Integer.parseInt(line[6]);
                    String rezolutie = line[7];
                    int p_car = Integer.parseInt(line[8]);
                    Tiparire tiparire = Tiparire.valueOf(line[9].toUpperCase());
                    listaEchipamente.add(new Imprimante(nume, inv, pret, zona, pagini_ppm, rezolutie, p_car, tiparire));
                    break;
                case "copiator":
                    int paginiPeToner = Integer.parseInt(line[6]);
                    FormatCopiere format = FormatCopiere.A4.valueOf(line[7].toUpperCase());
                    listaEchipamente.add(new Copiator(nume, inv, pret, zona, paginiPeToner, format));
                    break;
                case "sistem calcul":
                    String tipMon = line[6];
                    double vitezaProc = Double.parseDouble(line[7]);
                    int capacitate_hdd = Integer.parseInt(line[8]);
                    SistemOperare sistemOperare = SistemOperare.WINDOWS.valueOf(line[9].toUpperCase());
                    SistemCalcul sistemCalcul = new SistemCalcul(nume, inv, pret, zona, tipMon, vitezaProc, capacitate_hdd, sistemOperare);
                    listaEchipamente.add(sistemCalcul);
                    break;
                default:
                    System.out.println("Echipament necunoscut: " + tip);
                    break;
            }
        }

        for (Echipament e : listaEchipamente) {
            System.out.println(e);
        }
    }
}
