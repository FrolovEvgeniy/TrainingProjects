package com.forest.animals.meat_eating;

import com.forest.animals.Animal;

public class Tiger extends Animal {
    private int weight = 190;
    private boolean isHunter = true;
    private String name = "Jafar";

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

    public void fight(Animal animal){
        if(this.isHunter & !(animal.isHunter())){
            System.out.println(this.name + " killed " + animal.getName());
        }else if((this.isHunter & animal.isHunter()) ||((!this.isHunter & !animal.isHunter()))){
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
