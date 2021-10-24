package com.company.homework2;

public class AppZoo {
    public static void main(String[] args) {
        /* Программа для отслеживания состояния животных в зоопарке
         и проверки их речевых функций
        */
        Animals mouse = new Mouse();
        mouse.setName("Микки");
        mouse.setSleeping(false);
        mouse.setFeeding(false);
        System.out.println(mouse.say());

        Animals rabbit = new Rabbit();
        rabbit.setName("Пушистик");
        rabbit.setSleeping(true);
        rabbit.setFeeding(true);
        System.out.println(rabbit.say());

        Animals bird = new Bird();
        bird.setName("Феникс");
        bird.setSleeping(false);
        bird.setFeeding(true);
        System.out.println(bird.say());

        Animals cow = new Cow();
        cow.setName("Зорька");
        cow.setSleeping(true);
        cow.setFeeding(false);
        System.out.println(cow.say());

    }
}

