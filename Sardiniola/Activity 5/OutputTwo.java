public class OutputTwo{
    public static void main (String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > 0; j--) {
                if (i <= j) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}