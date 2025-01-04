# Recipes Web Application
**IN PROGRESS, JANUARY 2025**
- Individual, family, and community recipes.
- Allows for selection of recipes, weekly meal planning, and grocery list.
- Individual and family recipes are private, some recipes can be shared with community if user wishes.

# Developer Setup

## Dependencies
- Java SDK v 21 or greater
- Docker

## Local Configuration
To avoid checking secrets into source control, we use files that are marked as ignored in git. Examples of these files are provided to get you started.

- Copy `.env.example` to `.env` and set a password in the new file. This will be your database password for local development.
- Copy `src/main/resources/application-local.yml.example` to `src/main/resources/application-local.yml`. Set the database conneciton password to the same value used in the previous step.

## Running
In your IDE run configuration, set the Spring profile to `local`

# Developing
TBD
