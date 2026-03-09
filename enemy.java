import java.util.ArrayList;

public class enemy {
    String name;
    private int health;
    private int curHealth;
    private ArrayList<String> spells;
    private int speed; 
    private double attack;
    private double defense;
    private double magic;

    public enemy(String name){
        this.name = name;
        if (name.equals("maddy")){
            health = 10;
            attack = 2;
            defense = 2;
            magic = 10;
            speed = 55;
        }else if (name.equals("quint")){
            health = 20;
            attack = 4;
            defense = 4;
            magic = 4;
            speed = 27;
        }else if (name.equals("maxwell")){
            health = 25;
            attack = 6;
            defense = 2;
            magic = 6;
            speed = 40;
        }elsei fi (name.equals("troy")){
            health = 15;
            attack = random(6,7);
            defense = random(6,7);
            magic = random(6,7);
            speed = 67;
        }
    }

    public static int random(int num1,int num2){ //Generates a random number between two values
        int num3=(num2-num1)+1;
        int ran_num = (int) (Math.random()*num3)+num1;
        return ran_num;
    }
}
