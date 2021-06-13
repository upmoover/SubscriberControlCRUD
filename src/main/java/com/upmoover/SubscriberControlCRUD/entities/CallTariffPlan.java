package com.upmoover.SubscriberControlCRUD.entities;

public enum CallTariffPlan {
    CHEAP(1),
    MEDIUM(5),
    EXPENSIVE(10);

    private int value;

    CallTariffPlan(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
