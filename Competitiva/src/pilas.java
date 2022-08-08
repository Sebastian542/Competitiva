import java.util.*;

public class pilas {

    public static Random r = new Random();
    public static int i, j;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte cantidad de datos");
        int n = sc.nextInt();

        System.out.println("6) Pila");
        System.out.println("7) Cola");
        int aux = sc.nextInt();
        switch (aux) {

            case 6:
                pila(n);
                break;

        }
    }
 
    public static void pila(int n) {
        Stack<Integer> mipila = new Stack<>();
        for (i = 0; i < n; i++) {
            mipila.push(r.nextInt(50));
        }
        while (!mipila.isEmpty()) {
            System.out.println(mipila.pop());
        }
    }

}
