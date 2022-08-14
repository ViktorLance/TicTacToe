package organization.tictactoe.component;/*
 * License Lance
 */


import organization.tictactoe.model.Cell;

public interface CellNumberConverter {


   Cell toCell( char number) ;

     char toNumber( Cell cell) ;

}
