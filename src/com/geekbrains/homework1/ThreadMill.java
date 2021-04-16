package com.geekbrains.homework1;

public class ThreadMill  implements Let{
    private int  length;

    public ThreadMill(){
        this.length = 500;
    }



    @Override
    public void addParticipant(Person person){
        person.run(length );
    }
}
