package com.upmoover.SubscriberControlCRUD;

import com.upmoover.SubscriberControlCRUD.entities.CallTariffPlan;
import com.upmoover.SubscriberControlCRUD.entities.Subscriber;
import org.junit.*;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class SubscriberTest {
    private Subscriber subscriber;
    private List<Subscriber> subscribersList = new ArrayList<>();

    @Before
    public void init() {
        Subscriber subscriberPositiveBalance = new Subscriber(
                "Андрей",
                "Березин",
                "+7-8332-566-432",
                20.0,
                CallTariffPlan.CHEAP
        );
        Subscriber subscriberNegativeBalance = new Subscriber(
                "Андрей",
                "Березин",
                "+7-8332-566-432",
                -20.0,
                CallTariffPlan.CHEAP
        );

        subscribersList.add(subscriberPositiveBalance);
        subscribersList.add(subscriberNegativeBalance);
    }

    @Test
    public void createWithPositiveBalance() {
        assertTrue(subscribersList.get(0).isStatus());
    }

    @Test
    public void createWithNegativeBalance() {
        assertFalse(subscribersList.get(1).isStatus());
    }
}
