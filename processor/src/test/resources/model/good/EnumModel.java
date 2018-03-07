package io.logansquarex.processor;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;
import io.logansquarex.core.typeconverters.StringBasedTypeConverter;

@JsonObject
public abstract class EnumModel {

    public enum MyEnum {
        VALUE_1,
        VALUE_2,
        VALUE_3
    }

    @JsonField(name = "enum", typeConverter = EnumTypeConverter.class)
    public MyEnum myEnum;

    public static class EnumTypeConverter extends StringBasedTypeConverter<MyEnum> {
        @Override
        public MyEnum getFromString(String string) {
            switch (string) {
                case "value1":
                    return MyEnum.VALUE_1;
                case "value2":
                    return MyEnum.VALUE_2;
                case "value3":
                    return MyEnum.VALUE_3;
                default:
                    return null;
            }
        }

        @Override
        public String convertToString(MyEnum object) {
            switch (object) {
                case VALUE_1:
                    return "value1";
                case VALUE_2:
                    return "value2";
                case VALUE_3:
                    return "value3";
                default:
                    return null;
            }
        }
    }
}