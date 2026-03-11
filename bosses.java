import java.util.ArrayList;

public class bosses {
    private String name;
    private String title;
    private String art;
    private int health;
    private int curHealth;
    private ArrayList<String> spells;
    public int speed; 
    public boolean dead = false;
    private double attack;
    private double defense;
    private double magic;
    public double magicChance;
    public bosses(int number){
        if (number == 1){
            name = "\"Powerful Monster\"";
            art = "%%%%%%%%%%%%%%@@@@%%%%%%%%%%@@@@%%%%%%%%######\n%%%%%%%%@@@@@@@@%%%%%%%@%%%%%%@@@@@@@%%%%%####\n%%%%%%%%%@@@@@%%%@@%%%%%%%%%@@@@@@@@@@@@%%%%%%\n%%%%%%%%%%%@%@@%%%%%%%@%%%%%%%@@@@@@@@@@@@%@@@\n%%%%%%%%%%%%%%%%%%%%%@@@@@@@@%%@@@@@@@@@@@@@@@\n%@%%%%%%%%%%%%%#%###%%%%%%%%%%%%%%%%@@@@@@@%@@\n@%%%%%%%%%%%%%@@@%%%%%%%%%%%%%%#####%%@@@@@@@@\n@%%@@%%%%%%%%#####*###%%%#######*****#%@%@@@@@\n@%%@%##****+++=====+++*++====+++++++**#%%@@@@@\n@%%%*+=======-========------=====+++**#%%%%@@@\n%%%#*======-------------------====+****#%%@@@@\n%%%#+====-----=--------------=======++*%%%@@@@\n%@%#*+====-=-------=--=============+++##%%@@@@\n%%%%#+=============================+++*#%%%@@@\n%%@%#++============================++++*%%%%%@\n%%@%#++=========================++++++++#%%*+%\n#%%%*+++++++=+==++++++++++++====+++**+++*%+++%\n#++**++***+=-===*+++++++++=::::::-=++++++#+++@\n##++*++++=-.....:=++++++++=:::.::-=++++++*+=+@\n##++*+===-:......-=++=++++============++++++*@\n##++++====----=====++=+++++===========++++==#@\n###==+============+++==++++===========++*+=+@@\n###*=++================++++==========+++*=+@@@\n####+++=================++++=========+++*@@@@@\n######+==============--=+==+=====-===+++*@@@@@\n######++====-----=+*++++**+==----====+++*@@@@@\n######*++==------=+=====-++-=----====+++*@@@@@\n#####%#+===----=-==-++=++=+--=+=====++++%@@@@@\n#######*=======--#::%=.**.+#:+=====+++**@@@@@@\n########+++===*###+#%*.%%+*###+===++***=%@@@@@\n#########**++==*#=%#-###=%#=%:+=+++***=-+@@@@@\n#########%#**=-=*-+*-+*-+*-=*-+=++*#+==:=%%%@@\n#######%%@*:+=+++==-====-==+**+=**+===::-%%%%@\n####%%%@%%=.-=+*++===-=======++**====:::=%%%%%\n%%%%%%%%%%-..-==+**++=++=+++***====+::::#%%%%%\n%%%%%%%%%%:...=+---=+++++++========:.:::%%%%%%";
            title = "Dillon Mann";
            health = 50;
            speed = 10;
            attack = 8;
            defense = 5;
            magic = 2;
            magicChance = 0;
        }else if (number == 2){
            name = "My Couch";
            art = ".......:::::::::----::----------::--:::::::::::.......\n.:=+-----=============================------=--.   \n.-==-=++++++++++====++++++++====++++++++++=-==-.  \n:-==-----------==++=--------==+=------------==-:   \n:-+=----=========++===========+======-------=+-:   \n.::::-==============++==========++==============-::::.\n.==+=--+++++++++++==+==++++++++==+===++++++++++--===-.\n:-=+++=----------======---=-----===-------------===--.\n.==++===============+============+===============+==-.\n.==++======+==+===+++==+==+======++==============+==-.\n.==++=+++++++++++++++++++++++++++++++============+==-.\n.==++==++++++++++++++++++++++++++++==============+==-.\n.-+++=+++++++++++++++++++++++++++++++++++++=++===+==-.\n.-=+#**********#**#**********#**#***********==-.   ";
            title = "Grey or green?";
            health = 70;
            speed = 1;
            attack = 8;
            defense = 8;
            magic = 8;
            magicChance = 40;
        }else if (number == 3){
            name = "Sephiroth";
            title = "One-Winged Angel";
            health = 80;
            attack = 8;
            defense = 8;
            magic = 10;
            magicChance = 30;
            speed = 69;
        }else if (number == 4){
            name = "Steve";
            title = "Chicken Jockey";
            health = 75;
            attack = 9;
            defense = 9;
            magic = 7;
            magicChance = 50;
            speed = 45;
        }else if (number == 5){
            name = "100 Guys";
            title = "they will win";
            health = 100;
            attack = 8;
            defense = 5;
            magic = 5;
            magicChance = 20;
            speed = 30;
        }else if (number == 6){
            name = "Gorilla";
            title = "it will win";
            health = 75;
            attack = 11;
            defense = 9;
            magic = 3;
            magicChance = 0;
            speed = 50;
        }else if (number == 7){
            name = "Evil Piano";
            title = "Speaking ill of others";
            health = 85;
            attack = 10;
            defense = 10;
            magic = 8;
            magicChance = 60;
            speed = 40;
        }else if (number == 8){
            name = "Wesley";
            title = "The man from \"The Princess Bride\"";
            health = 70;
            attack = 13;
            defense = 10;
            magic = 9;
            magicChance = 40;
            speed = 70;
        }else if (number == 9){
            name = "Shawshank";
            title = "From \"The Shawshank Redemption\"";
            health = 60;
            attack = 10;
            defense = 10;
            magic = 10;
            magicChance = 50;
            speed = 70;
        }else if (number == 10){
            name = "Dr. Mario";
            title = "He will cure all diseases";
            health = 90;
            attack = 1;
            defense = 11;
            magic = 12;
            magicChance = 100;
        }else if (number == 11){
            name = "A Dog";
            title = "big scary thing";
            health = 85;
            attack = 13;
            defense = 12;
            magic = 2;
            magicChance = 0;
            speed = 78;
        }else if (number == 12){
            name = "pumbah";
            title = "fake boohbah";
            health = 100;
            attack = 10;
            defense = 10;
            magic = 10;
            speed = 10;
            magicChance = 50;
        }else if (number == 13){
            name = "The Number 13";
            title = "That is an unlucky number";
            health = 78;
            attack = 13;
            defense = 13;
            magic = 13;
            speed = 13;
            magicChance = 65;
        }else if (number == 14){
            name = "Anne Wood";
            title = "The creator of Boohbah";
            health = 88;
            attack = 13;
            defense = 12;
            magic = 18;
            magicChance = 30;
            speed = 77;
        }else if (number == 15){
            name = "The concept of division";
            title = "One of the four basic operations in mathematics";
            health = 100;
            attack = 12;
            defense = 10;
            magic = 16;
            speed = 81;
            magicChance = 60;
        }else if (number == 16){
            name = "Plato";
            title = "Inventor of Philosophy";
            health = 60;
            attack = 1;
            defense = 8;
            magic = 20;
            speed = 42;
            magicChance = 100;
        }else if (number == 17){
            name = "Dragonite";
            title = "The Dragon Pokemon";
            health = 91;
            attack = 15;
            defense = 9.5;
            magic = 10;
            speed = 40;
            magicChance = 50;
        }else if (number == 18){
            name = "An evil Phil Collins clone, but not actually a clone or Phil Collins";
            title = "He cares";
            health = 85;
            attack = 12;
            defense = 10;
            magic = 13;
            magicChance = 70;
            speed = 25;

        }else if (number == 19){
            name = "Freddie Mercury";
            title = "He is the champion, my friend";
            health = 134;
            attack = 6;
            defense = 10.6;
            magic = 12;
            magicChance = 75;
            speed = 68;
        }else if (number == 20){
            name = "A Bird";
            title = "Just a normal bird";
            health = 50;
            attack = 8;
            defense = 8;
            magic = 8;
            magicChance = 0;
            speed = 75;
        }else if (number == 21){
            name = "Bowser";
            title = "King Koopa";
            health = 100;
            attack = 10;
            defense = 15;
            magic = 10;
            magicChance = 50;
            speed = 50;
        }else if (number == 22){
            name = "A Lake";
            title = "It's full of pee";
            health = 100;
            attack = 14;
            defense = 14;
            magic = 14;
            magicChance = 50;
            speed = 66;
        }else if (number == 23){
            name = "Samus";
            title = "Intergalatic Bounty Hunter";
            health = 110;
            attack = 15;
            defense = 11;
            magic = 15;
            magicChance = 50;
            speed = 71;
        }else if (number == 24){
            name = "Mr. Markham";
            title = "Christopher's Father";
            health = 95;
            attack = 16;
            defense = 12;
            magic = 7;
            magicChance = 50;
            speed = 71;
        }else if (number == 25){
            name = "Karim Clicker";
            title = "Sprint 1 Winner";
            health = 130;
            attack = 14;
            defense = 14;
            magic = 15;
            magicChance = 50;
            speed = 67;
        }else if (number == 26){
            name = "Mr. 3";
            title = "I've run out of ideas";
            health = 30;
            attack = 30;
            defense = 9;
            magic = 30;
            magicChance = 30;
            speed = 30;
        }else if (number == 27){
            name = "Bob";
            title = "Bob.";
            health = 40;
            attack = 20;
            defense = 18;
            magic = 2;
            magicChance = 0;
            speed = 1;
        }else if (number == 28){
            name = "The Easter Bunny";
            title = "Santa wasn't there";
            health = 120;
            attack = 15;
            defense = 14;
            magic = 13;
            magicChance = 40;
            speed = 56;
        }else if (number == 29){
            name = "Titanic";
            title = "weak to ice";
            health = 200;
            attack = 20;
            defense = 2;
            magic = 2;
            magicChance = 0;
            speed = 5;
        }else if (number == 30){
            name = "Voldemort";
            title = "He-Who-Must-Not-Be-Named";
            health = 100;
            attack = 1;
            defense = 13;
            magic = 17;
            magicChance = 100;
            speed = 71;
        }else if (number == 31){
            name = "The Lion King";
            title = "Not live action";
            health = 110;
            attack = 19;
            defense = 13;
            magic = 10;
            magicChance = 0;
            speed = 71;
        }else if (number == 32){
            name = "the siege perilous";
            title = "cool chair";
            health = 110;
            attack = 17;
            defense = 17;
            magic = 17;
            magicChance = 50;
            speed = 63;
        }else if (number == 33){ //Boosting Boss
            name = "a lighthouse";
            title = "I can't imagine what that would make";
            health = 120;
            attack = 14;
            defense = 15;
            magic = 20;
            magicChance = 40;
            speed = 22;
        }else if (number == 34){
            name = "my brain";
            title = "Inventor of this game";
            health = 120;
            attack = 12;
            defense = 19;
            magic = 17;
            magicChance = 70;
            speed = 64;
        }else if (number == 35){
            name = "Wario";
            title = "Money (That's What I Want)";
            health = 120;
            attack = 18;
            defense = 18;
            magic = 18;
            magicChance = 66;
            speed = 45;
        }else if (number == 36){
            name = "Needle/Cutter Kirby";
            title = "From Kirby 64 : The Crystal Shards";
            health = 100;
            attack = 20;
            defense = 20;
            magic = 10;
            magicChance = 0;
            speed = 55;
        }else if (number == 37){
            name = "A really smart bird";
            title = "Higher IQ than Einstein";
            health = 90;
            attack = 1;
            defense = 17;
            magic = 20;
            magicChance = 100;
            speed = 44;
        }else if (number == 38){
            name = "Bon Jovi";
            title = "We're halfway there";
            health = 125;
            attack = 19;
            defense = 19;
            magic = 19;
            magicChance = 19;
            speed = 93;
        }
    }
}
