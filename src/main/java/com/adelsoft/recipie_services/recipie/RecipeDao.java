package com.adelsoft.recipie_services.recipie;

import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.Optional;


public interface RecipeDao {

    @SqlUpdate("""
            INSERT INTO recipe.Recipes (
                Name,
                Instructions
            ) VALUES (
                :Name,
                :Instructions
            )
            """)
    @GetGeneratedKeys
    Long insert(@BindBean RecipeCreationRequest creationRequest);

    @SqlQuery("""
            SELECT * FROM recipe.Recipes
            WHERE id = :id
            """)
    Optional<Recipe> findById(Long id);
}
