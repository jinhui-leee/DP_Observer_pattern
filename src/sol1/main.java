package sol1;

public class main {
    public static void main(String[] args) {

        //블로그 생성
        Blog blog = new Blog();

        //구독자 생성(4)
        Subscriber subscriber1 = new Subscriber("s1");
        Subscriber subscriber2 = new Subscriber("s2");
        Subscriber subscriber3 = new Subscriber("s3");
        Subscriber subscriber4 = new Subscriber("s4");

        //블로그의 새 글
        blog.writeNewPost("1st post");

        //s1~s4의 알람 받기
        blog.notifySubscribers(subscriber1);
        blog.notifySubscribers(subscriber2);
        blog.notifySubscribers(subscriber3);
        blog.notifySubscribers(subscriber4);

        //블로그의 새 글
        blog.writeNewPost("2nd post");

        //subscriber3가 더 이상 구독을 하고 싶지 않은 상황
        //blog에서 subscriber 직접 관리 불가
        blog.notifySubscribers(subscriber1);
        blog.notifySubscribers(subscriber2);
        blog.notifySubscribers(subscriber4);




    }


}
