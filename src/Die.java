
public class Die {
    private int dots;

    public void roll(){
        double die1 = (Math.random() * (6-1)+1)-1;
        double die2 = (Math.random() * (6-1)+1)-1;
        int result = (int) (die1 + die2);
        dots = result;
    }
    public int getNumDots(){
        return dots;
    }
    public static void main(String [] args){
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
    }
}
