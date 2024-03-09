package turing.java.edu.az.miniprojects;

public class AHappyFamilyProject {
    public static void main(String[] args) {

        //Pet pet = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human father = new Human("Vito", "Karleone", 1940,65,null);
        Human mother = new Human("Jane", "Karleone", 1950,89,null);
        Human child =new Human("bebes","bebesov",2004,78,null);
        Family family=new Family(mother,father);
        Human human=new Human();
        Fish fish = new Fish("Nemo");
        DomesticCat cat = new DomesticCat("Whiskers");
        Dog dog = new Dog("Buddy");
        RoboCat roboCat = new RoboCat("Circuit");

        fish.respond();
        cat.respond();
        dog.respond();
        roboCat.respond();

        cat.foul();
        dog.foul();




        System.out.println("Father name= "+father.getName());
        System.out.println("Father toString "+father.toString());
        System.out.println("Father IQ"+father.getIq());
        System.out.println("Father getFamily="+ father.getFamily());

        System.out.println("Mother name = "+mother.getName());
        System.out.println("Mother surname= "+mother.getSurname());
        System.out.println("Mother IQ"+mother.getIq());
        System.out.println("Mother getFamily"+mother.getFamily());
family.addChild(child);

        System.out.println("Child name ="+ child.getName());
        System.out.println("Child family="+child.getFamily());
        System.out.println("child birthyear"+child.getYear());
        System.out.println(" Child Iq = "+child.getIq());
        System.out.println("Child toString= "+ child.toString());


        System.out.println("Family countFamily= "+family.countFamily());
        System.out.println("Family getFather= "+ family.getFather());
        System.out.println("Family deleteChild = "+family.deleteChild(4));
        System.out.println("Family toString ="+ family.toString());

        Man man = new Man();
        Woman woman = new Woman();

        man.greetPet(cat);
        woman.greetPet(dog);

        man.repairCar();
        woman.makeup();


        System.out.println("Pet age is " + family.getPet().getAge());
        System.out.println("Pet Tostring is ="+ family.getPet().toString());
        System.out.println( "Pet trikLEvel= "+ family.getPet().getTrickLevel());
        human.greetPet();
        family.getPet().eat();
        family.getPet().foul();
        family.getPet().respond();

//        Man man = new Man();
//        Woman woman = new Woman();

        man.greetPet(cat);
        woman.greetPet(dog);

        man.repairCar();
        woman.makeup();


//        child.pet.eat();
//        child.pet.respond();
//        child.pet.foul();
//        child.greetPet();
//        child.describePet();
    }
}
