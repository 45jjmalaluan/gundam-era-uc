package com.gundam.era.uc.web.resource;

import java.util.UUID;
import org.springframework.hateoas.ResourceSupport;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.gundam.era.uc.core.model.MobileSuit;

@JsonPropertyOrder({
    "id"
})
public class MobileSuitResource extends ResourceSupport {
    public UUID identifier;

    public String model;

    public String type;

    public MobileSuitResource(MobileSuit mobileSuit) {
        this(mobileSuit.getId(), mobileSuit.getModel(), mobileSuit.getType()
            .toString());
    }

    public MobileSuitResource(UUID id, String model, String type) {
        super();
        setIdentifier(id);
        setModel(model);
        setType(type);
    }

    public MobileSuitResource() {
    }

    @JsonProperty(value = "id")
    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
