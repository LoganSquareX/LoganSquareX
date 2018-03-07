package io.logansquarex.demo.model;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;

@JsonObject
public class Name {

    @JsonField
    public String first;

    @JsonField
    public String last;
}
