/*
 * License 1
 */

package organization.tictactoe;

import organization.tictactoe.component.*;
import organization.tictactoe.component.keypad.DesktopNumericKeypadCellNumberConverter;

public class Launcher {

    public static void main(final String[] args) {
        final CellNumberConverter cellNumberConverter = new DesktopNumericKeypadCellNumberConverter();
        final Game game = new Game(
                new DataPrinter(cellNumberConverter),
                new ComputerMove(),
                new UserMove(cellNumberConverter),
                new WinnerVerifier(),
                new CellVerifier()
        );
        game.play();
    }
}
