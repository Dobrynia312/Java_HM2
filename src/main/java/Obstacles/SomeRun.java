package Obstacles;

public class SomeRun extends Opponent{
    public SomeRun(String name, int dist) {
        super(name, dist);
    }

    public SomeRun() {
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
