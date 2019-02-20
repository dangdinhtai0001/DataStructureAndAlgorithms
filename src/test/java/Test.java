import junit.framework.TestCase;
import lombok.NoArgsConstructor;
import week3.Permutation;
import week3.Subset;
import week3.Sudoku;
import week3.TheKnightTour;
import week4.Graph;

import java.io.FileNotFoundException;

@NoArgsConstructor
public class Test extends TestCase {
   public void testGraph() throws FileNotFoundException {
       Graph graph = new Graph("/home/dinhtai/IdeaProjects/DataStructureAndAlgorithms/src/main/resources/data.txt");
       graph.printGraph();
       graph.DFS(0);
   }

   public void testPermutation(){
       Permutation permutation = new Permutation();
       permutation.recursion(1, permutation.getResult(), permutation.getB());
   }

    public void testSubset(){
        Subset subset = new Subset();
        subset.recursion(1,subset.getResult());
    }

    public void testTheKnightTour(){
        TheKnightTour theKnightTour = new TheKnightTour();
        theKnightTour.recursion(2,2);
    }

    public void testSudoku(){
        Sudoku sudoku = new Sudoku();
        sudoku.Try(0,0);
        sudoku.showMap();

    }
}
