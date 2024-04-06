import java.util.Scanner;

public class zad4 {

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
                double ocena;
                do {
                    System.out.print("Ocena dla ucznia " + imionaUczniow[i] + " z przedmiotu " + przedmioty[j] + ": ");
                    ocena = scanner.nextDouble();
                    if (ocena <= 0 || ocena > 6) {
                        System.out.println("Błędna ocena. Wprowadź ocenę z zakresu 1-6.");
                    }
                } while (ocena <= 0 || ocena > 6);
                oceny[i][j] = ocena;
            }
        }

        // Wyświetlanie wszystkich ocen, ich sumy i obliczanie średniej oceny dla każdego ucznia
        for (int i = 0; i < liczbaUczniow; i++) {
            double sumaOcen = 0;
            System.out.println("Oceny dla ucznia " + imionaUczniow[i] + ":");
            for (int j = 0; j < liczbaPrzedmiotow; j++) {
                System.out.println("Ocena z przedmiotu " + przedmioty[j] + ": " + oceny[i][j]);
                sumaOcen += oceny[i][j];
            }
            System.out.println("Suma ocen dla ucznia " + imionaUczniow[i] + ": " + sumaOcen);
            double sredniaOcena = sumaOcen / liczbaPrzedmiotow;
            System.out.println("Średnia ocena dla ucznia " + imionaUczniow[i] + ": " + sredniaOcena);
        }
    }
}
