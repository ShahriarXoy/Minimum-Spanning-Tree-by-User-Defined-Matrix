import java.util.Arrays;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class MST {


    public void MST1(int G[][], int V) {
        int MAX = 9999999;
        int E;
        boolean[] selected = new boolean[V];
        Arrays.fill(selected, false);
        E = 0;
        selected[0] = true;
        System.out.println("Edge : Weight");
        while (E < V - 1) {
            int min = MAX;
            int x = 0;
            int y = 0;
            for (int i = 0; i < V; i++) {
                if (selected[i] == true) {
                    for (int j = 0; j < V; j++) {
                        if (!selected[j] && G[i][j] != 0) {
                            if (min > G[i][j]) {
                                min = G[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }
            System.out.println(x + " - " + y + " : " + G[x][y]);
            selected[y] = true;
            E++;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MST g = new MST();
        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        int[][] G = new int[V][V];
        System.out.println("Enter the adjacency matrix for the graph :");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                G[i][j] = scanner.nextInt();

            }
        }
        g.MST1(G, V);
    }
}