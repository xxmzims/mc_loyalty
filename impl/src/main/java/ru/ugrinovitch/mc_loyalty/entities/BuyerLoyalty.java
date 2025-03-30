package ru.ugrinovitch.mc_loyalty.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "buyer_loyalty")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BuyerLoyalty {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "buyer_id")
    private UUID buyerId;

    @Column(name = "amount")
    private int amount;
}
