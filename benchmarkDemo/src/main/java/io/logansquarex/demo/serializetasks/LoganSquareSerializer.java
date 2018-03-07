package io.logansquarex.demo.serializetasks;

import io.logansquarex.core.LoganSquare;
import io.logansquarex.demo.model.Response;

public class LoganSquareSerializer extends Serializer {

    public LoganSquareSerializer(SerializeListener parseListener, Response response) {
        super(parseListener, response);
    }

    @Override
    protected String serialize(Response response) {
        try {
            return LoganSquare.serialize(response);
        } catch (Exception e) {
            return null;
        } finally {
            System.gc();
        }
    }
}
