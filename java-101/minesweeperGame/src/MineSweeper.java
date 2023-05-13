import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private final Scanner scanner = new Scanner(System.in);
    private int lineCount = 0;
    private int columnCount = 0;
    private byte difficultyLevel = 2;
    private String[][] minefield;
    private String[][] minefieldWithPoints;
    private boolean isAlive = true;
    private int maxPoint;
    private int currentPoint;


    public void run() {
        getValues();
        while (isAlive && currentPoint < maxPoint) {
            enterCoordinate();
//            System.out.println(currentPoint);
        }
    }

    private void enterCoordinate() {
        int line = getLineVariable();
        int column = getColumnVariable();
        if (minefield[line][column].equals("*")) {
            isAlive = false;
            died(line, column);
        } else if (minefield[line][column].equals("-")) {
            minefield[line][column] = minefieldWithPoints[line][column];
            currentPoint++;
            if (currentPoint == maxPoint) {
                win();
            } else {
                printMinefield(minefield);
            }

        } else {
            printWarning("You have already opened this coordinate");
        }
    }

    private int getLineVariable() {
        System.out.print("Enter line coordinate(max " + lineCount + "): ");
        int line = scanner.nextInt();
        if (line < 1 || line > lineCount) {
            printError("You must enter line between 1 and " + lineCount);
            line = getLineVariable();
        }
        return line - 1;
    }

    private int getColumnVariable() {
        System.out.print("Enter column coordinate(max " + columnCount + "): ");
        int column = scanner.nextInt();
        if (column < 1 || column > columnCount) {
            printError("You must enter column between 1 and " + columnCount);
            column = getLineVariable();
        }
        return column - 1;
    }


    private void win() {
        printSuccess("You Win");
        printMinefield(minefieldWithPoints, true);
    }

    private void died(int line, int column) {
        printError("You Died");
        for (int i = 0; i < minefield.length; i++) {
            for (int j = 0; j < minefield[i].length; j++) {
                if (i == line && j == column)
                    System.out.print("\u001B[31m*\u001B[0m\t");
                else if (minefield[i][j].equals("*"))
                    System.out.print("\u001B[33m*\u001B[0m\t");
                else
                    System.out.print("-\t");
            }
            System.out.println();
        }
        System.out.print("=\t".repeat(columnCount));
    }

    //? Create Minefield and fill in it
    private void createEmptyMap() {
        for (int i = 0; i < minefield.length; i++) {
            Arrays.fill(minefield[i], "-");
            Arrays.fill(minefieldWithPoints[i], "-");
        }
        fillMinefield();
    }

    private void fillMinefield() {
        int minefieldCount = lineCount * columnCount;
        switch (difficultyLevel) {
            case 1 -> minefieldCount /= 8;
            case 2 -> minefieldCount /= 4;
            case 3 -> minefieldCount /= 2;
        }
        maxPoint = (lineCount * columnCount) - minefieldCount;
        Random random = new Random();
        while (minefieldCount > 0) {
            int randomLine = random.nextInt(lineCount);
            int randomColumn = random.nextInt(columnCount);
            if (minefield[randomLine][randomColumn].equals("-")) {
                minefield[randomLine][randomColumn] = "*";
                minefieldWithPoints[randomLine][randomColumn] = "*";
                minefieldCount--;
            }
        }
        setPointsOnBoxes();
    }

    private void setPointsOnBoxes() {
        for (int i = 0; i < minefieldWithPoints.length; i++) {
            for (int j = 0; j < minefieldWithPoints[i].length; j++) {
                if (minefieldWithPoints[i][j].equals("-")) {
                    minefieldWithPoints[i][j] = calculatePoint(i, j);
                }
            }
        }
    }

    private String calculatePoint(int i, int j) {
        int point = 0;
        int maxK = Math.min(i + 1, minefieldWithPoints.length - 1);
        for (int k = Math.max(i - 1, 0); k <= maxK; k++) {
            int maxL = Math.min(j + 1, minefieldWithPoints[k].length - 1);
            for (int l = Math.max(j - 1, 0); l <= maxL; l++) {
                if (minefield[k][l].equals("*")) {
                    point++;
                }
            }
        }
        return Integer.toString(point);
    }
    //? End of The "Create Minefield and fill in it"

    //? Required Values are Taken from The User
    private void getValues() {
        setLineCount();
        setColumnCount();
        setDifficultyLevel();

        minefield = new String[lineCount][columnCount];
        minefieldWithPoints = new String[lineCount][columnCount];
        createEmptyMap();

    }

    private void setLineCount() {
        System.out.print("How many lines will be: ");
        lineCount = scanner.nextInt();

        if (lineCount < 3) {
            printError("Line count must be minimum 3");
            setLineCount();
        }
    }

    private void setColumnCount() {
        System.out.print("How many column will be: ");
        columnCount = scanner.nextInt();

        if (columnCount < 3) {
            printError("Column count must be minimum 3");
            setColumnCount();
        }
    }

    private void setDifficultyLevel() {
        setDifficultyLevel(false);
    }

    private void setDifficultyLevel(boolean isCalledOnce) {
        if (!isCalledOnce) {
            printWarning("""
                    For Easy = 1
                    For Normal = 2
                    For Hard = 3""");
        }
        System.out.print("Select a difficulty level: ");
        difficultyLevel = scanner.nextByte();

        if (difficultyLevel < 1 || 3 < difficultyLevel) {
            printError("Difficulty level must be between 1 and 3");
            setDifficultyLevel(true);
        }

    }
    //? End of The "Required Values are Taken from The User"

    //? Print Methods
    private void printMinefield(String[][] arr) {
        printMinefield(arr, false);
    }

    private void printMinefield(String[][] arr, boolean printStart) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals("-") || arr[i][j].equals("*")) {
                    if (printStart) {
                        System.out.print(arr[i][j]);
                    } else {
                        System.out.print("-");
                    }
                } else {
                    System.out.print(ansiColorCode(arr[i][j]) + arr[i][j] + "\u001B[0m");
                }
                if (j != arr[i].length - 1)
                    System.out.print("\t");
            }
//            if (i < arr.length - 1 || !printStart)
                System.out.println();
        }
        System.out.println("=\t".repeat(columnCount));
    }

    private String ansiColorCode(String point) {
        String code;
        switch (point) {
            case "1" -> code = "1";
            case "2" -> code = "2";
            case "3" -> code = "3";
            case "4" -> code = "4";
            case "5" -> code = "5";
            default -> code = "6";
        }
        return "\u001B[3" + code + "m";
    }

    private void printError(String errorMessage) {
        System.out.println("\u001B[31m" + "!!!" + errorMessage + "!!!" + "\u001B[0m");
    }

    private void printWarning(String warningMessage) {
        System.out.println("\u001B[33m" + warningMessage + "\u001B[0m");
    }

    private void printSuccess(String successMessage) {
        System.out.println("\u001B[32m" + "!!!!!" + successMessage + "!!!!!" + "\u001B[0m");
    }
    //? End of The "Print Methods"
}
