package W_01_Review;

import java.util.List;

public class MyUtils <T>{

    public void printInfo(List<T> list){
        for (T each : list){
            System.out.println(each);
        }
        System.out.println("list.size() = " + list.size());
    }

    public T getLastItem(List<T> list){
        return list.get(list.size() - 1);
    }

    public String getLastName(List<T> list) throws Exception {
        T lastItem = list.get(list.size() -1);

        if (lastItem instanceof Student){
            return ((Student) lastItem).getName();
        } else if (lastItem instanceof Teacher) {
            return ((Teacher) lastItem).getName();
        } else {
            throw new Exception("Not valid type");
        }
    }
}


