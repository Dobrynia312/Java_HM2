package Obstacles;

public abstract class Opponent {
    protected String name;
    protected int dist;

    public Opponent(String name, int dist) {
        this.name = name;
        this.dist = dist;
    }

    public Opponent() {
    }
    public int retDist(){
        return this.dist;
    }

    public String getName() {
        return name;
    }
}
