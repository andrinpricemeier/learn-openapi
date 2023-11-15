package org.ubunifu.coders.backend;

import org.ubunifu.coders.backend.openapi.ApplesApi;
import org.ubunifu.coders.backend.openapi.model.Fruit;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public final class FruitApiImpl implements ApplesApi {
    @Override
    public Fruit getAllFruits() {
        final var fruit = new Fruit();
        fruit.setName("Test");
        fruit.setDescription("Any fruit");
        return fruit;
    }
}