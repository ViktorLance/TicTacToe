/*
 * License 1
 */

package organization.tictactoe;/*
 * License Lance
 */

import java.util.Random;

public class Game {

    public void play() {

        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");
        dataPrinter.printMappingTable();
        final GameTable gameTable = new GameTable();
        if (new Random().nextBoolean()) {
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
        }
        while (true) {
            userMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isUserWin(gameTable)) {
                System.out.println(" User WIN!");
                break;
            }
            if (drawVerifier.isDraw(gameTable)) {
                System.out.println(" DRAW!");
                break;
            }
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isComputerWin()) {
                System.out.println(" PC WIN!");
                break;
            }
            if (drawVerifier.isDraw(gameTable)) {
                System.out.println(" DRAW!");
                break;
            }
        }
        System.out.println(" Game OVER!");
    }
}
