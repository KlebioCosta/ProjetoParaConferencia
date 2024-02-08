package com.example.desafio.crud.model.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProduct(
        String id,
        @NotBlank String name,
        @NotBlank String description,
        @NotNull Float price){
}
