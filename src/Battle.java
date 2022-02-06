import java.util.Random;

class Battle{
    final static private int MAX = 5;
    private Entity[] entities;
    private int n = 0;

    Battle(){
        entities = new Entity[MAX];
    }

    public void add(Entity entity){
        if (n < MAX) {
            entities[n++] = entity;
        }
        else{
            System.out.println("No more members!");
        }
    }

    public void run(){
        Random random = new Random();
        int destroyed = 0;
        int n_fighter;
        int n_victim;
        Entity victim;
        Entity fighter;
        while (destroyed != n - 1){
            n_fighter = random.nextInt(n);
            n_victim = random.nextInt(n);
            fighter = entities[n_fighter];
            victim = entities[n_victim];
            //find non destroyed Fighter and his victim
            while (fighter == null || victim == null || !(fighter instanceof Fighter) || fighter == victim){
                n_fighter = random.nextInt(n);
                n_victim = random.nextInt(n);
                fighter = entities[n_fighter];
                victim = entities[n_victim];
            }
            ((Fighter)fighter).attack(victim);
            if (victim.isDestroyed()){
                entities[n_victim] = null;
                destroyed++;
            }
        }
        System.out.println("The Great Battle is finished");
    }

    public void start(){
        run();
    }
}