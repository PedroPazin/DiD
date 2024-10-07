package Classes;

public enum Classes {
    MAGE(new Mage(10, 3, 3)),
    PALADIN(new Paladin(10, 3, 3)),
    BARBARIAN(new Barbarian(10, 3, 3));

    private final EntityClass classe;

    Classes(EntityClass classe) {
        this.classe = classe;
    }
}
