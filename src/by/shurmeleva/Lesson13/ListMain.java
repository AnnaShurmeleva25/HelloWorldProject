package by.shurmeleva.Lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String > strings = new ArrayList<>();
        List<String> secondStrings = new ArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        System.out.println(strings);
        secondStrings.add("forth");
        secondStrings.add("fifth");
        strings.addAll(secondStrings);
        System.out.println(strings);
        strings.add(2,"next");
        System.out.println(strings);
        System.out.println(strings.contains("next"));
        System.out.println(strings.indexOf("next"));
        System.out.println(strings.lastIndexOf("next"));
        System.out.println(strings.isEmpty());
        System.out.println(strings.get(4));
        System.out.println(strings.remove("next"));
        System.out.println(strings.remove(4));
        System.out.println(strings.removeAll(secondStrings));
        System.out.println(strings.set(1, "next"));
        System.out.println(strings.size());
        System.out.println(strings.subList(1,3));
        System.out.println(strings);

        Collections.sort(secondStrings);
        System.out.println(secondStrings);


        Collections.shuffle(strings);
        System.out.println(strings);
        Collections.shuffle(strings);
        for (String str: strings) {
            System.out.println(str);
        }
        //strings.forEach(System out :: println);

    }
}
