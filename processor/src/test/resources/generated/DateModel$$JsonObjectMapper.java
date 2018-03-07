package io.logansquarex.processor;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import io.logansquarex.core.JsonMapper;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings("unsafe,unchecked")
public final class DateModel$$JsonObjectMapper extends JsonMapper<DateModel> {
    protected static final DateModel.MyDateTypeConverter IO_LOGANSQUAREX_PROCESSOR_DATEMODEL_MYDATETYPECONVERTER = new DateModel.MyDateTypeConverter();

    @Override
    public DateModel parse(JsonParser jsonParser) throws IOException {
        return null;
    }

    @Override
    public void parseField(DateModel instance, String fieldName, JsonParser jsonParser) throws IOException {
        if ("date".equals(fieldName)) {
            instance.date = IO_LOGANSQUAREX_PROCESSOR_DATEMODEL_MYDATETYPECONVERTER.parse(jsonParser);
        }
    }

    @Override
    public void serialize(DateModel object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
        if (writeStartAndEnd) {
            jsonGenerator.writeStartObject();
        }
        IO_LOGANSQUAREX_PROCESSOR_DATEMODEL_MYDATETYPECONVERTER.serialize(object.date, "date", true, jsonGenerator);
        if (writeStartAndEnd) {
            jsonGenerator.writeEndObject();
        }
    }
}