package ru.ugrinovitch.mc_loyalty.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.UUID;

@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Schema(description = "Бонусы")
public class BuyerLoyaltyResponse {

    @Schema(description = "id покупателя")
    private UUID buyerId;

    @Schema(description = "Количество бонусов покупателя")
    private int amountBonusPoints;
}
