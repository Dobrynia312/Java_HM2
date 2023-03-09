package Obstacles;

public class Wall extends Opponent{
    public Wall(String name, int dist) {
        super(name, dist);
    }

    public Wall() {
    }

    @Override
    public int retDist() {
        return this.dist;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
