package ru.ugrinovitch.mc_loyalty.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.UUID;

@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Schema(description = "Покупатель")
public class BuyerRequest {

    private UUID uuid;

    private String firstName;

    private String secondName;

    private int age;

    private String email;
}
