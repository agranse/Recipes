package com.adelsoft.recipie_services.recipie;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Recipe {
    long id;
    String name;
    String instructions;
}
