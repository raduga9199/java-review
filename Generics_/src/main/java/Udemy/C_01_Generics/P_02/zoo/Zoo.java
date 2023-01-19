package Udemy.C_01_Generics.P_01.zoo;

public class Zoo {
    public static void main(String[] args) {

        Cage<Monkey> cage = new Cage<>(new Monkey(),new Monkey());

        /*
        // MONKEY
        Cage <Monkey>cage = new Cage();
        cage.setAnimal1(new Monkey());
        cage.setAnimal2(new Monkey());
         */


        // LION
        Cage<Lion> lionCage = new Cage<>();
        lionCage.setAnimal1(new Lion());
        lionCage.setAnimal2(new Lion());
    }
}
