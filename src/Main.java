import javafx.util.Pair;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //первое задание
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("арбуз");
        hashSet.add("банан");
        hashSet.add("вишня");
        hashSet.add("груша");
        hashSet.add("дыня");
        hashSet.add("ежевика");
        hashSet.add("жень-шень");
        hashSet.add("земляника");
        hashSet.add("ирис");
        hashSet.add("картофель");
        for (String unit: hashSet)
            System.out.println(unit);

        System.out.println();
        //второе задание
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("арбуз","ягода");
        map.put("банан","трава");
        map.put("вишня","ягода");
        map.put("груша","фрукт");
        map.put("дыня","овощ");
        map.put("ежевика","куст");
        map.put("жень-шень","корень");
        map.put("земляника","ягода");
        map.put("ирис","цветок");
        map.put("картофель","клубень");

        for (Map.Entry<String, String> pair: map.entrySet())
            System.out.println(pair.getKey()+" - "+pair.getValue());

        System.out.println();

        //третье задание
        HashMap<String,Cat> catMap = new HashMap<String, Cat>();
        Cat[] catArray = new Cat[10];
        int i=0;
        for(String unit: hashSet) {
             catArray[i] = new Cat(unit);
             catMap.put(catArray[i].getName(),catArray[i]);
            System.out.println(i+1+" кота зовут "+catArray[i].getName());
            i++;
        }

        System.out.println();

        //четвёртое задание
        for (Map.Entry<String, String> pair: map.entrySet())
            System.out.println(pair.getKey()+" - ключ");

        System.out.println();

        //пятое задание
        for (Map.Entry<String, String> pair: map.entrySet())
            System.out.println(pair.getValue()+" - значение");

        System.out.println();

        //шестое задание
        Object[] objects = new Object[10];
        HashMap<String,Object> objectHashMap = new HashMap<>();
        i=0;
        for(String unit: hashSet) {
            objects[i] = new Object();
            objectHashMap.put(unit,objects[i]);
            i++;
        }

        for (Map.Entry<String,Object> pair: objectHashMap.entrySet())
            System.out.println(pair.getKey()+" - "+pair.getValue());

    }
}
