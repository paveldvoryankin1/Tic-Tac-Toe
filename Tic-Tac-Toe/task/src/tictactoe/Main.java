package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] field = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = " ";
            }
        }
        printField(field);
        String gameActive = "Not finished";
        int turn = 0;
        while (gameActive.equals("Not finished")) {
            if (turn % 2 == 0) {
                newPosition(field, "X");
            } else {
                newPosition(field, "O");
            }
            printField(field);
            gameActive = stillPlaying(field);
            turn++;
        }
        System.out.println(stillPlaying(field));
    }

    public static void printField(String[][] field) {
        System.out.println("---------");
        System.out.print("| ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.println(field[i][j] + " |");
                    if (i != 2) {
                        System.out.print("| ");
                    }
                } else {
                    System.out.print(field[i][j] + " ");
                }
            }
        }
        System.out.println("---------");
    }

    public static String[][] newPosition(String[][] field, String tictac) {
        Scanner scanner = new Scanner(System.in);
        boolean badCoordinates = true;
        while (badCoordinates) {
            System.out.print("Enter the coordinates: ");
            String userX = scanner.next();
            String userY = scanner.next();
            if (!("123456789".contains(userX)) || !("123456789".contains(userY))) {
                System.out.println("You should enter numbers!");
            } else {
                int x = Integer.parseInt(userX);
                int y = Integer.parseInt(userY);
                if (x < 1 || x > 3 || y < 1 || y > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else {
                    x--;
                    y--;
                    if (!field[x][y].equals(" ")) {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        field[x][y] = tictac;
                        badCoordinates = false;
                    }
                }
            }
        }
        return field;
    }

    public static String stillPlaying (String[][] field) {
        boolean xWins = false;
        boolean oWins = false;
        int countXRow = 0;
        int countORow = 0;
        int countXColumn = 0;
        int countOColumn = 0;
        int countXDiag = 0;
        int countODiag = 0;
        int countEmpty = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("X")) {
                    countXRow++;
                } else if (field[i][j].equals("O")) {
                    countORow++;
                } else {
                    countEmpty++;
                }

            }
            if (countXRow == 3) {
                xWins = true;
            }
            if (countORow == 3) {
                oWins = true;
            }
            countXRow = 0;
            countORow = 0;
        }

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                if (field[i][j].equals("X")) {
                    countXColumn++;
                } else if (field[i][j].equals("O")) {
                    countOColumn++;
                }
            }
            if (countXColumn == 3) {
                xWins = true;
            }
            if (countOColumn == 3) {
                oWins = true;
            }
            countXColumn = 0;
            countOColumn = 0;
        }

        for (int i = 0; i < 3; i++) {
            if (field[i][i].equals("X")) {
                countXDiag++;
            } else if (field[i][i].equals("O")) {
                countODiag++;
            }
        }

        if (countXDiag == 3) {
            xWins = true;
        }
        if (countODiag == 3) {
            oWins = true;
        }

        countXDiag = 0;
        countODiag = 0;

        for (int i = 0; i < 3; i++) {
            if (field[i][2 - i].equals("X")) {
                countXDiag++;
            } else if (field[i][2 - i].equals("O")) {
                countODiag++;
            }
        }

        if (countXDiag == 3) {
            xWins = true;
        }
        if (countODiag == 3) {
            oWins = true;
        }

        if (xWins) {
            return "X wins";
        } else if (oWins) {
            return "O wins";
        } else if (countEmpty == 0) {
            return "Draw";
        } else {
            return "Not finished";
        }
    }
}
