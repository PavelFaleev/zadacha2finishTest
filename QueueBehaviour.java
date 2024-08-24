public interface QueueBehaviour {
    void addPersonToQueue(Person person);   // Добавить человека в очередь
    void removePersonFromQueue();           // Удалить человека из очереди
    void processOrder();                    // Обработка заказа
    void giveOrder();                       // Выдача заказа
}
