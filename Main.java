public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        market.acceptToMarket(person1);
        market.acceptToMarket(person2);

        market.update();

        market.releaseFromMarket(person1);

        market.update();
    }
}