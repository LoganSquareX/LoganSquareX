package io.logansquarex.processor.model;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;

@JsonObject
public class SimpleGenericStringModel extends SimpleGenericModel<String> {

    @JsonField
    public String anotherString;

}
