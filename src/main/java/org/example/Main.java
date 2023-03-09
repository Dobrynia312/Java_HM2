package org.example;

import Obstacles.Opponent;
import Obstacles.SomeRun;
import Obstacles.Wall;
import Runners.Cat;
import Runners.Human;
import Runners.Robot;
import Runners.Runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int teamSize = 5;
        int dis = 5;
        int count = 0;
        List<Runner> runTeam = new ArrayList<>();
        for (int i = 0; i < teamSize; i++) {
            if (rand.nextInt(3) == 0) {
                runTeam.add(new Human(("H " + count), i * rand.nextInt(7), ((int) (i * 1.5))));
            } else if (rand.nextInt(3) == 1) {
                runTeam.add(new Cat(("C " + count), i * rand.nextInt(10), ((int) (i * 1.5))));
            } else {
                runTeam.add(new Robot(("R " + count), i * 2));
            }
            count++;
        }
        List<Opponent> disasters = new ArrayList<>();
        for (int i = 0; i < dis; i++) {
            if (i < 2) {
                disasters.add(new Wall(("W " + i), i * rand.nextInt(5)));
            } else {
                disasters.add(new SomeRun(("SR " + i), i * rand.nextInt(5)));
            }
        }


        for (int i = 0; i < runTeam.size(); i++) {
            System.out.println("---");
            for (int k = 0; k < dis; k++) {
                System.out.println(runTeam.get(i).getName() + " встретил " + disasters.get(k).getName());
                if (disasters.get(k) instanceof Wall) {
                    int res = runTeam.get(i).jump(disasters.get(k).retDist());
                    if (res == 0) {
                        runTeam.remove(i);
                        i--;
                        break;
                    }
                }
                if (disasters.get(k) instanceof SomeRun) {
                    int res = runTeam.get(i).run(disasters.get(k).retDist());
                    if (res == 0) {
                        runTeam.remove(i);
                        i--;
                        break;
                    }
                }
            }
        }


    }
}