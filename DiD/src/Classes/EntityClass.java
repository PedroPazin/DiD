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
}
