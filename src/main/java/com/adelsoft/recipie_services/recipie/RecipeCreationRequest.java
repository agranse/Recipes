package com.adelsoft.recipie_services.recipie;

import lombok.Value;

@Value
public class RecipeCreationRequest {
    String name;
    String instructions;
}
