package MAZE_GAME;

import java.util.Scanner;

public class GAME {
    public static void main(String[] args) {
        System.out.println("\u001B[1m\u001B[31m\t\t\t\t\t\t\t\t THE GREAT RAT ESCAPE GAME 🐁\u001B[0m");
        System.out.println("\u001B[1m\u001B[31m\t\t\t\t\t\t\t\t\t YOU HAVE 10 WARNINGS\u001B[0m");
        System.out.println("dKEYS:\n W➡️UP\n S➡️DOWN\n D➡️RIGHT\n A➡️LEFT\u001B[0m");
        System.out.println("\t\t\t\t\t\t\t\t\t\tWARNINGS 10");
        MAZE global_Board = new MAZE();
        ENEMY global_enemy = new ENEMY(global_Board);
        global_Board.MAZE_MAKER();

        PAC_MAN global_pac_man = new PAC_MAN(global_Board, global_enemy);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\nENTER MOVE: ");
            String CONTROLLED_MOVE = sc.next();
            global_pac_man.PAC_MAN(CONTROLLED_MOVE.toUpperCase());
            global_enemy.ENEMY1_MOVEMENT();
            global_enemy.ENEMY2_MOVEMENT();
            global_enemy.ENEMY3_MOVEMENT();

            if (global_pac_man.WARNINGS == 0 || global_pac_man.checkAllDotsEaten()) {
                break;
            }
            printMaze(global_Board);
        }
    }

    public static void printMaze(MAZE maze) {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(maze.bound[i][j] + " ");
            }
            System.out.println();
        }
    }
}
