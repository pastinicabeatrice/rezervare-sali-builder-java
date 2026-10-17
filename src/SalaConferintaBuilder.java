public class SalaConferintaBuilder implements IBuilder {
    private final SalaConferinta salaConferinta = new SalaConferinta();

    public SalaConferintaBuilder setNume(String nume) {
        salaConferinta.setNume(nume);
        return this;
    }

    public SalaConferintaBuilder setCapacitateMax(int capacitateMax) {
        salaConferinta.setCapacitateMax(capacitateMax);
        return this;
    }

    public SalaConferintaBuilder adaugaDotare(DotariSuplimentare dotare) {
        salaConferinta.adaugaDotare(dotare);
        return this;
    }

    @Override
    public SalaConferinta build() {
        if (salaConferinta.getNume() == null) {
            throw new IllegalStateException("Numele salii este obligatoriu");
        }
        if (salaConferinta.getCapacitateMax() == 0) {
            throw new IllegalStateException("Capacitatea maxima este obligatorie");
        }
        if (salaConferinta.getDotari().contains(DotariSuplimentare.proiector)
                && !salaConferinta.getDotari().contains(DotariSuplimentare.priza)) {
            throw new IllegalStateException("O sala cu proiector trebuie sa aiba priza dedicata");
        }
        return salaConferinta;
    }
}
