public class AttendanceReport {
    public static void main(String[] args) {
        int[] a = {20, 25, 30, 15, 40, 35, 20, 10, 45, 50};
        int[] prefix = new int[10];
        prefix[0] = a[0];
        for (int i = 1; i < 10; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
        int start = 3;
        int end = 7;

        if (start >= 1 && start <= end && end <= 10) {
            int total = prefix[end - 1];

            if (start > 1) {
                total = total - prefix[start - 2];
            }

            System.out.println("Total attendance: " + total);
        } else {
            System.out.println("Invalid range");
        }
        int max = a[0], day = 1;

        for (int i = 1; i < 10; i++) {
            if (a[i] > max) {
                max = a[i];
                day = i + 1;
            }
        }

        System.out.println("Highest attendance: " + max);
        System.out.println("Day: " + day);
    }
}