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
    private double magicChance;
    private String specialMove;

    public enemy(String name){
        this.name = name;
        if (name.equals("maddy")){
            health = 10;
            attack = 2;
            defense = 2;
            magic = 10;
            speed = 55;
            magicChance = 70;
            specialMove = "The Disabler";
        }else if (name.equals("quint")){
            health = 20;
            attack = 4;
            defense = 4;
            magic = 4;
            speed = 27;
            magicChance = 20;
            specialMove = "Idiot Punch";
        }else if (name.equals("maxwell")){
            health = 25;
            attack = 6;
            defense = 2;
            magic = 6;
            speed = 40;
            magicChance = 50;
            specialMove = "Smash Bros. Punch";
        }else if (name.equals("troy")){
            health = 15;
            attack =  random(6,7);
            defense = random(6,7);
            magic = random(6,7);
            speed = 67;
            magicChance = 67;
            specialMove = "67 beam";
        }else if (name.equals("marcus c.")){
            health = 35;
            attack = 6;
            defense = 9;
            magic = 7;
            speed = 100;
            magicChance = 50;
            specialMove = "Unicycle Attack";
        }else if (name.equals("binaca")){
            health = 30;
            attack = 5;
            defense = 5;
            magic = 11;
            speed = 35;
            magicChance = 78;
            specialMove = "Magic Blast";
        }else if (name.equals("rahul")){
            health = 40;
            attack = 4;
            defense = 10;
            magic = 4;
            speed = 10;
            magicChance = 50;
            specialMove = "Sightly Magical Punch";
        }else if (name.equals("khani")){
            health = 20;
            attack = 4;
            defense = 6;
            magic = 17;
            speed = 74;
            magicChance = 85;
            specialMove = "Magic Blast";
        }else if (name.equals("ayah")){
            health = 20;
            attack = 5;
            defense = 7;
            magic = 15;
            speed = 70;
            magicChance = 80;
            specialMove = "Robotics Attack";
        }else if (name.equals("gauhar")){
            health = 30;
            attack = 12;
            defense = 12;
            magic = 1;
            speed = 30;
            magicChance = 0;
            specialMove = "???";
        }else if (name.equals("karan")){
            health = 35;
            attack = 10;
            defense = 9;
            magic = 5;
            speed = 54;
            magicChance = 25;
            specialMove = "Slightly Magical Punch";
        }else if (name.equals("nayan")){
            health = 30;
            attack = 10;
            defense = 10;
            magic = 10;
            speed = 50;
            magicChance = 50;
            specialMove = "ChatGPT Beam";
        }else if (name.equals("karim")){
            health = 50;
            attack = 12;
            defense = 5;
            magic = 5;
            speed = 1;
            magicChance = 25;
            specialMove = "ChatGPT Beam";
        }else if (name.equals("Marcus Alexio")){
            health = 40;
            attack = 11;
            defense = 11;
            magic = 12;
            speed = 68;
            magicChance = 55;
            specialMove = "Full Art Display";
        }else if (name.equals("angel")){
            health = 40;
            attack = 9;
            defense = 14;
            magic = 18;
            speed = 15;
            magicChance = 75;
            specialMove = "Angelic Blast";
        }else if (name.equals("melo")){
            health = 35;
            attack = 20;
            defense = 5;
            magic = 5;
            speed = 50;
            magicChance = 10;
            specialMove = "Slightly Magical Punch";
        }else if (name.equals("jessica")){
            health = 35;
            attack = 5;
            defense = 7;
            magic = 20;
            speed = 55;
            magicChance = 90;
            specialMove = "Magic Beam";
        }else if (name.equals("gabe")){
            health = 35;
            attack = 10;
            defense = 9;
            magic = 7;
            speed = 1000;
            magicChance = 10;
            specialMove = "Running Punch";
        }else if (name.equals("sam")){
            health = 35;
            attack = 27;
            defense = 10;
            magic = 1;
            speed = 60;
            magicChance = 0;
            specialMove = "???";
        }else if (name.equals("biruk")){
            health = 45;
            attack = 15;
            defense = 15;
            magic = 15;
            speed = 55;
            magicChance = 50;
            specialMove = "Becoming Dictator";
        }else if (name.equals("afton")){
            health = 76;
            attack = 10;
            defense = 15;
            magic = 17;
            speed = 25;
            magicChance = 75;
            specialMove = "Electric Shopping Cart";
        }else if (name.equals("alex")){
            health = 40;
            attack = 20;
            defense = 20;
            magic = 1;
            speed = 50;
            magicChance = 0;
            specialMove = "???";
        }else if (name.equals("sham")){
            health = 60;
            attack = 1;
            defense = 10;
            magic = 100;
            speed = 68;
            magicChance = 2;
            specialMove = "The Ultimate Yap";
        }else if (name.equals("elizabeth")){
            health = 20;
            attack = 5;
            defense = 5;
            magic = 15;
            magicChance = 40;
            specialMove = "Magic Beam";
        }else if (name.equals("evan")){
            health = 40;
            
        }
    }

    public static int random(int num1,int num2){ //Generates a random number between two values
        int num3=(num2-num1)+1;
        int ran_num = (int) (Math.random()*num3)+num1;
        return ran_num;
    }
}
