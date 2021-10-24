package com.company.homework2;

public abstract class Animals {
    protected String name;
    protected boolean sleeping;
    protected boolean feeding;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public boolean isSleeping() {    //Использовал для проверки работы цикла
//        return sleeping;
//    }  //

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

//    public boolean isFeeding() {      //Использовал для проверки работы цикла
//        return feeding;
//    }

    public void setFeeding(boolean feeding) {
        this.feeding = feeding;
    }

        public abstract String say();

}
