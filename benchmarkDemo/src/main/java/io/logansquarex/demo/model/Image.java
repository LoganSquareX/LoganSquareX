package io.logansquarex.demo.model;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;

@JsonObject
public class Image {

    @JsonField
    public String id;

    @JsonField
    public String format;

    @JsonField
    public String url;

    @JsonField
    public String description;

}
