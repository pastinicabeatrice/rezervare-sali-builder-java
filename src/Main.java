public class Main {
    public static void main(String[] args) {
        SalaConferinta sala1 = new SalaConferintaBuilder()
                .setNume("Conferinta 1")
                .setCapacitateMax(800)
                .adaugaDotare(DotariSuplimentare.priza)
                .adaugaDotare(DotariSuplimentare.proiector)
                .adaugaDotare(DotariSuplimentare.sistem_audio)
                .adaugaDotare(DotariSuplimentare.internet_rapid)
                .build();
        System.out.println(sala1);

        SalaConferinta sala2 = new SalaConferintaBuilder()
                .setNume("Conferinta 2")
                .setCapacitateMax(100)
                .adaugaDotare(DotariSuplimentare.internet_rapid)
                .build();
        System.out.println(sala2);

        try {
            new SalaConferintaBuilder().setNume("Sala mica").setCapacitateMax(60).build();
        } catch (IllegalArgumentException e) {
            System.out.println("Configuratie respinsa: " + e.getMessage());
        }

        try {
            new SalaConferintaBuilder()
                    .setNume("Sala fara priza")
                    .setCapacitateMax(150)
                    .adaugaDotare(DotariSuplimentare.proiector)
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Configuratie respinsa: " + e.getMessage());
        }
    }
}
