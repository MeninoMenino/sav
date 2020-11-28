package com.menino.sav.exception;

public class BallotBoxQuantityNotFoundException extends RuntimeException{
    public BallotBoxQuantityNotFoundException() {
        super("Quantidade de urnas não encontrada");
    }
}
