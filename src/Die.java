
public class Die {
    private int dots;
    public Die(){
        dots = 0;
    }
    public void roll(){
        dots = (int) ((Math.random() * 6)+1);
        System.out.println(dots);
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
