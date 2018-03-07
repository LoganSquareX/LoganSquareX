package io.logansquarex.processor.bad;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;

@JsonObject
public class PrivateFieldModelWithoutAccessors {

    @JsonField
    private String string;

}
