package com.adelsoft.recipie_services.recipie;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/v1/recipe/{id}")
public class RecipeController {

    @GetMapping()
    public Recipe getRecipe(@PathVariable int id) {
        if (id == 1) {
            return Recipe.builder().id(1).description("A recipe").build();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe not found");
        }
    }
}
