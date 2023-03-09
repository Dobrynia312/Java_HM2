package Runners;

import org.example.EdgeRun;

public class Human extends Runner implements EdgeRun {

    public Human() {
    }

    public Human(String name, int maxRunDist, int maxJumpHeight) {
        super(name, maxRunDist, maxJumpHeight);
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int run(int dist) {
        if (dist > maxRunDist) {
            System.out.println(this.name + " выбыл из гонки, так как устал бежать#");
            return 0;
        } else {
            System.out.println(this.name + " пробежал дорожку#");
            return 1;
        }
    }

    @Override
    public int jump(int dist) {
        if (dist > maxJumpHeight) {
            System.out.println(this.name + " выбыл из гонки, так как низко прыгает#");
            return 0;
        } else {
            System.out.println(this.name + " перепрыгнул стенку#");
            return 1;
        }
    }
}
