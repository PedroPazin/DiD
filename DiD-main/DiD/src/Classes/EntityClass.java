package Classes;

public abstract class EntityClass {

    protected int intelligence;
    protected int str;
    protected int dex;

    EntityClass(int intelligence, int str, int dex){
        this.intelligence = intelligence;
        this.str = str;
        this.dex = dex;
    }

    public int getIntelligence(){
        return this.intelligence;
    }
    public int getStrength(){
        return this.str;
    }
    public int getDexterity(){
        return this.dex;
    }

    public void getStats(){
        System.out.print("Int: " + this.intelligence + " Str: " + this.str + " Dex: " + this.dex);
    }

}
