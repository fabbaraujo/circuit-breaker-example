package com.github.fabbaraujo.cbservice.model.exceptions;

public class InvestorNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public InvestorNotFoundException(String exception)
    {
        super(exception);
    }
}
