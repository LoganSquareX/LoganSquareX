package io.logansquarex.processor.model;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;

@JsonObject
public class SimpleExtendedModel extends SimpleModel {

    @JsonField
    public int extendedInt;

}
