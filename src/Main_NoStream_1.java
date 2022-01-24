/*Необходимо в списке отобрать первые 2 строки
в алфавитном порядке, которые имеют длину 4.
Рассмотрим первый способ решения без стримов*/

import java.util.*;

public class Main_NoStream_1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name : list){
            if (name.length() == 4){
                filtered.add(name);
            }
        }
        Collections.sort(filtered);
        Iterator<String> iter = filtered.iterator();
        if (iter.hasNext()){
            System.out.println(iter.next());
        }
        if (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
