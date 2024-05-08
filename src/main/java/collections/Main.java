package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> oakTree = new TreeSet<>();
        oakTree.add(2);
        oakTree.add(12);
        oakTree.add(10);
        oakTree.add(4);
        oakTree.add(18);

       Iterator<Integer> iteratorObject = oakTree.iterator();
        while (iteratorObject.hasNext()) {
            int number = iteratorObject.next();
            if (number < 10) {
                iteratorObject.remove();

            }
        }
        System.out.println(oakTree);

        List<Long> list = new ArrayList<>();
        list.add(4L);
        list.add(2L);
        list.add(12L);
        list.add(10L);
        list.add(18L);
      ListIterator<Long> listIterator = list.listIterator(list.size());
      while(listIterator.hasPrevious()){
          System.out.println(listIterator.previous());
      }
      Map<Integer,String> wuTangClan = new HashMap<>();
      wuTangClan.put(1,"Rza");
      wuTangClan.put(2,"Gza");
      wuTangClan.put(3,"Inspectah deck");
      wuTangClan.put(4,"Ghostface");
      //for each
        for(Map.Entry<Integer,String> entry: wuTangClan.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Iterator<Map.Entry<Integer,String>> iterator = wuTangClan.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

}

