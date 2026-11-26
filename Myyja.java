public class Myyja extends Tyontekija{

private double myyntibonus = 0;

public Myyja(String nimi, double palkka, double myyntibonus){
    super(nimi, palkka);
    
    
    if(myyntibonus > 0){
        this.myyntibonus = myyntibonus;
    }
    else{
        this.myyntibonus = 0;
    }
}

public void naytaMyyntibonus(){
    System.out.println("Myyntibonus: " + myyntibonus + " euroa");

}




    
}