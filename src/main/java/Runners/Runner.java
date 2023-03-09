package Runners;

import org.example.EdgeRun;

public abstract class Runner implements EdgeRun {
    protected String name;
    protected int maxRunDist;
    protected int maxJumpHeight;

    public Runner() {
        this.name = "sample";
        this.maxRunDist = 0;
        this.maxJumpHeight = 0;
    }

    public Runner(String name, int maxRunDist, int maxJumpHeight) {
        this.name = name;
        this.maxRunDist = maxRunDist;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }
}
