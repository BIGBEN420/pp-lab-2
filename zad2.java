import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę uczniów: ");
        int liczbaUczniow = scanner.nextInt();

        System.out.print("Podaj liczbę przedmiotów: ");
        int liczbaPrzedmiotow = scanner.nextInt();

        // Inicjalizacja tablicy ocen i przedmiotów
        double[][] oceny = new double[liczbaUczniow][liczbaPrzedmiotow];
        String[] przedmioty = new String[liczbaPrzedmiotow];
        String[] imionaUczniow = new String[liczbaUczniow];

        // Wprowadzanie nazw przedmiotów
        for (int j = 0; j < liczbaPrzedmiotow; j++) {
            System.out.print("Podaj nazwę przedmiotu " + (j + 1) + ": ");
            przedmioty[j] = scanner.next();
        }

        // Wprowadzanie imion uczniów i ocen
        for (int i = 0; i < liczbaUczniow; i++) {
            System.out.print("Podaj imię ucznia " + (i + 1) + ": ");
            imionaUczniow[i] = scanner.next();

            for (int j = 0; j < liczbaPrzedmiotow; j++) {
                System.out.print("Ocena dla ucznia " + imionaUczniow[i] + " z przedmiotu " + przedmioty[j] + ": ");
                oceny[i][j] = scanner.nextDouble();
            }
        }

        // Obliczanie średniej oceny dla każdego ucznia
        for (int i = 0; i < liczbaUczniow; i++) {
            double sumaOcen = 0;
            for (int j = 0; j < liczbaPrzedmiotow; j++) {
                sumaOcen += oceny[i][j];
            }
            double sredniaOcena = sumaOcen / liczbaPrzedmiotow;
            System.out.println("Średnia ocena dla ucznia " + imionaUczniow[i] + ": " + sredniaOcena);
        }
    }
}
