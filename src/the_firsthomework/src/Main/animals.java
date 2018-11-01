package Main;
//父类：动物类
abstract class Animals {
    private int age;
    private String name;
    private  String weight;
    public Animals(String name,int age,String weight){
        this.setName(name);
        this.setAge(age);
        setWeight();
    }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
        this.age = age;
        }
    public String getWeight(){
        return this.weight;
    }
    public void setWeight(){
         this.weight = weight;
    }
    public abstract void eat();
    public abstract void sounds();
    public abstract void favouritetoy();
}
class Dog extends Animals{
        public Dog(String name,int age,String weight){
            super(name, age,weight);

        }
        public void eat(){
            System.out.println(this.getName()+" eats shit!");

        }
        public void sounds(){
            System.out.println("汪汪汪！");

        }
        public void favouritetoy(){
            System.out.println("balls");
        }

}
class Cat extends Animals {
    public Cat(String name, int age, String weight) {
        super(name, age, weight);

    }

    public void eat() {
        System.out.println(this.getName() + " eats fishes!");

    }

    public void sounds() {
        System.out.println("喵喵喵！");
    }

    public void favouritetoy() {
        System.out.println("mouses");
    }
}
    class Pig extends Animals{
        public Pig(String name,int age,String weight){
            super(name, age,weight);

        }
        public void eat(){
            System.out.println(this.getName()+" eats jinkela");

        }
        public void sounds(){
            System.out.println("吼吼吼！");
        }
        public void favouritetoy(){
            System.out.println("own shit");
        }

}


class Test{
    public static void main(String[] args) {
        Animals dog = new Dog("YI",16,"1kg");
        dog.eat();
        Animals cat = new Cat("Zhen",12,"2kg");
        cat.sounds();
        Animals pig = new Pig("pangpang",1,"200kg");
        pig.sounds();


    }
}