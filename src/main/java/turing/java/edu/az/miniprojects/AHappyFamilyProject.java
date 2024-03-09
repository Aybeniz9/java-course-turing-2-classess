package turing.java.edu.az.miniprojects;

public class AHappyFamilyProject {
    public static void main(String[] args) {

        //Pet pet = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human father = new Human("Vito", "Karleone", 1940,65,DayOfWeek.FRIDAY);
        Human mother = new Human("Jane", "Karleone", 1950,89,DayOfWeek.SUNDAY);
        Human child =new Human("bebes","bebesov",2004,78,DayOfWeek.WEDNESDAY);
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
        System.out.println("Father getDayOfWeek"+father.getSchedule());

        System.out.println("Mother name = "+mother.getName());
        System.out.println("Mother surname= "+mother.getSurname());
        System.out.println("Mother IQ"+mother.getIq());
        System.out.println("Mother getFamily"+mother.getFamily());
        System.out.println("Mother getDayOfWeek"+mother.getSchedule());
//family.addChild(child);

        System.out.println("Child name ="+ child.getName());
        System.out.println("Child family="+child.getFamily());
        System.out.println("child birthyear"+child.getYear());
        System.out.println(" Child Iq = "+child.getIq());
        System.out.println("Child toString= "+ child.toString());
        System.out.println("Child getDayOfWeek"+child.getSchedule());
//
//
//        System.out.println("Family countFamily= "+family.countFamily());
//        System.out.println("Family getFather= "+ family.getFather());
//        System.out.println("Family deleteChild = "+family.deleteChild(4));
//        System.out.println("Family toString ="+ family.toString());

        Human man = new Man();
        Human woman = new Woman();
        Human childd = new Man();
        Pet catt = new DomesticCat("Whiskers");
        Pet dogg = new Dog("Buddy");


        man.addChild(childd);
        woman.addChild(childd);


        System.out.println("man: " + man);
        System.out.println("woman: " + woman);
        System.out.println("cat: " + catt);
        System.out.println("dog: " + dogg);


        System.out.println("Deleting child from man: " + man.deleteChild(childd));
        System.out.println("Deleting non-existent child from man: " + man.deleteChild(new Woman()));


        System.out.println("Deleting child at index 0 from woman: " + woman.deleteChild(0));
        System.out.println("Deleting child at invalid index from woman: " + woman.deleteChild(1));


        System.out.println("Before adding child: " + man.countFamily());
        man.addChild(new Woman());
        System.out.println("After adding child: " + man.countFamily());


//        Human man = new Man();
//        Human woman = new Woman();
//
//        man.greetPet(cat);
//        woman.greetPet(dog);
//
//        repairCar();
//        woman.makeup();


        System.out.println("Pet age is " + family.getPet().getAge());
        System.out.println("Pet Tostring is ="+ family.getPet().toString());
        System.out.println( "Pet trikLEvel= "+ family.getPet().getTrickLevel());
        human.greetPet();
        family.getPet().eat();
        family.getPet().foul();
        family.getPet().respond();




//        child.pet.eat();
//        child.pet.respond();
//        child.pet.foul();
//        child.greetPet();
//        child.describePet();
    }
}
