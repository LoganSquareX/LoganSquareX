package io.logansquarex.processor;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import io.logansquarex.core.JsonMapper;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;


@SuppressWarnings("unsafe,unchecked")
public final class AbstractParentModel$$JsonObjectMapper extends JsonMapper<AbstractParentModel> {
    @Override
    public AbstractParentModel parse(JsonParser jsonParser) throws IOException {
        return null;
    }

    @Override
    public void parseField(AbstractParentModel instance, String fieldName, JsonParser jsonParser) throws IOException {
        if ("parentTestInt".equals(fieldName)) {
            instance.parentTestInt = jsonParser.getValueAsInt();
        }
    }

    @Override
    public void serialize(AbstractParentModel object, JsonGenerator jsonGenerator, boolean writeStartAndEnd) throws IOException {
        if (writeStartAndEnd) {
            jsonGenerator.writeStartObject();
        }
        jsonGenerator.writeNumberField("parentTestInt", object.parentTestInt);
        if (writeStartAndEnd) {
            jsonGenerator.writeEndObject();
        }
    }
}
