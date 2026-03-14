public class Assignment{
  public static void main(String [] args){
        int n = 4;
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int t = i;
                int l = j;
                int r = size - 1 - j;
                int b = size - 1 - i;

                int min = Math.min(Math.min(t, b), Math.min(l, r));
                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
  }
}
