package com.example.flipcarddemo;

import org.springframework.data.annotation.Id;

record CashCard(@Id Long id, Double amount) {
    }

