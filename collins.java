import java.util.ArrayList;

public class collins {
    private String weapon;
    private String saveWeapon;
    private int health;
    private int curHealth;
    private int tempCurHealth;
    private ArrayList<String> spells;
    private ArrayList<String> saveSpells;
    private int MP;
    private int curMP; 
    private int tempCurMP;
    public int speed; 
    private double attack;
    private double defense;
    private double magic;
    public double tempAttack;
    public double tempDefense;
    public double tempSpeed;
    public double tempMagic;
    public double saveAttack;
    public double saveDefense;
    public int saveSpeed;
    public double saveMagic;
    public int saveHP;
    public int saveCurHP;
    public int saveMP;
    public int saveCurMP;
    public boolean dead = false;

    public collins(){
        weapon = "Wooden Drumsticks";
        saveWeapon = weapon;
        health = 47;
        curHealth = 47;
        tempCurHealth = 47;
        saveHP = 47;
        saveCurHP = 47;
        spells = new ArrayList<String>();
        saveSpells = new ArrayList<String>(spells);
        MP = 5;
        saveMP = 5;
        curMP = 5;
        tempCurMP = 5;
        saveCurMP = 5;
        speed = 46;
        saveSpeed = speed;
        tempSpeed = speed;
        attack = 5.36;
        saveAttack = 5.36;
        tempAttack = 5.36;
        defense = 5.54;
        saveDefense = 5.54;
        tempDefense = 5.54;
        magic = 4.23;
        saveMagic = 4.23;
        tempMagic = 4.23;
        gainSpell();

    }

    public void gainHealth(){
        health += 1;
        curHealth += 1;

        if (health > 999){
            health -= 1;
            curHealth -=1;
        }
    }

    public void gainHealth(int health){
        this.health += health;
        this.curHealth += health;
        if (health > 999){
            this.health -= health;
            curHealth -= health;
        }
    }

    public void heal(){
        curHealth = health;
        curMP = MP;
    }

    public void healHP(){
        curHealth = health;
    }

    public void healMP(){
        curMP = MP;
    }

    public void gainMP(){
        MP += 1000;
        curMP += 1000;
        }
    }

    public void gainMP(int MP){
        this.MP += MP;
        this.curMP += MP;
        }
    }

    public void gainAttack(){
        attack += 0.1;
        tempAttack += 0.1;
        if (attack > 99){
            attack -= 0.1;
            tempAttack -= 0.1;
        }
    }

    public void gainAttack(double attack){
        this.attack += attack;
        this.tempAttack += attack;
        if (attack > 99){
            this.attack -= attack;
            tempAttack -= attack;
        }
    }

    public void gainDefense(){
        defense += 0.1;
        tempDefense += 0.1;
        if (defense > 99){
            defense -= 0.1;
            tempDefense -= 0.1;
        }
    }

    public void gainDefense(double defense){
        this.defense += defense;
        this.tempDefense += defense;
        if (defense > 99){
            this.defense -= defense;
            tempDefense -= defense;
        }
    }

    public void gainMagic(){
        magic += 0.1;
        tempMagic += 0.1;
        if (magic > 99){
            magic -= 0.1;
            tempMagic -= 0.1;
        }
    }

    public void gainMagic(double magic){
        this.magic += magic;
        this.tempMagic += magic;
        if (magic > 99){
            this.magic -= magic;
            tempMagic -= magic;
        }
    }

    public void gainSpeed(){
        speed += 1;
        tempSpeed += 1;
        if (speed > 999){
            speed -= 1;
            tempSpeed -= 1;
        }
    }

    public void gainSpeed(int speed){
        this.speed += speed;
        tempSpeed += speed;
        if (speed > 999){
            this.speed -= speed;
            tempSpeed -= speed;
        }
    }

    public void resestTemps(){
        this.tempAttack = attack;
        this.tempDefense = defense;
        this.tempMagic = magic;
        this.tempSpeed = speed;
    }

    public void changeHP(){
        tempCurHealth = curHealth;
        tempCurMP = curMP;
    }

    public void fixHP(){
        curHealth = tempCurHealth;
        curMP = tempCurMP;
    }

    public void gainSpell(){
        boolean cont = true;
        boolean ableToContinue = true;
        int count = 0;
        String[] potentialSpells = {"In The Air Tonight","I Don't Care Anymore","Easy Lover","One More Night","Take Me Home","I Can't Dance","Sussudio","In Too Deep","Two Hearts","Invisible Touch"};
        int rando = (int)(Math.random()*10);
        while (cont == true){
            String newSpell = potentialSpells[rando];
            for (String spell:spells){
                if (newSpell.equals(spell)){
                    ableToContinue = false;
                }
            }
            if (ableToContinue){
                cont = false;
                spells.add(newSpell);
                System.out.println("Learn "+newSpell);
            }
            count++;
            if (count == 30){
                cont = false;
            }
        }
    }

    public void gainSuperSpell(){
        boolean cont = true;
        for (String spell:spells){
                if (spell.equals("That's All")){
                    cont = false;
                }
        }
        if (cont){
            spells.add("That's All");
        }
    }

    public void takeDamage(int damage){
        curHealth -= (int)(damage/tempDefense);
        System.out.println("You took: "+(int)(damage/tempDefense)+" damage.");
        System.out.println();
        if (curHealth <= 0){
            dead = true;
        }
    }

    public void healDamage(){
        double range = Math.random()+0.5;
        System.out.println("You used One More Night: ");
        int heal = (int) (tempMagic*4*range);
        curHealth += heal;
        System.out.println("Healed "+heal+" damage");
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
        System.out.println("Weapon: "+weapon);
    }

    public void displayHP(){
        System.out.println("HP: "+curHealth+"/"+health);
    }

    public void takeMagic(int damage){
        curHealth -= (int)(damage/tempMagic);
        System.out.println("You took: "+(int)(damage/tempMagic)+" damage.");
        if (curHealth <= 0){
            dead = true;
        }
    }

    public int dealMagic(){
        double range = Math.random()+0.5;
        System.out.println("You used In The Air Tonight: ");
        return (int) (tempMagic*10*4*range);
    }

    public void displaySpells(){
        int count = 0;
        for(String spell:spells){
            count++;
            System.out.println("MP: "+curMP+"/"+MP);
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
        System.out.println("Click enter to exit");
    }
    
    public int chooseSpells(){
        displaySpells();
        int whichSpell = main.intInput("Which spell would like to use it? ")-1;
        if (whichSpell >= spells.size() || curMP <= 0){
            return 11;
        }
        else if (spells.get(whichSpell).equals("In The Air Tonight")){
            curMP--;
            return 1;
        }else if (spells.get(whichSpell).equals("I Don't Care Anymore")){
            curMP--;
            return 2;
        }else if (spells.get(whichSpell).equals("Easy Lover")){
            curMP--;
            return 3;
        }else if (spells.get(whichSpell).equals("One More Night")){
            curMP--;
            return 4;
        }else if (spells.get(whichSpell).equals("Take Me Home")){
            curMP--;
            return 5;
        }else if (spells.get(whichSpell).equals("I Can't Dance")){
            curMP--;
            return 6;
        }else if (spells.get(whichSpell).equals("Sussudio")){
            curMP--;
            return 7;
        }else if (spells.get(whichSpell).equals("In Too Deep")){
            curMP--;
            return 8;
        }else if (spells.get(whichSpell).equals("Two Hearts")){
            curMP--;
            return 9;
        }else if (spells.get(whichSpell).equals("Invisible Touch")){
            curMP--;
            return 0;
        }else if (spells.get(whichSpell).equals("That's All")){
            curMP--;
            return 10;
        }else{
            return 11;
        }
    }

    public boolean instaKill(){
        int work = main.random(1,100);
        if (work > 90){
            return true;
        }else{
            return false;
        }
    }

    public void raiseAttack(){
        System.out.println("Increased attack power");
        tempAttack *= (1 + (tempMagic/10));
    }
    public void lowerAttack(){
        System.out.println("Decreased attack power");
        tempAttack /= (1 + (tempMagic/10));
    }

    public void raiseDefense(){
        System.out.println("Increased defense power");
        tempDefense *= (1 + (tempMagic/10));
    }

    public void lowerDefense(){
        System.out.println("Decreased defense power");
        tempDefense /= (1 + (tempMagic/10));
    }

    public void raiseMagic(){
        System.out.println("magic increased");
        tempMagic *= (1 + (tempMagic/10));
    }

    public void lowerMagic(){
        System.out.println("magic decreased");
        tempMagic /= (1 + (tempMagic/10));
    }

    public void raiseSpeed(){
        System.out.println("speed increased");
        tempSpeed *= (1 + (tempMagic/10));
    }

    public void lowerSpeed(){
        System.out.println("speed decreased");
        tempSpeed /= (1 + (tempMagic/10));
    }

    public void lowerAll(){
        System.out.println("Increased attack power");
        tempAttack /= (1 + (tempMagic/10));
        tempDefense /= (1 + (tempMagic/10));
        tempMagic /= (1 + (tempMagic/10));
        tempSpeed /= (1 + (tempMagic/10));
    }

    public int dealSuperDamage(){
        curMP -= 4;
        System.out.println("You used That's All");
        main.waitTime(3);
        System.out.println("=");
        main.waitTime(0.1);
        System.out.println("=");
        main.waitTime(0.1);
        System.out.println("=");
        main.waitTime(0.1);
        System.out.println("=");
        main.waitTime(0.1);
        System.out.println("=");
        main.waitTime(0.1);
        System.out.println("=");
        main.waitTime(0.1);
        System.out.println("=");
        main.waitTime(0.1);
        System.out.println("=");
        main.waitTime(0.1);
        System.out.println("=");
        main.waitTime(0.1);
        System.out.println("=");
        main.waitTime(2);
        System.out.println("!");

        double range = Math.random()+0.3;

        return (int) (tempMagic*100*range);

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
        System.out.println("Upgraded weapon to "+weapon);
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
        double range = Math.random()+0.5;
        int damage = (int) ((tempAttack * modifier)*10*range);
        return damage;
    }

    public void createSaveStats(){
        saveWeapon = weapon;
        saveAttack = attack;
        saveCurHP = curHealth;
        saveCurMP = curMP;
        saveHP = health;
        saveDefense = defense;
        saveSpeed = speed;
        saveMagic = magic;
        saveMP = MP;
        saveSpells = new ArrayList<String>(spells);
    }

    public void changeSaveStats(){
        weapon = saveWeapon;
        attack = saveAttack;
        defense = saveDefense;
        speed = saveSpeed;
        health = saveHP;
        magic = saveMagic;
        curHealth = saveCurHP;
        MP = saveMP;
        curMP = saveCurMP;
        spells = new ArrayList<String>(saveSpells);
    }

    public void takeConst1(){
        System.out.println("received damage");
        curHealth -= 30;
        if (curHealth <= 0){
            dead = true;
        }
    }
    public void takeConst2(){
        System.out.println("received damage");
        curHealth -= 40;
        if (curHealth <= 0){
            dead = true;
        }
    }
    public void takeConst3(){
        System.out.println("received damage");
        curHealth -= 50;
        if (curHealth <= 0){
            dead = true;
        }
    }  

    public void takeConst4(){
        System.out.println("received damage");
        curHealth -= 65;
        if (curHealth <= 0){
            dead = true;
        }
    }  
}
