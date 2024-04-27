
public class pattern {
    public static void main(String[] args) {
        String[] a = { "*", "  *", "    *", "  *" };
        int n = 11;
        int loop = 0;
        int index = 0;
        while (loop != n) {
            for (index = 0; index < 4; index++) {
                System.out.println(a[index]);
                loop++;
                if (loop == n) {
                    break;
                }
            }
        }
    }
}
