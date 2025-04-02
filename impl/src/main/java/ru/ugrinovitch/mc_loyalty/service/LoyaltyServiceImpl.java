package ru.ugrinovitch.mc_loyalty.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.ugrinovitch.mc_loyalty.DTO.BuyerDTO;
import ru.ugrinovitch.mc_loyalty.entities.BuyerLoyalty;
import ru.ugrinovitch.mc_loyalty.mapper.buyerMapper;
import ru.ugrinovitch.mc_loyalty.repository.BuyerLoyaltyRepositoryJpa;
import ru.ugrinovitch.mc_loyalty.response.BuyerLoyaltyResponse;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoyaltyServiceImpl implements LoyaltyService{

    private final BuyerLoyaltyRepositoryJpa loyaltyRepositoryJpa;

    private final buyerMapper buyerMapper;

    @Override
    public BuyerLoyaltyResponse getAmountBonusPoints(UUID id) {

        BuyerLoyalty buyerLoyalty = loyaltyRepositoryJpa.findById(id).orElseThrow(() -> new RuntimeException("This user not exists"));

        return buyerMapper.toBuyerLoyaltyResponse(buyerLoyalty);
    }
    public void save(BuyerDTO buyerDTO){
        BuyerLoyalty buyerLoyalty = new BuyerLoyalty(buyerDTO.getUuid(), 1000);
        log.info("Попытка сохранения сущности BuyerLoyalty c id {} в БД...", buyerLoyalty.getBuyerId());
        loyaltyRepositoryJpa.save(buyerLoyalty);
        log.info("сущность BuyerLoyalty c id {} успешно сохранена", buyerLoyalty.getBuyerId());
    }
}
