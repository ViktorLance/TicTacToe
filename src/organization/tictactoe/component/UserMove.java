/*
 * License 1
 */

/*
 * License 1
 */

package organization.tictactoe.component;/*
 * License Lance
 */

import organization.tictactoe.model.Cell;
import organization.tictactoe.model.GameTable;

import java.util.Scanner;

public class UserMove {

    private final char[][] mapping = {
            {'7', '8', '9'},
            {'4', '5', '6'},
            {'1', '2', '3'}
    };

    public void make(final GameTable gameTable) {

        while (true) {
            final Cell cell = getUcerInput();
            if (gameTable.isEmpty(cell)) {
                gameTable.setSign(cell, 'X');
                return;
            } else {
                System.out.println("Can't make a move, because the cell is not free. Try again.");
            }
        }
    }

    private Cell getUcerInput() {
        while (true) {
            System.out.println("Please type number between 1 and 9:");
            final String userInput = new Scanner(System.in).nextLine();
            if (userInput.length() == 1) {
                final char ch = userInput.charAt(0);
                if (ch >= '1' && ch <= '9') {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (mapping[i][j] == ch) {
                                return new Cell(i, j);
                            }
                        }
                    }
                }
            }
        }
    }
}
