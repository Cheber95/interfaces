package ru.geekbraines.homework8;

public class MainApp {

    public static void main(String[] args) {

        Barriers[] wallsAndRods = new Barriers[6];
        wallsAndRods[0] = new Wall("Стенка №1", 0.4);
        wallsAndRods[1] = new Road("Дорожка №1", 100.0);
        wallsAndRods[2] = new Wall("Стенка №2", 1.2);
        wallsAndRods[3] = new Road("Дорожка №2", 250.0);
        wallsAndRods[4] = new Road("Дорожка №3", 500.0);
        wallsAndRods[5] = new Wall("Стенка №3", 2.2);

        Skills[] participants = new Skills[6];
        participants[0] = new Homo("Василий",2,500);
        participants[1] = new Robot("R2D2",1,2500);
        participants[2] = new Cat("Снежок",2.5,50);
        participants[3] = new Homo("Иван",0.3,100);
        participants[4] = new Robot("BostonDynamics",2.1,510);
        participants[5] = new Cat("Сверхбарсик",10,1500);

        for (int i = 0; i < participants.length; i++) {
            System.out.println("----к участию присутпил участник № " + (i + 1));
            boolean partLive = true;
            for (int j = 0; j < wallsAndRods.length; j++) {
                if (partLive) {
                    if (wallsAndRods[j].isWall()) {
                        partLive = participants[i].jump((Wall) wallsAndRods[j]);
                    } else {
                        partLive = participants[i].run((Road) wallsAndRods[j]);
                    }
                } else {
                    break;
                }
            }
        }
    }
}
