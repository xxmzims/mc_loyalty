package ru.ugrinovitch.mc_loyalty.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ugrinovitch.mc_loyalty.entities.BuyerLoyalty;
import ru.ugrinovitch.mc_loyalty.mapper.BonusMapper;
import ru.ugrinovitch.mc_loyalty.repository.BuyerLoyaltyRepositoryJpa;
import ru.ugrinovitch.mc_loyalty.request.BuyerRequest;
import ru.ugrinovitch.mc_loyalty.response.BuyerLoyaltyResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LoyaltyServiceImpl implements LoyaltyService{

    private final BuyerLoyaltyRepositoryJpa loyaltyRepositoryJpa;

    private final BonusMapper bonusMapper;

    @Override
    public BuyerLoyaltyResponse getAmountBonusPoints(UUID id) {

        BuyerLoyalty buyerLoyalty = loyaltyRepositoryJpa.findById(id).orElseThrow(() -> new RuntimeException("This user not exists"));

        return bonusMapper.toBuyerLoyaltyResponse(buyerLoyalty);
    }

    public List<UUID> addNewBuyersFromSpectra(List<BuyerRequest> requestDTO){

        System.out.println(requestDTO);
        List<UUID> result = new ArrayList<>();

        for (UUID id: requestDTO.stream().map(BuyerRequest::getUuid).collect(Collectors.toList())){
            if (loyaltyRepositoryJpa.findById(id).isEmpty()){
                loyaltyRepositoryJpa.save(BuyerLoyalty.builder()
                        .buyerId(id)
                        .amount(0)
                        .build());
                result.add(id);
            }
        }
        return result;
    }
}
