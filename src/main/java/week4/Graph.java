package week4;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Getter
@Setter
public class Graph {
    private int[][] graph;
    private int n;

    private boolean[] visited ;

    public Graph(String path) throws FileNotFoundException {
        initGraph(path);
        visited = new boolean[n];
    }

    //Hàm lấy ma trận kề của đồ thị từ tệp
    public void initGraph(String filePath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filePath));
        n = Integer.parseInt(scanner.nextLine());
        graph = new int[n][n];
        String[] line;
        for (int i = 0; i < n; i++) {
            line = scanner.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(line[j]);
            }
        }
    }

    @SuppressWarnings("Duplicates")
    public void printGraph() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void DFS(int v){
        System.out.println(v);
        visited[v] = true;
        for (int i = 0; i < n; i++) {
            if(visited[i] == false && graph[v][i] != 0)
                DFS(i);
        }
    }

}
/**
 * Suppose that a graph G = (V, E) is represented by an adjacency matrix of size n × n : (a[i, j])n×n.
 * Let visit(u) is a function which visits a node u.
 * Let visited[1..n] be a boolean array which marks whether a node u has been already visited.
 *  visited[u] = 1 if u has been visited
 *  visited[u] = 0 otherwise
 * Initially, visited[u] = 0, for all u = 1,...,n.
 */
