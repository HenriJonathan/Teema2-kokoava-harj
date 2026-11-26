public class Main {
    public static void main(String[] args) {

    System.out.println("Työntekijöiden määrä aluksi: " + Tyontekija.getTyontekijoidenMaara());


    Tyontekija anna = new Tyontekija("Anna", 3000.0);
    Myyja matti = new Myyja("Matti", 2500, 500);
    Myyja liisa = new Myyja("Liisa", 2800.0, 650.0);

    
    System.out.println("\nAnnan tiedot;");
    anna.naytaTiedot();
   
    System.out.println("\nMatin tiedot:");
    matti.naytaTiedot();
    matti.naytaMyyntibonus();

    System.out.println("\nLiisan tiedot:");
    liisa.naytaTiedot();
    liisa.naytaMyyntibonus();

    Yritys yritys = new Yritys();

    System.out.println();
    yritys.esitteleTyontekija(anna);

    System.out.println();
    yritys.esitteleTyontekija(matti);


    System.out.println();
    System.out.println("Työntekijöiden määrä nyt: " + Tyontekija.getTyontekijoidenMaara());

 }
}
