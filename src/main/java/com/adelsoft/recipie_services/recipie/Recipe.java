package com.adelsoft.recipie_services.recipie;

import lombok.Builder;
import lombok.Getter;

public record Recipe(
        int id,
        String name,
        String instructions
) {

}
