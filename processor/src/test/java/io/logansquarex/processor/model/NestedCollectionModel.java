package io.logansquarex.processor.model;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@JsonObject
public class NestedCollectionModel {

    @JsonField
    public List<ArrayList<Set<Map<String, List<String>>>>>[] crazyCollection;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null || getClass() != o.getClass()) {
            return false;
        }

        return Arrays.equals(crazyCollection, ((NestedCollectionModel)o).crazyCollection);

    }

    @Override
    public int hashCode() {
        return crazyCollection != null ? Arrays.hashCode(crazyCollection) : 0;
    }
}
