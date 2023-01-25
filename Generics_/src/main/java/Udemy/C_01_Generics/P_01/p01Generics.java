package Udemy.C_01_Generics.P_01;

import java.util.ArrayList;

public class p01Generics {

    public static void main(String[] args) {
        ArrayList <String>name = new ArrayList();
        // name.add(new Date());
        name.add("Name 1");
        name.add("Name 2");

        String myFriendName = (String) name.get(0);

        System.out.println(myFriendName);
    }
}
