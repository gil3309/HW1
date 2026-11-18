public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }

        int[] distances = new int[m.length];
        distances[i] = 1;

        for (int step = 1; step < m.length; step++) {
            for (int k = 0; k < m.length; k++) {
                if (distances[k] == step) {
                    for (int l = 0; l < m.length; l++) {
                        if (m[k][l] == 1 && distances[l] == 0) {
                            distances[l] = step + 1;
                            if (l == j) {
                                return step;
                            }
                        }
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}