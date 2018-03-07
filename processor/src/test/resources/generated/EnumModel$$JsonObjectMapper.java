package io.logansquarex.processor;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import io.logansquarex.core.JsonMapper;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings("unsafe,unchecked")
public final class EnumModel$$JsonObjectMapper extends JsonMapper<EnumModel> {
    protected static final EnumModel.EnumTypeConverter IO_LOGANSQUAREX_PROCESSOR_ENUMMODEL_ENUMTYPECONVERTER = new EnumModel.EnumTypeConverter();

    @Override
    public EnumModel parse(JsonParser jsonParser) throws IOException {
        return null;
    }

    @Override
    public void parseField(EnumModel instance, String fieldName, JsonParser jsonParser) throws IOException {
        if ("enum".equals(fieldName)) {
            instance.myEnum = IO_LOGANSQUAREX_PROCESSOR_ENUMMODEL_ENUMTYPECONVERTER.parse(jsonParser);
        }
    }

    @Override
    public void serialize(EnumModel object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
        if (writeStartAndEnd) {
            jsonGenerator.writeStartObject();
        }
        IO_LOGANSQUAREX_PROCESSOR_ENUMMODEL_ENUMTYPECONVERTER.serialize(object.myEnum, "enum", true, jsonGenerator);
        if (writeStartAndEnd) {
            jsonGenerator.writeEndObject();
        }
    }
}