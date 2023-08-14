public class Card {
    public double balance;

    public Card(double balance) {
        this.balance = balance;
    }
    public void charge(double charge) {
        if (this.balance >= charge) {
            this.balance -= charge;
            System.out.println("Uspješno je skinut iznos od " + charge + " KM sa računa. Trenutno stanje računa je " + this.balance + " KM");
        } else {
            System.out.println("Nedovoljno sredstva na računu, isplata se nažalost ne može izvršiti");
        }
    }
}
