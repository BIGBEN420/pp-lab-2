import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę uczniów: ");
        int liczbaUczniow = scanner.nextInt();

        System.out.print("Podaj liczbę przedmiotów: ");
        int liczbaPrzedmiotow = scanner.nextInt();

        System.out.print("Podaj nazwę przedmiotu: ");
        String nazwaPrzedmiotu = scanner.next();

        // Wprowadzanie ocen i obliczanie średniej dla każdego ucznia
        for (int i = 0; i < liczbaUczniow; i++) {
            double sumaOcen = 0;
            System.out.print("Podaj imię ucznia " + (i + 1) + ": ");
            String imieUcznia = scanner.next();

            System.out.println("Oceny dla ucznia " + imieUcznia + " z przedmiotu " + nazwaPrzedmiotu + ":");
            for (int j = 0; j < liczbaPrzedmiotow; j++) {
                System.out.print("Ocena " + (j + 1) + ": ");
                double ocena = scanner.nextDouble();
                sumaOcen += ocena;
            }

            double sredniaOcena = sumaOcen / liczbaPrzedmiotow;
            System.out.println("Średnia ocena dla ucznia " + imieUcznia + " z przedmiotu " + nazwaPrzedmiotu + ": " + sredniaOcena);
        }
    }
}
