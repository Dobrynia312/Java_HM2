package Runners;

import org.example.EdgeRun;

public class Cat extends Runner implements EdgeRun {
    public Cat() {
    }

    public Cat(String name, int maxRunDist, int maxJumpHeight) {
        super(name, maxRunDist, maxJumpHeight);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int run(int dist) {
        if (dist > maxRunDist) {
            System.out.println(this.name + " выбыл из гонки, не царское дело так далеко бегать@");
            return 0;
        } else {
            System.out.println(this.name + " пробежал дорожку@");
            return 1;
        }
    }

    @Override
    public int jump(int dist) {
        if (dist > maxJumpHeight) {
            System.out.println(this.name + " выбыл из гонки, его величество не хочет прыгать так высоко@");
            return 0;
        } else {
            System.out.println(this.name + " перепрыгнул стенку@");
            return 1;
        }
    }
}
