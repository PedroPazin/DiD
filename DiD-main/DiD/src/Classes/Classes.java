package Classes;

public enum Classes {
    MAGE(new Mage(10, 3, 3)),
    PALADIN(new Paladin(7, 6, 5)),
    BARBARIAN(new Barbarian(1, 12, 5));

    private final EntityClass classe;

    Classes(EntityClass classe) {
        this.classe = classe;
    }

    public EntityClass getClasse(){
        return this.classe;
    }
}
