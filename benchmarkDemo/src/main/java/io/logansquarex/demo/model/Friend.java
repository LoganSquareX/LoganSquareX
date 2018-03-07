package io.logansquarex.demo.model;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;

@JsonObject
public class Friend {

    @JsonField
    public int id;

    @JsonField
    public String name;
}
