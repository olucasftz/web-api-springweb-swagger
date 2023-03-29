package com.firstwebapi.handler;

public class FieldMandatoryException extends BusinessException{
    public FieldMandatoryException(String field) {
        super("the field %s is mandatory", field);
    }
}
