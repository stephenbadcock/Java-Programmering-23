public class e2 {
    public static void main(String[] args) {
        int i = 0, count = 0;

        while(i <= 20) {
            i++;

            if(i % 2 != 0) continue;

            System.out.println(i);

            count += i;
        }

        System.out.println("Count: " + count);
    }
}
