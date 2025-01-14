package com.example.cardapio.food;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {

    public static FoodResponseDTO from(Food food){
        return new FoodResponseDTO(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
