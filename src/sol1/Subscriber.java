package sol1;

// 구독자
public class Subscriber {

    //구독자 이름
    String name;

    Subscriber(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //새 글 알람 받기
    public void update(String post) {
        System.out.println(name + " received an update: " + post);
    }
}
