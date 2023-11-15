package sol2;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    //구독자 리스트
    private List<Subscriber> subscribers = new ArrayList<>();

    //블로그 글
    private String post;

    //구독자 추가
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    //구독자 제거
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void writeNewPost(String post) {
        this.post = post;
        System.out.println("New Blog Post: " + post);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(post);
        }
    }
}
