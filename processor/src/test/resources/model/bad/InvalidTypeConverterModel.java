package io.logansquarex.processor.bad;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;

@JsonObject
public class InvalidTypeConverterModel {

    @JsonField(typeConverter = InvalidTypeConverter.class)
    public UnsupportedType unsupportedType;

    public static class UnsupportedType { }

    public static class InvalidTypeConverter {

    }
}
