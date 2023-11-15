package sol3;

public interface Blog {

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers();


}
