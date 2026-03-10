import java.util.ArrayList;

public class collins {
    private String weapon;
    private int health;
    private int curHealth;
    private ArrayList<String> spells;
    private int MP;
    private int curMP; 
    public int speed; 
    private double attack;
    private double defense;
    private double magic;
    public boolean dead = false;

    public collins(){
        weapon = "Wooden Drumsticks";
        health = 47;
        curHealth = 47;
        spells = new ArrayList<String>();
        MP = 5;
        curMP = 5;
        speed = 46;
        attack = 5.36;
        defense = 5.54;
        magic = 4.23;

    }

    public void gainHealth(){
        health += 1;
        curHealth += 1;
    }

    public void gainHealth(int health){
        this.health += health;
        this.curHealth += health;
    }

    public void heal(){
        curHealth = health;
        curMP = MP;
    }

    public void healHP(){
        curHealth = health;
    }

    public void healMP(){
        curHealth = health;
    }

    public void gainMP(){
        MP += 1;
        curMP += 1;
    }

    public void gainMP(int MP){
        this.MP += MP;
        this.curMP += MP;
    }

    public void gainAttack(){
        attack += 0.1;
    }

    public void gainAttack(double attack){
        this.attack += attack;
    }

    public void gainDefense(){
        defense += 0.1;
    }

    public void gainDefense(double defense){
        this.defense += defense;
    }

    public void gainMagic(){
        magic += 0.1;
    }

    public void gainMagic(double magic){
        this.magic += magic;
    }

    public void gainSpeed(){
        speed += 1;
    }

    public void gainSpeed(int speed){
        this.speed += speed;
    }

    public void gainSpell(){
        boolean cont = true;
        boolean ableToContinue = true;
        int count = 0;
        String[] potentialSpells = {"In The Air Tonight","I Don't Care Anymore","Easy Lover","One More Night","Take Me Home","I Can't Dance","Sussudio","In Too Deep","Two Hearts"};
        int rando = (int)(Math.random()*8);
        while (cont == true){
            String newSpell = potentialSpells[rando];
            for (String spell:spells){
                if (newSpell.equals(spell)){
                    ableToContinue = false;
                }
            }
            if (ableToContinue){
                cont = false;
            }
            count++;
            if (count == 10){
                cont = false;
            }
            
        }
    }

    public void takeDamage(int damage){
        curHealth -= (int)(damage/defense);
        System.out.println("You took: "+(int)(damage/defense)+" damage.");
        if (curHealth <= 0){
            dead = true;
        }
    }

    public void healDamage(int damage){
        curHealth += damage;
        if (curHealth >= health){
            curHealth = health;
        }
    }

    public void useMP(){
        curMP -= 1;
    }

    public void displayStats(){
        System.out.println("HP: "+curHealth+"/"+health);
        System.out.println("MP: "+curMP+"/"+MP);
        System.out.println("Attack: " +attack);
        System.out.println("Defense: "+defense);
        System.out.println("Magic: "+magic);
        System.out.println("Speed: "+speed);
    }

    public void displayHP(){
        System.out.println("HP: "+curHealth+"/"+health);
    }

    public void displaySpells(){
        int count = 0;
        for(String spell:spells){
            count++;
            System.out.print(count+". "+spell+": ");
            if (spell.equals("In The Air Tonight")){
                System.out.println("Basic Magic Attack Power");
            }else if (spell.equals("I Don't Care Anymore")){
                System.out.println("Instant death, failure in boss battles");
            }else if (spell.equals("Easy Lover")){
                System.out.println("Lowers the enemy's defense");
            }else if (spell.equals("One More Night")){
                System.out.println("heal you");
            }else if (spell.equals("Take Me Home")){
                System.out.println("Reset the encounter");
            }else if (spell.equals("I Can't Dance")){
                System.out.println("increase speed");
            }else if (spell.equals("Sussudio")){
                System.out.println("increase defense power");
            }else if (spell.equals("In Too Deep")){
                System.out.println("increase attack power");
            }else if (spell.equals("Two Hearts")){
                System.out.println("raise magic");
            }else if (spell.equals("Invisible Touch")){
                System.out.println("Always deals 25 damage");
            }else if (spell.equals("That's All")){
                System.out.println("ultimate music magic");
            }

        }
    }

    public void upgradeWeapon(){
        if(weapon.equals("Wooden Drumsticks")){
            weapon = "Stone Drumsticks";
        }else if (weapon.equals("Stone Drumsticks")){
            weapon = "Steel Drumsticks";
        }else if (weapon.equals("Steel Drumsticks")){
            weapon = "Plastic Drumsticks";
        }else if (weapon.equals("Plastic Drumsticks")){
            weapon = "Blood Drumsticks";
        }else if (weapon.equals("Blood Drumsticks")){
            weapon = "Crystal Drumsticks";
        }else if (weapon.equals("Crystal Drumsticks")){
            weapon = "Phil's Signiture Drumsticks";
        }else if (weapon.equals("Phil's Signiture Drumsticks")){
            weapon = "Ringo's Signiture Drumsticks";
        }else if (weapon.equals("Ringo's Signiture Drumsticks")){
            weapon = "Microphone Drumsticks";
        }else if (weapon.equals("Microphone Drumsticks")){
            weapon = "Boohbah Drumsticks";
        }else if (weapon.equals("Boohbah Drumsticks")){
            System.out.println("You can't upgrade your weapon further");
        }
    }

    public int dealDamage(){
        double modifier = 1;
        if(weapon.equals("Wooden Drumsticks")){
            modifier = 1;
        }else if (weapon.equals("Stone Drumsticks")){
            modifier = 1.5;
        }else if (weapon.equals("Steel Drumsticks")){
            modifier = 2;
        }else if (weapon.equals("Plastic Drumsticks")){
            modifier = 2.25;
        }else if (weapon.equals("Blood Drumsticks")){
            modifier = 2.5;
        }else if (weapon.equals("Crystal Drumsticks")){
            modifier = 3;
        }else if (weapon.equals("Phil's Signiture Drumsticks")){
            modifier = 3.25;
        }else if (weapon.equals("Ringo's Signiture Drumsticks")){
            modifier = 3.5;
        }else if (weapon.equals("Microphone Drumsticks")){
            modifier = 3.75;
        }else if (weapon.equals("Boohbah Drumsticks")){
            modifier = 4;
        }
        double range = Math.random()+0.8;
        int damage = (int) ((attack * modifier)*10*range);
        return damage;
    }

    
}
