
public class HamiltonianCycle {

    final int V = 5;
    int path[];
    public boolean isSafe(int v, int graph[][], int path[], int pos)
    {
        if (graph[path[pos - 1]][v] == 0)
            return false;

        for (int i = 0; i < pos; i++)
            if (path[i] == v)
                return false;

        return true;
    }


    public boolean hamCycleUtil(int graph[][], int path[], int pos)
    {

        if (pos == V)
        {

            if (graph[path[pos - 1]][path[0]] == 1)
                return true;
            else
                return false;
        }


        for (int v = 0; v < V; v++)
        {

            if (isSafe(v, graph, path, pos))
            {
                path[pos] = v;


                if (hamCycleUtil(graph, path, pos + 1) == true)
                    return true;


                path[pos] = -1;
            }
        }


        return false;
    }


    public int hamiltonCycle(int graph[][])
    {
        path = new int[V];
        for (int i = 1; i < V; i++)
            path[i] = -1;


        path[0] = 0;
        if (hamCycleUtil(graph, path, 1) == false)
        {
            System.out.println("\nSolution does not exist");
            return 0;
        }

        print(path);
        return 1;
    }


    public  void print(int path[])
    {
        System.out.println("Solution Exists: Following" + " is one Hamiltonian Cycle");
        for (int i = 1; i < V; i++)
            System.out.print(" " + path[i] + " ");


        System.out.println(" " + path[0] + " ");
    }


    public static void main(String args[])
    {
        HamiltonianCycle hamiltonian = new HamiltonianCycle();

        int g1[][] = {
                    {0, 1, 0, 1, 0},
                    {1, 0, 1, 1, 1},
                    {0, 1, 0, 0, 1},
                    {1, 1, 0, 0, 1},
                    {0, 1, 1, 1, 0},
        };


        hamiltonian.hamiltonCycle(g1);


        int g2[][] =   {
                            {0, 1, 0, 1, 0},
                            {1, 0, 1, 1, 1},
                            {0, 1, 0, 0, 1},
                            {1, 1, 0, 0, 0},
                            {0, 1, 1, 0, 0},
        };


        hamiltonian.hamiltonCycle(g2);
    }
}