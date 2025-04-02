package ru.ugrinovitch.mc_loyalty.API;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ugrinovitch.mc_loyalty.response.BuyerLoyaltyResponse;

import java.util.List;
import java.util.UUID;

@RequestMapping("loyalty")
@Tag(
        name="Loyalty",
        description = "Сервис лояльности покупателей"
)
public interface LoyaltyController {

    @Operation(summary = "Получение количества бонусов покупателя")
    @GetMapping("/{id}/bonus_points")
    ResponseEntity<BuyerLoyaltyResponse> getBonusPoints(@PathVariable @Parameter(description = "Уникальный идентификатор") UUID id);

}
