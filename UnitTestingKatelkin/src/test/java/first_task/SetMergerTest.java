package first_task;

import org.example.first_task.SetMerger;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetMergerTest {
    @Test
    void testMergeWithCommonElements(){
        SetMerger merger = new SetMerger();
        Set<Integer> set1 = Set.of(1,2,3);
        Set<Integer> set2 = Set.of(3,4,5);
        Set<Integer> result = merger.mergeSets(set1,set2);
        assertEquals(Set.of(1,2,3,4,5),result);
    }
    @Test
    void testMergeWithoutCommonElements(){
        SetMerger merger = new SetMerger();
        Set<Integer> set1 = Set.of(1,2,3);
        Set<Integer> set2 = Set.of(4,5,6);
        Set<Integer> result = merger.mergeSets(set1,set2);
        assertEquals(Set.of(1,2,3,4,5,6),result);
    }
    @Test
    void testMergeWithEmpty(){
        SetMerger merger = new SetMerger();
        Set<Integer> set1 = Set.of();
        Set<Integer> set2 = Set.of(1,2,3);
        Set<Integer> result = merger.mergeSets(set1,set2);
        assertEquals(Set.of(1,2,3),result);
    }
    @Test
    void testMergeTwoEmptySets(){
        SetMerger merger = new SetMerger();
        Set<Integer> set1 = Set.of();
        Set<Integer> set2 = Set.of();
        Set<Integer> result = merger.mergeSets(set1,set2);
        assertEquals(Set.of(),result);
    }
    @Test
    void testMergeWithDuplicates(){
        SetMerger merger = new SetMerger();
        Set<Integer> set1 = Set.of(1,2,3,4);
        Set<Integer> set2 = Set.of(3,4,5);
        Set<Integer> result = merger.mergeSets(set1,set2);
        assertEquals(Set.of(1,2,3,4,5),result);
    }
}
