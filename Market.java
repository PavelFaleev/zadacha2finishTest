import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Person> queue;

    public Market() {
        this.queue = new LinkedList<>();
    }

    // Реализация методов из QueueBehaviour
    @Override
    public void addPersonToQueue(Person person) {
        queue.add(person);
        System.out.println(person.getName() + " добавлен в очередь.");
    }

    @Override
    public void removePersonFromQueue() {
        Person person = queue.poll();
        if (person != null) {
            System.out.println(person.getName() + " удален из очереди.");
        } else {
            System.out.println("Очередь пуста.");
        }
    }

    @Override
    public void processOrder() {
        if (!queue.isEmpty()) {
            Person person = queue.peek();
            System.out.println("Заказ обрабатывается для " + person.getName());
        } else {
            System.out.println("Нет заказов для обработки.");
        }
    }

    @Override
    public void giveOrder() {
        if (!queue.isEmpty()) {
            Person person = queue.peek();
            System.out.println("Заказ выдан для " + person.getName());
        } else {
            System.out.println("Нет заказов для выдачи.");
        }
    }

    // Реализация методов из MarketBehaviour
    @Override
    public void acceptToMarket(Person person) {
        addPersonToQueue(person);
    }

    @Override
    public void releaseFromMarket(Person person) {
        removePersonFromQueue();
    }

    @Override
    public void update() {
        processOrder();
        giveOrder();
    }
}