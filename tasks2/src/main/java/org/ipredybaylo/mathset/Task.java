package org.ipredybaylo.mathset;

import java.util.Set;

public interface Task {
    Set<Integer> getUnion(Set<Integer> set1, Set<Integer> set2);

    Set<Integer> getCross(Set<Integer> set1, Set<Integer> set2);

    Set<Integer> getUnionStream(Set<Integer> set1, Set<Integer> set2);

    Set<Integer> getCrossStream(Set<Integer> set1, Set<Integer> set2);

    int getCrossSizeStream (Set<Integer> set1, Set<Integer> set2);

    void printer2Set(Set<Integer> set1, Set<Integer> set2);
}
