package sol2;


public class main {
    public static void main(String[] args) {

        //블로그 생성
        Blog blog = new Blog();

        //구독자 생성(4)
        Subscriber subscriber1 = new Subscriber("s1");
        Subscriber subscriber2 = new Subscriber("s2");
        Subscriber subscriber3 = new Subscriber("s3");
        Subscriber subscriber4 = new Subscriber("s4");

        blog.addSubscriber(subscriber1);
        blog.addSubscriber(subscriber2);
        blog.addSubscriber(subscriber3);
        blog.addSubscriber(subscriber4);


        //블로그의 새 글
        blog.writeNewPost("1st post");

        // 블로그에 새 글이 올라오면 바로 알람이 가는 것이 아님
        //구독자들에게 알람 보내기
        blog.notifySubscribers();

        //s1, s2 구독 취소
        blog.removeSubscriber(subscriber1);
        blog.removeSubscriber(subscriber2);

        //블로그의 새 글
        blog.writeNewPost("2nd post");

        //구독자들에게 알람 보내기
        blog.notifySubscribers();

    }
}
