package com.gundam.era.uc.web.config;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gundam.era.uc.core.model.MobileSuit;
import com.gundam.era.uc.core.model.Type;

@Configuration
public class StubDataConfig {
    @Bean
    public Map<UUID, MobileSuit> mobileSuits() {
        Map<UUID, MobileSuit> mobileSuits = new LinkedHashMap<>();
        mobileSuits.put(
            UUID.fromString("34b4ea2c-43f6-40ae-ad6d-4801ea3cfa04"),
            new MobileSuit(UUID
                .fromString("34b4ea2c-43f6-40ae-ad6d-4801ea3cfa04"), "RX-78-2",
                Type.GUNDAM));
        mobileSuits.put(
            UUID.fromString("6aced4fe-3eb5-45b7-91f9-a4f04ab7bf48"),
            new MobileSuit(UUID
                .fromString("6aced4fe-3eb5-45b7-91f9-a4f04ab7bf48"),
                "MS-06S Zaku II", Type.MOBILE_SUIT));
        return mobileSuits;
    }
}
