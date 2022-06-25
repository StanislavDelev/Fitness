public class Exercises {
    Topic topic = new Topic();
    Observer viewer1 = new TopicSubscriber("Viewer1");
    Observer viewer2 = new TopicSubscriber("Viewer2");
    Observer viewer3 = new TopicSubscriber("Viewer3");



    public void Laying() {

        topic.subscribe(viewer1);
        topic.subscribe(viewer2);
        topic.subscribe(viewer3);

        topic.setTopic("Laying");

    }

    public void Standing() {

        topic.subscribe(viewer1);
        topic.subscribe(viewer2);
        topic.subscribe(viewer3);

        topic.setTopic("Standing");
    }
}
