import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public class SalaConferinta {
    public static final int CAPACITATE_MINIMA = 50;

    private String nume;
    private int capacitateMax;
    private final Set<DotariSuplimentare> dotari = EnumSet.noneOf(DotariSuplimentare.class);

    SalaConferinta() {
    }

    public String getNume() {
        return nume;
    }

    void setNume(String nume) {
        if (nume == null || nume.isBlank()) {
            throw new IllegalArgumentException("Sala trebuie sa aiba un nume");
        }
        this.nume = nume;
    }

    public int getCapacitateMin() {
        return CAPACITATE_MINIMA;
    }

    public int getCapacitateMax() {
        return capacitateMax;
    }

    void setCapacitateMax(int capacitateMax) {
        if (capacitateMax < 2 * CAPACITATE_MINIMA) {
            throw new IllegalArgumentException(
                    "Capacitatea maxima trebuie sa fie de cel putin " + (2 * CAPACITATE_MINIMA) + " de persoane");
        }
        this.capacitateMax = capacitateMax;
    }

    public Set<DotariSuplimentare> getDotari() {
        return Collections.unmodifiableSet(dotari);
    }

    void adaugaDotare(DotariSuplimentare dotare) {
        if (dotare != null) {
            dotari.add(dotare);
        }
    }

    @Override
    public String toString() {
        return "Sala " + nume + " (capacitate " + CAPACITATE_MINIMA + "-" + capacitateMax + " persoane, dotari: "
                + (dotari.isEmpty() ? "standard" : dotari) + ")";
    }
}
