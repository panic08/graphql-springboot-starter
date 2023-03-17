package com.example.demo.schemas;

import org.springframework.graphql.data.method.annotation.SchemaMapping;

@SchemaMapping(typeName = "Post", field = "greeting")
public class TestSchema {
    public String greeting(){

        return "Hello";
    }
}
