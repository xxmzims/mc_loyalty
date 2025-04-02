package ru.ugrinovitch.mc_loyalty.service;

import ru.ugrinovitch.mc_loyalty.DTO.BuyerDTO;
import ru.ugrinovitch.mc_loyalty.response.BuyerLoyaltyResponse;

import java.util.UUID;

public interface LoyaltyService {

     BuyerLoyaltyResponse getAmountBonusPoints(UUID id);

      void save(BuyerDTO buyerDTO);

}
