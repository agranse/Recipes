package com.adelsoft.recipie_services.recipie;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/v1/recipe/{id}")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeDao recipeDao;

    @GetMapping()
    public Recipe getRecipe(@PathVariable long id) {

        return recipeDao.findById(id);

//        if (id == 1) {
//            return new Recipe(1, "Basted eggs", """
//                    Melt butter in skillet over medium-high heat.
//                    When butter is lightly brown, add eggs.
//                    Cook until bottoms are just set, and then add 1-2 Tbsp water and cover.
//                    Lower heat to medium low.
//                    Cook until done, 2-3 minutes.""");
//        } else {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe not found");
//        }
    }
}
