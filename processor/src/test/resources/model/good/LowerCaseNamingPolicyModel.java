package io.logansquarex.processor;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;
import io.logansquarex.core.annotation.JsonObject.FieldNamingPolicy;

import java.util.List;

@JsonObject(fieldNamingPolicy = FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class LowerCaseNamingPolicyModel {

    @JsonField
    public String camelCaseString;

    @JsonField
    public List<String> camelCaseList;

}
