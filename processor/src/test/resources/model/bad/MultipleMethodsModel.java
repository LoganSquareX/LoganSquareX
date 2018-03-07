package io.logansquarex.processor.bad;

import io.logansquarex.core.annotation.JsonObject;
import io.logansquarex.core.annotation.OnJsonParseComplete;

@JsonObject
public class MultipleMethodsModel {

    @OnJsonParseComplete
    public void onParseComplete() {

    }

    @OnJsonParseComplete
    public void secondOnParseComplete() {

    }

}
