package model.bad;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;

@JsonObject
public abstract class GenericModel<T> {

    @JsonField
    public String string;

}
