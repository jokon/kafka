package com.example.kafka.msg;

import java.math.BigDecimal;

public record AccountStateChange(
        BigDecimal change,
        long accountId
) {

    @Override
    public String toString() {
        return "AccountStateChange{" +
                "change=" + change +
                ", accountId=" + accountId +
                '}';
    }

}
