package io.logansquarex.processor.model;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;

import java.util.Date;

@JsonObject
public class SimpleModelWithoutNullObjects {

    @JsonField
    public String string;

    @JsonField
    public Date date;

    @JsonField(name = "test_int")
    public int testInt;

    @JsonField(name = "test_long")
    public long testLong;

    @JsonField(name = "test_float")
    public float testFloat;

    @JsonField(name = "test_double")
    public double testDouble;

    @JsonField(name = "test_string")
    public String testString;

    @JsonField(name = "test_int_obj")
    public Integer testIntObj;

    @JsonField(name = "test_long_obj")
    public Long testLongObj;

    @JsonField(name = "test_float_obj")
    public Float testFloatObj;

    @JsonField(name = "test_double_obj")
    public Double testDoubleObj;
}
