package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public long getOccurance(Integer value) {
        return Arrays.stream(super.array).filter(num -> num.equals(value)).count();
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(this.array)
                .filter(num -> getOccurance(num) < maxNumberOfDuplications)
                .toArray(Integer[]::new);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(this.array)
                .filter(num -> getOccurance(num) != exactNumberOfDuplications)
                .toArray(Integer[]::new);
    }

}
