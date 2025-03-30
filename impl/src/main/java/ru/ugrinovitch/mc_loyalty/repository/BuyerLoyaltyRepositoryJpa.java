package ru.ugrinovitch.mc_loyalty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ugrinovitch.mc_loyalty.entities.BuyerLoyalty;

import java.util.UUID;

public interface BuyerLoyaltyRepositoryJpa extends JpaRepository<BuyerLoyalty, UUID> {
}
    