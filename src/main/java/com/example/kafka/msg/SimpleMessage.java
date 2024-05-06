package com.example.kafka.msg;

public record SimpleMessage(
        String message,
        String author,
        int year
) {

    @Override
    public String toString() {
        return String.format("Message: %s, author: %s, year: %d", message, author, year);
    }

}
