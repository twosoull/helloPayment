package com.hellopayment;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        List<String> scores = Arrays.asList("z","x","spring","java");
        Collections.sort(scores, (o1, o2) -> o1.length() - o2.length());

        scores.forEach(System.out::println);
    }
}
