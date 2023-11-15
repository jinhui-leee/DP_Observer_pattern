package sol1;

// 블로그
public class Blog {

    private String post;



    public void writeNewPost(String post) {
        this.post = post;
        System.out.println("New Blog Post: " + post);
    }

    public void notifySubscribers(Subscriber subscriber) {
        subscriber.update(post);
    }

}
