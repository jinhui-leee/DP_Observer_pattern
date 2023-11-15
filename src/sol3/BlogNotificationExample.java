package sol3;

public class BlogNotificationExample {
    public static void main(String[] args) {
        // 블로그 생성
        SimpleBlog blog = new SimpleBlog();

        // 구독자 생성 및 블로그에 등록
        Subscriber subscriber1 = new BlogSubscriber("s1");
        Subscriber subscriber2 = new BlogSubscriber("s2");
        Subscriber subscriber3 = new BlogSubscriber("s3");
        Subscriber subscriber4 = new BlogSubscriber("s4");

        blog.addSubscriber(subscriber1);
        blog.addSubscriber(subscriber2);
        blog.addSubscriber(subscriber3);
        blog.addSubscriber(subscriber4);

        // 블로그에 새로운 글이 올라왔을 때 구독자들에게 알림
        blog.writeNewPost("1st post");

        // 구독자1이 구독 취소
        blog.removeSubscriber(subscriber1);

        // 다시 새로운 글이 올라왔을 때 구독자들에게 알림
        blog.writeNewPost("2nd post");

    }
}
