package homework.Task5.task2;

import java.util.Random;

import static homework.Task5.task2.Games.*;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    static Season getRandomSeason() {
        Season s = null;
        int rnd = new Random().nextInt(Season.values().length);
        switch (rnd) {
            case 0:
                s = WINTER;
                break;
            case 1:
                s = SPRING;
                break;
            case 2:
                s = SUMMER;
                break;
            case 3:
                s = AUTUMN;
                break;
            default:
                System.out.println("There is no such season");
        }
        return s;
    }

    static Games getGameForASeason(Season s) {
        Games game = null;
        switch (s) {
            case WINTER:
                game = SNOWBALLS_THROWING;
                break;
            case SPRING:
                game = BOATS_ON_THE_STREAMS;
                break;
            case SUMMER:
                game = FIND_AND_EAT_BERRIES;
                break;
            case AUTUMN:
                game = MEASURING_PUDDLES_BY_BOOTS;
                break;
            default:
                System.out.println("There is no such game");
        }
        return game;
    }
}
