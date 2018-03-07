package io.logansquarex.processor.bad;

import io.logansquarex.core.annotation.JsonObject;
import io.logansquarex.core.annotation.OnJsonParseComplete;

@JsonObject
public class MethodWithArgsModel {

    @OnJsonParseComplete
    public void onParseComplete(String someArg) {

    }

}
