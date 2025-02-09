package com.adelsoft.recipie_services.recipie;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/v1/recipe/")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeDao recipeDao;

    @GetMapping("/{id}")
    public Recipe getRecipe(@PathVariable long id) {
        return recipeDao.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public Recipe createRecipe(@RequestBody RecipeCreationRequest recipe) {
        var id = recipeDao.insert(recipe);
        return recipeDao.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
