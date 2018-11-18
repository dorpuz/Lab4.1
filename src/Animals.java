public class Animals {
    public static void main(String[] args) {

        Animal[] animals =  new Animal[6];
        animals[0] = new Dog("Pluto");
        animals[1] = new Cat("Tom");
        animals[2] = new Pig("Prosiaczek");
        animals[3] = new Animal();
        animals[4] = new Sheep("Shaun");
        animals[5] = new Hamster("Marlenka");

        for(Animal animal : animals){
            animal.introduce();
        }

    }
}

class Animal {
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String showName() {
        return "zwierze " + name;
    }

    String makeSound() {
        return "????";
    }

    void introduce() {
        System.out.println("Jestem " + showName() + ": " + makeSound());
    }
}

class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "pies " + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }
}

class Pig extends Animal {
    public Pig(String name) {
        this.name = name;
    }


    @Override
    String showName() {
        return "świnka " + name;
    }

    @Override
    String makeSound() {
        return "chrum chrum";
    }
}

class Hamster extends Animal {
    public Hamster(String name) {
        this.name = name;
    }


    @Override
    String showName() {
        return "chomik " + name;
    }

    @Override
    String makeSound() {
        return "nie wydaję dzwiekow";
    }
}

class Sheep extends Animal {
    public Sheep(String name) {
        this.name = name;
    }


    @Override
    String showName() {
        return "owca " + name;
    }

    @Override
    String makeSound() {
        return "meee";
    }
}