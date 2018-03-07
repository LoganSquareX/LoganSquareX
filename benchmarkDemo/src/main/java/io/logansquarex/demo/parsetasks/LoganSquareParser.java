package io.logansquarex.demo.parsetasks;

import io.logansquarex.core.LoganSquare;
import io.logansquarex.demo.model.Response;

public class LoganSquareParser extends Parser {

    public LoganSquareParser(ParseListener parseListener, String jsonString) {
        super(parseListener, jsonString);
    }

    @Override
    protected int parse(String json) {
        try {
            Response response = LoganSquare.parse(json, Response.class);
            return response.users.size();
        } catch (Exception e) {
            return 0;
        } finally {
            System.gc();
        }
    }

}
