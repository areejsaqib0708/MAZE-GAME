
package MAZE_GAME;
import java.util.Random;
public class ENEMY {
    Random random = new Random();
    int[][] POSITIONS_OF_ENEMY1 = {{3, 6},{3, 7},{3, 8}};
    int[][] POSITIONS_OF_ENEMY2 = {{8, 4},{8, 5}};
    int[][]POSITIONS_OF_ENEMY3={{4,1},{5,1}};
    int currentPositionIndexEnemy1 = 0;
    int currentPositionIndexEnemy2 = 0;
    int currentPositionIndexEnemy3 = 0;

    MAZE maze;
    public ENEMY(MAZE maze) {
        this.maze = maze;
        int[] initialPositionEnemy1 = POSITIONS_OF_ENEMY1[currentPositionIndexEnemy1];
        int[] initialPositionEnemy2 = POSITIONS_OF_ENEMY2[currentPositionIndexEnemy2];
        int[] initialPositionEnemy3 = POSITIONS_OF_ENEMY2[currentPositionIndexEnemy3];
        maze.bound[initialPositionEnemy1[0]][initialPositionEnemy1[1]] = "\uD83D\uDC08";
        maze.bound[initialPositionEnemy2[0]][initialPositionEnemy2[1]] = "\uD83D\uDC08";
        maze.bound[initialPositionEnemy3[0]][initialPositionEnemy3[1]] = "\uD83D\uDC08";
    }
    public int[] getPositionEnemy1() {
        return POSITIONS_OF_ENEMY1[currentPositionIndexEnemy1];
    }

    public int[] getPositionEnemy2() {
        return POSITIONS_OF_ENEMY2[currentPositionIndexEnemy2];
    }
    public int[] getPositionEnemy3() {
        return POSITIONS_OF_ENEMY2[currentPositionIndexEnemy3];
    }
    public void ENEMY1_MOVEMENT() {
        int[] currentPosition = POSITIONS_OF_ENEMY1[currentPositionIndexEnemy1];
        if (maze.bound[currentPosition[0]][currentPosition[1]].equals("🧀")) {
            maze.bound[currentPosition[0]][currentPosition[1]] = "🧀";
        } else {
            maze.bound[currentPosition[0]][currentPosition[1]] = "🧀";
        }
        int randomIndex = random.nextInt(3);
        currentPositionIndexEnemy1 = (currentPositionIndexEnemy1 + randomIndex) % 2;
        int[] newPosition = POSITIONS_OF_ENEMY1[currentPositionIndexEnemy1];
        if (maze.bound[newPosition[0]][newPosition[1]].equals("🧀")) {
            maze.bound[newPosition[0]][newPosition[1]] = "\uD83D\uDC08";
        }
        COLLISION_WITH_PACMAN(newPosition);
    }
    public void ENEMY2_MOVEMENT() {
        int[] currentPosition = POSITIONS_OF_ENEMY2[currentPositionIndexEnemy2];
        if (maze.bound[currentPosition[0]][currentPosition[1]].equals("🧀")) {
            maze.bound[currentPosition[0]][currentPosition[1]] = "🧀";
        } else {
            maze.bound[currentPosition[0]][currentPosition[1]] ="🧀";
        }
        int randomIndex = random.nextInt(3);
        currentPositionIndexEnemy2 = (currentPositionIndexEnemy2 + randomIndex) % 2;
        int[] newPosition = POSITIONS_OF_ENEMY2[currentPositionIndexEnemy2];
        if (maze.bound[newPosition[0]][newPosition[1]].equals("🧀")) {
            maze.bound[newPosition[0]][newPosition[1]] = "\uD83D\uDC08";
        }
        COLLISION_WITH_PACMAN(newPosition);
    }
    public void ENEMY3_MOVEMENT() {
        int[] currentPosition = POSITIONS_OF_ENEMY3[currentPositionIndexEnemy3];
        if (maze.bound[currentPosition[0]][currentPosition[1]].equals("🧀")) {
            maze.bound[currentPosition[0]][currentPosition[1]] = "🧀";
        } else {
            maze.bound[currentPosition[0]][currentPosition[1]] = "🧀";
        }
        int randomIndex = random.nextInt(3);
        currentPositionIndexEnemy3 = (currentPositionIndexEnemy3 + randomIndex) % 2;
        int[] newPosition = POSITIONS_OF_ENEMY3[currentPositionIndexEnemy3];
        if (maze.bound[newPosition[0]][newPosition[1]].equals("🧀")) {
            maze.bound[newPosition[0]][newPosition[1]] = "\uD83D\uDC08";
        }
        COLLISION_WITH_PACMAN(newPosition);
    }
    private void COLLISION_WITH_PACMAN(int[] newPosition) {
        int pacManX = maze.n;
        int pacManY = maze.m;
        if (newPosition[0] == pacManX && newPosition[1] == pacManY) {
            System.out.println("\t\t\t\t\t\t\t\u001B[1m\u001B[32mUH-OH! LOOKS LIKE THE CAT CAUGHT ITS DINNER!.\n\t\t\t\t\t\t\t\t\t\tGAME OVER!\u001B[0m\u001B[0m");
            System.exit(0);
        }
    }
}



