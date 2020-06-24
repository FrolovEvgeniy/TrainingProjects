package com.forest.animals;

public class Animal implements FighterAnimal{
    private int weight = 2;
    private String name = "Animal";
    private boolean isHunter = false;

    public Animal(){}

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean isHunter(){
        return isHunter;
    }

    public void setHunter(boolean isHunter){
        this.isHunter = isHunter;
    }

    public void say(){
        System.out.println("Я могу говорить");
    }

    public void eat(){
        System.out.println("Я могу есть");
    }

    @Override
    public void fight(Animal animal){
        if(this.isHunter & !(animal.isHunter)){
            System.out.println(this.name + " killed " + animal.getName());
        } if((this.isHunter & animal.isHunter()) ||(!this.isHunter & !animal.isHunter())){
            if(this.weight > animal.getWeight()){
                System.out.println(this.name + " killed " + animal.getName());
            }else{
                System.out.println(animal.getName() + " killed " + this.name);
            }
        }else{
            System.out.println(animal.getName() + " killed " + this.name);
        }
    }
}
