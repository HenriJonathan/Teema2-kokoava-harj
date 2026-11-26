public class Tyontekija {
    
private String nimi;
private double palkka;
private static int tyontekijoidenMaara = 0;

public Tyontekija(String nimi, double palkka){
    this.nimi = nimi;
    
    if(palkka > 0){
        this.palkka = palkka;
    }
    else{
        this.palkka = 0;
    }

     tyontekijoidenMaara++;
}

public void naytaTiedot(){
    System.out.println("Työntekijä: " + nimi);
    System.out.println("Kuukausipalkka: " + palkka + " euroa");
}

public String getNimi(){
    return nimi;
}

public double getPalkka(){
    return palkka;
}

public static int getTyontekijoidenMaara(){
    return tyontekijoidenMaara;
}





}
