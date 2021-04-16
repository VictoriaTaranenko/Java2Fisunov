package com.geekbrains.homework1;



public class Main {
    public static void main(String[] args) {

        Human human = new Human("Ira");
        ThreadMill threadMill = new ThreadMill();
        Wall wall = new Wall();
//        threadMill.addParticipant(human);
//        wall.addParticipant(human);

        Person [] pers = {
                new Human("JACK"),
                new Robot("JdK"),
                new Cat("Garic")
        };

        Let [] lets = {
                new ThreadMill(),
                new Wall()
        };

        for(Person p : pers) {
            for(Let l : lets) {
                l.addParticipant(p);
                if(!p.isOnDistance()) {
                    break;
                }
            }
        }

        }
    }


