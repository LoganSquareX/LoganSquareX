package io.logansquarex.processor;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;

@JsonObject
public abstract class AbstractParentModel {

    @JsonField
    public int parentTestInt;

}
