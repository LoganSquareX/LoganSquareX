package io.logansquarex.processor.model;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;
import io.logansquarex.core.annotation.JsonObject.FieldNamingPolicy;

@JsonObject(serializeNullObjects = true, fieldNamingPolicy = FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class SimpleModelWithGenericField {

    @JsonField
    public String string;

    @JsonField
    public SimpleGenericModel<String> genericModel;

}
