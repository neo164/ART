package org.ipredybaylo.mathset;

import java.util.HashSet;
import java.util.Set;
import java.util.*;


public class TaskImpl implements Task {
    @Override
    public Set<Integer> getUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    @Override
    public Set<Integer> getCross(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();
        //result.retainAll(set1);
        set1.retainAll(set2);
        return set1;
    }

    @Override
    public Set<Integer> getUnionStream(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union;
        union = Stream
                .concat(set1.stream(), set2.stream())
                .collect(Collectors.toSet());
        return union;
    }

    @Override
    public Set<Integer> getCrossStream(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> cross;
        cross = set1.stream()
                .filter(set2::contains)
                .collect(Collectors.toSet());
        return cross;
    }

    @Override
    public int getCrossSizeStream(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> cross;
        cross = set1.stream()
                .filter(set2::contains)
                .collect(Collectors.toSet());
        return cross.size();

    }

    @Override
    public void printer2Set(Set<Integer> set1, Set<Integer> set2) {
        System.out.println("Set1: " + set1 + ".");
        System.out.println("Set2: " + set2 + ".");
        System.out.println("UnionStream: " + getUnionStream(set1, set2) + ".");
        System.out.println("Union:       " + getUnion(set1, set2) + ".");

        if (getCrossSizeStream(set1, set2) == 0) {
            System.out.println("Not crossing.");
        } else {
            System.out.println("CrossStream: " + getCrossStream(set1, set2) + ".");
            System.out.println("Cross:       " + getCross(set1, set2) + ".");
        }


    }
}