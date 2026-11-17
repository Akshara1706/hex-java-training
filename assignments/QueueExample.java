import java.util.Queue;
import java.util.ArrayDeque;
public class QueueExample{
    public static void main(String[] args){
        Queue<String> q = new ArrayDeque<>();
        q.add("5");
        q.add("10");
        q.add("15");
        System.out.println(q);
        q.poll();
        System.out.println(q);

    }

}