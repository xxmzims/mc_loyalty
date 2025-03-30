package ru.ugrinovitch.mc_loyalty.mapper;

import org.springframework.stereotype.Component;
import ru.ugrinovitch.mc_loyalty.entities.BuyerLoyalty;
import ru.ugrinovitch.mc_loyalty.response.BuyerLoyaltyResponse;


@Component
public class BonusMapper {

    public BuyerLoyaltyResponse toBuyerLoyaltyResponse(BuyerLoyalty buyerLoyalty){
        return BuyerLoyaltyResponse.builder()
                .buyerId(buyerLoyalty.getBuyerId())
                .amountBonusPoints(buyerLoyalty.getAmount())
                .build();
    }
}
