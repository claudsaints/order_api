package com.claudsaints.spring.services.exceptions;

public class ResourceNotFindException extends RuntimeException{
    public ResourceNotFindException(Object id){
        super("Resource not found. Id " + id);
    }
}
