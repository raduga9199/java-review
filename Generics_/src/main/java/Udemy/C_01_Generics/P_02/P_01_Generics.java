package Udemy.C_01_Generics.P_02;

import java.util.ArrayList;

public class P_01_Generics {

    public static void main(String[] args) {
        ArrayList <String>name = new ArrayList();
        // name.add(new Date());
        name.add("Name 1");
        name.add("Name 2");

        String myFriendName = (String) name.get(0);

        System.out.println(myFriendName);
    }
}
