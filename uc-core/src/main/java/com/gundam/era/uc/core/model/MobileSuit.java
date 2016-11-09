package com.gundam.era.uc.core.model;

import java.util.UUID;

public class MobileSuit {
    public UUID id;

    public String model;

    public Type type;

    public MobileSuit(UUID id, String model, Type type) {
        super();
        this.id = id;
        this.model = model;
        this.type = type;
    }

    public MobileSuit() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
