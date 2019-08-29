package nubank.game;

import java.util.Set;

public interface BoardElement {

  Direction facingDirection();

  Set<Direction> directionsToMove();

  Set<CompassPosition> attackPositions();

  Set<Class<BoardElement>> attackEffectiveness();

}
