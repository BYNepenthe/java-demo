package com.bynepenthe.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:zhangpl@jerei.com">zhangpl</a>
 * @version 2016/8/25.
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<Long>();
        list.add(2L);
        list.add(3L);
        list.add(4L);

        List<Long> list2 = new ArrayList<Long>();
        list2.add(2L);
        list2.add(5L);

        System.out.println(list.containsAll(list2));
//        System.out.println(list.removeAll(list2));
//        System.out.println(list.toString());
        System.out.println(list2.removeAll(list));
        System.out.println(list2.toString());
    }
}
