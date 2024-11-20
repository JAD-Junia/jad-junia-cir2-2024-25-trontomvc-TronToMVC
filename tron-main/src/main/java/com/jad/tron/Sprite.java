package com.jad.tron;

public record Sprite(char symbol) {
}

// un record fabrique get, constructeur, hashcode, tout MAIS on ne peut pas modifier les valeurs à
// à l'intérieur > utile pour des choses qu'on ne modofie pas après
