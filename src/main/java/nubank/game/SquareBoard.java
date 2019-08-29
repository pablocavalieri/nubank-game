package nubank.game;

import java.util.Map;

public class SquareBoard {

  private final int size;
  private final Map<BoardCell, BoardElement> elementsInBoard;

  public SquareBoard insertElement(
      final BoardCell theBoardCellToInsertElementTo,
      final BoardElement theElementToInsert) {

  }

  public boolean canInsertElement(
      final BoardCell theBoardCellToInsertElementTo,
      final BoardElement theElementToInsert) {

  }


  public SquareBoard moveElement(
      final BoardCell theBoardCellToInsertElementTo,
      final Direction TheDirectionToMoveElement) {

  }

  public SquareBoard canMoveElement(
      final BoardCell theBoardCellToInsertElementTo,
      final Direction TheDirectionToMoveElement) {

  }

  public SquareBoard attack(final BoardCell theBoardCellToPerformAttack) {

  }

  public boolean canAttack(final BoardCell theBoardCellToPerformAttack) {

  }
}
