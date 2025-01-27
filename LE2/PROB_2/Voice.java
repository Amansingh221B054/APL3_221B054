public class Voice {
    private Animal[] animals;

     void prepareVoice() {
        animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        hear(animals);
        
    }

     void hear(Animal[] animal) {
       
        
        for (int i=0;i<5;i++){
            
            animal[i].makeVoice();
        }
        }
    }

