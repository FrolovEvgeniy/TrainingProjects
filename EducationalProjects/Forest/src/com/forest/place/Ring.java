package com.forest.place;

import com.forest.animals.Animal;
import com.forest.animals.grass_eating.Rabbit;
import com.forest.animals.grass_eating.Zebra;
import com.forest.animals.meat_eating.Lion;
import com.forest.animals.meat_eating.Tiger;

import java.util.List;

public class Ring {

    public void startFight() {
        Animal tiger = new Tiger();
        Animal zebra = new Zebra();
        Animal lion = new Lion();
        Animal rabbit = new Rabbit();

        tiger.fight(zebra);
        zebra.fight(rabbit);
        lion.fight(tiger); 
    }
}
