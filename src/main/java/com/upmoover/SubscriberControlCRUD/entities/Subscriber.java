package com.upmoover.SubscriberControlCRUD.entities;

import javax.persistence.*;

@Entity
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String phoneNumber;

    private double balance;

    private boolean status;

    @Enumerated(EnumType.STRING)
    private CallTariffPlan tariffPlan;
}