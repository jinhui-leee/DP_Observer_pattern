package sol3;

import java.util.ArrayList;
import java.util.List;

public class SimpleBlog implements Blog{

    private List<Subscriber> subscribers = new ArrayList<>();
    private String post;

    //구독자 등록
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    //구독자 제거
    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    //새로운 글이 올라왔을 때 구독자들에게 알림
    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(post);
        }
    }

    // 새로운 글 작성
    public void writeNewPost(String postContent) {
        this.post = postContent;
        System.out.println("New Blog Post: " + postContent);
        //바로 새로운 글을 구독자에게 알림
        notifySubscribers();
    }
}
