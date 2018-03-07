package io.logansquarex.demo.model;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonIgnore;
import io.logansquarex.core.annotation.JsonIgnore.IgnorePolicy;
import io.logansquarex.core.annotation.JsonObject;
import io.logansquarex.core.annotation.JsonObject.FieldDetectionPolicy;

import java.util.List;

@JsonObject(fieldDetectionPolicy = FieldDetectionPolicy.NONPRIVATE_FIELDS_AND_ACCESSORS)
public class NonPrivateFieldsAndAccessorsFieldDetectionPolicyModel {

    public String nonAnnotatedString;

    public List<String> nonAnnotatedList;

    private int nonAnnotatedPrivateInt;

    @JsonField(name = "annotated_string")
    public String annotatedString;

    @JsonIgnore
    public int intToIgnore;

    @JsonIgnore(ignorePolicy = IgnorePolicy.PARSE_AND_SERIALIZE)
    public int intToIgnoreForBoth;

    @JsonIgnore(ignorePolicy = IgnorePolicy.PARSE_ONLY)
    public int intToIgnoreForParse;

    @JsonIgnore(ignorePolicy = IgnorePolicy.SERIALIZE_ONLY)
    public int intToIgnoreForSerialization;

    public transient int transientIntToIgnore;

    public static int staticIntToIgnore;

    @JsonField
    public transient int transientIntToInclude;

    @JsonField
    public static int staticIntToInclude;

    @JsonField
    private transient int privateTransientIntToInclude;

    @JsonField
    private static int privateStaticIntToInclude;

    public int getNonAnnotatedPrivateInt() {
        return nonAnnotatedPrivateInt;
    }

    public void setNonAnnotatedPrivateInt(int nonAnnotatedPrivateInt) {
        this.nonAnnotatedPrivateInt = nonAnnotatedPrivateInt;
    }

    public int getPrivateTransientIntToInclude() {
        return privateTransientIntToInclude;
    }

    public void setPrivateTransientIntToInclude(int privateTransientIntToInclude) {
        this.privateTransientIntToInclude = privateTransientIntToInclude;
    }

    public static int getPrivateStaticIntToInclude() {
        return privateStaticIntToInclude;
    }

    public static void setPrivateStaticIntToInclude(int privateStaticIntToInclude) {
        NonPrivateFieldsAndAccessorsFieldDetectionPolicyModel.privateStaticIntToInclude = privateStaticIntToInclude;
    }
}
