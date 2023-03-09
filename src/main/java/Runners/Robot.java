package Runners;

import org.example.EdgeRun;

public class Robot extends Runner implements EdgeRun {
    public Robot() {
    }

    public Robot(String name, int maxRunDist) {
        super(name, maxRunDist, 0);
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int run(int dist) {
        if (dist > maxRunDist) {
            System.out.println(this.name + " выбыл из гонки, так как не добежал%");
            return 0;
        } else {
            System.out.println(this.name + " пробежал дорожку%");
            return 1;
        }
    }

    @Override
    public int jump(int dist) {
        if (dist > maxJumpHeight) {
            System.out.println(this.name + " выбыл из гонки, потому что не мог прыгнуть%");
            return 0;
        } else {
            System.out.println(this.name + " перепрыгнул стенку%");
            return 1;
        }
    }
}
