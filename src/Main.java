public class Main {
    public static void main(String[] args) {
        Choroba swinka = new Choroba("swinka");
        Choroba ospa = new Choroba("ospa");

        Pacjent pacjent1 = new Pacjent("Jan", "Nowak");
        Pacjent pacjent2 = new Pacjent("Karolina", "Kowal");

        Lekarz lekarz1 = new Lekarz("Maciej", "Nowakowski");
        Lekarz lekarz2 = new Lekarz("Piotr", "Malinowski");

        lekarz1.dodajPacjenta(pacjent1);
        System.out.println(pacjent1);



    }
}