package com.geekbrains.homework1;

public class Wall implements Let  {
    private int height;

    public Wall() {
        this.height = 100;
    }

    @Override
    public void addParticipant(Person person){
        person.jump(height);
    }

}
