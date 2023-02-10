package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        String[] strArr1 = {"1", "2", "3"};
        List<String> list1 = Arrays.stream(strArr1).map(str -> "TEST-" + str).collect(Collectors.toList());
        System.out.println(list1);

        String[] strArr2 = {"hello java", "hello intumit", "hello world"};
        List<String> list2 = Arrays.stream(strArr2).map(str -> "TEST-" + str).collect(Collectors.toList());
        System.out.println(list2);
    }
}
