import java.util.Random;
import java.util.Scanner;

public class TheGame {

    public static char[][] map;
    public static int mapSizeX;
    public static int mapSizeY;
    public static int winCombo = 4;

    public static char human_dot = 'X';
    public static char ai_dot = 'O';
    public static char empty_dot = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createMap(){
        mapSizeX = 5;
        mapSizeY = 5;
        map = new char[mapSizeY][mapSizeX];

                for (int y = 0; y < mapSizeY; y++){
                    for(int x = 0; x < mapSizeX; x++){
                        map[y][x] = empty_dot;
                    }
                }
    }

    public static void printMap(){
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
               System.out.print(map[x][y] + "|");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }


    public static void humanTurn(){
        int x;
        int y;

        do {
            System.out.println("Введите координаты по вертикали");
            x = scanner.nextInt() - 1;
            System.out.println("Введите координаты по горизонтали");
            y = scanner.nextInt() - 1;

        } while (!isValidCell(y,x) || !isEmptyCell(y,x));
        map[y][x] = human_dot;

    }


    public static boolean isEmptyCell(int y, int x) {
        return map[y][x] == empty_dot;
    }

    public static boolean isValidCell(int y, int x) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }


    public static boolean fullMap(){
        for (int y = 0; y < mapSizeY; y++){
            for (int x = 0; x < mapSizeX; x++){
                if (map[y][x] == empty_dot){
                    return false;
                }
            }
        }
        return true;
    }


    public static void aiTurn(){
        int k = 6;
        int l = 6;

         for (int y = 0; y < mapSizeY; y++){
             for (int x = 0; x < mapSizeX; x++){
                 for (int i = 0; i < 3; i++) {
                     for (int j = 0; j < 3; j++) {
                         if (isValidCell(y+3*(i-1), x+3*(j-1)) && isEmptyCell(y+3*(i-1), x+3*(j-1)) && (vector(y,x,(i-1),(j-1),ai_dot,3) || vector(y,x,(i-1),(j-1),human_dot,3))){
                             k = y + 3 * (i - 1);
                             l = x + 3 * (j - 1);
                         }
                     }
                 }
             }
         }
         if (k + l == 12) do {
                 k = random.nextInt(mapSizeX);
                 l = random.nextInt(mapSizeY);
             } while (!isEmptyCell(k,l));

        map[k][l] = ai_dot;
        System.out.println("Ход компьютера: [" + (l + 1) + ";" + (k + 1) + "]");
     }




     public static boolean win(char currentPlayer){
        for (int y = 0; y < mapSizeY; y++){
            for (int x = 0; x < mapSizeX; x++){
              if (vector(y,x,1,0,currentPlayer,winCombo)) return true;  //горизонталь
              if (vector(y,x,1,1,currentPlayer,winCombo)) return true;  //диагональ правая
              if (vector(y,x,0,1,currentPlayer,winCombo)) return true;  //вертикаль
              if (vector(y,x,1,-1,currentPlayer,winCombo)) return true; //диагональ левая
            }
        }
        return false;
     }

     public static boolean vector(int y, int x, int vy, int vx, char currentPlayer,int vectorLength){
         int end_y = y + (vectorLength - 1)*vy;
         int end_x = x + (vectorLength - 1)*vx;
         if (!isValidCell(end_y,end_x)) return false;
         for (int i = 0; i < vectorLength; i++){
             if (map[y+i*vy][x+i*vx] != currentPlayer) return false;
         }
         return true;
    }

    public static void main(String[] args) {
        createMap();
        printMap();

        while (true){
            humanTurn();
            printMap();
            if (win(human_dot)){
                System.out.println("Вы выйграли!");
                break;
            }
            if (fullMap()){
                System.out.println("Ходы закончились. Ничья.");
                break;
            }
            aiTurn();
            printMap();
            if (win(ai_dot)){
                System.out.println("Компьютер выйграл!");
                break;
            }
            if (fullMap()){
                System.out.println("Ходы закончились. Ничья.");
                break;
            }
        }

    }

}
