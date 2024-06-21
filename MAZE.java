package MAZE_GAME;
class MAZE {
    String[][] bound;
    int n,m;
    public MAZE(){
         bound = new String[12][12];
         n=2;
         m=2;
    }
    public void MAZE_MAKER() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (i == 0 || i == 11 || j == 0 || j == 11) {
                    bound[i][j] = "🌫️";
                } else if (i == 4 && j > 4 && j < 11) {
                    bound[i][j] = "🌫️";
                } else if (i == 7 && j > 1 && j < 11) {
                    bound[i][j] = "🌫️";
                } else if (i == 9 && j > 6 && j < 11) {
                    bound[i][j] = "🌫️";
                } else if (j == 12 && i > 1 && i < 5) {
                    bound[i][j] = "🌫️";
                } else if (j == 2 && i > 6 && i < 10) {
                    bound[i][j] ="🌫️";
                } else {
                    bound[i][j] = "🧀";
                }
            }
        }
        bound[n][m]="🐁";
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(bound[i][j] + " ");
            }
            System.out.println();
        }
    }
    public String[][] getMazeState() {
        return bound;
    }

    }

