package sk.stuba.fei.uim.oop;

import java.util.Objects;
import java.util.Scanner;



public class Main {
    static String funkcia(int den, int mesiac, String znamenie) {
        switch (mesiac) {
            case 1:
                if (den <= 20) {
                    znamenie = "Kozorozec";
                } else {
                    znamenie = "Vodnar";
                }
                break;

            case 2:
                if (den <= 19) {
                    znamenie = "Vodnar";
                } else {
                    znamenie = "Ryby";
                }
                break;
            case 3:
                if (den <= 20) {
                    znamenie = "Ryby";
                } else {
                    znamenie = "Baran";
                }
                break;

            case 4:
                if (den <= 20) {
                    znamenie = "Baran";
                } else {
                    znamenie = "Byk";
                }
                break;
            case 5:
                if (den <= 21) {
                    znamenie = "Byk";
                } else {
                    znamenie = "Blizenci";
                }
                break;

            case 6:
                if (den <= 21) {
                    znamenie = "Blizenci";
                } else {
                    znamenie = "Rak";
                }
                break;
            case 7:
                if (den <= 22) {
                    znamenie = "Rak";
                } else {
                    znamenie = "Lev";
                }
                break;

            case 8:
                if (den <= 23) {
                    znamenie = "Lev";
                } else {
                    znamenie = "Panna";
                }
                break;
            case 9:
                if (den <= 23) {
                    znamenie = "Panna";
                } else {
                    znamenie = "Vahy";
                }
                break;

            case 10:
                if (den <= 23) {
                    znamenie = "Vahy";
                } else {
                    znamenie = "Skorpion";
                }
                break;
            case 11:
                if (den <= 22) {
                    znamenie = "Skorpion";
                } else {
                    znamenie = "Strelec";
                }
                break;

            case 12:
                if (den <= 21) {
                    znamenie = "Strelec";
                } else {
                    znamenie = "Kozorozec";
                }
                break;
        }
        return znamenie;
    }
    public static void main(String[] args) {
        Scanner klavesnica = new Scanner(System.in);
        System.out.println("Pre pokracovanie stlacte Enter. Pre ukoncenie programu napiste Koniec");
        while (!Objects.equals(klavesnica.nextLine(), "Koniec")) {
            System.out.println("Pre pokracovanie stlacte Enter. Pre ukoncenie programu napiste Koniec");
            System.out.println("Zadaj den (cislom) : ");
            int den = Integer.parseInt(klavesnica.nextLine());
            System.out.println("Zadaj mesiac (cislom) : ");
            int mesiac = Integer.parseInt(klavesnica.nextLine());
            String znamenie = "Nezname znamenie";
            znamenie = funkcia(den, mesiac, znamenie);
            System.out.println("Znamenie je " + znamenie);
        }
    }
}
