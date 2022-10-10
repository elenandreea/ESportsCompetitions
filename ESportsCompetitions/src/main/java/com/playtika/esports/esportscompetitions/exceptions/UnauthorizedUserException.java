package com.playtika.esports.esportscompetitions.exceptions;

public class UnauthorizedUserException extends RuntimeException{

    public UnauthorizedUserException(){
    };

    public UnauthorizedUserException(String message){
        super(message);
    }
}
