
package MAZE_GAME;
class PAC_MAN {
    MAZE maze;
    ENEMY enemy;
//    PAC_MAN pac_maan;
    int WARNINGS;
    int FOOD_COUNT;
    public  PAC_MAN(MAZE maze,ENEMY enemy){
        this.maze=maze;
        this.enemy=enemy;
//        maze.MAZE_MAKER();
        FOOD_COUNT=0;
        WARNINGS=10;
    }

    public void PAC_MAN(String MOVE){
        while (WARNINGS>0){
            if (MOVE.equals("S")){
                if (maze.n + 1 < maze.bound.length && !maze.bound[maze.n+1][maze.m].equals("🌫️")){
                    PAC_MAN_MOVEMET(1,0);
                    System.out.println("FOOD_COUNT: "+FOOD_COUNT);
                } else {
                    System.out.println("HIT THE BOUNDARY");
                    WARNINGS--;
                    System.out.println("\t\t\t\t\t\t\t\t\tWARNINGS: "+WARNINGS);
                }
            } else if (MOVE.equals("W")) {
                if (maze.n-1>=0 && !maze.bound[maze.n-1][maze.m].equals("🌫️")){
                      PAC_MAN_MOVEMET(-1,0);
                    System.out.println("FOOD_COUNT: "+FOOD_COUNT);
                }else {
                    System.out.println("HIT THE BOUNDARY");
                    WARNINGS--;
                    System.out.println("\t\t\t\t\t\t\t\t\tWARNINGS: "+WARNINGS);
                }
            } else if (MOVE.equals("A")) {
                if (maze.m-1<maze.bound.length && !maze.bound[maze.n][maze.m-1].equals("🌫️")){

                    PAC_MAN_MOVEMET(0,-1);
                    System.out.println("FOOD_COUNT: "+FOOD_COUNT);
                }else {
                    System.out.println("HIT THE BOUNDARY");
                    WARNINGS--;
                    System.out.println("\t\t\t\t\t\t\t\t\tWARNINGS: "+WARNINGS);
                }
            } else if (MOVE.equals("D")) {
                if (maze.m+1<maze.bound.length && !maze.bound[maze.n][maze.m+1].equals("🌫️")){
                    PAC_MAN_MOVEMET(0,1);
                    System.out.println("FOOD_COUNT: "+FOOD_COUNT);
                }else {
                    System.out.println("HIT THE BOUNDARY");
                    WARNINGS--;
                    System.out.println("\t\t\t\t\t\t\t\t\tWARNINGS: "+WARNINGS);
                }
            }
            enemy.ENEMY1_MOVEMENT();
            enemy.ENEMY2_MOVEMENT();
            enemy.ENEMY3_MOVEMENT();
            if (collisionWithEnemy()) {
                System.out.println("\t\t\t\t\t\t\t\t\tYOU COLLIDE WITH ENEMY.\n\t\t\t\t\t\t\t\t\tGAME OVER!");
                return;
            }
            boolean WIN_GAME=checkAllDotsEaten();
            if (WIN_GAME){
                System.out.println("\t\t\t\t\t\t\tYOU WIN");
                break;
            }
            if (WARNINGS == 0) {
                System.out.println("\t\t\t\t\t\t\t\t\tYOU LOOSE ");
                break;
            }
            break;
        }
    }
    private void PAC_MAN_MOVEMET(int CHANGE_IN_N, int CHANGE_IN_M) {
        if (maze.bound[maze.n + CHANGE_IN_N][maze.m + CHANGE_IN_M].equals("🧀")) {
            FOOD_COUNT++;
        }
        maze.bound[maze.n][maze.m] = "♦️";
        maze.n += CHANGE_IN_N;
        maze.m += CHANGE_IN_M;
        maze.bound[maze.n][maze.m] = "🐁";
    }
    public boolean checkAllDotsEaten() {
        for (int i = 0; i < maze.bound.length; i++) {
            for (int j = 0; j < maze.bound[i].length; j++) {
                if (maze.bound[i][j].equals("🧀")) {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean collisionWithEnemy() {
        int[] pacManPosition = {maze.n, maze.m};
        int[] enemy1Position = enemy.getPositionEnemy1();
        int[] enemy2Position = enemy.getPositionEnemy2();
        int[] enemy3Position = enemy.getPositionEnemy3();
        return (comparePositions(pacManPosition, enemy1Position) ||
                comparePositions(pacManPosition, enemy2Position) ||
                comparePositions(pacManPosition, enemy3Position));
    }

    private boolean comparePositions(int[] pos1, int[] pos2) {
        return pos1[0] == pos2[0] && pos1[1] == pos2[1];
    }
}