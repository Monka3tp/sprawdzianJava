import java.util.ArrayList;

public class Lekarz {
    private String imie;
    private String nazwisko;
    private ArrayList<Pacjent> listaLeczonychPacjentow = new ArrayList<>();

    public Lekarz(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<Pacjent> getListaLeczonychPacjentow() {
        return listaLeczonychPacjentow;
    }
    public void dodajPacjenta(Pacjent pacjent){
        listaLeczonychPacjentow.add(pacjent);
    }
}
