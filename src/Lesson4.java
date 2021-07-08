import javax.management.MBeanRegistration;
import javax.print.Doc;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static char[][] map;
    public static final int SIZE=5;
    public static final int DOTS_TO_WIN=4;

    public static final char DOT_EMPTY='.';
    public static final char DOT_X='X';
    public static final char DOT_O='O';

    public static void main(String[] args) {
        initMap();
        printMAp();

        while (true){
            humanTurn();
            printMAp();
            if(isWinner(DOT_X)){
                System.out.println("Human is the winner");
                break;
            }
            if(isMapFull()){
                System.out.println("EVEN");
                break;
            }
            //aiTurn();
            printMAp();
            if(isWinner(DOT_O)){
                System.out.println("T-1000 is the winner");
                break;
            }
            if(isMapFull()){
                System.out.println("EVEN");
                break;
            }

        }

        System.out.println("THE VERY END");
    }

    public  static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j]= DOT_EMPTY;
            }
        }
    }

    public static void printMAp(){
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i+" ");
        }

        System.out.println();

        for (int i = 0; i <SIZE; i++) {
            System.out.print((i+1)+" ");
            for (int j = 0; j <SIZE ; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void humanTurn(){
        Scanner scanner=new Scanner(System.in);
        int x;
        int y;

        do {
            System.out.println("Введите X и Y");

            x = scanner.nextInt()-1;
            y = scanner.nextInt()-1;
        }while (!(isCellValid(x,y)));
        map[x][y]= DOT_X;
    }

    public static void aiTurn(){
        Random random =new Random();
        int x;
        int y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }while (!(isCellValid(x,y)));

        System.out.println("AI походил в точку "+(x+1)+" "+(y+1));
        map[x][y]= DOT_O;

    }

    public static boolean isCellValid(int x, int y){
        if(x<0 || x>=SIZE || y < 0 || y >= SIZE){
            return false;
        }

        if (map[y][x] == DOT_EMPTY){
            return true;
        }

        return false;
    }

    public static boolean isWinner(char symb)
            /*
    {

        //

        for (int str = 0; str < map.length; str++) {
            int counterStrings=0;
            int counterColumns=0;
            for (int clm = 0; clm< map.length; clm++) {
                if (map[str][clm]==symb)counterStrings++;
                else counterStrings=0;

                if (map[clm][str]==symb)counterColumns++;
                else counterColumns=0;
            }
            if (counterColumns== DOTS_TO_WIN || counterStrings== DOTS_TO_WIN)return true;
        }

        //

            for (int i = 0; i< map.length; i++) {
                int main=0;
                int side=0;

                if (map[i][i]==symb)main++;
                else main=0;

                if (map[i][map.length-1-i]==symb)side++;
                else side=0;

                if (main== DOTS_TO_WIN || side== DOTS_TO_WIN)return true;
            }






        return false;
    }
     */
    {
        int endOfOffset = map.length - DOTS_TO_WIN;

        for (int rowOffset = 0; rowOffset <= endOfOffset; rowOffset++)
        {
            if (isDiagonalsFilledWith(symb, rowOffset))
            {
                return true;
            }

            for (int columnOffset = 0; columnOffset <= endOfOffset; columnOffset++)
            {
                boolean hasWin =
                        isLinesFilledWith(symb, rowOffset, columnOffset);

                if (hasWin)
                {
                    return true;
                }
            }
        }

        return false;
    }

    static boolean isLinesFilledWith(char symb, int rowOffset, int columnOffset)
    {
        for (int row = rowOffset; row < (DOTS_TO_WIN + rowOffset); row++)
        {
            int horizontalWinCounter = 0;
            int verticalWinCounter = 0;

            for (int column = columnOffset; column < (DOTS_TO_WIN + columnOffset); column++)
            {
                // проверка горизонтали
                if (map[row][column] == symb)
                {
                    horizontalWinCounter++;
                }
                else
                {
                    horizontalWinCounter = 0;
                }

                // проверка вертикали
                if (map[column][row] == symb)
                {
                    verticalWinCounter++;
                }
                else
                {
                    verticalWinCounter = 0;
                }
            }

            if ((horizontalWinCounter == DOTS_TO_WIN) || (verticalWinCounter == DOTS_TO_WIN))
            {
                return true;
            }
        }

        return false;
    }

    static boolean isDiagonalsFilledWith(char symb, int rowOffset)
    {
        int mainDiagonalCounter = 0;
        int sideDiagonalCounter = 0;

        final int subSquareLength = (DOTS_TO_WIN + rowOffset);

        for (int row = rowOffset; row < subSquareLength; row++)
        {
            // проверка главной диагонали
            if (map[row][row] == symb)
            {
                mainDiagonalCounter++;
            }
            else
            {
                mainDiagonalCounter = 0;
            }

            // проверка побочной диагонали
            if (map[row][map.length - 1 - row] == symb)
            {
                sideDiagonalCounter++;
            }
            else
            {
                sideDiagonalCounter = 0;
            }
        }

        return (mainDiagonalCounter == DOTS_TO_WIN) || (sideDiagonalCounter == DOTS_TO_WIN);
    }


    public static boolean isMapFull(){
        for (int i = 0; i <SIZE; i++) {
            for (int j = 0; j <SIZE ; j++) {
                if(map[i][j]==DOT_EMPTY){
                return  false;
                }
            }
        }
        return true;
    }
}
