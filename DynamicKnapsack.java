package Dynamic;


public class DynamicKnapsack {
        public static int max(int a, int b) {
            return (a > b) ? a : b;
        }



      public  static int knapSackProb(int C, int weight[], int profit[], int n) {
            int i, w;
            int K[][] = new int[n + 1][C + 1];

            for (i = 0; i <= n; i++) {
                for (w = 0; w <= C; w++) {
                    if (i == 0 || w == 0)
                        K[i][w] = 0;
                    else if (weight[i - 1] <= w)
                        K[i][w] = max(profit[i - 1] + K[i - 1][w - weight[i - 1]], K[i - 1][w]);
                    else
                        K[i][w] = K[i - 1][w];

//
//                    System.out.println(K[i][w]);

                }

            }
            return K[n][C];
        }


        public static void main(String args[]) {
            int Profit[] = new int[]{40, 90, 100};
            int weight[] = new int[]{50, 30, 40};
            int Capacity = 50;
            int n = Profit.length;
            System.out.println("Maximum profit is :->  "+knapSackProb(Capacity, weight, Profit, n));
        }
    }



