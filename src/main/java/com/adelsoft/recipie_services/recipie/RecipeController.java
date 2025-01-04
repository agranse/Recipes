package com.adelsoft.recipie_services.recipie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/recipe")
public class RecipeController {

    @GetMapping("{id}")
    public Recipe getRecipe(@PathVariable int id) {
        if(id == 1) {
            return new Recipe();
        } else {
            return null;
        }
    }
}
