package io.logansquarex.core.objectmappers;

import io.logansquarex.core.JsonMapper;
import io.logansquarex.core.LoganSquare;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

import java.io.IOException;
import java.util.Map;

/**
 * Built-in mapper for Map objects of a unknown value types
 */
public class MapMapper extends JsonMapper<Map<String, Object>> {

    @Override
    public Map<String, Object> parse(JsonParser jsonParser) throws IOException {
        return LoganSquare.mapperFor(Object.class).parseMap(jsonParser);
    }

    @Override
    public void parseField(Map<String, Object> instance, String fieldName, JsonParser jsonParser) throws IOException { }

    @Override
    public void serialize(Map<String, Object> map, JsonGenerator generator, boolean writeStartAndEnd) throws IOException {
        LoganSquare.mapperFor(Object.class).serialize(map, generator);
    }

}
