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

public class CellVerifier {
    public boolean allCellsFilled(final GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameTable.isEmpty(new Cell(i, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}

