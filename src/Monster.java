public abstract class Monster extends Entity implements Fighter{
    private int force;

    public Monster(String name, int force) {
        super(name);
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }
    public int getForce(){
        return force;
    }
}