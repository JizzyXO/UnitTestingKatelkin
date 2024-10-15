package org.example.first_task;

import java.util.HashSet;
import java.util.Set;

public class SetMerger {
    public Set<Integer> mergeSets(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }
}
