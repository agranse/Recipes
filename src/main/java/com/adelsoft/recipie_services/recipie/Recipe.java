package com.adelsoft.recipie_services.recipie;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Recipe {
    private Integer id;
    private String description;
}
