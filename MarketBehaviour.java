public interface MarketBehaviour {
    void acceptToMarket(Person person);     // Принять человека в магазин
    void releaseFromMarket(Person person);  // Выпустить человека из магазина
    void update();                          // Обновить состояние магазина
}