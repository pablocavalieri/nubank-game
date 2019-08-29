package nubank.game;

import static nubank.game.CompassPosition.EAST;
import static nubank.game.CompassPosition.NORTH;
import static nubank.game.CompassPosition.NORTH_EAST;
import static nubank.game.CompassPosition.NORTH_WEST;
import static nubank.game.CompassPosition.SOUTH;
import static nubank.game.CompassPosition.SOUTH_EAST;
import static nubank.game.CompassPosition.SOUTH_WEST;
import static nubank.game.CompassPosition.WEST;
import static nubank.game.Direction.DOWN;
import static nubank.game.Direction.UP;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Dinosaur implements BoardElement {

  private final Direction facingDirection;

  @Override
  public Direction facingDirection() {
    return facingDirection;
  }

  @Override
  public Set<Direction> directionsToMove() {
    return Collections.emptySet();
  }

  @Override
  public Set<CompassPosition> attackPositions() {
    return Collections.emptySet();
  }

  @Override
  public Set<Class<BoardElement>> attackEffectiveness() {
    return Collections.emptySet();
  }
}
