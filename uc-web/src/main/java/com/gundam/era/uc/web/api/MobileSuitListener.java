package com.gundam.era.uc.web.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.gundam.era.uc.core.model.MobileSuit;
import com.gundam.era.uc.web.assembler.MobileSuitAssembler;
import com.gundam.era.uc.web.resource.MobileSuitResource;

@RestController
@RequestMapping("/mobileSuits")
public class MobileSuitListener {
    @Resource
    private Map<UUID, MobileSuit> mobileSuits;

    @RequestMapping(method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpEntity<List<MobileSuitResource>> getAll() {
        // assemble the resource
        MobileSuitAssembler assembler = new MobileSuitAssembler(this.getClass());
        List<MobileSuitResource> mobileSuitResources = new ArrayList<>();
        for (MobileSuit mobileSuit : mobileSuits.values()) {
            mobileSuitResources.add(assembler.toResource(mobileSuit));
        }
        return new ResponseEntity<>(mobileSuitResources, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpEntity<MobileSuitResource> getOne(@PathVariable("id") UUID id) {
        MobileSuit mobileSuit = mobileSuits.get(id);
        // assemble the resource
        MobileSuitAssembler assembler = new MobileSuitAssembler(this.getClass());
        return new ResponseEntity<>(assembler.toResource(mobileSuit),
            HttpStatus.OK);
    }
}
