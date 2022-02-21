package homework.Task5.task2;

public enum Games {
    SNOWBALLS_THROWING("снежки"),
    BOATS_ON_THE_STREAMS("запуск корабликов по ручьям"),
    FIND_AND_EAT_BERRIES("собирание и поедание ягод"),
    MEASURING_PUDDLES_BY_BOOTS("измерение глубины луж методом \"сапога\"");

    private final String gameName;

    Games(String gameName) {
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }
}
