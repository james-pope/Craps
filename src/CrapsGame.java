// Implements the game of Craps logic

public class CrapsGame
{
  private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public int processRoll(int total)
  {
    int result = 0;
    int win = 1;
    int loss = -1;
    if (point == 0) {
      if (total == 2 || total == 3 || total == 12) {
        result = loss;
        point = 0;
      } else if (total == 7 || total == 11) {
        result = win;
        point = 0;
      } else {
        point = total;
        result = point;
      }
    }
    else{
        if (total == point){
          result = win;
          point = 0;
      }
        else if (total == 7){
          result = loss;
          point = 0;
        }
    }
    return result;
  }

  public int getPoint()
  {
    return point;
  }
}

