package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    public long getOccurance(String value) {
        return Arrays.stream(super.array).filter(word -> word.equals(value)).count();
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(this.array)
                .filter(num -> getOccurance(num) < maxNumberOfDuplications)
                .toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(this.array)
                .filter(num -> getOccurance(num) != exactNumberOfDuplications)
                .toArray(String[]::new);
    }
}
