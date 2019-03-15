package examples;

import auxiliar.Person;

public class A_Inheritance {

    public static void main(String[] args){
        Animal animal = new Animal();
        //animal behaviour

        Bird bird = new Bird();
        //bird behavior

    }
}

class Animal{
    //add access modifiers
    boolean live;

    public void eat(){
        System.out.println("I am an animal, I eat");
    }

    public boolean isAlive(){
        return live;
    }

}

class Bird extends Animal{
    String plumageColor;

    public void fly(){
        live = true;

        System.out.println("I am a bird, I can fly");
    }
}

class Mammal extends Animal{
    String furColor;
}

