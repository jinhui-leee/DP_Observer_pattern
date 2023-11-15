package sol3;

// 구독자(ConcreteObserver) 클래스
class BlogSubscriber implements Subscriber {

    private String name;

    public BlogSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String newPost) {
        System.out.println(name + " received an update: " + newPost);
    }
}