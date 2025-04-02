package ru.ugrinovitch.mc_loyalty.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.ugrinovitch.mc_loyalty.DTO.BuyerDTO;
import ru.ugrinovitch.mc_loyalty.repository.BuyerLoyaltyRepositoryJpa;
import ru.ugrinovitch.mc_loyalty.service.LoyaltyService;

@Service
@RequiredArgsConstructor
public class KafkaConsumer {

    private final LoyaltyService loyaltyService;

    @KafkaListener(topics = "buyers", groupId = "buyers_listeners")
    public void listen(String message) throws JsonProcessingException {

        BuyerDTO buyerDTO = new ObjectMapper().readValue(message, BuyerDTO.class);

        loyaltyService.save(buyerDTO);
    }

}
