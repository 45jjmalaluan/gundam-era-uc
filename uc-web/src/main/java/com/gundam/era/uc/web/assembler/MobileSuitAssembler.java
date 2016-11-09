package com.gundam.era.uc.web.assembler;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.gundam.era.uc.core.model.MobileSuit;
import com.gundam.era.uc.web.resource.MobileSuitResource;

public class MobileSuitAssembler extends
    ResourceAssemblerSupport<MobileSuit, MobileSuitResource> {
    public MobileSuitAssembler(Class controller) {
        super(controller, MobileSuitResource.class);
    }

    @Override
    public MobileSuitResource toResource(MobileSuit model) {
        MobileSuitResource resource = new MobileSuitResource(model);
        resource.add(assembleLink(model, "self"));
        return resource;
    }

    private Link assembleLink(MobileSuit model, String rel) {
        return createResourceWithId(model.getId(), model).getLink(rel);
    }
}
