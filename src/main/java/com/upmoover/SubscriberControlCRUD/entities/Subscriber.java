package com.upmoover.SubscriberControlCRUD.entities;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CallTariffPlan getTariffPlan() {
        return tariffPlan;
    }

    public void setTariffPlan(CallTariffPlan tariffPlan) {
        this.tariffPlan = tariffPlan;
    }

    public boolean isStatus() {
        return status;
    }

    public Subscriber() {
    }

    public Subscriber(String name, String surname, String phoneNumber, double balance, CallTariffPlan tariffPlan) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.tariffPlan = tariffPlan;

        if (balance > 0.0) this.status = true;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", balance=" + balance +
                ", status=" + status +
                ", tariffPlan=" + tariffPlan +
                '}';
    }
}