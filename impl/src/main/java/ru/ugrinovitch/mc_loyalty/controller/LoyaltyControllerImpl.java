package ru.ugrinovitch.mc_loyalty.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.ugrinovitch.mc_loyalty.API.LoyaltyController;
import ru.ugrinovitch.mc_loyalty.response.BuyerLoyaltyResponse;
import ru.ugrinovitch.mc_loyalty.service.LoyaltyService;

import java.util.List;
import java.util.UUID;

import static org.springframework.http.HttpStatus.ACCEPTED;

@RestController
@RequiredArgsConstructor
@Slf4j
public class LoyaltyControllerImpl implements LoyaltyController {

    private final LoyaltyService loyaltyService;

    @Override
    public ResponseEntity<BuyerLoyaltyResponse> getBonusPoints(UUID id) {
        return new ResponseEntity<>(loyaltyService.getAmountBonusPoints(id), ACCEPTED);
    }
}
