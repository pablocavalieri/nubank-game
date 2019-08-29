package nubank.game;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static nubank.game.Direction.*;
import static nubank.game.CompassPosition.*;

public class Robot implements BoardElement {



  private static final Set<Class<BoardElement>> CAN_ATTACK =
      new HashSet(Collections.singletonList(Robot.class));

  private static final Set<Direction> DIRECTIONS_CAN_MOVE =
      new HashSet<>(Arrays.asList(UP, DOWN));
  private static final Set<CompassPosition> POSITIONS_CAN_ATTACK =
      new HashSet<>(Arrays.asList(
          NORTH,
          NORTH_EAST,
          NORTH_WEST,
          SOUTH,
          SOUTH_EAST,
          SOUTH_WEST,
          EAST,
          WEST));

  private final Direction facingDirection;

  @Override
  public Direction facingDirection() {
    return facingDirection;
  }

  @Override
  public Set<Direction> directionsToMove() {
    return DIRECTIONS_CAN_MOVE;
  }

  @Override
  public Set<CompassPosition> attackPositions() {
    return POSITIONS_CAN_ATTACK;
  }

  @Override
  public Set<Class<BoardElement>> attackEffectiveness() {
    return CAN_ATTACK;
  }
}
