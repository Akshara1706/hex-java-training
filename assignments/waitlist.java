import java.util.*;
public class waitlist {
    public static void main(String[] args){
        String[] seats = new String[3];
        Queue<String> wait = new LinkedList<>();
        String[] names = {"Asha","Ravi","Meena","Kiran","Pooja"};
        for(String name : names){
            boolean added = false;
            for(int i=0;i<3;i++){
                if(seats[i] == null){
                    seats[i] = name;
                    added = true;
                    break;
                }
            }
            if(!added){
                wait.add(name);
            }
        }
        System.out.println("Seats: " + Arrays.toString(seats));
        System.out.println("Waiting list: " + wait);
        for(int i=0;i<3;i++){
            if("Ravi".equals(seats[i])){
                seats[i] = wait.poll();
                break;
            }
        }
            System.out.println("\nafter ravi leaves:");
            System.out.println("Seats:"+ Arrays.toString(seats));
            System.out.println("Waiting list:"+ wait);
        }
    }