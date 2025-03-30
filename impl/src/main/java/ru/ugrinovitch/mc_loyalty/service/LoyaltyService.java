package ru.ugrinovitch.mc_loyalty.service;

import ru.ugrinovitch.mc_loyalty.request.BuyerRequest;
import ru.ugrinovitch.mc_loyalty.response.BuyerLoyaltyResponse;

import java.util.List;
import java.util.UUID;

public interface LoyaltyService {

     BuyerLoyaltyResponse getAmountBonusPoints(UUID id);

     List<UUID> addNewBuyersFromSpectra(List<BuyerRequest> requestDTO);
}
