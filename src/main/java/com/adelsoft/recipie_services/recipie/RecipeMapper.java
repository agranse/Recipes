package com.adelsoft.recipie_services.recipie;

import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class RecipeMapper implements RowMapper<Recipe> {

    @Override
    public Recipe map(ResultSet rs, StatementContext ctx) throws SQLException {
        return new Recipe(
                rs.getLong("ID"),
                rs.getString("Name"),
                rs.getString("Instructions")
        );
    }
}
