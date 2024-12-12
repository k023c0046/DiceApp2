package DiceApp2;

public class Game {
    Player p;
    Dice d;

    Game(){
        p=new Player();
        d=new Dice();
    }

    void start(){
        p.turn(d);
        System.out.println("Player1 : "+d.me1);
        System.out.println("Player2 : "+d.me2);
        judge();
    }

    void judge(){
        if (d.me1>d.me2){
            System.out.println("Player1の勝ち");
        }else if (d.me1<d.me2){
            System.out.println("Player2の勝ち");
        }else{
            System.out.println("あいこ");
        }

    }

}
