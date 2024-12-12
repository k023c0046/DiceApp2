package DiceApp2;

public class Dice {
    int me1,me2;

    void roll(){
        me1=(int)(Math.random()*5)+1;
        me2=(int)(Math.random()*5)+1;
    }
}
