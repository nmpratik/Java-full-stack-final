package com.pra.a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ArrayInse{
    public void arryin(){
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {3, 4, 5, 6, 7};
        
        // Find common elements using lambda functions
        List<Integer> commonElements = Arrays.stream(array1)
                .filter(Arrays.asList(array2)::contains)
                .collect(Collectors.toList());
        System.out.println("Common elements: " + commonElements);

        // Find unique elements using lambda functions
        List<Integer> uniqueElements = Arrays.stream(array1)
                .filter(i -> !Arrays.asList(array2).contains(i))
                .collect(Collectors.toList());
        uniqueElements.addAll(Arrays.stream(array2)
                .filter(i -> !Arrays.asList(array1).contains(i))
                .collect(Collectors.toList()));
        System.out.println("Unique elements: " + uniqueElements);
    }
}

public class Arrayu {
    public static void main(String[] args) {
        ArrayInse ai = new ArrayInse();
        ai.arryin();
    }
}
