package io.logansquarex.processor;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;

@JsonObject
public class SimpleWrapperModel {

    @JsonField
    public WrappedClass wrappedObject;

    @JsonObject
    public static class WrappedClass {

        @JsonField
        public String wrappedString;
    }

}
