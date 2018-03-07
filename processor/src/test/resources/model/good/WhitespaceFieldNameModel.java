package io.logansquarex.processor.model;

import io.logansquarex.core.annotation.JsonField;
import io.logansquarex.core.annotation.JsonObject;

import java.util.List;
import java.util.Map;

@JsonObject
public class WhitespaceFieldNameModel {

    @JsonField(name = "Full Name")
    public String fullName;

    @JsonField(name = "Address Lines")
    public List<String> addressLines;

    @JsonField(name = "Pet Names")
    public String[] petNames;

    @JsonField(name = "Address-Lines")
    public List<String> addressLinesDuplicate;

    @JsonField(name = "All Contacts")
    public Map<String, String> allContacts;
}
