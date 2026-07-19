package com.shruti.ems.exception;

public class ResourceNotFoundException extends RuntimeException
{
    public ResourceNotFoundException(String meassage)
    {
        super(meassage);
    }
}
