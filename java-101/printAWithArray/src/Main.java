public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[7][3];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if ((i % 3 == 0 || j % 2 == 0) && !(j == 2 && i % 3 == 0)) {
                    letter[i][j] = "*";
                } else {
                    letter[i][j] = " ";
                }
            }
        }

        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}