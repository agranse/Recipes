package com.adelsoft.recipie_services.recipie;

import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;


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
    Long insert(@BindBean Recipe carMaker);

    @SqlQuery("""
            SELECT * FROM recipe.Recipes
            WHERE id = :id
            """)
    Recipe findById(Long id);
}
