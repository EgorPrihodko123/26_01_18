package animals;


public class AnimalsMain {
    public static void main(String[] args) {

        Cat cat=new Cat("vitalik","oval");
        Cat cat1=new Cat("triangle","Irisca");
        Cat cat2=new Cat("triangle","Irisca");
        Dog dog=new Dog("triangle","Irisca");
        Cat cat3=cat;
        System.out.println(cat==cat2);
        System.out.println(cat.equals(cat3));
        System.out.println("------------");
        //System.out.println(dog==cat2);
        System.out.println(dog.equals(cat2));
        System.out.println(cat.hashCode());
        cat.setName(" vasia");
        System.out.println(cat.hashCode());

        Dog []dogMas=new Dog[3];
        dogMas[0]=dog;
        Animals[]animMas=new Animals[2];
        animMas[0]=cat;
        animMas[1]=dog;

        for(Animals animMa:animMas){
            if(animMa instanceof Cat){
                animMa.sayMyHeadFormAndWhatICan();
            }
        }
    }



}
