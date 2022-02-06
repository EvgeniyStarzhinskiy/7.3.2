abstract class Entity{
    private String name;
    private int hp = 100;
    private boolean destroyed = false;

    public Entity(String name) {
        this.name = name;
    }
    public boolean isDestroyed(){
        return destroyed;
    }
    public String getName(){
        return name;
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println(name + " was destroyed");
            return true;
        }
        return false;
    }


}