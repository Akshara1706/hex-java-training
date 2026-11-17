import java.util.*;
public class QueueArrayDeque{
    public static void main(String[] args){
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(100);
        q.offer(150);
        q.offer(200);
        System.out.println(q);
        System.out.println(q);
        q.poll();
        System.out.println(q);
    }
}