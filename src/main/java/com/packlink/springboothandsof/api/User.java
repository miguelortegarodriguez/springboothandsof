package com.packlink.springboothandsof.api;


import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("name")
    private String name;

    @JsonProperty("identifier")
    private String identifier;

    @JsonProperty("phoneNumber")
    private String phoneNumber;
}
