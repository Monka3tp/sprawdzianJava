import java.time.LocalDate;
import java.util.Objects;

public class Pacjent {

    private String imie;
    private String nazwisko;
    private LocalDate dataPrzyjecia;
    private String choroba;

    public Pacjent(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataPrzyjecia = LocalDate.now();
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataPrzyjecia() {
        return dataPrzyjecia;
    }

    public String getChoroba() {
        return choroba;
    }

    @Override
    public String toString() {
        return String.format("Imię pacjenta " + imie + "\n" +
                "Nazwisko pacjenta " + nazwisko + "\n" +
                "Data przyjęcia " + dataPrzyjecia + "\n" +
                "Choroba " + choroba);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pacjent pacjent = (Pacjent) o;
        return Objects.equals(imie, pacjent.imie) && Objects.equals(nazwisko, pacjent.nazwisko) && Objects.equals(dataPrzyjecia, pacjent.dataPrzyjecia) && Objects.equals(choroba, pacjent.choroba);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, dataPrzyjecia, choroba);
    }
}
