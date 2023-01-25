package W_01;

import java.util.ArrayList;

public class Team <T extends Player>{
    private String name;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(((Player)player).getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(((Player)player).getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }


    public void method1(String str){}
    public void method2(Integer int_1){}
    public void method3(Object obj){}

}
